const ArrayPractice = {
    isArray: (input) => {
        return Array.isArray(input);
    },
    cloneArray: (a) => {
        return [... a];
    },
    getFirstItemOfArray: (a) => {
        return a[0];
    },
    getLastElementInArray: (a) => {
        return a[a.length-1];
    },
    joinAllElementsInArray: (a) => {
        return a.join(' ');
    },
    takeNumberReturnDashedString: (numberAsString) => {
        let returnString = '';
        for(var i = 0; i < numberAsString.length; i++){
            const n1 = Number(numberAsString.charAt(i));
            if(returnString.length > 0) {
                if((Number(returnString.charAt(returnString.length - 1)) % 2 === 0) && (n1 % 2 === 0)) {
                    returnString += ('-' + n1);
                } else {
                    returnString += n1;
                }
            } else {
                returnString += n1;
            }
        }
        return returnString;
    }
}

export default ArrayPractice;