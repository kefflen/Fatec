import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import Product from "../typeorm/entities/Products";
import ProductRepositories from "../typeorm/repositories/ProductRepositories";


interface IRequest {
    id: string
}
class ShowProductService {
    public async execute({ id }: IRequest): Promise<Product>{
        let productRepository = getCustomRepository(ProductRepositories)
        let productExist = await productRepository.findOne(id)
        if (!productExist) {
            throw new AppError("Produto não existe")
        }
        return productExist
    }
}

export default ShowProductService