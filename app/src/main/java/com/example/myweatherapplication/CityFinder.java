package com.example.myweatherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
public class CityFinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityfinder);
        final EditText editText=findViewById(R.id.searchCity);
        ImageView backButton=findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> finish());

        editText.setOnEditorActionListener((v, actionId, event) -> {
            String newCity= editText.getText().toString();
            Intent intent=new Intent(CityFinder.this,MainActivity.class);
            intent.putExtra("City",newCity);
            startActivity(intent);
            return false;
        });
    }
}