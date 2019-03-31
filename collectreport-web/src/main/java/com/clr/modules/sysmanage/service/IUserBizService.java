
package com.clr.modules.sysmanage.service;

import com.clr.modules.sysmanage.entity.bo.MenuBO;
import com.clr.modules.sysmanage.entity.bo.UserBO;
import com.clr.modules.sysmanage.entity.po.SysMenuPO;
import com.clr.modules.sysmanage.entity.po.SysUserPO;
import com.clr.common.utils.Page;

import java.util.List;
import java.util.Map;


public interface IUserBizService {

	Page<UserBO> listUserByPage(Map<String, Object> params);

	List<MenuBO> listMenuByCondition(Map<String, Object> params);

}
