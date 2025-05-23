package yarnwrap.nbt;
public class SnbtOperation { public net.minecraft.nbt.SnbtOperation wrapperContained; public SnbtOperation(net.minecraft.nbt.SnbtOperation wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String TRUE() { return wrapperContained.TRUE; }
// public void TRUE(java.lang.String value) { wrapperContained.TRUE = value; }
public static java.lang.String TRUE() { return net.minecraft.nbt.SnbtOperation.TRUE; }
// public static void TRUE(java.lang.String value, ) { net.minecraft.nbt.SnbtOperation.TRUE = value; }

// public java.lang.String FALSE() { return wrapperContained.FALSE; }
// public void FALSE(java.lang.String value) { wrapperContained.FALSE = value; }
public static java.lang.String FALSE() { return net.minecraft.nbt.SnbtOperation.FALSE; }
// public static void FALSE(java.lang.String value, ) { net.minecraft.nbt.SnbtOperation.FALSE = value; }

// public java.util.Map OPERATIONS() { return wrapperContained.OPERATIONS; }
// public void OPERATIONS(java.util.Map value) { wrapperContained.OPERATIONS = value; }
public static java.util.Map OPERATIONS() { return net.minecraft.nbt.SnbtOperation.OPERATIONS; }
// public static void OPERATIONS(java.util.Map value, ) { net.minecraft.nbt.SnbtOperation.OPERATIONS = value; }

// public yarnwrap.util.packrat.Suggestable SUGGESTIONS() { return new yarnwrap.util.packrat.Suggestable(wrapperContained.SUGGESTIONS); }
// public void SUGGESTIONS(yarnwrap.util.packrat.Suggestable value) { wrapperContained.SUGGESTIONS = value.wrapperContained; }
public static yarnwrap.util.packrat.Suggestable SUGGESTIONS() { return new yarnwrap.util.packrat.Suggestable(net.minecraft.nbt.SnbtOperation.SUGGESTIONS); }
// public static void SUGGESTIONS(yarnwrap.util.packrat.Suggestable value, ) { net.minecraft.nbt.SnbtOperation.SUGGESTIONS = value.wrapperContained; }

// public yarnwrap.util.packrat.CursorExceptionType EXPECTED_STRING_UUID_EXCEPTION() { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.EXPECTED_STRING_UUID_EXCEPTION); }
// public void EXPECTED_STRING_UUID_EXCEPTION(yarnwrap.util.packrat.CursorExceptionType value) { wrapperContained.EXPECTED_STRING_UUID_EXCEPTION = value.wrapperContained; }
// public static yarnwrap.util.packrat.CursorExceptionType EXPECTED_STRING_UUID_EXCEPTION() { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.nbt.SnbtOperation.EXPECTED_STRING_UUID_EXCEPTION); }
// public static void EXPECTED_STRING_UUID_EXCEPTION(yarnwrap.util.packrat.CursorExceptionType value, ) { net.minecraft.nbt.SnbtOperation.EXPECTED_STRING_UUID_EXCEPTION = value.wrapperContained; }

// public yarnwrap.util.packrat.CursorExceptionType EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION() { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION); }
// public void EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION(yarnwrap.util.packrat.CursorExceptionType value) { wrapperContained.EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION = value.wrapperContained; }
// public static yarnwrap.util.packrat.CursorExceptionType EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION() { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.nbt.SnbtOperation.EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION); }
// public static void EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION(yarnwrap.util.packrat.CursorExceptionType value, ) { net.minecraft.nbt.SnbtOperation.EXPECTED_NUMBER_OR_BOOLEAN_EXCEPTION = value.wrapperContained; }


}