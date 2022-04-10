package privatestudy.VirtualCurrency.DEFAULT;

import java.util.Calendar;

public class DateJudg {
    public Calendar calendar = Calendar.getInstance();

    public int GetYear() {
        int Year = 0;

        Year = calendar.get(Calendar.YEAR);

        return Year;
    }

    public int GetMonth() {
        int Month = 0;

        Month = calendar.get(Calendar.MONTH) + 1;

        return Month;
    }

    public int GetDay() {
        int Day = 1;

        Day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        return Day;
    }
}
