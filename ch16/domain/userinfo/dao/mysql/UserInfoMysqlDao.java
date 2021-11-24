package ch16.domain.userinfo.dao.mysql;

import ch16.domain.userinfo.Userinfo;
import ch16.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Mysql DB userId = "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("update into Mysql DB userId = "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("delete into Mysql DB userId = "+userInfo.getUserId());
	}

}
