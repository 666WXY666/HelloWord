package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * @author 王兴宇
 */
public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private EditText et1,et2;
    private RadioGroup rg;
    private CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello World!",Toast.LENGTH_SHORT).show();
                Log.d("Sign In:","SUCCESS");
            }
        });

        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"注册成功！",Toast.LENGTH_SHORT).show();
                Log.d("Sign Up:","SUCCESS");
            }
        });

        et1=findViewById(R.id.et_1);
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("username editText:",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("username:",s.toString());
            }
        });

        et2=findViewById(R.id.et_2);
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("password editText:",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("password:",s.toString());
            }
        });

        rg=findViewById(R.id.rg_1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb=group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,rb.getText(),Toast.LENGTH_SHORT).show();
                Log.d("RadioButton:",rb.getText().toString());
            }
        });

        cb=findViewById(R.id.cb_1);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this,"选中记住密码，小心！",Toast.LENGTH_SHORT).show();
                    Log.d("Remember Password:","True");
                }
                else {
                    Toast.makeText(MainActivity.this,"取消记住密码",Toast.LENGTH_SHORT).show();
                    Log.d("Remember Password:","False");
                }
            }
        });
    }
}
