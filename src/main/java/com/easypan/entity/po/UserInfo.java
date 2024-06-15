package com.easypan.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.easypan.entity.enums.DateTimePatternEnum;
import com.easypan.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户信息
 */
public class UserInfo implements Serializable {


	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 用户昵称
	 */
	private String nickName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * qq登录id
	 */
	private String qqOpenId;

	/**
	 * qq头像
	 */
	private String qqAvator;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 注册时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date joinTime;

	/**
	 * 活跃时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLoginTime;

	/**
	 * 状态：0 禁用 1 启用
	 */
	private Integer status;

	/**
	 * 使用空间
	 */
	private Long useSpace;

	/**
	 * 总空间
	 */
	private Long totalSpace;


	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setNickName(String nickName){
		this.nickName = nickName;
	}

	public String getNickName(){
		return this.nickName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setQqOpenId(String qqOpenId){
		this.qqOpenId = qqOpenId;
	}

	public String getQqOpenId(){
		return this.qqOpenId;
	}

	public void setQqAvator(String qqAvator){
		this.qqAvator = qqAvator;
	}

	public String getQqAvator(){
		return this.qqAvator;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setJoinTime(Date joinTime){
		this.joinTime = joinTime;
	}

	public Date getJoinTime(){
		return this.joinTime;
	}

	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setUseSpace(Long useSpace){
		this.useSpace = useSpace;
	}

	public Long getUseSpace(){
		return this.useSpace;
	}

	public void setTotalSpace(Long totalSpace){
		this.totalSpace = totalSpace;
	}

	public Long getTotalSpace(){
		return this.totalSpace;
	}

	@Override
	public String toString (){
		return "用户id:"+(userId == null ? "空" : userId)+"，用户昵称:"+(nickName == null ? "空" : nickName)+"，邮箱:"+(email == null ? "空" : email)+"，qq登录id:"+(qqOpenId == null ? "空" : qqOpenId)+"，qq头像:"+(qqAvator == null ? "空" : qqAvator)+"，密码:"+(password == null ? "空" : password)+"，注册时间:"+(joinTime == null ? "空" : DateUtil.format(joinTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，活跃时间:"+(lastLoginTime == null ? "空" : DateUtil.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，状态：0 禁用 1 启用:"+(status == null ? "空" : status)+"，使用空间:"+(useSpace == null ? "空" : useSpace)+"，总空间:"+(totalSpace == null ? "空" : totalSpace);
	}
}