import User from "../typeorm/entities/User";
import UserRepository from "../typeorm/repositories/UserRepository";
import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import { hash } from 'bcryptjs'

interface IRequest {
  name: string,
  email: string
  password: string
}

class CreateUserService {
  public async execute({ name, email, password }: IRequest): Promise<User> {
    let userRepository = getCustomRepository(UserRepository)
    let userExists = await userRepository.findByEmail(email);
    let codedPassword = await hash(password, 8)
    if (userExists) {
      throw new AppError("Ja existe um usuario com esse nome")
    }
    let newUser = userRepository.create({
      name, email, password: codedPassword
    })
    await userRepository.save(newUser);
    return newUser;
  }
}
export default CreateUserService