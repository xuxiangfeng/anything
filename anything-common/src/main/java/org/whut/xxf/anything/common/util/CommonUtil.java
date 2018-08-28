package org.whut.xxf.anything.common.util;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * TODO
 *
 * @author xxf
 * @date 2018.08.28 15:03
 */
public class CommonUtil {

    /**
     * 是否相等
     * @param objl
     * @param objr
     * @return
     */
    public Boolean isEqual(Object objl,Object objr){
        return (objl == null && objr == null) || (objl != null && objl.equals(objr));
    }

}
