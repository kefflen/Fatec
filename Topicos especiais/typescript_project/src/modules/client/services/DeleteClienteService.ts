import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import ClientRepository from "../typeorm/repositories/ClientRepository";

interface IRequest {
  id: string
}
class DeleteClientService {
  public async execute({ id }: IRequest): Promise<void> {
    let clientRepository = getCustomRepository(ClientRepository)
    let clientExist = await clientRepository.findOne(id)
    if (!clientExist) {
      throw new AppError(`Cliente não existe`)
    }
    await clientRepository.remove(clientExist)
  }
}

export default DeleteClientService