package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint mPaint1 = new Paint();
    Paint mPaint2 = new Paint();
    Paint mPaint3 = new Paint();
    Path mPath = new Path();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint1.setStyle(Paint.Style.STROKE);
        mPaint1.setColor(Color.WHITE);
        mPath.moveTo(50,50);
        mPath.lineTo(50,400);
        mPath.rLineTo(650,0);
        canvas.drawPath(mPath,mPaint1);

        canvas.drawText("meizizi",70,420,mPaint1);
        canvas.drawText("meizizi",150,420,mPaint1);
        canvas.drawText("meizizi",230,420,mPaint1);
        canvas.drawText("meizizi",310,420,mPaint1);
        canvas.drawText("meizizi",390,420,mPaint1);
        canvas.drawText("meizizi",470,420,mPaint1);


        mPaint2.setStyle(Paint.Style.FILL);
        mPaint2.setColor(Color.BLUE);
        canvas.drawRect(70,70,130,400,mPaint2);
        canvas.drawRect(150,120,210,400,mPaint2);
        canvas.drawRect(230,180,290,400,mPaint2);
        canvas.drawRect(310,90,370,400,mPaint2);
        canvas.drawRect(390,380,450,400,mPaint2);
        canvas.drawRect(470,220,530,400,mPaint2);
        canvas.drawRect(550,500,610,400,mPaint2);

        mPaint3.setTextSize(40);
        mPaint3.setColor(Color.WHITE);
        canvas.drawText("直方图",300,480,mPaint3);

    }
}
