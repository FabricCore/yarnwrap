package yarnwrap.stat;
public class StatFormatter { public net.minecraft.stat.StatFormatter wrapperContained; public StatFormatter(net.minecraft.stat.StatFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.stat.StatFormatter DEFAULT() { return new yarnwrap.stat.StatFormatter(wrapperContained.DEFAULT); }
public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
public yarnwrap.stat.StatFormatter DISTANCE() { return new yarnwrap.stat.StatFormatter(wrapperContained.DISTANCE); }
public yarnwrap.stat.StatFormatter DIVIDE_BY_TEN() { return new yarnwrap.stat.StatFormatter(wrapperContained.DIVIDE_BY_TEN); }
public yarnwrap.stat.StatFormatter TIME() { return new yarnwrap.stat.StatFormatter(wrapperContained.TIME); }

}