import { EntityRepository, Repository } from "typeorm";
import User from "../entities/User";


@EntityRepository(User)
class UserRepositories extends Repository<User> {
    
    public async findByName(name: string): Promise<User | undefined> {
        let User = await this.findOne({
            where: {
                name
            }
        })
        return User
    }

    public async findByEmail(email: string): Promise<User | undefined> {
        let User = await this.findOne({
            where: {
                email
            }
        })
        return User
    }

    public async findById(id: string): Promise<User | undefined> {
        let User = await this.findOne({
            where: {
                id
            }
        })
        return User
    }
}

export default UserRepositories