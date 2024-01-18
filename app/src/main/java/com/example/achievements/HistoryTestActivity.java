package com.example.achievements;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 既存のXMLを読み込んでLinearLayoutを取得
        setContentView(R.layout.activity_history_test);
        LinearLayout linearLayout = findViewById(R.id.linear1);

        // 表示するTextViewの個数
        int numberOfTextViews = 3;

        // 新しいTextViewを指定した個数だけ作成してLinearLayoutに追加
        for (int i = 1; i <= numberOfTextViews; i++) {
            TextView textView = new TextView(this);
            textView.setText("TextView " + i);
            linearLayout.addView(textView);
        }
    }
}