const Sequelize = require('sequelize')
const sequelize = new Sequelize('nodejsandmysql', 'root', 'asddsaqweewq4141', {
    host: "localhost",
    dialect: 'mysql'
})

sequelize.authenticate().then(function(){
    console.log("Banco conectado!")
}).catch(function(erro){
    console.log("Falha ao se conectar: "+erro)
})