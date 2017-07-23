package cn.com.alien.user.server;

import cn.com.alien.user.api.UserService;
import cn.com.alien.user.api.req.UserReq;
import cn.com.alien.user.api.resp.UserResp;
import cn.com.alien.user.api.resp.base.BaseResp;
import cn.com.alien.user.dao.SystemUserDao;
import cn.com.alien.user.model.db.SystemUserModel;
import org.apache.thrift.TException;
import org.spring.boot.thrift.server.annotation.ThriftServer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * Created by Root on 2017/7/16.
 */
@ThriftServer(value = "/userService")
public class UserServiceImpl implements UserService.Iface {

    @Autowired
    private SystemUserDao systemUserDao;

    @Override
    public UserResp userLogin(UserReq userReq) throws TException {
        UserResp userResp = new UserResp();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode("000000").setMsg("成功").setIp("123456345345");
        if(userReq.getUserId().equals("123456")){
            userResp.setBaseResp(baseResp);
            userResp.setUserId("33");
            userResp.setUserName("22");
        }
        System.out.println("in");

        SystemUserModel record = new SystemUserModel();
        record.setId(UUID.randomUUID().toString());
        record.setUserId(UUID.randomUUID().toString());
        record.setUserIdCode("asdfsdf");
        record.setUserMac("12312312");
        //systemUserDao.getList(record);
        systemUserDao.insert(record);
        return userResp;
    }

    @Override
    public UserResp userLogout(UserReq userReq) throws TException {
        UserResp userResp = new UserResp();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode("111111").setMsg("成功").setIp("33");
        if(userReq.getUserId().equals("123456")){
            userResp.setBaseResp(baseResp);
            userResp.setUserId("11");
            userResp.setUserName("22");
        }
        return userResp;
    }
}
