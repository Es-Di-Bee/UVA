#include <bits/stdc++.h>
using namespace std; 
#define ll long long
int main() { 
  ios_base::sync_with_stdio(false); 
  cin.tie(NULL); 
  ll i = 0, j = 0;
  map<ll, ll> mp;
  while(cin>>i>>j) { 
    cout<<i<<" "<<j<<" ";
    if (i > j ) swap(i,j);
    ll ans = 0;
    ll count = 0; 
    for (ll n = i; n <= j; ++n) { 
      if (mp.count(n) > 0) {
        count = mp[n];
      } else { 
        count = 1; 
        ll temp = n; 
        while(temp != 1) { 
          if (temp &1 == 1)
            temp =(3*temp)+1;
          else temp /= 2; 
          ++count; 
        } 
        mp.insert(make_pair(n, count));  
      } 
      ans = max(ans, count);
    } cout<< ans << endl; 
  } 
}