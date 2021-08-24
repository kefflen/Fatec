import { Repository } from "typeorm";
import Product from "../entities/Products";


class ProductRepositories extends Repository<Product> {

    public async findByName(name: string): Promise<Product | undefined> {
        let product = this.findOne({
            where: {
                name
            }
        })
        return product
    }
}

export default ProductRepositories