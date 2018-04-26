package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    Paint mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint mPaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint mPaint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint mPaint4 = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        mPaint1.setColor(Color.GRAY);
        canvas.drawCircle(200,150,100, mPaint1);

        mPaint2.setColor(Color.YELLOW);
        canvas.drawCircle(200,400,100,mPaint2);

        mPaint3.setStyle(Paint.Style.STROKE);
        mPaint3.setStrokeWidth(5);
        canvas.drawCircle(500,150,100,mPaint3);

        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(20);
        canvas.drawCircle(500,380,100,mPaint4);
    }
}
