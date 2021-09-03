import { getCustomRepository } from "typeorm";
import Product from "../typeorm/entities/Products";
import ProductRepositories from "../typeorm/repositories/ProductRepositories";

class ListProductService {
    public async execute(): Promise<Product[]> {
        let productRepository = getCustomRepository(ProductRepositories)
        let products = productRepository.find()
        return products
    }
}

export default ListProductService