import ModuleSix from "../Module6/ModuleSix";

const ArrayPractice = {
    isArray: (input) => {
        return Array.isArray(input);
    },
    cloneArray: (a) => {
        return [...a];
    },
    getFirstItemOfArray: (a) => {
        return a[0];
    },
    getLastElementInArray: (a) => {
        return a[a.length - 1];
    },
    joinAllElementsInArray: (a) => {
        return a.join(' ');
    },
    takeNumberReturnDashedString: (numberAsString) => {
        let returnString = '';
        for (var i = 0; i < numberAsString.length; i++) {
            const n1 = Number(numberAsString.charAt(i));
            if (returnString.length > 0) {
                if ((Number(returnString.charAt(returnString.length - 1)) % 2 === 0) && (n1 % 2 === 0)) {
                    returnString += ('-' + n1);
                } else {
                    returnString += n1;
                }
            } else {
                returnString += n1;
            }
        }
        return returnString;
    },
    sortArray: (unsorted) => {
        return unsorted.sort((a, b) => a - b).join(',');
    },
    findMostFrequentItem: (array) => {
        const uniqueItems = [];
        for (var i = 0; i < array.length; i++) {
            const index = uniqueItems.find((item) => item.item === array[i]);
            if (index != undefined) {
                // index contains a reference to the value in the array.
                index.count++;
            } else {
                var newItem = {count: 0, item: array[i]};
                uniqueItems.push(newItem);
            }
        }
        return uniqueItems.sort((a, b) => a.count - b.count)[uniqueItems.length - 1].item;
    },
    reverseTextCase: (text) => {
        let returnString = '';
        for (var i = 0; i < text.length; i++) {
            let code = text.charCodeAt(i);
            if (code === 32) {
                returnString += String.fromCharCode(code);
            }
            else if (ArrayPractice.determineIfLowerCase(code)) {
                code += 32;
                returnString += String.fromCharCode(code);
            } else {
                code -= 32;
                returnString += String.fromCharCode(code);
            }
        }
        return returnString;
    },
    determineIfLowerCase: (char) => {
        return char > 64 && char < 90 ? true : false;
    },
    printElementsOfArray: (array) => {
        for(var i = 0; i < array.length; i++){
            console.log('row ' + i);
            for(var j = 0; j < array[j].length; j++){
                console.log(array[i][j]);
            }
        }
    },
    squareAllItemsInVector: (array) => {
        return array.reduce((accum, num) =>  accum + Math.pow(num, 2), 0);
    },
    calculateSumAndProductOfArray: (array) => {
        const sumAndProduct = {product: 1, sum: 0}
        sumAndProduct.sum = array.reduce((accum, num) => accum + num, sumAndProduct.sum);
        sumAndProduct.product = array.reduce((accum, num) => accum * num, sumAndProduct.product);
        return sumAndProduct;
    },
    removeDuplicateItems: (array) => {
        let newArray = [];
        array.forEach((item) => {
            if(typeof item === 'string') {
                item = item.toLowerCase();
            }
           if(!newArray.includes(item)){
               newArray.push(item);
           }
        });
        return JSON.stringify(newArray);
    }
}

export default ArrayPractice;