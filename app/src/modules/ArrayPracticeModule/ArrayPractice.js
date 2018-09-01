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
    takeNumberReturnDashedString: () => {

    }
}

export default ArrayPractice;