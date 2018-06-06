package com.bwei.tianwang20180606;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private EditText edit_sjh;
    private EditText edit_pass;
    private Button bt_zc;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        text = findViewById(R.id.textView);
        edit_sjh = findViewById(R.id.ed_sjh);
        edit_pass = findViewById(R.id.ed_pass);
        bt_zc = findViewById(R.id.bt_zc);
text.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
});
        bt_zc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_sjh.length() != 11){
                    Toast.makeText(Main3Activity.this,"手机号无法使用",Toast.LENGTH_SHORT).show();
                }
                if (edit_pass.length() >= 6){

                }else{
                    Toast.makeText(Main3Activity.this,"密码长度不正确",Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(Main3Activity.this,"注册成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
