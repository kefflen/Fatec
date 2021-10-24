import { NextFunction, Request, Response } from "express";
import AppError from "../../../shared/errors/AppError";
import CreateSessionService from "../services/CreateSessionService";

export default class SessionController {

  public async create(request: Request, response: Response, next: () => any): Promise<Response> {

    const { email, password } = request.body

    const createSessionService = new CreateSessionService()
    try {
      const session = await createSessionService.execute({
        email, password
      })
      return response.json(session)
    } catch(error) {
      if (error instanceof AppError) {
        return response.status(error.statusCode).send(error.message)
      } else throw error
    }
  }
}