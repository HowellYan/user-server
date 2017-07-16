namespace java cn.com.alien.user.api.req
include "base/BaseReq.thrift"
struct UserReq {
1: required string userId;
2: required string userPasswd;
3: required string userIp;
4: required string userMac;
5: required BaseReq.BaseReq baseReq;
}