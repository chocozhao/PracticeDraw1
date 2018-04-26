package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

public class Practice4DrawPointView extends View {
    Paint mPaint1 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint2 = new Paint(ANTI_ALIAS_FLAG);
    Paint mPaint3 = new Paint(ANTI_ALIAS_FLAG);
    Path mPath = new Path();

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        mPaint1.setStrokeWidth(40);
        mPaint1.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(250,100,mPaint1);


        mPaint2.setStrokeWidth(40);
        mPaint2.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(500,100,mPaint2);
//        绘制多个点
        float[] floats = {50, 200,200,60,200,90};
        canvas.drawPoints(floats,1,4,mPaint2);

        mPaint3.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100,100);
        mPath.moveTo(200,100);
        mPath.lineTo(200,0);

    }
}
