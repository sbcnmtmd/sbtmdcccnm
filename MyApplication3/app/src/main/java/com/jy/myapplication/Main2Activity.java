package com.jy.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {


        private TextView tex1;
        private CheckBox cb;
        private TextView tex2;
        private Button butt;
        private double zhifu;
        private int sum;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            initView();
        }

        private void initView() {
            tex1 = findViewById(R.id.tex1);
            cb = findViewById(R.id.cb);
            tex2 = findViewById(R.id.tex2);
            butt = findViewById(R.id.butt);
            Intent integer = getIntent();
            sum = integer.getIntExtra("num",0);
            zhifu=sum;
            tex1.setText("您需要支付的金额为:"+ sum +"元");
            tex2.setText("您最终需要支付的金额为:"+ sum +"元");
            cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        Double sum1 =  sum *0.8;
                        tex2.setText("您最终需要支付的金额为:"+sum1+"元");
                        zhifu = sum1;
                    }else{
                        tex2.setText("您最终需要支付的金额为:"+ sum +"元");
                        zhifu = sum;
                    }
                }
            });
            butt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Main2Activity.this,"成功支付"+zhifu,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


