import { Router } from 'express'
import ProductController from '../controllers/ProductController'

let productRouter = Router()

let productController = new ProductController()

productRouter.get("/", productController.index)
productRouter.get("/:id", productController.show)
productRouter.post("/", productController.create)
productRouter.post("/:id", productController.delete)
productRouter.put("/:id", productController.update)


export default productRouter
