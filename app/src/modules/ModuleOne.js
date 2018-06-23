const utils = {
	sayHi: () => {
		console.log('Hi from module');
	},
	sayBye: () => {
		console.log('Bye from module');
	},
	getMultiplesOf3And5: (upperLimit) => {
		let sum = 0;
		for(let i = 0; i < upperLimit; i++ ){
			if(i % 3 === 0 || i % 5 === 0){
				sum+=i;
			}
		}
	return sum;
	},
	// Sums an array of fibonacci numbers
	sumOfFibonacciTerms: (numbers) => {
		let sum = 0;
		for(let i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 === 0){
				sum += numbers[i];
			}
		}
		return sum;
	},
	// Gets an array of fibonacci numbers under a maximum sum value.
	getArrayOfFibonacciTerms: (max) => {
		let numbers = [1, 2];
		while(numbers.reduce((a, b) => {
			return Math.max(a,b);
		}) < max){
			numbers.push(
				numbers[numbers.length - 1] + numbers[numbers.length - 2]
			);
		}
		return numbers;
	}
}

export default utils;