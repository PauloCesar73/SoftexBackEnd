const prompt = require('prompt-sync')();

var nota1, nota2, result, exit


do {

    var notas = false
    
    while (notas == false) {

        console.log("Quanto você precisa?, Vamos ver!")
    
        nota1 = parseFloat(prompt("Adicione sua primeira nota "))
        nota2 = parseFloat(prompt("Adicione sua segunda nota "))

        if (nota1 >= 0 && nota2 >= 0 && nota1 <= 10 && nota2 <= 10) {
            notas = true
        } else {
            console.log("Adicione uma nota verdadeira!!")
            notas = false
        }
        
    }

    result = 21 - nota1 - nota2

    console.log("Você precisa tirar", result)

    exit = prompt("Para encerrar digite (Exit). ")

    if (exit == "Exit" || exit == "exit" || exit == "EXIT"){
        exit = true
    }
    else{
        exit = false
    }
    
} while (exit == false);