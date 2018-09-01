const assert = require('assert');
import ModuleSix from '../src/modules/Module6/ModuleSix';

describe('Robot arm tests:', () => {

    let commands = [];
    let blockStateException = [];

    before(()=> {
        commands = [
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
        blockStateException = [
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

    });

    // it('TEST: 0: 0', () => {
    //     const result = ModuleSix.interpretAndExecute(commands);
    //     assert.equal(blockStateException[0], result[0]);
    // })

    it('MoveAOnToB:', () => {
        // assert.equal(JSON.stringify([2, 1]) === JSON.stringify(ModuleSix.blocks[2]), true);
        ModuleSix.blocks[4] = [];
        ModuleSix.blocks[1].push(4);
        ModuleSix.blocks[5] = [];
        ModuleSix.blocks[1].push(5);
        ModuleSix.moveAOnToB(2, 1);
        assert.equal( JSON.stringify([1,2]), JSON.stringify(ModuleSix.blocks[1]));
    });

    // it('MoveAOverB', () => {
    //     // To set up some test to simulate, a 4 already having been moved
    //
    //     // console.log(ModuleSix.blocks);
    // })

})