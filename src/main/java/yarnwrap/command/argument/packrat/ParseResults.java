package yarnwrap.command.argument.packrat;
public class ParseResults { public net.minecraft.command.argument.packrat.ParseResults wrapperContained; public ParseResults(net.minecraft.command.argument.packrat.ParseResults wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap results() { return wrapperContained.results; }
// public void results(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.results = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap results() { return net.minecraft.command.argument.packrat.ParseResults.results; }
// public static void results(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.command.argument.packrat.ParseResults.results = value; }

public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.command.argument.packrat.ParseResults.equals(o); }
public java.lang.Object get(yarnwrap.command.argument.packrat.Symbol symbol) { return wrapperContained.get(symbol.wrapperContained); }
// public static java.lang.Object get(yarnwrap.command.argument.packrat.Symbol symbol, ) { return net.minecraft.command.argument.packrat.ParseResults.get(symbol.wrapperContained); }
public void put(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object value) { wrapperContained.put(symbol.wrapperContained,value); }
// public static void put(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object value, ) { net.minecraft.command.argument.packrat.ParseResults.put(symbol.wrapperContained,value); }
public void putAll(yarnwrap.command.argument.packrat.ParseResults results) { wrapperContained.putAll(results.wrapperContained); }
// public static void putAll(yarnwrap.command.argument.packrat.ParseResults results, ) { net.minecraft.command.argument.packrat.ParseResults.putAll(results.wrapperContained); }
public java.lang.Object getAny(net.minecraft.command.argument.packrat.Symbol[] symbols) { return wrapperContained.getAny(symbols); }
// public static java.lang.Object getAny(net.minecraft.command.argument.packrat.Symbol[] symbols, ) { return net.minecraft.command.argument.packrat.ParseResults.getAny(symbols); }
public java.lang.Object getOrThrow(yarnwrap.command.argument.packrat.Symbol symbol) { return wrapperContained.getOrThrow(symbol.wrapperContained); }
// public static java.lang.Object getOrThrow(yarnwrap.command.argument.packrat.Symbol symbol, ) { return net.minecraft.command.argument.packrat.ParseResults.getOrThrow(symbol.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object fallback) { return wrapperContained.getOrDefault(symbol.wrapperContained,fallback); }
// public static java.lang.Object getOrDefault(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object fallback, ) { return net.minecraft.command.argument.packrat.ParseResults.getOrDefault(symbol.wrapperContained,fallback); }
public java.lang.Object getAnyOrThrow(net.minecraft.command.argument.packrat.Symbol[] symbols) { return wrapperContained.getAnyOrThrow(symbols); }
// public static java.lang.Object getAnyOrThrow(net.minecraft.command.argument.packrat.Symbol[] symbols, ) { return net.minecraft.command.argument.packrat.ParseResults.getAnyOrThrow(symbols); }

}