package yarnwrap.command.argument;
public class Vec3ArgumentType { public net.minecraft.command.argument.Vec3ArgumentType wrapperContained; public Vec3ArgumentType(net.minecraft.command.argument.Vec3ArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.Vec3ArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.Vec3ArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return wrapperContained.INCOMPLETE_EXCEPTION; }
// public void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return net.minecraft.command.argument.Vec3ArgumentType.INCOMPLETE_EXCEPTION; }
// public static void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.Vec3ArgumentType.INCOMPLETE_EXCEPTION = value; }

// public boolean centerIntegers() { return wrapperContained.centerIntegers; }
// public void centerIntegers(boolean value) { wrapperContained.centerIntegers = value; }
// public static boolean centerIntegers() { return net.minecraft.command.argument.Vec3ArgumentType.centerIntegers; }
// public static void centerIntegers(boolean value, ) { net.minecraft.command.argument.Vec3ArgumentType.centerIntegers = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MIXED_COORDINATE_EXCEPTION() { return wrapperContained.MIXED_COORDINATE_EXCEPTION; }
// public void MIXED_COORDINATE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MIXED_COORDINATE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType MIXED_COORDINATE_EXCEPTION() { return net.minecraft.command.argument.Vec3ArgumentType.MIXED_COORDINATE_EXCEPTION; }
// public static void MIXED_COORDINATE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.Vec3ArgumentType.MIXED_COORDINATE_EXCEPTION = value; }

public Vec3ArgumentType(boolean centerIntegers) { this.wrapperContained = new net.minecraft.command.argument.Vec3ArgumentType(centerIntegers); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.Vec3ArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.PosArgument getPosArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.PosArgument(wrapperContained.getPosArgument(context,name)); }
// public static yarnwrap.command.argument.PosArgument getPosArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.command.argument.PosArgument(net.minecraft.command.argument.Vec3ArgumentType.getPosArgument(context,name)); }
// public yarnwrap.command.argument.Vec3ArgumentType vec3(boolean centerIntegers) { return new yarnwrap.command.argument.Vec3ArgumentType(wrapperContained.vec3(centerIntegers)); }
// public static yarnwrap.command.argument.Vec3ArgumentType vec3(boolean centerIntegers, ) { return new yarnwrap.command.argument.Vec3ArgumentType(net.minecraft.command.argument.Vec3ArgumentType.vec3(centerIntegers)); }
// public yarnwrap.util.math.Vec3d getVec3(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVec3(context,name)); }
// public static yarnwrap.util.math.Vec3d getVec3(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.command.argument.Vec3ArgumentType.getVec3(context,name)); }
// public yarnwrap.command.argument.Vec3ArgumentType vec3() { return new yarnwrap.command.argument.Vec3ArgumentType(wrapperContained.vec3()); }
public static yarnwrap.command.argument.Vec3ArgumentType vec3() { return new yarnwrap.command.argument.Vec3ArgumentType(net.minecraft.command.argument.Vec3ArgumentType.vec3()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.Vec3ArgumentType.parse(reader); }

}