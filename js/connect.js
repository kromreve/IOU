const {createpool} = require('mysql');

const pool = creatPool({
    host:"localhost",
    user:"root",
    password="",
    database: "test",
    connectionLimit: 10
}
)

//pool.query('select * from ')