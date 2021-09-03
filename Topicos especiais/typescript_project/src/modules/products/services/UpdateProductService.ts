import { getCustomRepository } from "typeorm";
import AppError from "../../../shared/errors/AppError";
import Product from "../typeorm/entities/Products";
import ProductRepositories from "../typeorm/repositories/ProductRepositories";

interface IRequest {
    id: string
    name: string
    price: number
    quantity: number
}

class UpdateProductService {
    public async execute({id, name, price, quantity}: IRequest): Promise<Product> {
        let productRepository = getCustomRepository(ProductRepositories)
        let product = await productRepository.findOne(id)
        if (!product) {
            throw new AppError("Produto não existe")
        }

        let productExist = await productRepository.findByName(name)
        if (productExist && productExist.id != id) {
            throw new AppError("Ja tem um produto com esse nome")
        }

        product.name = name
        product.quantity = quantity
        product.price = price

        await productRepository.save(product)

        return product
    }
}

export default UpdateProductService 