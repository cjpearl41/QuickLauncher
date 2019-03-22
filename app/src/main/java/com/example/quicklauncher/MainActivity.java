package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.caleb_p_lines");
               if(startIntent != null){
                   startActivity(startIntent);
               }

            }
        });
        Button sixCalcBtn = (Button)findViewById(R.id.sixCalcBtn);
        sixCalcBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.caleb_p_firstapp_addition");
                if(startIntent != null){
                    startActivity(startIntent);
                }

            }
        });
        Button peachBtn = (Button)findViewById(R.id.peachBtn);
        peachBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.list_app");
                if(startIntent != null){
                    startActivity(startIntent);
                }

            }
        });
        Button creativeBtn = (Button)findViewById(R.id.creativeBtn);
        creativeBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.my_list_view");
                if(startIntent != null){
                    startActivity(startIntent);
                }

            }
        });
        Button quadBtn = (Button)findViewById(R.id.quadBtn);
        quadBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.caleb_p_quadratic");
                if(startIntent != null){
                    startActivity(startIntent);
                }

            }
        });
        Button dbBtn = (Button)findViewById(R.id.dbBtn);
        dbBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.database");
                if(startIntent != null){
                    startActivity(startIntent);
                }

            }
        });
        //Attempt to launch an activity outside our app
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String google = "http://www.westada.tech/a4/calebp";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotoGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoGoogle);
                }
            }
        });

    }
}
