// overloaded + operator with array and object
[] + [] //concatenation with coercion
[] + {} //kind of absorbation, probably?
{} + [] //not very clear why
{} + {} //i could buy that

//well defined order.. not
0 >= null;
null >= 0;
null == 0;

//sorting array
//Array.sort() forces all members toString(), though comparison between built-in types
//is well defined
[0, -1, -2].sort()

// valueOf() method
[1,2,3]+4 == "1,2,34"

var three = { valueOf: function() { return 3; }} //object, valueOf() returns primitive
three + three == 6;
three - three == 0;
var lenArray = [1,2,3,4];
lenArray.valueOf = function() { return this.length; }
three + lenArray == 7

