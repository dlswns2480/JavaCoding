#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    int num1;
    int a, b;
    int num2;
    int num3;

    int cnt = 0;
    int og ;

    cin >> og;
    num1 = og;
    while(true)
    {
        a = num1 / 10;
        b = num1 % 10;
        num2 = a + b;
         cnt++;
        
        num3 = (10*b) + (num2%10);
        if(og == num3)
        {
            break;
        }
        num1 = num3;
    }
    cout << cnt;

}