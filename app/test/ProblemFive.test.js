const assert = require('assert');
import ModuleFive from '../src/modules/Module5/ModuleFive';

/**
 * It is conjectured that the algorithm above will terminate (when a 1 is printed) for any integral input value. Despite the simplicity of the algorithm, it is unknown whether this conjecture is true. It has been verified, however, for all integers n such that 0 < n < 1,000,000 (and, in fact, for many more numbers than this.)
 Given an input n, it is possible to determine the number of numbers printed before and including the 1 is printed. For a given n this is called the cycle-length of n. In the example above, the cycle length of 22 is 16.
 For any two numbers i and j you are to determine the maximum cycle length over all numbers between and including both i and j.
 */
describe('100 - The 3n + 1 problem', () => {
    it('', () => {
        assert.equal('1 10 20', ModuleFive.calculate('1 10'));
        // ModuleFive.getCycleLengthForNumber('1 10');
        // console.log(ModuleFive.calculate('1 10'));
    })
    it('', () => {
        assert.equal('100 200 125', ModuleFive.calculate('100 200'));
    });
    it('', () => {
        assert.equal('201 210 89', ModuleFive.calculate('201 210'));
    });
    it('', () => {
        assert.equal('900 1000 174', ModuleFive.calculate('900 1000'));
    });
})