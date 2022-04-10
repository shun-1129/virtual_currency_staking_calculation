package privatestudy.VirtualCurrency;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import privatestudy.VirtualCurrency.DEFAULT.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeapYear Leap = new LeapYear();
        DateJudg Judg = new DateJudg();

        int Year = 2024;
        int Ans1 = Leap.LeapYear(Year);
        String Ans2 = Judg.GetYear() + "/" + Judg.GetMonth() + "/" + Judg.GetDay();

        Toast.makeText(this, String.valueOf(Ans1) + " : " + Ans2, Toast.LENGTH_SHORT).show();
    }
}