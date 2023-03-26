let number = 10;

for (let i = 100; i > 5; i /= 2) {
    console.log(i)
}

console.log(number)

let j = 0;

while (j < 1000) {
    j++;
    console.log(j)
    j -= 100;
}


for (let i = 10; i <= 20; i += 2) {
    if (i > 15)
        break;
    console.log(i)
}



