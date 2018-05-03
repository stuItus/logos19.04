//alert("Hello World");
//console.log("Hello World");
//
//var name = 'John Doe'; // const - константа; let - теж саме щой var;
//console.log(name);
//let firstName = 'Tom';
//console.log(firstName);
//const lastName = 'Sraka';
//console.log(lastName);
//lastName = "Motyka";
//console.log(lastName);

/*
// String 
const name = 'john';
console.log(typeof name);

// Number
const age = 20; // 20.8
console.log(typeof age);

//Boolean
const isAdult = true;
console.log(typeof isAdult);

//Null
const car = null;
console.log(typeof car);

//Undefined
let user;
console.log(typeof user);

//Nan
let sqrt = Math.sqrt(-9);
console.log(sqrt);

//Object
const hobbies = ['walk'];
console.log(typeof hobbies);

const address = {
    city: 'Lviv',
    street: 'Shevchenka'
};
console.log(typeof address);
*/

//const num1 = 120;
//const num2 = 40;
//let res;
//res = num1 + num2;
//console.log(res);
//res = num1 - num2;
//console.log(res);
//res = num1 / num2;
//console.log(res);
//res = num1 * num2;
//console.log(res);
//res = num1 % num2;
//console.log(res);

/*
//Math
let res;
res = Math.PI;
console.log(res);
res = Math.round(2.5); // звичайне заокруглення
console.log(res);
res = Math.ceil(2.3); // до більшого
console.log(res);
res = Math.floor(2.9); // до меншого
console.log(res);
res = Math.sqrt(81);
console.log(res);
res = Math.abs(-20);
console.log(res);
res = Math.pow(2, 3);
console.log(res);
res = Math.max(2, 34, -235, 73);
console.log(res);
res = Math.min(2, 34, -235, 73);
console.log(res);
res = Math.random();
console.log(res);
res = Math.floor(Math.random() * 10 + 1);
console.log(res);
*/

/*
//String
const firstName = 'Tommy';
const lastName = 'Doe';
let res;

res = firstName + ' ' + lastName;
console.log(res);
res = res.length;
console.log(res);
res = firstName.concat(' ', lastName);
console.log(res);
res = firstName[1];
console.log(res);
res = firstName.indexOf('m');
console.log(res);
res = firstName.lastIndexOf('m');
console.log(res);
res = lastName.charAt(0);
console.log(res);
res = lastName.charAt(lastName.length - 1);
console.log(res);
res = lastName.substring(0, 2);
console.log(res);
res = lastName.slice(0, 2);
console.log(res);
res = lastName.slice(-3); // slice - має ширшу реалізацію
console.log(res);
const tags = 'web, design, java, spring'
res = tags.split(',');
console.log(res);
res = lastName.replace('e', 'wn');
console.log(res);
*/

/*
//Arrays
const nums = [23, -42, 345, 34, 35,67,79, -4];
const nums2 = new Array(23, -42, 345, 34, 35,67,79, -4);
let res;
res = nums.length;
console.log(res);
res = Array.isArray(nums);
console.log(res);
res = nums[2];
console.log(res);
res = nums.indexOf(-4);
console.log(res);

nums.push(999); // додати значення в кінець
console.log(nums);
nums.unshift(999); // додати значення на початок
console.log(nums);

nums.pop(); // протилежно пушу - витягнути значення в кінці
console.log(nums); 
nums.shift(); // протилежно аншифту - витягнути значення на початку
console.log(nums);

nums.reverse();
console.log(nums);

nums.sort();
console.log(nums);

res = nums.sort(function(x, y) {
    return x-y;
})
console.log(res);
res = nums.sort(function(x, y) {
    return y-x;
})
console.log(res);
*/

/*
//Object
const person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 29,
    email: 'johndoe@gmail.com',
    hobbies: ['web', 'java', 'spring', 'sql'],
    address: {
        city: 'Lviv',
        street: 'Nova Str'
    },
    getBirthYear: function() {
        return 2018 - this.age;
    }
};
let res;
res = person;
res = person.email;
res = person['firstName'];
res = person.hobbies;
res = person.hobbies[2];
res = person.address.city;
res = person.getBirthYear();
console.log(res);
*/

/*
//Conditions
const id = '100';
if (id == 100) {
    console.log('+');
} else {
    console.log('-');
}

if (id === 100) {
    console.log('+');
} else {
    console.log('-');
}

if (id !== 100) {
    console.log('+');
} else {
    console.log('-');
}
*/

/*
//Functions
function sayHello() {
    console.log('hello');
}
sayHello();

function sayHello(name) {
    console.log('hello' + name);
}
sayHello();

function sayHello(name = 'Tom') {
    console.log('hello' + name);
}
sayHello(123);
sayHello();
*/

//const square = function(x =0) {
//    return x*x;
//}
//console.log(square(5));

//(function () {
//    console.log('Hello World');
//})();

(function (name) {
    console.log('Hello ' + name + '!');
})('Loshara');