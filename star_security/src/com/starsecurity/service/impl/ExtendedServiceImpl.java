/*
 * FileName:ExtendedServiceImpl.java
 * 
 * Package:com.starsecurity.service
 * 
 * Date:2013-04-17
 * 
 * Copyright: Copyright (c) 2013 Minz.Chan
 */
package com.starsecurity.service.impl;

import android.graphics.Bitmap;

import com.starsecurity.component.Connection;
import com.starsecurity.component.ConnectionManager;
import com.starsecurity.service.ExtendedService;

/**
 * @function     功能	  扩展功能接口实现类
 * @author       创建人              陈明珍
 * @date        创建日期           2013-04-17
 * @author       修改人              陈明珍
 * @date        修改日期           2013-04-17
 * @description 修改说明	          首次增加
 */
public class ExtendedServiceImpl implements ExtendedService {
	private String conn_name;
	
	
	
	public ExtendedServiceImpl(String conn_name) {
		super();
		this.conn_name = conn_name;
	}

	@Override
	public Bitmap takePicture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void switchToFullScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void restoreFromFullScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getNextChannelList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveConnectionConfig2File(String recordName, String username,
			String password, String svr_ip, int port, int channel_no) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCurrentConnection(String username, String password,
			String svr_ip, int port, int channel_no) {
		Connection conn = ConnectionManager.getConnection(conn_name);
		conn.setUsername(username);
		conn.setPassword(password);
		conn.setSvr_ip(svr_ip);
		conn.setPort(port);
		conn.setChannel_no(channel_no);

	}

}