package yarnwrap.command.argument.packrat;
public class ParseErrorList { public net.minecraft.command.argument.packrat.ParseErrorList wrapperContained; public ParseErrorList(net.minecraft.command.argument.packrat.ParseErrorList wrapperContained) { this.wrapperContained = wrapperContained; }

public void setCursor(int cursor) { wrapperContained.setCursor(cursor); }
public void add(int cursor,yarnwrap.command.argument.packrat.Suggestable suggestions,java.lang.Object reason) { wrapperContained.add(cursor,suggestions.wrapperContained,reason); }
public void add(int cursor,java.lang.Object reason) { wrapperContained.add(cursor,reason); }

}