package com.starsecurity.service;

import java.util.List;

import com.starsecurity.model.DVRDevice;
import com.starsecurity.model.FavouriteRecord;

/**
 * @function     功能	  进行收藏夹记录的操作接口
 * @author       创建人                肖远东
 * @date        创建日期           2013-04-26
 * @author       修改人                 肖远东
 * @date        修改日期           2013-04-26
 * @description 修改说明	             首次增加
 */
public interface FavouriteControlService {
	/***
	 * 为XML文件创建根节点
	 */
	public boolean createFileAndRoot(String fileName,String rootName);
	
	/***
	 * 根据收藏名获取收藏记录
	 * @param fileName			XML文件名
	 * @param favouriteName		记录名
	 * @return					找到的收藏记录
	 */
	public FavouriteRecord getFavouriteRecordByName(String fileName,String favouriteName);
	
	/***
	 * 查看收藏记录是否存在
	 * @param fileName			XML文件名
	 * @param favouriteName		记录名
	 * @return					是否存在
	 */
	public boolean isExist(String fileName,String favouriteName);
	
	/***
	 * 获取收藏记录名列表
	 * @param fileName		XML文件名
	 * @return 				记录名列表
	 */
	public List<String> getFavouriteList(String fileName);
	
	/***
	 * 修改收藏记录
	 * @param favouriteRecord	新记录
	 * @return					成功与否
	 */
	public boolean coverFavouriteElement(String fileName,FavouriteRecord favouriteRecord);
	
	/***
	 * 删除收藏夹记录
	 * @param fileName			XML文件名
	 * @param favouriteName		记录名
	 * @return					成功与否
	 */
	public boolean removeFavouriteElement(String fileName,String favouriteName);
	
	/***
	 * 手动添加收藏夹操作
	 * @param favouriteRecord	需要添加的记录
	 * @return					成功与否
	 */
	public boolean addFavouriteElement(String fileName,FavouriteRecord favouriteRecord);
	
	/***
	 * 默认添加收藏操作（云台选择某一平台后，自动添加进收藏夹）
	 * @param dvrDevice		需要添加的对象
	 * @param fileName		XML文件名
	 * @return				成功与否
	 */
	public boolean addDefaultFavouriteElement(DVRDevice dvrDevice,String fileName);
}