#include <iostream>

#include <iostream>
using namespace std;
#include "section_6/greeting.h"
#include "section_7/course_arrays.h"

string global_greet = "hello";

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
int main() {
    showArrays();
    return 0;
}



void helloWorld() {
    // TIP Press <shortcut actionId="RenameElement"/> when your caret is at the <b>lang</b> variable name to see how CLion can help you rename it.
    auto lang = "C++";
    std::cout << "Hello and welcome to " << lang << "!\n";

    for (int i = 1; i <= 5; i++) {
        // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        std::cout << "i = " << i << std::endl;
    }
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