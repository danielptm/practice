const ModuleSix = {
    blocks: [],
    initializeBlocks: (numberOfBlocks) => {
        if (numberOfBlocks > 25) {
            throw new Error('Too many blocks!');
        } else {
            for(var i = 0; i < numberOfBlocks; i++){
                ModuleSix.blocks.push([i]);
            }
        }
    },
    interpretAndExecute: (commands) => {
        commands.forEach((cmd) => {
            const parts = cmd.includes(' ') ? cmd.split(' ') : cmd;
            if(parts[0] === 'move' && parts[2] === 'onto'){
                ModuleSix.moveAOnToB(Number(parts[1]), Number(parts[3]))
            } else if (parts[0] === 'move' && parts[2] === 'over') {
                ModuleSix.moveAOverB(Number(parts[1]), Number(parts[2]));
            } else if (parts[0] === 'pile' && parts[2] === 'over') {
                ModuleSix.pileAOverB(parts[1], parts[2])
            } else if (parts === 'quit') {
                for(let i = 0; i < ModuleSix.blocks.length; i++){
                    ModuleSix.blocks[i][0] = i;
                    for(let j = 0; j < ModuleSix.blocks[i].length; j++){
                        ModuleSix.blocks[i][0] += ': ' +ModuleSix.blocks[i][j];
                    }
                }
            }
        });
        return ModuleSix.blocks;
    },
    moveAOnToB: (a, b) => {
        return 'hi';
    },
    moveAOverB: (a, b) => {

    },
    pileAOnToB: () => {

    },
    pileAOverB: () => {

    },
    returnBlockToInitialPosition: (i) => {
      this.blocks[i][0] = 0;
    },
    quit: () => {

    }
}

export default ModuleSix;