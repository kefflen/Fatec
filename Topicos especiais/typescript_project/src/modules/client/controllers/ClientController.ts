import { Request, Response } from 'express'
import CreateClientService from '../services/CreateClientService'
import ListClientService from '../services/ListClientService'


export default class ClientController {
  public async index(req: Request, res: Response) {
    let listClientService = new ListClientService()
    let clients = await listClientService.execute()
    return res.json(clients)
  }

  public async create(req: Request, res: Response) {
    let { name, rg, cpf, endereco } = req.body
    let createClientService = new CreateClientService()
    let client = await createClientService.execute({
      name, rg, cpf, endereco
    })
    return res.json(client)
  }
}