package cn.r2ys.manifold.demo.extensions.java.util.LinkedHashMap;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import cn.r2ys.manifold.demo.extensions.java.math.BigDecimal.BigDecimalExt;

import java.util.LinkedHashMap;

@Extension
public class LinkedHashMapExt {
    public static String toCsvLineSplittedByComma(@This LinkedHashMap<String, Object> thiz) {
        if (thiz == null) {
          return "";
        }
        if (thiz.keySet().isEmpty()) {
          return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        thiz.forEach((s, o) -> {
            stringBuffer.append(o);
            stringBuffer.append(",");
        });
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }
}
