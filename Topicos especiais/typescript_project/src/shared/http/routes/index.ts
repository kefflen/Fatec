import { Router } from 'express'
import productRouter from "../../../modules/products/routes/routes.product"
let routes = Router()

routes.use("/product", productRouter)


export default routes

