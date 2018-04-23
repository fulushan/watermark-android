package cn.fulushan.watermark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.fulushan.watermark.view.WaterMarkBg;

public class MainActivity extends AppCompatActivity {
    private TextView bg_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg_tv = findViewById(R.id.bg_tv);

        SimpleDateFormat createTimeSdf1 = new SimpleDateFormat("yyyy-MM-dd");

        List<String> labels = new ArrayList<>();
        labels.add("用户名：张三");
        labels.add("日期："+ createTimeSdf1.format(new Date()));
        labels.add("不可扩散");
        bg_tv.setBackgroundDrawable(new WaterMarkBg(MainActivity.this,labels,-30,13));


    }
}
