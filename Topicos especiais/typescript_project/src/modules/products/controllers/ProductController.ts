//Controle não contem regras ede negocio

import { Request, Response } from "express";
import CreateProductService from "../services/CreateProductService";


class ProductController {
    public async create(request: Request, response: Response): Promise<Response>{

        //Recuperar dados
        let {name, price, quantity} = request.body

        let createProduct = new CreateProductService()

        let product = await createProduct.execute({
            name, price, quantity
        })

        return response.json(product)
    }
}

export default ProductController