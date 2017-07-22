package cn.com.alien.user.dao;

import cn.com.alien.user.model.db.SystemUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SystemUserDao {

    @Autowired
    private SystemUser systemUser;

    public int insert(SystemUserModel record){
        return systemUser.insert(record);
    }

    public int insertSelective(SystemUserModel record){
        return systemUser.insertSelective(record);
    }
}
