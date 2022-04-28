/*functions */
function Add(){
    for(var i = 1; i < 20; i++){
        console.log(i);
    }
    console.log("Answer is:" + i);
}
Add();

/*
Note:
*To declare a variable, we use "let"
* To declare a global variable, use "var".
*We have "number,boolen,String,any,enum".
 */

/**
 * Example of enum in typeScript.
 */
const ColorRed= 0;
const ColorYellow =1;
const ColorGreen=2;

enum Color{Red =0,Yellow=1,Green=2};
let backgroundColor = Color.Green;

/**
 * function in JavaScript
 */
let log = function(message){
    console.log(message);
}
/**
 * Arrow functions in TypeScript
 */
let doLog =(message) => console.log(message);




