const assert = require('assert');
import ModuleThree from '../src/modules/ModuleThree';

describe('Coding practice problems: https://projecteuler.net/problem=3',() => {
  describe('Problem 3 What is the largest prime factor of the number 600851475143 ?', () => {
    it('Get an array of prime factors of a certain number.', () => {
		const result = ModuleThree.getPrimeFactorsFromANumber(13195);
		result.includes(5);
		result.includes(7);
		result.includes(13);
		result.includes(29);

    });
    it('Find the largest number in an array.', () => {
		const result = ModuleThree.getPrimeFactorsFromANumber(13195);
		const x = ModuleThree.getLargestNumberFromArray(result);
		console.log('***** RESULT');
		console.log(x);
		assert.equal(x, 29);
    });
    it('Determine if a number is a prime factor.', () => {
		const a = ModuleThree.determineIfNumberisPrime(6857);
		const b = ModuleThree.determineIfNumberisPrime(7);
		const c = ModuleThree.determineIfNumberisPrime(13);
		const d = ModuleThree.determineIfNumberisPrime(21);
		const e = ModuleThree.determineIfNumberisPrime(50);
		assert.equal(true, a)
		assert.equal(true, b)
		assert.equal(true, c)
		assert.equal(false, d)
		assert.equal(false, e)
    });
  });
});
