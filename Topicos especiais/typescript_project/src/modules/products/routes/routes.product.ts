import { Router } from 'express'
import ProductController from '../controllers/ProductController'

let productRouter = Router()

let productController = new ProductController()
import { celebrate, Joi, Segments } from 'celebrate'
import isAutheticated from '../../../shared/middleware/isAuthenticated'


productRouter.get("/", isAutheticated, productController.index)

productRouter.get('/:id',
celebrate({
  [Segments.PARAMS]: {
    id: Joi.string().uuid().required()
  }
}))

productRouter.get("/:id",  isAutheticated, productController.show)


productRouter.post('/',
celebrate({
  [Segments.BODY]: {
    name: Joi.string().required(),
    price: Joi.number().precision(2).required(),
    quantity: Joi.number().required()
  }
}))

productRouter.post("/",  isAutheticated, productController.create)


productRouter.delete('/:id',
celebrate({
  [Segments.PARAMS]: {
    id: Joi.string().uuid().required()
  }
}))
productRouter.post("/:id",  isAutheticated, productController.delete)


productRouter.put('/:id',
celebrate({
  [Segments.PARAMS]: {
    id: Joi.string().uuid().required()
  },
  [Segments.BODY]: {
    name: Joi.string().required(),
    price: Joi.number().precision(2).required(),
    quantity: Joi.number().required()
  }
}))
productRouter.put("/:id",  isAutheticated, productController.update)


export default productRouter
