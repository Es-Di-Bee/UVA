#include<bits/stdc++.h>
#define readfromfile() freopen("input.txt", "r", stdin);
#define writetofile()  freopen("output.txt", "w", stdout);
#define fastio() ios_base::sync_with_stdio(false); cin.tie(NULL);
#define arrayinput() for (int i = 0; i < n; ++i) cin >> a[i];
#define debug(val) cout << "The value is " << val << endl;
#define ll long long
using namespace std;
string a[300][300];

void fillit(int x, int y, string oldColor, string newColor,int r, int c) {
	if (oldColor == newColor) return;
	if (a[x][y] == oldColor) {
		a[x][y] = newColor;
		if (x-1 >= 0) fillit(x-1, y, oldColor, newColor, r, c);
		if (y+1 <= c-1) fillit(x, y+1, oldColor, newColor, r, c);
		if (x+1 <= r-1) fillit(x+1, y, oldColor, newColor, r, c);
		if (y-1 >= 0) fillit(x, y-1, oldColor, newColor, r, r);
	}
}

int main() {
    	fastio();
	#ifndef ONLINE_JUDGE
        	readfromfile();
    	#endif

	int r,c;
    	while(true) {
		string str;
		cin >> str;
		if (str == "X") break;
		if (str == "I") {
			cin >> c >> r;
			for (int i = 0; i < r; ++i) {
				for (int j = 0; j < c; ++j) {
					a[i][j] = "O";
				}
			}
		} else if (str == "C") {
			for (int i = 0; i < r; ++i) {
				for (int j = 0; j < c; ++j) {
					a[i][j] = "O";
				}
			}
		} else if (str == "L") {
			int x, y; string color;
			cin >> x >> y >> color;
			a[y-1][x-1] = color;
		} else if (str == "V") {

			int x,y1,y2;
			string color;
			cin >> x >> y1 >> y2 >> color;
			if (y1 > y2) swap(y1,y2);
			for (int i = y1-1; i < y2; ++i) {

				a[i][x-1] = color;
			}
		} else if (str == "H") {
			int x1,x2,y; string color;
			cin >> x1 >> x2 >> y >> color;
			if (x1 > x2) swap(x1,x2);
			for (int i = x1-1; i < x2; ++i) {
				a[y-1][i] = color;
			}
		} else if (str == "F") {
			int x, y; string color;
			cin >> x >> y >> color;
			//a[y][x] = color;
			fillit(y-1,x-1,a[y-1][x-1],color,r,c); //////////////////////////// method called
		} else if (str == "S") {
			string name;
			cin >> name;
			cout << name << endl;
			for (int i = 0; i < r; ++i) {
				for (int j = 0; j < c; ++j) {
					cout << a[i][j];
				}
				cout << endl;
			}
		} else if (str == "K") {
			int x1,y1,x2,y2;
			string color;
			cin >> x1 >> y1 >> x2 >> y2 >> color;
			if (x1 > x2) swap(x1, x2);
			if (y1 > y2) swap(y1, y2);
			for (int i = y1-1; i < y2; ++i) {
				for (int j = x1-1; j < x2; ++j) {
					a[i][j] = color;
				}
			}
		} else {
			string waste;
			getline(cin, waste);
		}
    	}
}
