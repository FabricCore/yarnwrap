package yarnwrap.command;
public class FloatRangeArgument { public net.minecraft.command.FloatRangeArgument wrapperContained; public FloatRangeArgument(net.minecraft.command.FloatRangeArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.FloatRangeArgument ANY() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.ANY); }
// public void ANY(yarnwrap.command.FloatRangeArgument value) { wrapperContained.ANY = value.wrapperContained; }
public static yarnwrap.command.FloatRangeArgument ANY() { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.ANY); }
// public static void ANY(yarnwrap.command.FloatRangeArgument value, ) { net.minecraft.command.FloatRangeArgument.ANY = value.wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ONLY_INTS_EXCEPTION() { return wrapperContained.ONLY_INTS_EXCEPTION; }
// public void ONLY_INTS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ONLY_INTS_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ONLY_INTS_EXCEPTION() { return net.minecraft.command.FloatRangeArgument.ONLY_INTS_EXCEPTION; }
// public static void ONLY_INTS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.FloatRangeArgument.ONLY_INTS_EXCEPTION = value; }

public FloatRangeArgument(java.lang.Float min,java.lang.Float max) { this.wrapperContained = new net.minecraft.command.FloatRangeArgument(min,max); }
public boolean isInSquaredRange(double value) { return wrapperContained.isInSquaredRange(value); }
// public static boolean isInSquaredRange(double value, ) { return net.minecraft.command.FloatRangeArgument.isInSquaredRange(value); }
// public yarnwrap.command.FloatRangeArgument exactly(float value) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.exactly(value)); }
// public static yarnwrap.command.FloatRangeArgument exactly(float value, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.exactly(value)); }
// public yarnwrap.command.FloatRangeArgument between(float min,float max) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.between(min,max)); }
// public static yarnwrap.command.FloatRangeArgument between(float min,float max, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.between(min,max)); }
// public yarnwrap.command.FloatRangeArgument fromJson(com.google.gson.JsonElement json) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.fromJson(json)); }
// public static yarnwrap.command.FloatRangeArgument fromJson(com.google.gson.JsonElement json, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.fromJson(json)); }
// public yarnwrap.command.FloatRangeArgument parse(com.mojang.brigadier.StringReader reader,boolean allowFloats) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.parse(reader,allowFloats)); }
// public static yarnwrap.command.FloatRangeArgument parse(com.mojang.brigadier.StringReader reader,boolean allowFloats, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.parse(reader,allowFloats)); }
// public java.lang.Float method_35405(java.lang.Float value) { return wrapperContained.method_35405(value); }
// public static java.lang.Float method_35405(java.lang.Float value, ) { return net.minecraft.command.FloatRangeArgument.method_35405(value); }
// public yarnwrap.command.FloatRangeArgument atLeast(float value) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.atLeast(value)); }
// public static yarnwrap.command.FloatRangeArgument atLeast(float value, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.atLeast(value)); }
public com.google.gson.JsonElement toJson() { return wrapperContained.toJson(); }
// public static com.google.gson.JsonElement toJson() { return net.minecraft.command.FloatRangeArgument.toJson(); }
// public yarnwrap.command.FloatRangeArgument atMost(float value) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.atMost(value)); }
// public static yarnwrap.command.FloatRangeArgument atMost(float value, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.atMost(value)); }
public boolean isInRange(float value) { return wrapperContained.isInRange(value); }
// public static boolean isInRange(float value, ) { return net.minecraft.command.FloatRangeArgument.isInRange(value); }
// public yarnwrap.command.FloatRangeArgument parse(com.mojang.brigadier.StringReader reader,boolean allowFloats,java.util.function.Function transform) { return new yarnwrap.command.FloatRangeArgument(wrapperContained.parse(reader,allowFloats,transform)); }
// public static yarnwrap.command.FloatRangeArgument parse(com.mojang.brigadier.StringReader reader,boolean allowFloats,java.util.function.Function transform, ) { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.FloatRangeArgument.parse(reader,allowFloats,transform)); }
// public boolean peekDigit(com.mojang.brigadier.StringReader reader,boolean allowFloats) { return wrapperContained.peekDigit(reader,allowFloats); }
// public static boolean peekDigit(com.mojang.brigadier.StringReader reader,boolean allowFloats, ) { return net.minecraft.command.FloatRangeArgument.peekDigit(reader,allowFloats); }
// public java.lang.Float mapFloat(java.lang.Float value,java.util.function.Function function) { return wrapperContained.mapFloat(value,function); }
// public static java.lang.Float mapFloat(java.lang.Float value,java.util.function.Function function, ) { return net.minecraft.command.FloatRangeArgument.mapFloat(value,function); }
// public java.lang.Float parseFloat(com.mojang.brigadier.StringReader reader,boolean allowFloats) { return wrapperContained.parseFloat(reader,allowFloats); }
// public static java.lang.Float parseFloat(com.mojang.brigadier.StringReader reader,boolean allowFloats, ) { return net.minecraft.command.FloatRangeArgument.parseFloat(reader,allowFloats); }

}