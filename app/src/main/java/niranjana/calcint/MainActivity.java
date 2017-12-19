package niranjana.calcint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void simpleInterest(View view){
        System.out.println("Simple Interest");
        Intent intent = new Intent(this,simpleInterest.class);
        startActivity(intent);

    }
    public void compoundInterest(View view){

        System.out.println("Compound Interest");
        Intent intent = new Intent(this,compoundInterest.class);
        startActivity(intent);
    }
    public void emi(View view){
        System.out.println("emi");
        Intent intent = new Intent(this,emi.class);
        startActivity(intent);

    }
}
