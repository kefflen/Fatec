import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import UserRepository from "../typeorm/repositories/UserRepository";

interface IRequest {
  id: string
}
class DeleteUserService {
  public async execute({ id }: IRequest): Promise<void> {
    let userRepository = getCustomRepository(UserRepository)
    let userExist = await userRepository.findOne(id)
    if (!userExist) {
      throw new AppError(`Produto não existe`)
    }
    await userRepository.remove(userExist)
  }
}

export default DeleteUserService