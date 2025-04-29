package yarnwrap.server.filter;
public class FilteredMessage { public net.minecraft.server.filter.FilteredMessage wrapperContained; public FilteredMessage(net.minecraft.server.filter.FilteredMessage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String raw() { return wrapperContained.raw; }
// public void raw(java.lang.String value) { wrapperContained.raw = value; }
// public static java.lang.String raw() { return net.minecraft.server.filter.FilteredMessage.raw; }
// public static void raw(java.lang.String value, ) { net.minecraft.server.filter.FilteredMessage.raw = value; }

// public yarnwrap.server.filter.FilteredMessage EMPTY() { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.server.filter.FilteredMessage value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.server.filter.FilteredMessage EMPTY() { return new yarnwrap.server.filter.FilteredMessage(net.minecraft.server.filter.FilteredMessage.EMPTY); }
// public static void EMPTY(yarnwrap.server.filter.FilteredMessage value, ) { net.minecraft.server.filter.FilteredMessage.EMPTY = value.wrapperContained; }

// public java.lang.String raw() { return wrapperContained.raw(); }
// // public static java.lang.String raw() { return net.minecraft.server.filter.FilteredMessage.raw(); }
public java.lang.String filter() { return wrapperContained.filter(); }
// public static java.lang.String filter() { return net.minecraft.server.filter.FilteredMessage.filter(); }
// public yarnwrap.server.filter.FilteredMessage permitted(java.lang.String raw) { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.permitted(raw)); }
// public static yarnwrap.server.filter.FilteredMessage permitted(java.lang.String raw, ) { return new yarnwrap.server.filter.FilteredMessage(net.minecraft.server.filter.FilteredMessage.permitted(raw)); }
public java.lang.String getString() { return wrapperContained.getString(); }
// public static java.lang.String getString() { return net.minecraft.server.filter.FilteredMessage.getString(); }
// public yarnwrap.server.filter.FilteredMessage censored(java.lang.String raw) { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.censored(raw)); }
// public static yarnwrap.server.filter.FilteredMessage censored(java.lang.String raw, ) { return new yarnwrap.server.filter.FilteredMessage(net.minecraft.server.filter.FilteredMessage.censored(raw)); }
public boolean isFiltered() { return wrapperContained.isFiltered(); }
// public static boolean isFiltered() { return net.minecraft.server.filter.FilteredMessage.isFiltered(); }

}