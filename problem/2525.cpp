#include<iostream>
using namespace std;

int main()
{
    int hour, minute, time;
    cin >> hour >> minute;
    cin >> time;
    if ((hour >= 0 && hour <= 24) && (minute >= 0 && minute <= 59) && (time <= 1000 && time >= 0))
        minute = minute + time;

    switch(hour)
    {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
            if (minute >= 60)
            {
                hour = hour + int(minute / 60);
                minute = (minute % 60);
                if (hour > 23)
                {
                    hour = hour - 24;
                }
            }
        case 23:
            if (minute >= 60 && minute < 120)
            {
                hour = 0;
                minute = (minute % 60);
                
            }
            else if(minute >= 120)
            {
                hour = 0 + int(minute / 60) -1;
                minute = (minute % 60);
            }
    }
    cout << hour << " " << minute << endl;
    
}