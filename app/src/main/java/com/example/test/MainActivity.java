package com.example.test;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button listButton;
    public Button exitButton;
    public String [] list = {"사과","오렌지","포도"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listButton = findViewById(R.id.listButton);
        exitButton = findViewById(R.id.exitButton);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("List");
                builder.setItems(list, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),list[which]+"를 눌렀습니다.",Toast.LENGTH_LONG).show();
                    }
                });
                //알림창 생성 및 실행
                AlertDialog alertD = builder.create();
                alertD.show();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }
    private void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("안내");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("종료하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Clicked 취소button",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void addClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resultView =  (TextView) findViewById(R.id.resultView);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        resultView.setText(Integer.toString(n1 + n2));
    }

    public void subClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resultView =  (TextView) findViewById(R.id.resultView);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        resultView.setText(Integer.toString(n1 - n2));
    }

    public void mulClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resultView =  (TextView) findViewById(R.id.resultView);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        resultView.setText(Integer.toString(n1 * n2));
    }

    public void divClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resultView =  (TextView) findViewById(R.id.resultView);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        resultView.setText(Integer.toString(n1 / n2));
    }

    public void appleClick(View v){
        Toast.makeText(getApplicationContext(),"사과버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
    }
    public void orangeClick(View v){
        Toast.makeText(getApplicationContext(),"오렌지버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
    }
    public void grapeClick(View v){
        Toast.makeText(getApplicationContext(),"포도버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
    }

    public void exitClick(View v){

    }
}