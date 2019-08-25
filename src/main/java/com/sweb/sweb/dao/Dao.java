package com.sweb.sweb.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao implements DaoInterFace {
	
	@Autowired
	SqlSession session;
	
	@Override
	public HashMap<String, Object> test() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = session.selectOne("sweb.test");
		System.out.println(map.toString());
		return map;
	}

}
