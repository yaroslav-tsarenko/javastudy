/*
let num = 42

let firstName = "Yaroslav"

const isProgrammer = true

console.log('Test:', num, firstName)

console.log(num + 10)
console.log(num - 10)
console.log(num * 10)
console.log(num / 10)
console.log(num)



let num2 = num + 10
console.log(num, num2)
num = num2 - num
num2 = num2 + 1
console.log(num, num2)


let num3 = (num + 10 * 2) / (5 - 1)
console.log('Result of num3: ' + num3)

const fullName = firstName + ' Tsarenko'
console.log(fullName)
*/

const resultElement = document.getElementById('pretty-button')
const ButtonHello = (props) =>{
    onclick(resultElement)
}

function outerFunction() {
    const outerVariable = 'I am from the outer function';

    function innerFunction() {
        console.log(outerVariable); // innerFunction has access to outerVariable
    }

    return innerFunction;
}

const closureExample = outerFunction();
closureExample(); // This will log "I am from the outer function"

