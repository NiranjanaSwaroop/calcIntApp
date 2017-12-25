package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class simpleInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
    }


    public void calcSi(View view){

        System.out.println("Calculate Simple Interest!");

        EditText principleET = (EditText)findViewById(R.id.principleET);
        EditText rateET = (EditText)findViewById(R.id.rateET);
        EditText yTimeET = (EditText)findViewById(R.id.yTimeET);
        EditText mTimeET = (EditText)findViewById(R.id.mTimeET);
        EditText dTimeET = (EditText)findViewById(R.id.dTimeET);

        double principle = new Double(principleET.toString());
        double rate = new Double(rateET.toString());
        double yTime = new Double(yTimeET.toString());
        double mTime = new Double(mTimeET.toString());
        double dTime = new Double(dTimeET.toString());
        double time = yTime + (mTime/12.0) +(dTime/365.0);
        double simpeInterest = (principle * time * rate)/100.0;

        String simpleInterestStr =  Double.toString(simpeInterest);
        System.out.println(simpeInterest);
        Toast.makeText(getApplicationContext(),("The simple interest is "+simpleInterestStr+" ."),Toast.LENGTH_LONG).show();

    }
}
