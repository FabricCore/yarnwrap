package yarnwrap.util.packrat;
public class ParseErrorList { public net.minecraft.util.packrat.ParseErrorList wrapperContained; public ParseErrorList(net.minecraft.util.packrat.ParseErrorList wrapperContained) { this.wrapperContained = wrapperContained; }

public void setCursor(int cursor) { wrapperContained.setCursor(cursor); }
// public static void setCursor(int cursor, ) { net.minecraft.util.packrat.ParseErrorList.setCursor(cursor); }
public void add(int cursor,yarnwrap.util.packrat.Suggestable suggestions,java.lang.Object reason) { wrapperContained.add(cursor,suggestions.wrapperContained,reason); }
// public static void add(int cursor,yarnwrap.util.packrat.Suggestable suggestions,java.lang.Object reason, ) { net.minecraft.util.packrat.ParseErrorList.add(cursor,suggestions.wrapperContained,reason); }
public void add(int cursor,java.lang.Object reason) { wrapperContained.add(cursor,reason); }
// public static void add(int cursor,java.lang.Object reason, ) { net.minecraft.util.packrat.ParseErrorList.add(cursor,reason); }

}