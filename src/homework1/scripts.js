var input = prompt("Enter value", 0);

console.log("input value = " + input);

var result = input + 2;
alert("Результат вычисления: " + result)

var testFunc = function (text) {
    console.log(text);
}

var humanInput = prompt("Введите что-нибудь", "Ничего не введено");

var alertFunction = function () {
    for (var i = 0; i <= 10; i++) {
        alert("Значение счетчика: " + i)
    }
}

testFunc(humanInput);

testFunc(alertFunction);

function Car(make, model) {
    this.make = make;
    this.model = model;
}

let arrayEx = [1, 2, 3, 4, 5];
let intEx = 100;
let doubleEx = 10.5;
let objEx = new Object();

//let objEx;

if (true) {
    var carEx = new Car("saab", "9-3");
    let carEx2 = new Car("Alfa Romeo", "Giulia");
}

console.log(carEx.make);
console.log(carEx2.make);

console.log(typeof arrayEx);
console.log(typeof intEx);
console.log(typeof doubleEx);
console.log(typeof objEx)
console.log(typeof carEx)

console.log("new!");
console.log(1 / 0);
console.log("test" / 0);

console.log(typeof Car)
console.log(typeof "test")
