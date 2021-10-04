import { EntityRepository, Repository } from "typeorm";
import Client from "../entities/Client";


@EntityRepository(Client)
class ClientRepository extends Repository<Client> {
    
    public async findByName(name: string): Promise<Client | undefined> {
        let Client = await this.findOne({
            where: {
                name
            }
        })
        return Client
    }

    public async findByRg(rg: string): Promise<Client | undefined> {
        let Client = await this.findOne({
            where: {
                rg
            }
        })
        return Client
    }

    public async findByCpf(cpf: string): Promise<Client | undefined> {
        let Client = await this.findOne({
            where: {
                cpf
            }
        })
        return Client
    }

    public async findById(id: string): Promise<Client | undefined> {
        let Client = await this.findOne({
            where: {
                id
            }
        })
        return Client
    }
}

export default ClientRepository