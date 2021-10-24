import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import User from "../typeorm/entities/User";
import UserRepository from "../typeorm/repositories/UserRepository";
import { compare } from 'bcryptjs'
import jwt from 'jsonwebtoken'

interface IRequest {
  email: string,
  password: string
}
interface IResponse {
  user: User,
  token: string
}

class CreateSessionService {
  public async execute({ email, password }: IRequest): Promise<IResponse> {
    const userRepository = getCustomRepository(UserRepository)

    const user = await userRepository.findByEmail(email)
    if (!user) throw new AppError("Email/Senha invalido", 401)

    const validPassword = await compare(password, user.password)
    if (!validPassword) throw new AppError("Email/Senha invalido", 401)

    const { id } = user
    const token = await jwt.sign({},
      process.env.AUTH_SECRETS?? 'secret',
      {subject: id, expiresIn: '1d'})

    return {
      user, token
    }
  }
}

export default CreateSessionService