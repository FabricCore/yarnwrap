package yarnwrap.util.packrat;
public class ParseResults { public net.minecraft.util.packrat.ParseResults wrapperContained; public ParseResults(net.minecraft.util.packrat.ParseResults wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
// public static int MISSING() { return net.minecraft.util.packrat.ParseResults.MISSING; }
// public static void MISSING(int value, ) { net.minecraft.util.packrat.ParseResults.MISSING = value; }

// public java.lang.Object FRAME() { return wrapperContained.FRAME; }
// public void FRAME(java.lang.Object value) { wrapperContained.FRAME = value; }
// // public static java.lang.Object FRAME() { return net.minecraft.util.packrat.ParseResults.FRAME; }
// public static void FRAME(java.lang.Object value, ) { net.minecraft.util.packrat.ParseResults.FRAME = value; }

// public int ENTRY_SIZE() { return wrapperContained.ENTRY_SIZE; }
// public void ENTRY_SIZE(int value) { wrapperContained.ENTRY_SIZE = value; }
// public static int ENTRY_SIZE() { return net.minecraft.util.packrat.ParseResults.ENTRY_SIZE; }
// public static void ENTRY_SIZE(int value, ) { net.minecraft.util.packrat.ParseResults.ENTRY_SIZE = value; }

// public java.lang.Object[] stack() { return wrapperContained.stack; }
// public void stack(java.lang.Object[] value) { wrapperContained.stack = value; }
// public static java.lang.Object[] stack() { return net.minecraft.util.packrat.ParseResults.stack; }
// public static void stack(java.lang.Object[] value, ) { net.minecraft.util.packrat.ParseResults.stack = value; }

// public int stackTop() { return wrapperContained.stackTop; }
// public void stackTop(int value) { wrapperContained.stackTop = value; }
// public static int stackTop() { return net.minecraft.util.packrat.ParseResults.stackTop; }
// public static void stackTop(int value, ) { net.minecraft.util.packrat.ParseResults.stackTop = value; }

// public int stackBottom() { return wrapperContained.stackBottom; }
// public void stackBottom(int value) { wrapperContained.stackBottom = value; }
// public static int stackBottom() { return net.minecraft.util.packrat.ParseResults.stackBottom; }
// public static void stackBottom(int value, ) { net.minecraft.util.packrat.ParseResults.stackBottom = value; }

public java.lang.Object get(yarnwrap.util.packrat.Symbol symbol) { return wrapperContained.get(symbol.wrapperContained); }
// public static java.lang.Object get(yarnwrap.util.packrat.Symbol symbol, ) { return net.minecraft.util.packrat.ParseResults.get(symbol.wrapperContained); }
public void put(yarnwrap.util.packrat.Symbol symbol,java.lang.Object value) { wrapperContained.put(symbol.wrapperContained,value); }
// public static void put(yarnwrap.util.packrat.Symbol symbol,java.lang.Object value, ) { net.minecraft.util.packrat.ParseResults.put(symbol.wrapperContained,value); }
public java.lang.Object getAny(net.minecraft.util.packrat.Symbol[] symbols) { return wrapperContained.getAny(symbols); }
// public static java.lang.Object getAny(net.minecraft.util.packrat.Symbol[] symbols, ) { return net.minecraft.util.packrat.ParseResults.getAny(symbols); }
public java.lang.Object getOrThrow(yarnwrap.util.packrat.Symbol symbol) { return wrapperContained.getOrThrow(symbol.wrapperContained); }
// public static java.lang.Object getOrThrow(yarnwrap.util.packrat.Symbol symbol, ) { return net.minecraft.util.packrat.ParseResults.getOrThrow(symbol.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.util.packrat.Symbol symbol,java.lang.Object fallback) { return wrapperContained.getOrDefault(symbol.wrapperContained,fallback); }
// public static java.lang.Object getOrDefault(yarnwrap.util.packrat.Symbol symbol,java.lang.Object fallback, ) { return net.minecraft.util.packrat.ParseResults.getOrDefault(symbol.wrapperContained,fallback); }
public java.lang.Object getAnyOrThrow(net.minecraft.util.packrat.Symbol[] symbols) { return wrapperContained.getAnyOrThrow(symbols); }
// public static java.lang.Object getAnyOrThrow(net.minecraft.util.packrat.Symbol[] symbols, ) { return net.minecraft.util.packrat.ParseResults.getAnyOrThrow(symbols); }
public void pushFrame() { wrapperContained.pushFrame(); }
// public static void pushFrame() { net.minecraft.util.packrat.ParseResults.pushFrame(); }
// public void expandIfNeeded(int amount) { wrapperContained.expandIfNeeded(amount); }
// public static void expandIfNeeded(int amount, ) { net.minecraft.util.packrat.ParseResults.expandIfNeeded(amount); }
public int indexOf(net.minecraft.util.packrat.Symbol[] symbols) { return wrapperContained.indexOf(symbols); }
// public static int indexOf(net.minecraft.util.packrat.Symbol[] symbols, ) { return net.minecraft.util.packrat.ParseResults.indexOf(symbols); }
public void popFrame() { wrapperContained.popFrame(); }
// public static void popFrame() { net.minecraft.util.packrat.ParseResults.popFrame(); }
// public int getPreviousStackBottom(int current) { return wrapperContained.getPreviousStackBottom(current); }
// public static int getPreviousStackBottom(int current, ) { return net.minecraft.util.packrat.ParseResults.getPreviousStackBottom(current); }
public void duplicateFrames() { wrapperContained.duplicateFrames(); }
// public static void duplicateFrames() { net.minecraft.util.packrat.ParseResults.duplicateFrames(); }
public int indexOf(yarnwrap.util.packrat.Symbol symbol) { return wrapperContained.indexOf(symbol.wrapperContained); }
// public static int indexOf(yarnwrap.util.packrat.Symbol symbol, ) { return net.minecraft.util.packrat.ParseResults.indexOf(symbol.wrapperContained); }
public void clearFrameValues() { wrapperContained.clearFrameValues(); }
// public static void clearFrameValues() { net.minecraft.util.packrat.ParseResults.clearFrameValues(); }
public void chooseCurrentFrame() { wrapperContained.chooseCurrentFrame(); }
// public static void chooseCurrentFrame() { net.minecraft.util.packrat.ParseResults.chooseCurrentFrame(); }
public java.util.Map toSymbolKeyedMap() { return wrapperContained.toSymbolKeyedMap(); }
// public static java.util.Map toSymbolKeyedMap() { return net.minecraft.util.packrat.ParseResults.toSymbolKeyedMap(); }
public boolean areFramesPlacedCorrectly() { return wrapperContained.areFramesPlacedCorrectly(); }
// public static boolean areFramesPlacedCorrectly() { return net.minecraft.util.packrat.ParseResults.areFramesPlacedCorrectly(); }
// public void addFrame() { wrapperContained.addFrame(); }
// public static void addFrame() { net.minecraft.util.packrat.ParseResults.addFrame(); }
// public boolean isValid() { return wrapperContained.isValid(); }
// public static boolean isValid() { return net.minecraft.util.packrat.ParseResults.isValid(); }

}