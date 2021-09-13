import { Router } from 'express'
import ProductController from '../controllers/ProductController'

let productRouter = Router()

let productController = new ProductController()
import { celebrate, Joi, Segments } from 'celebrate'


productRouter.get("/", productController.index)

productRouter.get('/:id',
celebrate({
  [Segments.PARAMS]: {
    id: Joi.string().uuid().required()
  }
}))

productRouter.get("/:id", productController.show)


productRouter.post('/',
celebrate({
  [Segments.BODY]: {
    name: Joi.string().required(),
    price: Joi.number().precision(2).required(),
    quantity: Joi.number().required()
  }
}))

productRouter.post("/", productController.create)


productRouter.delete('/:id',
celebrate({
  [Segments.PARAMS]: {
    id: Joi.string().uuid().required()
  }
}))
productRouter.post("/:id", productController.delete)


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
productRouter.put("/:id", productController.update)


export default productRouter
