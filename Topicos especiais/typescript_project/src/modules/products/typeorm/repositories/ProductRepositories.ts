import { EntityRepository, Repository } from "typeorm";
import Product from "../entities/Products";


@EntityRepository(Product)
class ProductRepositories extends Repository<Product> {

    public async findByName(name: string): Promise<Product | undefined> {
        let product = await this.findOne({
            where: {
                name
            }
        })
        return product
    }
}

export default ProductRepositories