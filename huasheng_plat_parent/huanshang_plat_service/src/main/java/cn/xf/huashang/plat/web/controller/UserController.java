package cn.xf.huashang.plat.web.controller;

import cn.xf.huashang.plat.pojo.User;
import cn.xf.huashang.util.ResultUtils;
import cn.xf.huashang.vo.ResultVO;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public ResultVO getUser(@RequestBody User user){

        if(user!=null&&!StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if("RemainderTime".equals(user.getName())&&"admin".equals(user.getPassword())){
                return ResultUtils.success();
            }else{
                return ResultUtils.error();
            }
        }
        return ResultUtils.error();
    }
}
