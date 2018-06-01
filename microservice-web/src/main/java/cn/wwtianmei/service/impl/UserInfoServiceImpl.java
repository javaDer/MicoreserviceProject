package cn.wwtianmei.service.impl;

import cn.wwtianmei.entity.UserInfo;
import cn.wwtianmei.mapper.UserInfoMapper;
import cn.wwtianmei.service.IUserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2018-06-01
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
