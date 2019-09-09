package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_taikhoan , edt_matkhau ;
    CheckBox cb ;
    Button btn_dangnhap;
    TextView tv_ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_taikhoan = (EditText) findViewById(R.id.edt_taikhoan);
        edt_matkhau = (EditText) findViewById(R.id.edt_matkhau);
        cb = (CheckBox) findViewById(R.id.cb);
        btn_dangnhap = (Button) findViewById(R.id.btn_dangnhap);
        tv_ketqua = (TextView) findViewById(R.id.tv_ketqua);
        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked()){
                    tv_ketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }else {
                    tv_ketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
            }
        });
    }

}
