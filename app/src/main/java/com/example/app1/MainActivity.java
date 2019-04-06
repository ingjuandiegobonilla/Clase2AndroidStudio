package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declarando variables
        Button btnClick = findViewById(R.id.btn);
        Button btnClick2 = findViewById(R.id.btn2);
            btnClick.setOnClickListener(this); // implementando el OnClick de la actividad
            btnClick2.setOnClickListener(this);


        Switch swonoff = findViewById(R.id.switch1);
        swonoff.setChecked(false);
        swonoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){

                if(isChecked){

                    Toast.makeText(MainActivity.this, R.string.Switchon, Toast.LENGTH_SHORT).show();

                }
                else if(!isChecked){

                    Toast.makeText(MainActivity.this, R.string.Switchoff, Toast.LENGTH_SHORT).show();

                }


            }
        });


    };

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn:
                Toast.makeText(this, R.string.Btn_Principal, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, R.string.Btn_Secundario, Toast.LENGTH_SHORT).show();
                break;
        }


    }
}


/*
public class MainActivity extends AppCompatActivity {


    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.btn);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, R.string.Btn_Principal, Toast.LENGTH_LONG).show();

            }
        });

    }

}
*/
