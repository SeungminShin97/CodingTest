#include <bits/stdc++.h>

#define fastio ios::sync_with_stdio(0), cin.tie(0), cout.tie(0)
using namespace std;

int main() {
    fastio;
    int a, b;
    while(cin >> a >> b) {
        cout << b / (a + 1) << "\n";
    }
    return 0;
}