const utils = {
	getPrimeFactorsFromANumber: (aNumber) => {
		const primes = [];
		for(let i = 0; i < aNumber; i++){
			if(aNumber % i === 0){
				if(utils.determineIfNumberisPrime(i)){
					primes.push(i);
				}
			}
		}
		return primes;
	},
	getLargestNumberFromArray: (numbersArray) => {
		return numbersArray.reduce((a, b) => Math.max(a, b));
	},
	determineIfNumberisPrime: (aNumber) => {
		let isPrimeFlag = true;
		let x = Math.sqrt(aNumber);
		for(let i = 0; i < x; i++){
			if(aNumber % i === 0 && (i !== x && i !== 1 )){
				isPrimeFlag = false;
			}
		}
		return isPrimeFlag;
	}
}

export default utils;
