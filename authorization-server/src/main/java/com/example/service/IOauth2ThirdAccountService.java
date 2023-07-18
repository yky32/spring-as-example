package com.example.service;

import com.example.entity.Oauth2ThirdAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 三方登录账户信息表 服务类
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
public interface IOauth2ThirdAccountService extends IService<Oauth2ThirdAccount> {

    /**
     * 检查是否存在该用户信息，不存在则保存，暂时不做关联基础用户信息，由前端引导完善/关联基础用户信息
     *
     * @param thirdAccount 用户信息
     */
    void checkAndSaveUser(Oauth2ThirdAccount thirdAccount);

}
