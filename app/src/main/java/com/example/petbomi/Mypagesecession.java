package com.example.petbomi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Mypagesecession extends AppCompatActivity {
    TextView mypage_secession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        mypage_secession = findViewById(R.id.mypage_secession);
        mypage_secession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showMessage();
            }
        });
    }

    private void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("회원 탈퇴");
        builder.setMessage("정말로 탈퇴하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("탈퇴하기", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int whichButton) {
                String message = "탈퇴되었습니다. ";
                mypage_secession.setText(message);
            }
        });
        builder.setNeutralButton("취소", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int whichButton) {
                String message = "취소 버튼이 눌렸습니다. ";
                mypage_secession.setText(message);
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int whichButton) {
                String message = "아니오 버튼이 눌렸습니다. ";
                mypage_secession.setText(message);
            }
        });
        AlertDialog dialog = builder.create();

        dialog.show();
    }

}

