const express = require("express");
const app = express();

var Route = require('../routes/rotas');
app.use('/', Route);

app.listen(3333, ()=>{
    console.log("Server ligado");
})