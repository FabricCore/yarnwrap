package yarnwrap.command.argument.packrat;
public class ParsingState { public net.minecraft.command.argument.packrat.ParsingState wrapperContained; public ParsingState(net.minecraft.command.argument.packrat.ParsingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map packrats() { return wrapperContained.packrats; }
// public void packrats(java.util.Map value) { wrapperContained.packrats = value; }
// public static java.util.Map packrats() { return net.minecraft.command.argument.packrat.ParsingState.packrats; }
// public static void packrats(java.util.Map value, ) { net.minecraft.command.argument.packrat.ParsingState.packrats = value; }

// public yarnwrap.command.argument.packrat.ParsingRules rules() { return new yarnwrap.command.argument.packrat.ParsingRules(wrapperContained.rules); }
// public void rules(yarnwrap.command.argument.packrat.ParsingRules value) { wrapperContained.rules = value.wrapperContained; }
// public static yarnwrap.command.argument.packrat.ParsingRules rules() { return new yarnwrap.command.argument.packrat.ParsingRules(net.minecraft.command.argument.packrat.ParsingState.rules); }
// public static void rules(yarnwrap.command.argument.packrat.ParsingRules value, ) { net.minecraft.command.argument.packrat.ParsingState.rules = value.wrapperContained; }

// public yarnwrap.command.argument.packrat.ParseErrorList errors() { return new yarnwrap.command.argument.packrat.ParseErrorList(wrapperContained.errors); }
// public void errors(yarnwrap.command.argument.packrat.ParseErrorList value) { wrapperContained.errors = value.wrapperContained; }
// public static yarnwrap.command.argument.packrat.ParseErrorList errors() { return new yarnwrap.command.argument.packrat.ParseErrorList(net.minecraft.command.argument.packrat.ParsingState.errors); }
// public static void errors(yarnwrap.command.argument.packrat.ParseErrorList value, ) { net.minecraft.command.argument.packrat.ParsingState.errors = value.wrapperContained; }

// public ParsingState(yarnwrap.command.argument.packrat.ParsingRules rules,yarnwrap.command.argument.packrat.ParseErrorList errors) { this.wrapperContained = new net.minecraft.command.argument.packrat.ParsingState(rules.wrapperContained,errors.wrapperContained); }
public yarnwrap.command.argument.packrat.ParseErrorList getErrors() { return new yarnwrap.command.argument.packrat.ParseErrorList(wrapperContained.getErrors()); }
// public static yarnwrap.command.argument.packrat.ParseErrorList getErrors() { return new yarnwrap.command.argument.packrat.ParseErrorList(net.minecraft.command.argument.packrat.ParsingState.getErrors()); }
public void setCursor(int cursor) { wrapperContained.setCursor(cursor); }
// public static void setCursor(int cursor, ) { net.minecraft.command.argument.packrat.ParsingState.setCursor(cursor); }
public java.util.Optional startParsing(yarnwrap.command.argument.packrat.Symbol startSymbol) { return wrapperContained.startParsing(startSymbol.wrapperContained); }
// public static java.util.Optional startParsing(yarnwrap.command.argument.packrat.Symbol startSymbol, ) { return net.minecraft.command.argument.packrat.ParsingState.startParsing(startSymbol.wrapperContained); }
// public Object getCache(Object key) { return wrapperContained.getCache(key); }
// public static Object getCache(Object key, ) { return net.minecraft.command.argument.packrat.ParsingState.getCache(key); }
// public void putCache(Object key,java.util.Optional value) { wrapperContained.putCache(key,value); }
// public static void putCache(Object key,java.util.Optional value, ) { net.minecraft.command.argument.packrat.ParsingState.putCache(key,value); }
public java.lang.Object getReader() { return wrapperContained.getReader(); }
// public static java.lang.Object getReader() { return net.minecraft.command.argument.packrat.ParsingState.getReader(); }
public java.util.Optional parse(yarnwrap.command.argument.packrat.Symbol symbol) { return wrapperContained.parse(symbol.wrapperContained); }
// public static java.util.Optional parse(yarnwrap.command.argument.packrat.Symbol symbol, ) { return net.minecraft.command.argument.packrat.ParsingState.parse(symbol.wrapperContained); }
public int getCursor() { return wrapperContained.getCursor(); }
// public static int getCursor() { return net.minecraft.command.argument.packrat.ParsingState.getCursor(); }

}