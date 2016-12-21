package com.example.atul.udemy7_shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Shapes{
        int number;

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + x;
            }

            if(number==triangularNumber){
                return true;
            }else{
                return false;
            }

        }

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);

            if(squareRoot==Math.floor(squareRoot)){
                return true;
            }
            else{
                return false;
            }
        }
    }



    public void testNumber(View view){

        String message ="";
        EditText userNumber = (EditText) findViewById(R.id.userNumber);
        Log.i("User Number", userNumber.getText().toString());

        if(userNumber.getText().toString().isEmpty()){
            message="Please enter a number.";
        }
        else {

        Shapes myNUm = new Shapes();

        myNUm.number = Integer.parseInt(userNumber.getText().toString());

        if(myNUm.isSquare()){

            if(myNUm.isTriangular()){
                message= myNUm.number+" is both Triangular and Square";
            }else{
                message=myNUm.number+" is only Square but not Triangular";
            }
        }else {
            if(myNUm.isTriangular()){
                message= myNUm.number+" is Triangular but not Square";
            }else{
                message=myNUm.number+" is neither Triangular not Square ";
            }
            //message=myNUm.number+" is only a Triangular";
        }

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
       // System.out.println(myNUm.isSquare());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
