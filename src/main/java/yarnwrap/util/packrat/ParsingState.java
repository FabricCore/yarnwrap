package yarnwrap.util.packrat;
public class ParsingState { public net.minecraft.util.packrat.ParsingState wrapperContained; public ParsingState(net.minecraft.util.packrat.ParsingState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.packrat.ParseErrorList getErrors() { return new yarnwrap.util.packrat.ParseErrorList(wrapperContained.getErrors()); }
// public static yarnwrap.util.packrat.ParseErrorList getErrors() { return new yarnwrap.util.packrat.ParseErrorList(net.minecraft.util.packrat.ParsingState.getErrors()); }
public void setCursor(int cursor) { wrapperContained.setCursor(cursor); }
// public static void setCursor(int cursor, ) { net.minecraft.util.packrat.ParsingState.setCursor(cursor); }
public java.util.Optional startParsing(yarnwrap.util.packrat.ParsingRuleEntry rule) { return wrapperContained.startParsing(rule.wrapperContained); }
// public static java.util.Optional startParsing(yarnwrap.util.packrat.ParsingRuleEntry rule, ) { return net.minecraft.util.packrat.ParsingState.startParsing(rule.wrapperContained); }
public java.lang.Object getReader() { return wrapperContained.getReader(); }
// public static java.lang.Object getReader() { return net.minecraft.util.packrat.ParsingState.getReader(); }
public int getCursor() { return wrapperContained.getCursor(); }
// public static int getCursor() { return net.minecraft.util.packrat.ParsingState.getCursor(); }
public yarnwrap.util.packrat.ParseResults getResults() { return new yarnwrap.util.packrat.ParseResults(wrapperContained.getResults()); }
// public static yarnwrap.util.packrat.ParseResults getResults() { return new yarnwrap.util.packrat.ParseResults(net.minecraft.util.packrat.ParsingState.getResults()); }
public java.lang.Object parse(yarnwrap.util.packrat.ParsingRuleEntry rule) { return wrapperContained.parse(rule.wrapperContained); }
// public static java.lang.Object parse(yarnwrap.util.packrat.ParsingRuleEntry rule, ) { return net.minecraft.util.packrat.ParsingState.parse(rule.wrapperContained); }
public yarnwrap.util.packrat.Cut pushCutter() { return new yarnwrap.util.packrat.Cut(wrapperContained.pushCutter()); }
// public static yarnwrap.util.packrat.Cut pushCutter() { return new yarnwrap.util.packrat.Cut(net.minecraft.util.packrat.ParsingState.pushCutter()); }
public void popCutter() { wrapperContained.popCutter(); }
// public static void popCutter() { net.minecraft.util.packrat.ParsingState.popCutter(); }
public yarnwrap.util.packrat.ParsingState getErrorSuppressingState() { return new yarnwrap.util.packrat.ParsingState(wrapperContained.getErrorSuppressingState()); }
// public static yarnwrap.util.packrat.ParsingState getErrorSuppressingState() { return new yarnwrap.util.packrat.ParsingState(net.minecraft.util.packrat.ParsingState.getErrorSuppressingState()); }

}