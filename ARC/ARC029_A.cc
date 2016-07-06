#include <iostream>
#include <string>
#include <vector>
#include <cmath>
#include <algorithm>
#include <sstream>
#include <fstream>
#include <cstdio>
#include <set>
#include <map>
#include <stack>
#include <queue>
#include <deque>
#include <complex>
#include <ctime>
#include <bitset>
#include <cstring>
#include <cstdlib>
#include <iterator>
 
#define pb push_back
#define pf push_front
#define mp make_pair
#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define REP(i,n) FOR(i,0,n)
#define ALL(a) (a).begin(),(a).end()
#define RALL(a) (a).rbegin(), (a).rend()
 
typedef long long int lli;
typedef long long ll;
using namespace std;
 
int main(){
    int N;
    cin >> N;
    
    int T[4]={};
    REP(i,N)cin >> T[i];
 
 
    int ans=1000000;
    ans=min(max(T[0]+T[1], T[2]+T[3]), max(T[0]+T[2], T[1]+T[3]));
    ans=min(ans, max(T[0]+T[3], T[1]+T[2]));
    ans=min(ans, max(T[0]+T[1]+T[2], T[3]));
    ans=min(ans, max(T[0]+T[2]+T[3], T[1]));
    ans=min(ans, max(T[0]+T[1]+T[3], T[2]));
    ans=min(ans, max(T[1]+T[2]+T[3], T[0]));
    cout << ans << endl;
    
}