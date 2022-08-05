const prompt = require('prompt-sync')();

var nota1, nota2, nota3, result, resultt, exit

do {

    console.log("Resultado final!")

nota1 = parseFloat(prompt("Adicione sua primeira nota "))
nota2 = parseFloat(prompt("Adicione sua segunda nota "))
nota3 = parseFloat(prompt("Adicione sua terceira nota "))

result = (nota1 + nota2 + nota3) / 3

resultt = (result >= 7) ? "aprovado!" : "reprovado!"
console.log("Você foi ",resultt)

exit = prompt("Digite exit para encerrar o programa ")

    if (exit == "Exit" || exit == "exit" || exit == "EXIT"){
        exit = true
    }
    else{
        exit = false
    }
} while (exit == false);


