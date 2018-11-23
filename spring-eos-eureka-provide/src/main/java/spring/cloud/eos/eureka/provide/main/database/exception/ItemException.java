package spring.cloud.eos.eureka.provide.main.database.exception;

import spring.cloud.eos.eureka.common.database.enums.ResultEnum;

public class ItemException extends RuntimeException {

    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;
    private String errorCode;

    public ItemException() {
    }

    public ItemException(Throwable ex) {
        super(ex);
    }

    public ItemException(int errorCode) {
        this.errorCode = String.valueOf(errorCode);
    }

    public ItemException(String errorCode) {
        this.errorCode = errorCode;
    }

    public ItemException(int errorCode, String msg) {
        super(msg);
        this.errorCode = String.valueOf(errorCode);
    }

    public ItemException(ResultEnum result) {
        super(result.getMsg());
        this.errorCode = result.getCode();
    }

    public ItemException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    public ItemException(int errorCode, Throwable ex) {
        super(ex);
        this.errorCode = String.valueOf(errorCode);
    }

    public ItemException(String errorCode, Throwable ex) {
        super(ex);
        this.errorCode = errorCode;
    }

    public ItemException(int errorCode, String msg, Throwable ex) {
        super(msg, ex);
        this.errorCode = String.valueOf(errorCode);
    }

    public int getErrorCode() {
        return Integer.parseInt(this.errorCode);
    }

    public String getErrorCodeStr() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = String.valueOf(errorCode);
    }
}
