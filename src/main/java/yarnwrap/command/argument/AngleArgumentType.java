package yarnwrap.command.argument;
public class AngleArgumentType { public net.minecraft.command.argument.AngleArgumentType wrapperContained; public AngleArgumentType(net.minecraft.command.argument.AngleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ANGLE_EXCEPTION() { return wrapperContained.INCOMPLETE_ANGLE_EXCEPTION; }
// public void INCOMPLETE_ANGLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_ANGLE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ANGLE_EXCEPTION() { return net.minecraft.command.argument.AngleArgumentType.INCOMPLETE_ANGLE_EXCEPTION; }
// public static void INCOMPLETE_ANGLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.AngleArgumentType.INCOMPLETE_ANGLE_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.AngleArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.AngleArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ANGLE_EXCEPTION() { return wrapperContained.INVALID_ANGLE_EXCEPTION; }
// public void INVALID_ANGLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_ANGLE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ANGLE_EXCEPTION() { return net.minecraft.command.argument.AngleArgumentType.INVALID_ANGLE_EXCEPTION; }
// public static void INVALID_ANGLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.AngleArgumentType.INVALID_ANGLE_EXCEPTION = value; }

// public yarnwrap.command.argument.AngleArgumentType angle() { return new yarnwrap.command.argument.AngleArgumentType(wrapperContained.angle()); }
public static yarnwrap.command.argument.AngleArgumentType angle() { return new yarnwrap.command.argument.AngleArgumentType(net.minecraft.command.argument.AngleArgumentType.angle()); }
// public float getAngle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getAngle(context,name); }
// public static float getAngle(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.AngleArgumentType.getAngle(context,name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.AngleArgumentType.parse(reader); }

}