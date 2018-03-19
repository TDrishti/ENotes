package project.com.elearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

        String mail = null;
        TextView phoneHead;
        EditText phone;
        Button verifyBt;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);

            phoneHead = findViewById(R.id.phonehd);
            phone = findViewById(R.id.phone);
            verifyBt = findViewById(R.id.verifybt);

            phoneHead.setVisibility(View.INVISIBLE);
            phone.setVisibility(View.INVISIBLE);
            verifyBt.setVisibility(View.INVISIBLE);

            Button phoneLogin = findViewById(R.id.phonelogin);
            phoneLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    phoneHead.setVisibility(View.VISIBLE);
                    phone.setVisibility(View.VISIBLE);
                    verifyBt.setVisibility(View.VISIBLE);

                    verifyBt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(LoginActivity.this,PhoneVerify.class);
                            String phoneNumber = String.valueOf(phone.getText());
                            Bundle bundle = new Bundle();
                            bundle.putString("number", phoneNumber);

                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
}
