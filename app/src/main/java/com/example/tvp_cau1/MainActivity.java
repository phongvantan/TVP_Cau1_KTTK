package com.example.tvp_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_tk1,tv_tk2;
EditText et_1,et_2;
CheckBox cb_ltt;
Button btn_dn,btn_thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_tk1=(TextView)findViewById(R.id.textView_tk1);
        tv_tk2=(TextView)findViewById(R.id.textView_tk2);
        et_1=(EditText)findViewById(R.id.editText_1);
        et_2=(EditText)findViewById(R.id.editText_2);
        cb_ltt=(CheckBox)findViewById(R.id.checkBox_ltt);
        btn_dn=(Button)findViewById(R.id.button_dn);
        btn_thoat=(Button)findViewById(R.id.button_thoat);

        btn_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String thongbao="Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu";
                if (cb_ltt.isChecked()==true)
                {
                    thongbao="Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu";
                }

                else
                    thongbao="Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu";
                Toast.makeText(getApplicationContext(),thongbao,Toast.LENGTH_SHORT).show();

            }


    });
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this,android.R.style.Theme_DeviceDefault_Dialog);
                builder.setTitle("Thông báo");
                builder.setMessage("Bạn có muốn thoát không ?");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }
}
