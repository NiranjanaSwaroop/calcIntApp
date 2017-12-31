package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class emi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
    }

    private boolean isEmpty(EditText editText){
        if(editText.getText().toString().length()>0){
            return false;
        }
        return true;
    }

    private void handleEmpty(EditText editText,String name){
        String message = name +" is empty!!\nPlease fill with proper data.";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    public void calculateEmi(View view){
        System.out.println("The Emi is !");

        int count = 0;

        EditText amountEt = findViewById(R.id.amountET);
        EditText rateEmiEt = findViewById(R.id.rateEmiET);
        EditText monthsEt = findViewById(R.id.timeEmiET);

        if(isEmpty(amountEt)){
            handleEmpty(amountEt,"Amount");
            count++;
        }
        if (isEmpty(rateEmiEt)){
            handleEmpty(rateEmiEt,"Rate");
            count++;
        }
        if (isEmpty(monthsEt)){
            handleEmpty(monthsEt,"Months");
            count++;
        }
        if (count == 0){
            float amount = Float.parseFloat(amountEt.getText().toString());
            float ratePerAnnum = Float.parseFloat(rateEmiEt.getText().toString());
            float rate = ratePerAnnum/12.0f;
            rate = rate/100.0f;
            float months = Float.parseFloat(monthsEt.getText().toString());

            CheckBox roundOff = findViewById(R.id.roundEmi);


            float onePlusRate = rate + 1;
            float fraction = (float) (pow(onePlusRate,months)/(pow(onePlusRate,months)-1.0f));
            float emi =      (amount*rate)*fraction;
            if(roundOff.isChecked()){
                emi = (float)ceil(emi);
            }
            String message = "The EMI is "+emi+" .";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        }





    }
}
