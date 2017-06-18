package in.bloomingbeacon.bloomingbeacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button sign_in, register;
    TextView forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        sign_in = (Button) findViewById(R.id.sign_in);
        register = (Button) findViewById(R.id.register);
        forgot_password = (TextView) findViewById(R.id.forgot_password);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit_username = username.getText().toString();
                String edit_password = password.getText().toString();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
    }
}
