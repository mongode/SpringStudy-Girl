package com.mongode.girl.utils;

import com.mongode.girl.domain.Result;

public class ResultUtil {
    
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("Successfully!");
        result.setData(object);
        return result;
    }
    
    public static Result success() {
        return success(null);
    }
    
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
