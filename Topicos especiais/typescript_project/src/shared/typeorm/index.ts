import { createConnection } from "typeorm"
import Product from "../../modules/products/typeorm/entities/Products"


createConnection()

/* createConnection({
  "type": "postgres",
  "host": "localhost",
  "port": 4444,
  "username": "postgres",
  "password": "docker",
  "database": "api-vendas",
  entities: [Product]
}) */
