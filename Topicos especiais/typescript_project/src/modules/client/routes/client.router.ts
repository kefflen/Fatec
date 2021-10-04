import { celebrate, Segments } from 'celebrate'
import { Router } from 'express'
import Joi from 'joi'
import ClientController from '../controllers/ClientController' 

let clientRouter = Router()
let clientController = new ClientController()

clientRouter.get('/', clientController.index)


clientRouter.post('/',
celebrate({
  [Segments.BODY]: {
    name: Joi.string().required(),
    rg: Joi.string().required(),
    cpf: Joi.string().required(),
    endereco: Joi.string().required()
  }
}))
clientRouter.post('/', clientController.create)

export default clientRouter