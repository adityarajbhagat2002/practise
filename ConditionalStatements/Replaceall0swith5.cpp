#include <bits/stdc++.h>
using namespace std;

int convertFive(int n);

// Driver program to test above function
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << convertFive(n) << endl;
    }
}// } Driver Code Ends


int reverse(int n)
{
    int num=0;
    while(n>0)
    {
        num = (num*10)+(n%10);
        n/=10;
    }
    return num;
}

int convertFive(int n) 
{
    int num=0;
    while(n>0)
    {
        if(n%10 == 0)n+=5;
        num = (num*10)+(n%10);
        n/=10;
    }
    n = reverse(num);
    return n;
}
