package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

public class Practice11PieChartView extends View {
    Paint mPaint1 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint2 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint3 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint4 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint5 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint6 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint7 = new Paint(ANTI_ALIAS_FLAG);
    Path mPath = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.RED);
        canvas.drawArc(70, 60, 500, 500, -180, 120, true, mPaint1);
        mPaint2.setStyle(Paint.Style.FILL);
        mPaint2.setColor(Color.BLUE);
        canvas.drawArc(70, 85, 515, 500, -180, -95, true, mPaint2);
        mPaint3.setStyle(Paint.Style.FILL);
        mPaint3.setColor(Color.YELLOW);
        canvas.drawArc(70, 80, 530, 500, -63, 62, true, mPaint3);
        mPaint4.setStyle(Paint.Style.FILL);
        mPaint4.setColor(Color.GRAY);
        canvas.drawArc(70, 85, 530, 500, 0, 10, true, mPaint4);
        mPaint5.setStyle(Paint.Style.FILL);
        mPaint5.setColor(Color.GREEN);
        canvas.drawArc(70, 95, 530, 500, -350, 20, true, mPaint5);
        mPaint6.setStyle(Paint.Style.FILL);
        mPaint6.setColor(Color.BLACK);
        canvas.drawArc(70, 100, 530, 500, -328, 53, true, mPaint6);

        mPaint7.setStyle(Paint.Style.STROKE);
        mPaint7.setColor(Color.WHITE);
        mPath.moveTo(160,100);
        mPath.lineTo(140,100);
        mPath.rLineTo(-30,-30);
        canvas.drawPath(mPath,mPaint7);
        mPaint7.setTextSize(20);
        canvas.drawText("红色",80,60,mPaint7);

        mPath.moveTo(500,190);
        mPath.lineTo(520,170);
        mPath.rLineTo(50,0);
        canvas.drawText("黄色",575,175,mPaint7);

        mPath.moveTo(530,320);
        mPath.lineTo(550,300);
        mPath.rLineTo(30,0);
        mPath.rLineTo(20,-10);
        canvas.drawText("灰色",600,300,mPaint7);
    }
}
