package android.example.arabicdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.arabicdictionary.Dictionaries.FamilyMembers;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView colorsActivity;
    TextView bodyParts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        colorsActivity = (TextView) findViewById(R.id.Colors);


        colorsActivity.setOnClickListener(this);

















    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(MainActivity.this , FamilyMembers.class);
        startActivity(i);


    }
}
