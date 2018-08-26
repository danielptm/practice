const assert = require('assert');
import ModuleFive from '../src/modules/Module5/ModuleFive';

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