import express, { NextFunction, Request, Response } from 'express'
import cors from 'cors'
import routes from './routes'
import 'reflect-metadata'
import '../../shared/typeorm/index'
import AppError from '../errors/AppError'
import { errors } from 'celebrate'
import 'express-async-errors'


const PORT = 3333
const app = express()

app.use(cors())
app.use(express.json()) 

app.use(routes)


app.use(errors())
app.use(
    (error: Error, request: Request, response: Response, next: NextFunction) => {
        if (error instanceof AppError) {
            return response.status(error.statusCode).json({
                status: 'error',
                message: error.message
            })
        } 
        return response.status(500).json({
            status: 'error',
            message: 'Internet error server'
        })
    }
)

app.listen(PORT, () => {
    console.log(`Running on port ${PORT}`)
})
