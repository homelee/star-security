/*
 * FileName:VideoView.java
 * 
 * Package:com.starsecurity.h264
 * 
 * Date:2013-04-12
 * 
 * Copyright: Copyright (c) 2013 Minz.Chan
 */
package com.starsecurity.h264;

import java.nio.ByteBuffer;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @function     功能	  	视频图像显示
 *     本类用于对解码后的视频数据进行显示，其中视频帧的宽度(Width)
 * 和高度(Height)可自定义。该类使用前须先调用初始化操作。
 * @author       创建人              陈明珍
 * @date        创建日期           2013-04-12
 * @author       修改人              陈明珍
 * @date        修改日期           2013-04-16
 * @description 修改说明	  使图像可适应容器的Width和Height
 */
public class VideoView extends ImageView {
	private int width = 352;
	private int height = 288;
	
	private byte [] mPixel = new byte[width * height * 2];
    private ByteBuffer buffer;
	private Bitmap VideoBit;     
	

    public VideoView(Context context) {
        super(context);
        setFocusable(true);
    }

    public VideoView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
    
	public VideoView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
    
    @Override 
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);   
        if (VideoBit != null) {
        	VideoBit.copyPixelsFromBuffer(buffer);	
            canvas.drawBitmap(Bitmap.createScaledBitmap(VideoBit, getWidth(), getHeight(), true)
            		, 0, 0, null); 
        }
    }
    
    /**
     * VideoView初始化
     */
    public void init() {
    	
    	buffer = ByteBuffer.wrap(mPixel);
    	VideoBit = Bitmap.createBitmap(width, height, Config.RGB_565);
    	
    	int i = mPixel.length;
    	
        for (i = 0; i < mPixel.length; i++) {
        	mPixel[i] = (byte)0x00;
        }
        
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

	public byte[] getmPixel() {
		return mPixel;
	}

    
}