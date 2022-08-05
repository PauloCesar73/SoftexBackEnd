const prompt = require('prompt-sync')();
var number1, number2, result, operador;

do {

console.log("Calculadora")
number1 = parseFloat(prompt("Digite o primeiro número: "))
operador = prompt("Digite o sinal da operação desejada(+, -, /, x)")
number2 = parseFloat(prompt("Digite o segundo número: "))

    if (operador == '+') {
        result = number1 + number2
        console.log("Resultado: ", result)
    }
    else if (operador == '-'){
        result = number1 - number2
        console.log("Resultado: ", result)
    }
    else if (operador == '/'){
        result = number1 / number2
        var sobra = number1 % number2
        console.log("Resultado: ", result, " Sobra: ", sobra)
    }
    else if (operador == 'x' || operador == 'X'){
        result = number1 * number2
        console.log("Resultado:", result)
    }
    else {
        console.log("Erro!")
    };

    var exit = prompt("Deseja continuar?(Digite sim) ")
if (exit == "Sim" || exit == "sim" || exit == "SIM" || exit == "SiM" || exit == "sIM" || exit == "siM" || exit == "S" || exit == "s" || exit == "yes" || exit == "Yes" || exit == "YES"){
exit = true
}
else {
    exit = false
}

} while (exit == true);