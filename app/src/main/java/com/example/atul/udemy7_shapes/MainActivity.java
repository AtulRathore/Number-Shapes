package com.example.atul.udemy7_shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    public void testNumber(View view){

        EditText userNumber = (EditText) findViewById(R.id.userNumber);
        Log.i("User Number", userNumber.getText().toString());

        /*Shapes myNUm = new Shapes();
        myNUm.number = 7;

        System.out.println(myNUm.isSquare());*/

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
