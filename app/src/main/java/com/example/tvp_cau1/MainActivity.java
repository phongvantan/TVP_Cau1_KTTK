package com.example.tvp_cau1;

import androidx.appcompat.app.AppCompatActivity;

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
Button btn_dn;

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
    }
}
