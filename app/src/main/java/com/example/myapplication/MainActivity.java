package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        TextView infoTextView=(TextView) findViewById(R.id.textView);
        switch (id){
            case R.id.action_one:
                infoTextView.setText("You`r choose was one!");
                return true;
            case R.id.action_two:
                infoTextView.setText("You`r choose was two!");
                return true;
            case R.id.action_three:
                infoTextView.setText("You`r choose was three!");
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }














    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public void onSettingsMenuClick(MenuItem item) {
        TextView infoTextView=(TextView) findViewById(R.id.textView);
        infoTextView.setText("Settings!");
    }
}