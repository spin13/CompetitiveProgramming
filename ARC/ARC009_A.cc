#include <iostream>
#include <vector>
using namespace std;
 
int main(){
    vector <int> ta;
    
    int N;
    cin >> N;  //n
 
    int i=0;
 
    int num;
    int ex;
 
    int sum=0;
 
    while(i<N){
        cin >> num;
        cin >> ex;
        sum=num*ex+sum;
        i++;
    }
    int a=sum*1.05;
    cout << a << endl;
    return 0;
}