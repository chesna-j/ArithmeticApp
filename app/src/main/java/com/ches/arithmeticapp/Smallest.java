package com.ches.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Smallest extends AppCompatActivity {
     EditText e1,e2;
     AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest);
        e1=(EditText) findViewById(R.id.num1);
        e2=(EditText) findViewById(R.id.num2);
        b1=(AppCompatButton) findViewById(R.id.Smallest);
        b2=(AppCompatButton) findViewById(R.id.menu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getNum1 =e1.getText().toString();
                    String getNum2 =e2.getText().toString();
                    Double n1=Double.parseDouble(getNum1);
                    Double n2=Double.parseDouble(getNum2);
                    if(n1<n2)
                    {
                        Toast.makeText(getApplicationContext(),"smallest-"+n1.toString(), Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"smallest-"+n2.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}