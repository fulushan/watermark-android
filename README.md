#  android版本水印
==请加star 请加star 请加star 重要的事情说三遍！！！==
### 特点
支持多行水印，支持自定义角度，支持自定义文字大小。

### 原理： 
使用一个TextView 占据整个页面。在TextView基础上面打水印。

### 用法：
具体的view在

```
cn.fulushan.watermark.view.WaterMarkBg.java 
```

具体的用法

```

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
```
效果图

![image](https://github.com/fulushan/watermark-android/blob/master/intro.jpeg)


