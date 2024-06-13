// This is a javascript Practice code sheet
// This is console log used to print
console.log("Js series");

// This is the delcaration
fullName = "Javascrpit";
fullname = "JAVASCRIPT";
//age = 24;
price = 99.99;
x = null;
y = undefined;
isfollow = true;
console.log(fullName);
console.log(fullname);

/* Generally variables are declared using 3 tpyes
i.e var let and cosnt
but var was frequently used till 2015
now let and const are used because it does not allow re-declaration and provide update*/
let age = 25;
age = 59; 
age = 86;
console.log(age);

let a;
a = 110;
console.log(a);

const PI = 3.14;
console.log(PI);

// THIS IS DATA TYPE
/* number, string, boolean, undefined, null, bigint, symbol
are 7 primitive datatypes -> fixed value
wherease ohter are non primitive datatypes -> objects - arrays, functions*/

// objects stored in key valued pairs
const student = {
    fullName : "Rahul Kumar",
    age : 20,
    cgpa : 8.2,
    isPass : true,

};
console.log(student);

// to access the valued stored in the object using two different method:- square and dot
// method 1 -> square with quotes
console.log(student["fullName"])

// method 2 -> dot without quotes
console.log(student.age);

//updation of valued stored in key value pair
student["age"] = student["age"] + 1;
console.log(student["age"]);

// practices problem - 1
const product = {
    title : "Ball Pen",
    rating : 4,
    offer : 5,
    price : 270,
};
console.log(product);

// practices problem - 2
const profile = {
    userName : "@shardha",
    isfollow: false,
    followers: 123,
    following: 123
};
console.log(profile);

// To find datatype of the const varible define
console.log(typeof profile);

// To find the datatype of the key valued stroed in const object
console.log(typeof profile ["userName"]);