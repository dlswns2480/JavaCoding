#include<iostream>
using namespace std;

int main()
{
    int a[10];
    int i = 0;
    int largest = 0;
    while(i < 9)
    {
        cin >> a[i];
        if(a[i] >= 100)
        {
            break;
        }
        i++;
    }
    i = 0;
    for(i = 0; i < 8; i++)
    {
        if (a[i] < a[i+1])
        {
            largest = i+1;
        }
    }
    cout << a[largest] << endl; 
    cout << largest + 1 << endl;
}