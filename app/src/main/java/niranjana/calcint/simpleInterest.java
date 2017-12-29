package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.*;

import static java.lang.Math.ceil;
import static java.lang.String.valueOf;

public class simpleInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
    }

    private boolean isEmpty(EditText editText) {
        if (editText.getText().toString().trim().length() > 0)
            return false;

        return true;
    }
    private void handleEmpty(EditText editText,String name){

        String message = name + " is empty!!\nPlease fill proper data.";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();


    }

    public void calculateSi(View view) {

        System.out.println("Calculate Simple Interest!");


        int count = 0;

        EditText principleET = findViewById(R.id.principleET);
        EditText rateET = findViewById(R.id.rateET);
        EditText yTimeET = findViewById(R.id.yTimeET);
        EditText mTimeET = findViewById(R.id.mTimeET);
        EditText dTimeET = findViewById(R.id.dTimeET);
        if (isEmpty(principleET)) {
            handleEmpty(principleET, "Principle");
            count++;
        }
        if (isEmpty(rateET)) {
            handleEmpty(rateET, "Rate");
            count++;

        }

        if (isEmpty(yTimeET)) {
                handleEmpty(yTimeET, "Years");
                count++;

            }
        if (isEmpty(mTimeET)) {
                handleEmpty(mTimeET, "Months");
                count++;

            }
        if (isEmpty(dTimeET)) {
                handleEmpty(dTimeET, "Days");
                count++;
            }


          if(count == 0){


            float principle = Float.parseFloat(principleET.getText().toString());
            float rate = Float.parseFloat(rateET.getText().toString());
            float yTime = Float.parseFloat(yTimeET.getText().toString());
            float mTime = Float.parseFloat(mTimeET.getText().toString());
            float dTime = Float.parseFloat(dTimeET.getText().toString());

            float time = (float) (yTime + (mTime / 12.0) + (dTime / 365.0));
            float simpeInterest = (float) ((principle * time * rate) / 100.0);

            String simpleInterestStr = Float.toString(simpeInterest);
            System.out.println(simpeInterest);
            String message = "The simple interest is " + ceil(simpeInterest) + " .";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }
    }
}
