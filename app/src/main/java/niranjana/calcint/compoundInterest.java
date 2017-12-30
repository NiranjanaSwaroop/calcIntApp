package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class compoundInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
    }

    private boolean isEmpty(EditText editText ){
        if(editText.getText().toString().length()>0){
            return false;
        }
        return true;
    }
    private void handleEmpty(EditText editText,String name){
        String message = name + " is empty!!\nPlease fill proper data.";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
    public void calculateCi(View view){
        System.out.println("The compound interest is !");
        int count = 0;

        EditText principleET = findViewById(R.id.prCiET);
        EditText ratePercentET = findViewById(R.id.rateCiET);
        EditText yTimeET = findViewById(R.id.yTimeCiET);
        EditText mTimeET = findViewById(R.id.mTimeCiET);
        EditText dTimeET = findViewById(R.id.dTimeCiET);
        EditText numberOfTimesET = findViewById(R.id.nTimesET);

        if(isEmpty(principleET)){
            handleEmpty(principleET,"Principle");
            count++;
        }
        if (isEmpty(ratePercentET)){
            handleEmpty(ratePercentET,"Rate");
            count++;
        }
        if (isEmpty(yTimeET))
        {
            handleEmpty(yTimeET,"Years");
            count++;
        }
        if (isEmpty(mTimeET)){
            handleEmpty(mTimeET,"Months");
            count++;
        }
        if (isEmpty(dTimeET)){
            handleEmpty(dTimeET,"Days");
            count++;
        }
        if (isEmpty(numberOfTimesET)){
            handleEmpty(numberOfTimesET,"Number of times");
            count++;
        }
        if(count == 0){
            float principle = Float.parseFloat(principleET.getText().toString());
            float ratePercent = Float.parseFloat(ratePercentET.getText().toString());
            float rate = ratePercent/100.0f;
            float yTime = Float.parseFloat(yTimeET.getText().toString());
            float mTime = Float.parseFloat(mTimeET.getText().toString());
            float dTime = Float.parseFloat(dTimeET.getText().toString());
            float numberOfTimes = Float.parseFloat(numberOfTimesET.getText().toString());
        }



    }
}
