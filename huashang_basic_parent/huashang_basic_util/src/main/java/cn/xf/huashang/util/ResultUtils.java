package cn.xf.huashang.util;

import cn.xf.huashang.vo.ResultVO;

public class ResultUtils {

    public static ResultVO successData(Object o){
        ResultVO  resultVO=new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        resultVO.setData(o);
        return resultVO;
    }
    public static ResultVO success( ){
        ResultVO  resultVO=new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO error(){
        ResultVO  resultVO=new ResultVO();
        resultVO.setCode(500);
        resultVO.setMsg("失败");
        return resultVO;
    }
    public static ResultVO errorMsg(Integer code,String msg){
        ResultVO  resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
