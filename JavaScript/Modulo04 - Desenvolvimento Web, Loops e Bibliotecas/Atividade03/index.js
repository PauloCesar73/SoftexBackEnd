var moto = new Object
moto.marca = "Honda"
moto.tipo = "Naked"
moto.valor = 40000

var roupas = ["Camisa", "Calça", "Tênis"]


function objetos() {
    for (const objetos1 in moto){
        console.log(`${objetos1}: `,`${moto[objetos1]}`)
    }
}
function array() {
    for (const array1 of roupas){
        console.log(array1)
    }
}

console.log("Objeto: ")
objetos()
console.log("Array: ")
array()