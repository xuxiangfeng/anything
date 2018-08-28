package org.whut.xxf.anything.entity.dto;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 返回值枚举
 *
 * @author xxf
 * @date 2018.08.28 14:57
 */
public enum CodeEnum {

    SUCCESS(0,"成功");

    private Integer value;
    private String text;

    private CodeEnum(int value,String text){
        this.value = value;
        this.text = text;
    }

    public Integer getValue(){
        return value;
    }

    public String getText(){
        return text;
    }

    public Boolean equal(CodeEnum codeEnum){
        return value.equals(codeEnum.getValue());
    }
}
