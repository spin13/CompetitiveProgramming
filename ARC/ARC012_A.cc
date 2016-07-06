#include <iostream>
#include <string>
using namespace std;
 
int main(){
    string a;
    cin >> a;
    if(a=="Monday"){
        cout << 5;
    }else if(a=="Tuesday"){
        cout << 4;
    }else if(a=="Wednesday"){
        cout << 3;
    }else if(a=="Thursday"){
        cout << 2;
    }else if(a=="Friday"){
        cout <<1;
    }else{
        cout <<0;
    }
}