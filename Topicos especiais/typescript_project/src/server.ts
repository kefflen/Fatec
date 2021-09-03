import express from 'express'
import cors from 'cors'
import routes from './shared/http/routes'


const PORT = 3333
const app = express()

app.use(cors())
app.use(express.json()) 

app.use(routes)

app.listen(PORT, () => {
    console.log(`Running on port ${PORT}`)
})
