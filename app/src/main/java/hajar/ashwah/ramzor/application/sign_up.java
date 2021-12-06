package hajar.ashwah.ramzor.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class sign_up extends AppCompatActivity {
private TextInputEditText etEmail,etPassword,etRePassword,etFullname,etPhone;
private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        etRePassword=findViewById(R.id.etRePassword);
        etFullname=findViewById(R.id.etName);
        btnSave=findViewById(R.id.btnSave);
        etPhone=findViewById(R.id.etPhone);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        private void validate () {

        }
        \\
    }
}