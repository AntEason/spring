package spring.cloud.eos.eureka.provide.main.database.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.eos.eureka.common.database.enums.ResultEnum;
import spring.cloud.eos.eureka.common.database.page.Result;
import spring.cloud.eos.eureka.common.utils.ResultUtils;
import spring.cloud.eos.eureka.provide.main.database.exception.ItemException;

@ControllerAdvice
public class ExceptionHandle {

    @SuppressWarnings({ "rawtypes", "static-access" })
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {

        if (e instanceof ItemException) {
            ItemException exception = (ItemException) e;
            return new ResultUtils().error(exception.getErrorCodeStr(), exception.getMessage());
        }
        return new ResultUtils().error(ResultEnum.UNKNOWN_ERROR);
    }

}
