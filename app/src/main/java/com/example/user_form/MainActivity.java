package com.example.user_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnClick(v);
            }
        });
    }


    public void onBtnClick(View view) {
        TextView messageShow = findViewById(R.id.messageShow);
        EditText fullName = findViewById(R.id.fullName);


        String fullnameShow = "First Name: " + fullName.getText().toString();

        messageShow.setText(fullnameShow);




        TextView messageShow2 = findViewById(R.id.messageShow2);
        EditText lastName = findViewById(R.id.lastName);


        String lastnameShow = "Last Name: " + lastName.getText().toString();

        messageShow2.setText(lastnameShow);

        TextView messageShow3 = findViewById(R.id.messageShow3);
        EditText age = findViewById(R.id.age);


        String ageShow = "Your Age: " + age.getText().toString();

        messageShow3.setText(ageShow);


        TextView messageShow4 = findViewById(R.id.messageShow4);
        EditText address = findViewById(R.id.address);


        String addressShow = "Address: " + address.getText().toString();

        messageShow4.setText(addressShow);

    }


}
