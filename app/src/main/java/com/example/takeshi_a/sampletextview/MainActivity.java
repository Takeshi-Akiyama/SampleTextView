package com.example.takeshi_a.sampletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_msg);

        // TextViewにjavaで文字をセットする場合
        textView.setText("Javaで表示文字を設定しました。layoutで指定した文字を表示する際はMainActivity.javaのsetText(17行目)をコメントアウトする");
    }
}
