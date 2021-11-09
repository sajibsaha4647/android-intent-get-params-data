package com.example.getdatafromactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editText = findViewById(R.id.editsubactivity);
        button = findViewById(R.id.MainBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {

                       String value = editText.getText().toString();
                       Intent intent = new Intent(Profile.this,MainActivity.class);
                       intent.putExtra( "name", value);
                       startActivity(intent);

               }catch (Exception e){

               }

            }
        });
    }
}