package com.liu.myviewformatdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.liu.myviewformatdemo.view.MyImageView;

public class MainActivity extends AppCompatActivity {

    private MyImageView mMyImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }



    private void initView() {
        mMyImageView = (MyImageView) findViewById(R.id.myIv);
    }

    private void initData() {


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.my_rote);
        animation.setRepeatMode(Animation.RELATIVE_TO_SELF);
        animation.setRepeatCount(Animation.INFINITE);
        mMyImageView.setAnimation(animation);
        animation.start();

    }
}
