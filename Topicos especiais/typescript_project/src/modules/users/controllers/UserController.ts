import { Request, Response } from 'express'
import CreateUserService from '../services/CreateUserServi e'
import ListUserService from '../services/ListUserService'


export default class UserController {
  public async index(req: Request, res: Response) {
    let listUserService = new ListUserService()
    let users = await listUserService.execute()
    return res.json(users)
  }

  public async create(req: Request, res: Response) {
    let { name, email, password } = req.body
    let createUserService = new CreateUserService()
    let user = await createUserService.execute({
      name, email, password
    })
    return res.json(user)
  }
}