const assert = require('assert');

import ProblemOne from '../src/ProblemOne';
import ModuleOne from '../src/modules/ModuleOne'

describe('Coding practice problems',() => {
  describe('Problems from the website projecteuler.net', () => {
    it('Just checking stuff works', () => {
		const x = new ProblemOne();
		x.sayHi();
		ModuleOne.sayHi();
		ModuleOne.sayBye();	
    });
	it('Problem 1, how many multiples of 3 and 5', () => {
		const x = ModuleOne.getMultiplesOf3And5(10);
		const y = ModuleOne.getMultiplesOf3And5(1000);
		assert.equal(23, x);	
		assert.equal(y > 23, true);	
	})
	it('Problem 2, By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms', ()=> {
		const x = ModuleOne.sumOfFibonacciTerms(ModuleOne.getArrayOfFibonacciTerms(89));
		const y = ModuleOne.sumOfFibonacciTerms(ModuleOne.getArrayOfFibonacciTerms(4000000));
		assert.equal(44, x);
		assert.equal(4613732, y);
	})
  });
});
	