package yarnwrap.command.argument;
public class Vec2ArgumentType { public net.minecraft.command.argument.Vec2ArgumentType wrapperContained; public Vec2ArgumentType(net.minecraft.command.argument.Vec2ArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.Vec2ArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.Vec2ArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return wrapperContained.INCOMPLETE_EXCEPTION; }
// public void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return net.minecraft.command.argument.Vec2ArgumentType.INCOMPLETE_EXCEPTION; }
// public static void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.Vec2ArgumentType.INCOMPLETE_EXCEPTION = value; }

// public boolean centerIntegers() { return wrapperContained.centerIntegers; }
// public void centerIntegers(boolean value) { wrapperContained.centerIntegers = value; }
// public static boolean centerIntegers() { return net.minecraft.command.argument.Vec2ArgumentType.centerIntegers; }
// public static void centerIntegers(boolean value, ) { net.minecraft.command.argument.Vec2ArgumentType.centerIntegers = value; }

public Vec2ArgumentType(boolean centerIntegers) { this.wrapperContained = new net.minecraft.command.argument.Vec2ArgumentType(centerIntegers); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.Vec2ArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.Vec2ArgumentType vec2() { return new yarnwrap.command.argument.Vec2ArgumentType(wrapperContained.vec2()); }
public static yarnwrap.command.argument.Vec2ArgumentType vec2() { return new yarnwrap.command.argument.Vec2ArgumentType(net.minecraft.command.argument.Vec2ArgumentType.vec2()); }
// public yarnwrap.util.math.Vec2f getVec2(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.Vec2f(wrapperContained.getVec2(context,name)); }
// public static yarnwrap.util.math.Vec2f getVec2(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.util.math.Vec2f(net.minecraft.command.argument.Vec2ArgumentType.getVec2(context,name)); }
// public yarnwrap.command.argument.Vec2ArgumentType vec2(boolean centerIntegers) { return new yarnwrap.command.argument.Vec2ArgumentType(wrapperContained.vec2(centerIntegers)); }
// public static yarnwrap.command.argument.Vec2ArgumentType vec2(boolean centerIntegers, ) { return new yarnwrap.command.argument.Vec2ArgumentType(net.minecraft.command.argument.Vec2ArgumentType.vec2(centerIntegers)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.Vec2ArgumentType.parse(reader); }

}