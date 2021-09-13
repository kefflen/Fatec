import { createConnection } from "typeorm"
import Product from "../../modules/products/typeorm/entities/Products"


createConnection({
  "type": "postgres",
  "host": "localhost",
  "port": 4444,
  "username": "postgres",
  "password": "docker",
  "database": "api-vendas",
  entities: [Product]
})



/*
const connection = await createConnection({
    type: "mysql",
    host: "localhost",
    port: 3306,
    username: "test",
    password: "test",
    database: "test"
});
*/