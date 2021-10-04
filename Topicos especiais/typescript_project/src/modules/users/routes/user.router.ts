import { celebrate, Segments } from 'celebrate'
import { Router } from 'express'
import Joi from 'joi'
import UserController from '../controllers/UserController' 

let userRouter = Router()
let userController = new UserController()

userRouter.get('/', userController.index)


userRouter.post('/',
celebrate({
  [Segments.BODY]: {
    name: Joi.string().required(),
    email: Joi.string().required(),
    password: Joi.string().required()
  }
}))
userRouter.post('/', userController.create)

export default userRouter