//
// Created by daniel on 3/15/26.
//
#include <iostream>
using namespace std;

string global_greet = "hello";

void runIntTypes();

int main() {
    // cout << global_greet << endl;
    // int room_width{0};
    // int room_length{0};
    //
    // cout << "Enter the width of the room: " << endl;
    // cin >> room_width;
    //
    // cout << "Enter the length of the room: " << endl;
    // cin >> room_length;
    //
    // cout << "The length of the room is: " << room_width * room_length <<  " square feet" << endl;
    //

    runIntTypes();
    return 0;
}

void runIntTypes() {

    // Notice the bracket initialization. This helps catch compiler errors.
    //unsigned int x{-1};
    int x = 1;
    bool y = true;

    // regular assignment with = does not catch compiler errors
    cout << x << endl;

    //bools print numbers
    cout << y << endl;



}
