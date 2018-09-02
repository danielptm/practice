import assert from 'assert';
import ArrayPractice from '../src/modules/ArrayPracticeModule/ArrayPractice';

describe('Javascript practice. https://www.w3resource.com/javascript-exercises/javascript-array-exercises.php', () => {
    it('', () =>{

    })
    it('Write a JavaScript function to check whether an `input` is an array or not', () => {
        assert.equal(ArrayPractice.isArray('hi'), false);
        assert.equal(ArrayPractice.isArray([1,2]), true);
    })
    it('Write a JavaScript function to clone an array', ()=>{
        const a = [1,2];
        assert.equal(JSON.stringify(a), JSON.stringify(ArrayPractice.cloneArray(a)));
    })
    it('Write a JavaScript function to get the first element of an array. Passing a parameter \'n\' will return the first \'n\' elements of the array', () =>{
        const a = [1,2];
        assert.equal(1, ArrayPractice.getFirstItemOfArray(a));
    })
    it('Write a JavaScript function to get the last element of an array. Passing a parameter \'n\' will return the last \'n\' elements of the array.', () =>{
        const a = [1,2];
        assert.equal(2, ArrayPractice.getLastElementInArray(a));
    })
    it('Write a simple JavaScript program to join all elements of the following array into a string. Go to the editor\n' +
        'Sample array : myColor = ["Red", "Green", "White", "Black"]', () =>{
        const a = ["Red", "Green", "White", "Black"];
        assert.equal("Red Green White Black", ArrayPractice.joinAllElementsInArray(a));
    })
    it('Write a JavaScript program which accept a number as input and insert dashes (-) between each two even numbers. For example if you accept 025468 the output should be 0-254-6-8', () =>{
        assert.equal('0-254-6-8', ArrayPractice.takeNumberReturnDashedString('025468'));
    })
    it('Write a JavaScript program to sort the items of an array.', () =>{
        // Sample array : var arr1 = [ 3, 8, 7, 6, 5, -4, -3, 2, 1 ];
        // Sample Output :
        assert.equal('-4,-3,1,2,3,5,6,7,8', ArrayPractice.sortArray([ 3, 8, 7, 6, 5, -4, -3, 2, 1 ]));
    })
    it('Write a JavaScript program to find the most frequent item of an array.', () => {
        assert.equal('a', ArrayPractice.findMostFrequentItem([3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3]));
    })
});