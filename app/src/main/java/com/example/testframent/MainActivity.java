package com.example.testframent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnThayDoi = findViewById(R.id.btnThayDoiFrag);



        btnThayDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Truyền dữ liệu từ Activity
                FragmentManager fragmentManager = getSupportFragmentManager();
               Fragment_A fragment_a = (Fragment_A) getSupportFragmentManager().findFragmentById(R.id.fragmentA);
               fragment_a.txt.setText("Thay DOi Boi Activity");

            }
        });

    }
}