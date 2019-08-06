#include <iostream>
using namespace std;
int main() {
  int n;
  cin>>n;
  int tem=0;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  for(int i=0;i<n;i++){
    tem=tem+arr[i];
  }
  cout<<tem/n;
}
