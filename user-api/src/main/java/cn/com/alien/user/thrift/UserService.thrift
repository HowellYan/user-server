namespace java cn.com.alien.user.api
include "req/UserReq.thrift"
include "resp/UserResp.thrift"
typedef i32 int

service UserService {
    UserResp.UserResp userLogin(UserReq.UserReq userReq)
    UserResp.UserResp userLogout(UserReq.UserReq userReq)
}