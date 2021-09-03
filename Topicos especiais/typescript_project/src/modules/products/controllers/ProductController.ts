//Controle não contem regras ede negocio

import { Request, Response } from "express";
import CreateProductService from "../services/CreateProductService";
import DeleteProductService from "../services/DeleteProductService";
import ListProductService from "../services/ListProductService";
import ShowProductService from "../services/ShowProductService";
import UpdateProductService from "../services/UpdateProductService";


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

    public async delete(request: Request, response: Response): Promise<Response> {
        let { id } = request.params
        let deleteProduct = new DeleteProductService()

        await deleteProduct.execute({id})
        return response.json([])
    }

    public async index(request: Request, response: Response): Promise<Response> {
        let listProductService = new ListProductService()
        let products = await listProductService.execute()
        return response.json(products)
    }

    public async show(request: Request, response: Response): Promise<Response> {
        let { id } = request.params
        let showProductService = new ShowProductService()
        let product = await showProductService.execute({id})
        return response.json(product)
    }

    public async update(request: Request, response: Response): Promise<Response> {
        let {id} = request.params
        let {name, quantity, price} = request.body

        let updateProductService = new UpdateProductService()
        let product = await updateProductService.execute({id, name, quantity, price})
        return response.json(product)
    }


}


export default ProductController