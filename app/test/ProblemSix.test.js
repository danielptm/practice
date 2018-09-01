const assert = require('assert');
import ModuleSix from '../src/modules/Module6/ModuleSix';

describe('Problem six tests', () => {
    it('#6', () => {
        const commands = [
            'move 9 onto 1',
            'move 8 over 1',
            'move 7 over 1',
            'move 6 over 1',
            'pile 8 over 6',
            'pile 8 over 5',
            'move 2 over 1',
            'move 4 over 9',
            'quit'
        ];
        const blockStateExpection = [
            '0: 0',
            '1: 1 9 2 4',
            '2:',
            '3: 3',
            '4:',
            '5: 5 8 7 6',
            '6:',
            '7:',
            '8:',
            '9:'
        ];
        ModuleSix.initializeBlocks(10);
        const result = ModuleSix.interpretAndExecute(commands);
        blockStateExpection.forEach((be, i) => {
          assert.equal(blockStateExpection[i], result[i]);
        })
    })
})