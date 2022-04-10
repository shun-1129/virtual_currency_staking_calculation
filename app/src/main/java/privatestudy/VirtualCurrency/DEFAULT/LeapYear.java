package privatestudy.VirtualCurrency.DEFAULT;

public class LeapYear {
    public int LeapYear(int Year) {
        int YearDay = 365;

        if(Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    YearDay = 366;
                }
            } else {
                YearDay = 366;
            }
        }

        return YearDay;
    }
}
