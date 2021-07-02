#include<bits/stdc++.h>
#define readfromfile() freopen("input.txt", "r", stdin);
#define writetofile()  freopen("output.txt", "w", stdout);
#define fastio() ios_base::sync_with_stdio(false); cin.tie(NULL);
#define arrayinput() for (int i = 0; i < n; ++i) cin >> a[i];
#define debug(val) cout << "The value is " << val << endl;
#define ll long long
using namespace std;

int main() {
	fastio();
	#ifndef ONLINE_JUDGE
		readfromfile();
    	#endif

	int n , m;
	int fieldNo = 1;
	int tc = 1;
	while (cin >> n >> m && n != 0 && m != 0) {
		if (tc != 1) cout << "\n";
		string s[n] = {};
		getline(cin, s[0]); // this is for waste
		cout << "Field #" << fieldNo << ":\n";
		for (int i = 0; i < n; ++i) {
			getline(cin, s[i]);
		}

		for (int i = 0; i < n; ++i) {
			string ans = "";
			string str = s[i];
			for (int j = 0; j < str.size(); ++j) {
				int count = 0;
				if (str[j] == '*') {
					cout << '*';
					continue;
				}
				if (i-1 >= 0) {
					string strUp = s[i-1];
					if (j-1 >= 0 && strUp[j-1] == '*') ++count;
					if (strUp[j] == '*') ++count;
					if (j+1 <= m-1 && strUp[j+1] == '*') ++count;
				}
				if (j-1 >= 0 && str[j-1] == '*') ++count;
				if (j+1 <= m-1 && str[j+1] == '*') ++count;
				if (i+1 <= n-1) {
					string strDown = s[i+1];
					if (j-1 >= 0 && strDown[j-1] == '*') ++count;
					if (strDown[j] == '*') ++count;
					if (j+1 <= m-1 && strDown[j+1] == '*') ++count;
				}
				cout << count;
			}
			cout << "\n";
		}
		++fieldNo;
		++tc;
	}
}
