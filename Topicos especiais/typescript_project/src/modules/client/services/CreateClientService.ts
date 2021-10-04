import Client from "../typeorm/entities/Client";
import ClientRepository from "../typeorm/repositories/ClientRepository";
import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";


interface IRequest {
  name: string
  rg: string
  cpf: string
  endereco: string
}

class CreateClientService {
  public async execute({ name, rg, cpf, endereco}: IRequest): Promise<Client> {
    let clientRepository = getCustomRepository(ClientRepository)
    
    let cpfAlreadyExist = await clientRepository.findByCpf(cpf);
    if (cpfAlreadyExist) {
      throw new AppError("Ja existe um cliente com esse cpf")
    }

    let rgAlreadyExist = await clientRepository.findByRg(rg);
    if (rgAlreadyExist) {
      throw new AppError("Ja existe um cliente com esse rg")
    }

    let newClient = clientRepository.create({
      name, rg, cpf, endereco
    })
    await clientRepository.save(newClient);
    return newClient;
  }
}
export default CreateClientService