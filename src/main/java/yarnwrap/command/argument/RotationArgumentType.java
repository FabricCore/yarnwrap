package yarnwrap.command.argument;
public class RotationArgumentType { public net.minecraft.command.argument.RotationArgumentType wrapperContained; public RotationArgumentType(net.minecraft.command.argument.RotationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RotationArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RotationArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ROTATION_EXCEPTION() { return wrapperContained.INCOMPLETE_ROTATION_EXCEPTION; }
// public void INCOMPLETE_ROTATION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_ROTATION_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ROTATION_EXCEPTION() { return net.minecraft.command.argument.RotationArgumentType.INCOMPLETE_ROTATION_EXCEPTION; }
// public static void INCOMPLETE_ROTATION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.RotationArgumentType.INCOMPLETE_ROTATION_EXCEPTION = value; }

// public yarnwrap.command.argument.PosArgument getRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.PosArgument(wrapperContained.getRotation(context,name)); }
// public static yarnwrap.command.argument.PosArgument getRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.command.argument.PosArgument(net.minecraft.command.argument.RotationArgumentType.getRotation(context,name)); }
// public yarnwrap.command.argument.RotationArgumentType rotation() { return new yarnwrap.command.argument.RotationArgumentType(wrapperContained.rotation()); }
public static yarnwrap.command.argument.RotationArgumentType rotation() { return new yarnwrap.command.argument.RotationArgumentType(net.minecraft.command.argument.RotationArgumentType.rotation()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.RotationArgumentType.parse(reader); }

}