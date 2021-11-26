import { celebrate, Segments } from "celebrate"
import { Router } from "express"
import Joi from "joi"
import SessionController from "../controllers/SessionController"

const sessionRouter = Router()
const sessionController = new SessionController()

sessionRouter.post('/',
celebrate({
  [Segments.BODY]: {
    email: Joi.string().email().required(),
    password: Joi.string().required()
  }
}), sessionController.create)

sessionRouter.all('/',(...args) => {
  console.log(args)
})


export default sessionRouter
