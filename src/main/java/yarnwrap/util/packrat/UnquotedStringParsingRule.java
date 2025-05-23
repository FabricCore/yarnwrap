package yarnwrap.util.packrat;
public class UnquotedStringParsingRule { public net.minecraft.util.packrat.UnquotedStringParsingRule wrapperContained; public UnquotedStringParsingRule(net.minecraft.util.packrat.UnquotedStringParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minLength() { return wrapperContained.minLength; }
// public void minLength(int value) { wrapperContained.minLength = value; }
// public static int minLength() { return net.minecraft.util.packrat.UnquotedStringParsingRule.minLength; }
// public static void minLength(int value, ) { net.minecraft.util.packrat.UnquotedStringParsingRule.minLength = value; }

// public yarnwrap.util.packrat.CursorExceptionType tooShortException() { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.tooShortException); }
// public void tooShortException(yarnwrap.util.packrat.CursorExceptionType value) { wrapperContained.tooShortException = value.wrapperContained; }
// public static yarnwrap.util.packrat.CursorExceptionType tooShortException() { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.util.packrat.UnquotedStringParsingRule.tooShortException); }
// public static void tooShortException(yarnwrap.util.packrat.CursorExceptionType value, ) { net.minecraft.util.packrat.UnquotedStringParsingRule.tooShortException = value.wrapperContained; }

public UnquotedStringParsingRule(int minLength,yarnwrap.util.packrat.CursorExceptionType tooShortException) { this.wrapperContained = new net.minecraft.util.packrat.UnquotedStringParsingRule(minLength,tooShortException.wrapperContained); }

}