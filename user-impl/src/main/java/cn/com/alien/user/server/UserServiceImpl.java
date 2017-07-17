package cn.com.alien.user.server;

import cn.com.alien.user.api.UserService;
import cn.com.alien.user.api.req.UserReq;
import cn.com.alien.user.api.resp.UserResp;
import cn.com.alien.user.api.resp.base.BaseResp;
import org.apache.thrift.TException;
import org.spring.boot.thrift.server.annotation.ThriftServer;

/**
 * Created by Root on 2017/7/16.
 */
@ThriftServer(value = "/userService")
public class UserServiceImpl implements UserService.Iface {
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
