import { NextFunction, Request, Response } from "express";
import AppError from "../errors/AppError";
import {verify} from 'jsonwebtoken'

export default function isAutheticated(request: Request, response: Response, next: NextFunction): void {

    const authHeader = request.headers.authorization
    if (!authHeader){
        throw new AppError('Token está ausente')
    }

    const [, token] = authHeader.split(' ')

    try {
        const tokenDecodificado = verify(token, process.env.AUTH_SECRETS?? 'secret')
        console.log({tokenDecodificado})
        next()
    }
    catch{
        throw new AppError('Token é inválido')
    }

}