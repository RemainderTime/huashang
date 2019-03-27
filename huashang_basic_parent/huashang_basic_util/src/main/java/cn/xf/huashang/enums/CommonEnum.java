package cn.xf.huashang.enums;

public enum CommonEnum {

    SUCCESS(200,"操作成功"),
    ERROR(500,"操作失败");

    private Integer code;

    private String message;


    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;

    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
