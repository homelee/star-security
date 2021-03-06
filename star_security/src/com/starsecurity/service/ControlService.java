/*
 * FileName:ControlService.java
 * 
 * Package:com.starsecurity.service
 * 
 * Date:2013-04-15
 * 
 * Copyright: Copyright (c) 2013 Minz.Chan
 */
package com.starsecurity.service;


/**
 * @function     功能	  	控制操作接口
 * @author       创建人              陈明珍
 * @date        创建日期           2013-04-15
 * @author       修改人              陈明珍
 * @date        修改日期           2013-05-17
 * @description 修改说明	          
 *   2013-05-17 加入[停止控制动作]接口 陈明珍
 */
public interface ControlService {
	
	/**
	 * 播放视频
	 * @return
	 */
	public int playVideo();
	
	/**
	 * 停止播放视频
	 * @return
	 */
	public int stopVideo();
	
	/**
	 * 移动摄像头位置
	 * @param direction 上、下、左、右分别对应UP、DOWN、LEFT、RIGHT
	 * @return
	 */
	public int move(String direction);
	
	/**
	 * 视频放大/缩小
	 * @param flag true, 为视频放大；false, 为视频缩小
	 * @return
	 */
	public int zoomInOrOut(boolean flag);
	
	/**
	 * 焦点放大/缩小
	 * @param flag true, 为焦点放大；false，焦点缩小
	 * @return
	 */
	public int adjustFocus(boolean flag);
	
	/**
	 * 光圈放大/缩小
	 * @param flag true, 为光圈放大；false为光圈缩小
	 * @return
	 */
	public int adjustAperture(boolean flag);
	

	/**
	 * 切换频道
	 * @param des_channelno 目标频道号
	 * @return
	 */
	public int switchChannel(int des_channelno);

	/**
	 * 停止控制动作
	 * @return
	 */
	public int stopAction();
	
}
