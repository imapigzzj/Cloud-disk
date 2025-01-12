package com.easypan.controller;

import java.util.List;

import com.easypan.entity.query.UserInfoQuery;
import com.easypan.entity.po.UserInfo;
import com.easypan.entity.vo.ResponseVO;
import com.easypan.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户信息 Controller
 */
@RestController("userInfoController")
@RequestMapping("/userInfo")
public class UserInfoController extends ABaseController{

	@Resource
	private UserInfoService userInfoService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(UserInfoQuery query){
		return getSuccessResponseVO(userInfoService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(UserInfo bean) {
		userInfoService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<UserInfo> listBean) {
		userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<UserInfo> listBean) {
		userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId查询对象
	 */
	@RequestMapping("/getUserInfoByUserId")
	public ResponseVO getUserInfoByUserId(String userId) {
		return getSuccessResponseVO(userInfoService.getUserInfoByUserId(userId));
	}

	/**
	 * 根据UserId修改对象
	 */
	@RequestMapping("/updateUserInfoByUserId")
	public ResponseVO updateUserInfoByUserId(UserInfo bean,String userId) {
		userInfoService.updateUserInfoByUserId(bean,userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId删除
	 */
	@RequestMapping("/deleteUserInfoByUserId")
	public ResponseVO deleteUserInfoByUserId(String userId) {
		userInfoService.deleteUserInfoByUserId(userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndNickName查询对象
	 */
	@RequestMapping("/getUserInfoByUserIdAndNickName")
	public ResponseVO getUserInfoByUserIdAndNickName(String userId,String nickName) {
		return getSuccessResponseVO(userInfoService.getUserInfoByUserIdAndNickName(userId,nickName));
	}

	/**
	 * 根据UserIdAndNickName修改对象
	 */
	@RequestMapping("/updateUserInfoByUserIdAndNickName")
	public ResponseVO updateUserInfoByUserIdAndNickName(UserInfo bean,String userId,String nickName) {
		userInfoService.updateUserInfoByUserIdAndNickName(bean,userId,nickName);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndNickName删除
	 */
	@RequestMapping("/deleteUserInfoByUserIdAndNickName")
	public ResponseVO deleteUserInfoByUserIdAndNickName(String userId,String nickName) {
		userInfoService.deleteUserInfoByUserIdAndNickName(userId,nickName);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Email查询对象
	 */
	@RequestMapping("/getUserInfoByEmail")
	public ResponseVO getUserInfoByEmail(String email) {
		return getSuccessResponseVO(userInfoService.getUserInfoByEmail(email));
	}

	/**
	 * 根据Email修改对象
	 */
	@RequestMapping("/updateUserInfoByEmail")
	public ResponseVO updateUserInfoByEmail(UserInfo bean,String email) {
		userInfoService.updateUserInfoByEmail(bean,email);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Email删除
	 */
	@RequestMapping("/deleteUserInfoByEmail")
	public ResponseVO deleteUserInfoByEmail(String email) {
		userInfoService.deleteUserInfoByEmail(email);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据QqOpenId查询对象
	 */
	@RequestMapping("/getUserInfoByQqOpenId")
	public ResponseVO getUserInfoByQqOpenId(String qqOpenId) {
		return getSuccessResponseVO(userInfoService.getUserInfoByQqOpenId(qqOpenId));
	}

	/**
	 * 根据QqOpenId修改对象
	 */
	@RequestMapping("/updateUserInfoByQqOpenId")
	public ResponseVO updateUserInfoByQqOpenId(UserInfo bean,String qqOpenId) {
		userInfoService.updateUserInfoByQqOpenId(bean,qqOpenId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据QqOpenId删除
	 */
	@RequestMapping("/deleteUserInfoByQqOpenId")
	public ResponseVO deleteUserInfoByQqOpenId(String qqOpenId) {
		userInfoService.deleteUserInfoByQqOpenId(qqOpenId);
		return getSuccessResponseVO(null);
	}


}