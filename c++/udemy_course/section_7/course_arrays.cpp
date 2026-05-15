#include "course_arrays.h"

#include <iostream>
#include <ostream>
#include <vector>
using namespace std;

string print(int items[]) {
    string res;

    for (int i = 0; i < 5; i++) {
        res += to_string(items[i]) + ", ";
    }
    return res;
}

string print(vector<int> items) {
    string res;

    for (int i = 0; i < items.size(); i++) {
        res += to_string(items.at(i)) + ", ";
    }
    return res;
}


void showArrays() {
    int test_cores [5] {1, 2, 3, 4, 5};
    int test_scores_2 [] {1, 2, 3, 4, 5};

    cout << "test_cores" << endl;

    cout << print(test_cores) << endl;

    cout << "test_cores_2" << endl;

    cout << print(test_scores_2) << endl;

}

void showVectors() {
    vector <char> vowels;
    vector <int> test_scores {80, 50, 60, 70, 90, 100};
    vector <double> hi_temps (350, 500);

    cout << print(test_scores) << endl;

    test_scores.push_back(101);

    cout << print(test_scores) << endl;
}