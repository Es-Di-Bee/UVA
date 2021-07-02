#include<bits/stdc++.h>
#define readfromfile() freopen("input.txt", "r", stdin);
#define writetofile()  freopen("output.txt", "w", stdout);
#define fastio() ios_base::sync_with_stdio(false); cin.tie(NULL);
#define arrayinput() for (int i = 0; i < n; ++i) cin >> a[i];
#define debug(val) cout << "The value is " << val << endl;
#define ll long long
using namespace std;

double a[10000];
int tc = 0, n = 0;

int main() {
    	fastio();
	#ifndef ONLINE_JUDGE
		readfromfile();
    	#endif

    	while(cin >> n && n != 0) {
		arrayinput();
		double sum = 0;
		for (int i = 0; i < n; ++i) sum += a[i];
		double avg = sum / n;
		double pos = 0, neg = 0;
		for (int i = 0; i < n; ++i) {
			double dif = a[i] - avg;
			dif = (long) (dif * 100.0) / 100.0;
			if (dif > 0) pos += dif;
			else neg += dif;
		}
		cout << fixed;
		cout << setprecision(2);
		cout << "$" << (-(neg) > pos? -(neg) : pos) << "\n";
    	}
}

