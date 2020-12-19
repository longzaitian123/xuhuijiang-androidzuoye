package com.example.endzuoye;
//引导页

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.endzuoye.adapter.LaunchImproveAdapter;

public class LaunchImproveActivity extends AppCompatActivity {
    // 声明引导页面的图片数组
    private int[] lanuchImageArray = {R.drawable.p1,
            R.drawable.p2, R.drawable.p3, R.drawable.p4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_improve);

        getSupportActionBar().hide();
        // 从布局视图中获取名叫vp_launch的翻页视图
        ViewPager vp_launch = findViewById(R.id.vp_launch);
        // 构建一个引导页面的碎片翻页适配器
        LaunchImproveAdapter adapter = new LaunchImproveAdapter(getSupportFragmentManager(), lanuchImageArray);
        // 给vp_launch设置引导页面适配器
        vp_launch.setAdapter(adapter);
        // 设置vp_launch默认显示第一个页面
        vp_launch.setCurrentItem(0);
    }
}