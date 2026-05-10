#include "course_arrays.h"

#include <iostream>
#include <ostream>

std::string print(const int items[]) {
    std::string res;

    for (int i = 0; i < 5; i++) {
        res += std::to_string(items[i]) + ", ";
    }
    return res;
}


void showArrays() {
    int test_cores [5] {1, 2, 3, 4, 5};
    int test_scores_2 [] {1, 2, 3, 4, 5};

    std::cout << "test_cores" << std::endl;

    std::cout << print(test_cores) << std::endl;

    std::cout << "test_cores_2" << std::endl;

    std::cout << print(test_scores_2) << std::endl;
}

