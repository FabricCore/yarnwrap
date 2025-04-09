package yarnwrap.command.argument.packrat;
public class ParsingState { public net.minecraft.command.argument.packrat.ParsingState wrapperContained; public ParsingState(net.minecraft.command.argument.packrat.ParsingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map packrats() { return wrapperContained.packrats; }
// public yarnwrap.command.argument.packrat.ParsingRules rules() { return new yarnwrap.command.argument.packrat.ParsingRules(wrapperContained.rules); }
// public yarnwrap.command.argument.packrat.ParseErrorList errors() { return new yarnwrap.command.argument.packrat.ParseErrorList(wrapperContained.errors); }
public yarnwrap.command.argument.packrat.ParseErrorList getErrors() { return new yarnwrap.command.argument.packrat.ParseErrorList(wrapperContained.getErrors()); }
public void setCursor(int cursor) { wrapperContained.setCursor(cursor); }
public java.util.Optional startParsing(yarnwrap.command.argument.packrat.Symbol startSymbol) { return wrapperContained.startParsing(startSymbol.wrapperContained); }
// public Object getCache(Object key) { return wrapperContained.getCache(key); }
// public void putCache(Object key,java.util.Optional value) { wrapperContained.putCache(key,value); }
public java.lang.Object getReader() { return wrapperContained.getReader(); }
public java.util.Optional parse(yarnwrap.command.argument.packrat.Symbol symbol) { return wrapperContained.parse(symbol.wrapperContained); }
public int getCursor() { return wrapperContained.getCursor(); }

}