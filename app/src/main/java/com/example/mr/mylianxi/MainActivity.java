package com.example.mr.mylianxi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private ImageView img;
    Handler hander = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Bitmap bit = (Bitmap) msg.obj;
            img.setImageBitmap(bit);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        try {
                            URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1523354357198&di=0045d362cde44662476677ca2cd8eeac&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3D853448de252dd42a5f0901a3333a5b2f%2F4372d8a20cf431ad99f15e8e4b36acaf2fdd98af.jpg");

                            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                            urlConnection.setConnectTimeout(5000);
                            urlConnection.setReadTimeout(5000);
                            urlConnection.setRequestMethod("GET");

                            int responseCode = urlConnection.getResponseCode();

                            if (responseCode == 200){
                                InputStream inputStream = urlConnection.getInputStream();

                                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

                                Message msg = Message.obtain();
                                msg.obj = bitmap;
                                hander.sendMessage(msg);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
    }
}
