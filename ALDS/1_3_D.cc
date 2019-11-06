#include <iostream>
#include <string>
#include <algorithm>
#include <stack>
#include <vector>

#define pb push_back
#define mp make_pair

using namespace std;

int main(){
    string S;
    cin >> S;

    int sum=0;
    stack<int> s1;
    // 水たまりのほう
    stack<pair<int, int> > s2;

    for(int i=0;i<S.length();i++){
        if('\\' == S[i]){
            s1.push(i);
        }else if('/' == S[i]){
            // 対応する"\\" が存在しない場合は水たまりにならない
            if(s1.size() > 0){
                int top = s1.top();
                s1.pop();
                sum += (i-top);

                // 今の地点から新しくできる水たまりの面積
                int a = i-top;
                while(s2.size()>0 && s2.top().first>top){
                    a += s2.top().second;
                    s2.pop();
                }
                s2.push(mp(top, a));
            }
        }
    }
    cout << sum << "\n";
    cout << s2.size();

    vector<int> puddle;
    while(s2.size() > 0){
        puddle.pb(s2.top().second);
        s2.pop();
    }
    reverse(puddle.begin(), puddle.end());

    for(int i=0;i<puddle.size();i++){
        cout << " ";
        cout << puddle[i];
    }

    cout << endl;
}
