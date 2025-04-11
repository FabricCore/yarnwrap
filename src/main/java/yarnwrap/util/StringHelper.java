package yarnwrap.util;
public class StringHelper { public net.minecraft.util.StringHelper wrapperContained; public StringHelper(net.minecraft.util.StringHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern FORMATTING_CODE() { return wrapperContained.FORMATTING_CODE; }
// public void FORMATTING_CODE(java.util.regex.Pattern value) { wrapperContained.FORMATTING_CODE = value; }
// public java.util.regex.Pattern LINE_BREAK() { return wrapperContained.LINE_BREAK; }
// public void LINE_BREAK(java.util.regex.Pattern value) { wrapperContained.LINE_BREAK = value; }
// public java.util.regex.Pattern ENDS_WITH_LINE_BREAK() { return wrapperContained.ENDS_WITH_LINE_BREAK; }
// public void ENDS_WITH_LINE_BREAK(java.util.regex.Pattern value) { wrapperContained.ENDS_WITH_LINE_BREAK = value; }
public boolean isEmpty(java.lang.String text) { return wrapperContained.isEmpty(text); }
public java.lang.String formatTicks(int ticks,float tickRate) { return wrapperContained.formatTicks(ticks,tickRate); }
public java.lang.String stripTextFormat(java.lang.String text) { return wrapperContained.stripTextFormat(text); }
public int countLines(java.lang.String text) { return wrapperContained.countLines(text); }
public java.lang.String truncate(java.lang.String text,int maxLength,boolean addEllipsis) { return wrapperContained.truncate(text,maxLength,addEllipsis); }
public boolean endsWithLineBreak(java.lang.String text) { return wrapperContained.endsWithLineBreak(text); }
public java.lang.String truncateChat(java.lang.String text) { return wrapperContained.truncateChat(text); }
public boolean isValidChar(char c) { return wrapperContained.isValidChar(c); }
public boolean isWhitespace(int c) { return wrapperContained.isWhitespace(c); }
public java.lang.String stripInvalidChars(java.lang.String string,boolean allowLinebreak) { return wrapperContained.stripInvalidChars(string,allowLinebreak); }
// public boolean method_57178(int c) { return wrapperContained.method_57178(c); }
public boolean isValidPlayerName(java.lang.String name) { return wrapperContained.isValidPlayerName(name); }
public java.lang.String stripInvalidChars(java.lang.String string) { return wrapperContained.stripInvalidChars(string); }
public boolean isBlank(java.lang.String string) { return wrapperContained.isBlank(string); }

}