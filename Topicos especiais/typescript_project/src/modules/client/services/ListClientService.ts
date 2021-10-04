import { getCustomRepository } from "typeorm";
import Client from "../typeorm/entities/Client";
import ClientRepository from "../typeorm/repositories/ClientRepository";

class ListClientService {
    public async execute(): Promise<Client[]> {
        let clientRepository = getCustomRepository(ClientRepository)
        let client_list = clientRepository.find()
        return client_list
    }
}

export default ListClientService