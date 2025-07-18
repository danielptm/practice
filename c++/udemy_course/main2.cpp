#include <iostream>

/*
 *You can use a namespace like this and then include or omit the namespace of the package the
 *function comes from. See how std is used and not used in this file.
 */
using namespace std;

/*
 *This is a
 *multiline
 *comment
 */
int main() {
    // single line comment
    int favorite_number;
    int num1;
    int num2;
    int num3;
    int num4;
    cout << "Enter your favoriet number between 1 and 100: "; // Standard outputstream to console. If you put a string like 1b2, it will read only the 1 because it's an int.
    cin >> favorite_number; // Inputstream that defaults to keyboard
    std::cout << "That's my favorite number too.... ";
    //Create a new line after the text.
    cout << "No really!, " << favorite_number << " is my favoriet number!" << std::endl;

    cout << "************************************" << endl;
    // here is a weird behavior if you try with input <1 2> (notice the space between 1 and 2). It will skip the second cin and print the correct output as if you filled in cin.
    cout << "enter a number" << endl;
    cin >> num1;
    cout << "enter another number" << endl;
    cin >> num2;
    cout << "You entered " << num1 << " and " << num2 << std::endl;

    cout << "************************************" << endl;

    // Here is another weird one. If you enter invalid input in the first one it goes into error state, skips over the next cin and prints weird data.
    cout << "enter 'b' (this is expecting an int)" << endl;
    cin >> num3;
    cout << "enter 1" << endl;
    cin >> num4;
    cout << "You entered " << num3 << " and " << num4 << std::endl;
}
