package com.liu.myviewformatdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.liu.myviewformatdemo.R;

/**
 * @Description: 描述
 * @AUTHOR 刘楠  Create By 2016/10/12 0012 14:41
 */
public class MyImageView extends ImageView {
    public MyImageView(Context context) {
        this(context,null);
    }

    public MyImageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //获取所有的自定义属性集合
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MyImageView, defStyleAttr,0);


        //获取是还是显示boolean值

        boolean isDisplay = typedArray.getBoolean(R.styleable.MyImageView_my_display, true);


        if(isDisplay){
            this.setVisibility(VISIBLE);
        }else {
            this.setVisibility(GONE);
        }


    }


}
