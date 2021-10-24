import { Router } from 'express'
import clientRouter from '../../../modules/client/routes/client.router'
import productRouter from "../../../modules/products/routes/routes.product"
import sessionRouter from '../../../modules/users/routes/session.routes'
import userRouter from '../../../modules/users/routes/user.router'
let routes = Router()

routes.use("/product", productRouter)
routes.use("/user", userRouter)
routes.use("/client", clientRouter)
routes.use("/session", sessionRouter)

export default routes

