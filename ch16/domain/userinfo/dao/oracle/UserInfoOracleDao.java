package ch16.domain.userinfo.dao.oracle;

import ch16.domain.userinfo.Userinfo;
import ch16.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Oracle DB userId = "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("update into Oracle DB userId = "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("delete into Oracle DB userId = "+userInfo.getUserId());
	}

}
