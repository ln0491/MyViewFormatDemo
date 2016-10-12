package com.liu.myviewformatdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.liu.myviewformatdemo.R;

/**
 * @Description: 描述
 * @AUTHOR 刘楠  Create By 2016/10/12 0012 13:54
 */
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        this(context,null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

       TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTextView);


        //获取文字
        String textName = typedArray.getString(R.styleable.MyTextView_my_textname);

        this.setText(textName);

        //获取文字大小
        float textsize = typedArray.getDimensionPixelSize(R.styleable.MyTextView_my_textsize, 14);

        this.setTextSize(textsize);


        //获取文字颜色
        int color = typedArray.getColor(R.styleable.MyTextView_my_textcolor, 0xff00ff00);
        this.setTextColor(color);


        //获取背景
        int resourceId = typedArray.getResourceId(R.styleable.MyTextView_my_background, R.mipmap.ic_launcher);

        this.setBackgroundResource(resourceId);



    }
}
