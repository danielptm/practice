console.log("Section 2");

// old way
var name = "Max"
console.log(name)

// new way
let name2 = "Daniel";
console.log(name2);

//This works
if (true) {
  var x =  1;
}

console.log(x)

//This errors if uncommented
// if (true) {
//   let y = 1;
// }
//
// console.log(y);

//let allows us to use block scoping for the variable.
// var stores variable in global scope.


// this changes context depending on where it is called.
function fn2() {
  console.log(this);
}
// fn2();


// this keeps its context everywhere, it doesnt change.
const fn3 = () => {
  console.log("fn3()");
  console.log(this);
}

fn3();
