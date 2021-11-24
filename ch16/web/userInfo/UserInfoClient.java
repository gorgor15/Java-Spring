package ch16.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch16.domain.userinfo.Userinfo;
import ch16.domain.userinfo.dao.UserInfoDao;
import ch16.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch16.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		Userinfo userInfo = new Userinfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("KIM");
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}else {
			System.out.println("DB error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
