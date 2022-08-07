const prompt = require('prompt-sync')();

function msgm (){
    console.log("Calculadora")
}

function calculadora (operador, num1, num2){
    if (operador == '+'){
        return num1 + num2
    }else if(operador == '-'){
        return num1 - num2
    }else if(operador == 'x' || operador == 'X'){
        return num1 * num2
    }else if(operador == '/'){
        return num1 / num2
    } 
}

const resultado = (nome) => nome = nome

//chamando função tradicional sem nenhum parametro.
msgm()

nome = prompt('Qual seu nome?' )
num1 = parseFloat(prompt("Digite o primeiro número: "))
operador = prompt("Digite o sinal da operação desejada(+, -, /, x)")
num2 = parseFloat(prompt("Digite o segundo número: "))

//chamando função tradicional com parâmetros e um retorno de valor.
var result = (calculadora(operador, num1, num2))


//chamando arrow function com parâmetro e que retorne um valor.
resultado()

console.log(nome, "resultado da sua operação é: ", result)



