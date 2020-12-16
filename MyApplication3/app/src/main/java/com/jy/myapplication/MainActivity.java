package com.jy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText pri1;
    private EditText pri2;
    private EditText pri3;
    private EditText pri4;
    private EditText count1;
    private EditText count2;
    private EditText count3;
    private EditText count4;
    private Button but1;
    private Button but2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pri1 = findViewById(R.id.price1);
        pri2 = findViewById(R.id.price2);
        pri3 = findViewById(R.id.price3);
        pri4 = findViewById(R.id.price4);
        count1 = findViewById(R.id.count1);
        count2 = findViewById(R.id.count2);
        count3 = findViewById(R.id.count3);
        count4 = findViewById(R.id.count4);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }
                         public void onClick(View view) {
                        switch (view.getId()) {
                            case R.id.but1:
                                pri1.setText("");
                                pri2.setText("");
                                pri3.setText("");
                                pri4.setText("");
                                count1.setText("");
                                count2.setText("");
                                count3.setText("");
                                count4.setText("");
                                break;
                            case R.id.but2:
                               int pri1 = fun(this.pri1);
                                int pri2 = fun(this.pri2);
                                int pri3 = fun(this.pri3);
                                int pri4 = fun(this.pri4);
                                int count1 = fun(this.count1);
                                int  count2= fun(this.count2);
                                int count3 = fun(this.count3);
                                int count4 = fun(this.count4);
                                final int num= pri1*count1+pri2*count2+pri3*count3+pri4*count4;
                                new AlertDialog.Builder(this)
                                        .setTitle("提示")
                                        .setMessage("你金额"+num)
                                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                                                    intent.putExtra("num",num);
                                                startActivity(intent);

                                            }
                                        })
                                        .setNegativeButton("取消",null)
                                        .show();
                                break;
                        }
                    }
                    public int fun(EditText et){
                        String s = et.getText().toString();
                        int d = Integer.parseInt(s);
                        return d;

                    }
                }





