package com.example.achievements;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_PARENT,
//                ConstraintLayout.LayoutParams.MATCH_PARENT));
//
//        // TextViewを作成
//        TextView tvHistoryTitle = new TextView(this);
//        int viewId = View.generateViewId();
//        tvHistoryTitle.setID(viewId);
//        tvHistoryTitle.setText(R.string.tv_history_title);//タイトル
//        tvHistoryTitle.setLayoutParams(new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_PARENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT));
//        constraintLayout.addView(tvHistoryTitle);
//
//        ConstraintSet constraintSet = new ConstraintSet();
//        constraintSet.clone(constraintLayout);
//        constraintSet.con


        // メインのLinearLayout
        LinearLayout mainLinearLayout = new LinearLayout(this);
        mainLinearLayout.setOrientation(LinearLayout.VERTICAL);
        mainLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        mainLinearLayout.setGravity(Gravity.CENTER);
        mainLinearLayout.setPadding(10, 10, 10, 10); // padding=10dp

/*        -----------------------------------
                linearLayoutA(horizontal)
                    linearLayoutB(vertical)
                        textview（指定の個数）
           ----------------------------------
           上記のまとまりを1ブロックとしています。1ブロック＝ペット1体分です。


*/
        // ブロックの数（過去のペットの数）
        int numberOfBlocks = 3;

        // TextViewの数（固定）
        int numberOfTv = 3;

        // ブロックごとに繰り返し
        for (int i = 1; i <= numberOfBlocks; i++) {


            // LinearLayoutA
            LinearLayout linearLayoutA = new LinearLayout(this);
            linearLayoutA.setOrientation(LinearLayout.HORIZONTAL);
            linearLayoutA.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutA.getLayoutParams();//レイアウトパラメータの取得
            linearLayoutA.setPadding(0, 20, 0, 20); // paddingStart=20dp,paddingEnd=20dp
            linearLayoutA.setBackgroundResource(R.drawable.shape_style_orange);//色と角丸を設定

            layoutParams.setMargins(0, 0, 0, 0); // marginTop=0dp
            linearLayoutA.setLayoutParams(layoutParams);

            // LinearLayoutB
            LinearLayout linearLayoutB = new LinearLayout(this);
            linearLayoutB.setOrientation(LinearLayout.VERTICAL);
            linearLayoutB.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));


            // TextViewを生成してLinearLayoutBに追加
            for (int j = 1; j <= numberOfTv; j++) {
                TextView textView = new TextView(this);
                textView.setText("TextView " + j);
                linearLayoutB.addView(textView);
            }


            // LinearLayoutAにLinearLayoutBを追加
            linearLayoutA.addView(linearLayoutB);

            // メインのLinearLayoutにLinearLayoutAを追加
            mainLinearLayout.addView(linearLayoutA);
        }

        // 最終的なメインのLinearLayoutをActivityのコンテンツビューにセット
        setContentView(mainLinearLayout);

//        // 新しいレイアウトをインフレート
//        View newContentView = getLayoutInflater().inflate(R.layout.your_new_content_layout, null);
//
//        // ScrollViewを取得
//                ScrollView scrollView = findViewById(R.id.svHistory);
//
//        // ScrollViewに新しいビューを追加
//                scrollView.addView(newContentView);
    }
}