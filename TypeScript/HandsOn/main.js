/*functions */
// function Add(){
//     for(var i = 1; i < 20; i++){
//         console.log(i);
//     }
//     console.log("Answer is:" + i);
// }
// Add();
/*
*To declare a variable, we use "let"
* To declare a global variable, use "var".
*We have "number,boolen,String,any,enum".
 */
var ColorRed = 0;
var ColorYellow = 1;
var ColorGreen = 2;
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Yellow"] = 1] = "Yellow";
    Color[Color["Green"] = 2] = "Green";
})(Color || (Color = {}));
;
var backgroundColor = Color.Green;
