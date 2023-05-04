package cn.r2ys.manifold.demo.extensions.java.math.BigDecimal;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import cn.r2ys.manifold.demo.ManifoldDemoApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Extension
public final class BigDecimalExt {
  public static String toDisplayText(@This BigDecimal thiz) {
    if (thiz == null) {
      return "";
    }
    if (thiz.scale() > 0) {
      return thiz.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
    return thiz.toPlainString();
  }
}
