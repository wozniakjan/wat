// overloaded + operator with array and object
[] + [] //concatenation
[] + {} //adds object to array
{} + [] //not very clear why
{} + {} //i could buy that

// valueOf() method
[1,2,3,4]+3 == "1,2,34"

var three = { valueOf: function() { return 3; }} //object, valueOf() returns primitive
three + three == 6;
three - three == 0;
var lenArray = [1,2,3,4];
lenArray.valueOf = function() { return this.length; }
three + lenArray == 7

