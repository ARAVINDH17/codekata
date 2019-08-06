#include <iostream>
using namespace std;
int main() {
  int n;
  int r,count=0;
  cin>>n;
  while(n>=1){
    r = n%10;
    count++;
    n=n/10;
  }
  cout<<count;
}
