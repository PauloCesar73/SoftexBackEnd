const prompt = require('prompt-sync')();

function Banco(conta, saldo, accounttype, agency){
    this.conta = conta
    this.saldo = saldo
    this.accounttype = accounttype
    this.agency = agency
    
    buscarsaldo = function ValorSaldo(){
        console.log("\n" + "Saldo atual: ", contabancaria.saldo)
        console.log("------------------------------------")
    }
    deposito = function Valordeposito(){
        valordep = parseFloat(prompt("Quanto você quer depositar? "))
        console.log("\n" + "Saldo atual com deposito:", contabancaria.saldo + valordep)
        console.log("------------------------------------")
    }
    saque = function Valorsaque(){
        valorsaq = parseFloat(prompt("Quanto você quer sacar? "))
        console.log("\n" + "Saldo atual com saque:", contabancaria.saldo - valorsaq)
        console.log("------------------------------------")
    }
    numconta = function numeroconta(){
        console.log("\n" + "Número da conta: ", contabancaria.conta + "\n" + "\n")
        console.log("------------------------------------")
    }
}
var contabancaria = new Banco("1234", 400000, "Contacorrente", "Santander")
var encerrar = true
while (encerrar == true) {
console.log("Agência: ",contabancaria.agency)
console.log("Tipo da conta: ",contabancaria.accounttype + "\n")

console.log("Para saber seu saldo digite 1" + "\n" + "Para fazer deposito digite 2" + "\n" + "Para saque digite 3" + "\n" + "Para saber número da conta digite 4" + "\n" + "Para fechar digite 5")

var pergunt = parseInt(prompt("Oque deseja? "))

if(pergunt == 1){
    buscarsaldo()
}else if (pergunt == 2){
    deposito()
}else if (pergunt == 3){
    saque()
}else if (pergunt == 4){
    numconta()
}else if (pergunt == 5){
    encerrar = false
}else if (pergunt != 1 || pergunt != 2 || pergunt != 3 || pergunt != 4 || pergunt != 5){
    console.log("Erro!")
    encerrar = false
}
}