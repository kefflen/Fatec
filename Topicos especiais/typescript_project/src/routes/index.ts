import { Router } from 'express'

let routes = Router()

routes.get("/", (req, res) => {
    return res.json({
        message: 'It is working'
    })
})

export default routes

