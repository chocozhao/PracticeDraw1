package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {
    Paint mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint mPaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        mPaint1.setColor(Color.GREEN);
        mPaint1.setStyle(Paint.Style.FILL);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawRoundRect(200,50,500,200,50,50,mPaint1);

        mPaint2.setColor(Color.BLUE);
        mPaint2.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(200,250,500,400,200,200,mPaint2);
    }
}
