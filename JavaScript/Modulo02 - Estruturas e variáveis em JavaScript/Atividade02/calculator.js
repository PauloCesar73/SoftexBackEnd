const prompt = require('prompt-sync')();
var number1, number2, result, operador;

do {

console.log("Calculadora")
number1 = prompt("Digite o primeiro número: ")
operador = prompt("Digite o sinal da operação desejada(+, -, /, x)")
number2 = prompt("Digite o segundo número: ")

    if (operador == '+') {
        result = number1 + number2
        console.log(result)
    }
    else if (operador == '-'){
        result = number1 - number2
        console.log(result)
    }
    else if (operador == '/'){
        result = number1 / number2
        console.log(result)
    }
    else if (operador == 'x' || operador == 'X'){
        result = number1 * number2
        console.log(result)
    }
    else {
        console.log("Erro!")
    };

    var exit = prompt("Deseja continuar? ")
if (exit == "Sim" || exit == "sim" || exit == "SIM" || exit == "SiM" || exit == "sIM" || exit == "siM" || exit == "yes" || exit == "Yes" || exit == "YES"){
exit = true
}
else {
    exit = false
}

} while (exit == true);
