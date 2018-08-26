let symbol = Symbol('debug');
let anotherSymbol = Symbol('debug');

let obj = {
  name: 'max',
  [symbol]: 22
}

console.log(obj[symbol]);
