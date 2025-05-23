package yarnwrap.util.packrat;
public class PatternParsingRule { public net.minecraft.util.packrat.PatternParsingRule wrapperContained; public PatternParsingRule(net.minecraft.util.packrat.PatternParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern pattern() { return wrapperContained.pattern; }
// public void pattern(java.util.regex.Pattern value) { wrapperContained.pattern = value; }
// public static java.util.regex.Pattern pattern() { return net.minecraft.util.packrat.PatternParsingRule.pattern; }
// public static void pattern(java.util.regex.Pattern value, ) { net.minecraft.util.packrat.PatternParsingRule.pattern = value; }

// public yarnwrap.util.packrat.CursorExceptionType exception() { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.exception); }
// public void exception(yarnwrap.util.packrat.CursorExceptionType value) { wrapperContained.exception = value.wrapperContained; }
// public static yarnwrap.util.packrat.CursorExceptionType exception() { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.util.packrat.PatternParsingRule.exception); }
// public static void exception(yarnwrap.util.packrat.CursorExceptionType value, ) { net.minecraft.util.packrat.PatternParsingRule.exception = value.wrapperContained; }

public PatternParsingRule(java.util.regex.Pattern pattern,yarnwrap.util.packrat.CursorExceptionType exception) { this.wrapperContained = new net.minecraft.util.packrat.PatternParsingRule(pattern,exception.wrapperContained); }

}