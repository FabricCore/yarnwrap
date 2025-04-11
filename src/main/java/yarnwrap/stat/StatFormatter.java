package yarnwrap.stat;
public class StatFormatter { public net.minecraft.stat.StatFormatter wrapperContained; public StatFormatter(net.minecraft.stat.StatFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.stat.StatFormatter DEFAULT() { return new yarnwrap.stat.StatFormatter(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.stat.StatFormatter value) { wrapperContained.DEFAULT = value.wrapperContained; }
public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
// public void DECIMAL_FORMAT(java.text.DecimalFormat value) { wrapperContained.DECIMAL_FORMAT = value; }
public yarnwrap.stat.StatFormatter DISTANCE() { return new yarnwrap.stat.StatFormatter(wrapperContained.DISTANCE); }
// public void DISTANCE(yarnwrap.stat.StatFormatter value) { wrapperContained.DISTANCE = value.wrapperContained; }
public yarnwrap.stat.StatFormatter DIVIDE_BY_TEN() { return new yarnwrap.stat.StatFormatter(wrapperContained.DIVIDE_BY_TEN); }
// public void DIVIDE_BY_TEN(yarnwrap.stat.StatFormatter value) { wrapperContained.DIVIDE_BY_TEN = value.wrapperContained; }
public yarnwrap.stat.StatFormatter TIME() { return new yarnwrap.stat.StatFormatter(wrapperContained.TIME); }
// public void TIME(yarnwrap.stat.StatFormatter value) { wrapperContained.TIME = value.wrapperContained; }
public java.lang.String format(int value) { return wrapperContained.format(value); }
// public java.lang.String method_16816(int cm) { return wrapperContained.method_16816(cm); }
// public void method_16817(java.text.DecimalFormat decimalFormat) { wrapperContained.method_16817(decimalFormat); }
// public java.lang.String method_16818(int i) { return wrapperContained.method_16818(i); }
// public java.lang.String method_16819(int ticks) { return wrapperContained.method_16819(ticks); }

}