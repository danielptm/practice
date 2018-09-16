const ModuleFive = {
    counter: 0,
    cycleLengths: [],
    calculate: (input) => {
       let cycleLengths = [];

       let inputParts = input.split(' ');
       inputParts = inputParts.map((item) => Number(item));

        for (var i = inputParts[0] + 1; i < inputParts[1]; i++){
            ModuleFive.counter = 0;
            ModuleFive.cycleLengths = [];
            ModuleFive.getCycleLengthForNumber(i);
            cycleLengths.push(ModuleFive.counter);
        }
        return inputParts[0] + ' ' + inputParts[1] + ' ' + Math.max(...cycleLengths);
    },
    getCycleLengthForNumber: (n) => {
        ModuleFive.counter ++;
        if (n === 1) {
            return
        } else {
            if (n % 2 === 1) {
                n = (3 * n) + 1;
            } else {
                n = n / 2;
            }
        }
        ModuleFive.getCycleLengthForNumber(n);
    }
}

export default ModuleFive;