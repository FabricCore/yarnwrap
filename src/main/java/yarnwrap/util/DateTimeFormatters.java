package yarnwrap.util;
public class DateTimeFormatters { public net.minecraft.util.DateTimeFormatters wrapperContained; public DateTimeFormatters(net.minecraft.util.DateTimeFormatters wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.format.DateTimeFormatter create() { return wrapperContained.create(); }
public static java.time.format.DateTimeFormatter create() { return net.minecraft.util.DateTimeFormatters.create(); }

}