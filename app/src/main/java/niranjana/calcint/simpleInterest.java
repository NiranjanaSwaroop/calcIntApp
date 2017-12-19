package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class simpleInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
    }


    public void calcSi(View view){
        System.out.println("Calculate Simple Interest!");
    }
}
