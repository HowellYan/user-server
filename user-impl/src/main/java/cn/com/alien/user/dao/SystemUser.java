package cn.com.alien.user.dao;


import cn.com.alien.user.model.db.SystemUserModel;

public interface SystemUser {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DB_SYSTEM_USER
     *
     * @mbg.generated Sat Jul 22 23:25:28 CST 2017
     */
    int insert(SystemUserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DB_SYSTEM_USER
     *
     * @mbg.generated Sat Jul 22 23:25:28 CST 2017
     */
    int insertSelective(SystemUserModel record);
}