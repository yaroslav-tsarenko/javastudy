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

import {checkLS, showMessage} from "./cookies";

if (!checkLS()) console.log(showMessage('Problem'));

function functionName() {

}

const a1 = (b, c) => b * 4 * c;
console.log(a1(3, 2))

// spread rest
// ...

const normalWork = ["engineer", "worker", "mechanic"];
const work = [...normalWork, "bloger", "inst model"];
console.log(work);

const worker = {
    "name": "Alex",
    "job": "bloger"
}

const macDuk = {
    ...worker,
    "position": "clean mananger"
}

console.log(macDuk)

//rest
const num = (...args) => {
    console.log(args);
}

console.log(num(1, 2));
console.log(num(1, 2, 77, 88, 99));

// desctucturization

const arr = [33, 44, 55, 66, 77];
const [d1, ,, d2] = arr;
console.log(d1, d2);

const {name, position} = macDuk;
console.log(name, position);

// map, filter
//////




