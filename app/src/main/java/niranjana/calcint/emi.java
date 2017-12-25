package niranjana.calcint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class emi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
    }

    public void calcEmi(View view){
        System.out.println("The Emi is !");
    }
}
