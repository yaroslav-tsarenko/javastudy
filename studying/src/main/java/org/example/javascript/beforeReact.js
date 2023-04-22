let userName = "Alex";
//let userName = "Oleg";
userName = "Oleg"

const userLastname = 'Trifany';
//userLastname = 'Robocop';
//const userLastname = 'Robocop';

const univer = {
    "sociology": 5,
    "etics": 4,
    "philosophy": 2
}

univer['physics'] = 5;
univer.chemistry = 5;
console.log(univer);

const univerResult = [3, 4, 5];
//univerResult = [4, 4, 5];
univerResult[0] = 5;
console.log(univerResult);

//  Import Export

import smear1 from './smear.js';
import smear from './smear.js';

console.log(smear1('physics'));
console.log(smear('math'));

