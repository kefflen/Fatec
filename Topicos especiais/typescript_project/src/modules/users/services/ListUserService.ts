import { getCustomRepository } from "typeorm";
import User from "../typeorm/entities/User";
import UserRepositories from "../typeorm/repositories/UserRepository";

class ListUserService {
    public async execute(): Promise<User[]> {
        let userRepository = getCustomRepository(UserRepositories)
        let users = userRepository.find()
        return users
    }
}

export default ListUserService