package ch16.domain.userinfo.dao;

import ch16.domain.userinfo.Userinfo;

public interface UserInfoDao {
	void insertUserInfo(Userinfo userInfo);
	void updateUserInfo(Userinfo userInfo);
	void deleteUserInfo(Userinfo userInfo);
}
