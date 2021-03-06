package net.ariflaksito.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputNama = (EditText) findViewById(R.id.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPwd = (EditText) findViewById(R.id.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.in_button_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("--Nama--", inputNama.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Phone--", inputPhone.getText().toString());
                Log.d("--Password--", inputPwd.getText().toString());
            }
        });
    }
}