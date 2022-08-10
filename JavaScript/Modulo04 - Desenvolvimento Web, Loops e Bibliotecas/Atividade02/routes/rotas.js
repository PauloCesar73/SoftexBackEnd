var express = require('express');
var router = express.Router();

router.get('/project', function(req, res) {
    res.send('Projeto');
})

router.get('/', function(req, res) {
    res.send('Rotas funcionando!');
})

module.exports = router