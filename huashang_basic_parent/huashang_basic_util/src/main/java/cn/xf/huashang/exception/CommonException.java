package cn.xf.huashang.exception;
import cn.xf.huashang.enums.CommonEnum;

public class CommonException extends RuntimeException{
    private Integer coed;

    public CommonException(CommonEnum resultEnum) {
        super(resultEnum.getMessage());
        this.coed=resultEnum.getCode();
    }

    public CommonException(Integer code, String message){
        super(message);
        this.coed=code;
    }
}
