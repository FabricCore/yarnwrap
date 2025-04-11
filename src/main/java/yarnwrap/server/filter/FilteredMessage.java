package yarnwrap.server.filter;
public class FilteredMessage { public net.minecraft.server.filter.FilteredMessage wrapperContained; public FilteredMessage(net.minecraft.server.filter.FilteredMessage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String raw() { return wrapperContained.raw; }
// public void raw(java.lang.String value) { wrapperContained.raw = value; }
public yarnwrap.server.filter.FilteredMessage EMPTY() { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.server.filter.FilteredMessage value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.lang.String raw() { return wrapperContained.raw(); }
public java.lang.String filter() { return wrapperContained.filter(); }
public yarnwrap.server.filter.FilteredMessage permitted(java.lang.String raw) { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.permitted(raw)); }
public java.lang.String getString() { return wrapperContained.getString(); }
public yarnwrap.server.filter.FilteredMessage censored(java.lang.String raw) { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.censored(raw)); }
public boolean isFiltered() { return wrapperContained.isFiltered(); }

}