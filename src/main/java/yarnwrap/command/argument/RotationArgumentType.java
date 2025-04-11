package yarnwrap.command.argument;
public class RotationArgumentType { public net.minecraft.command.argument.RotationArgumentType wrapperContained; public RotationArgumentType(net.minecraft.command.argument.RotationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ROTATION_EXCEPTION() { return wrapperContained.INCOMPLETE_ROTATION_EXCEPTION; }
// public void INCOMPLETE_ROTATION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_ROTATION_EXCEPTION = value; }
public yarnwrap.command.argument.PosArgument getRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.PosArgument(wrapperContained.getRotation(context,name)); }
public yarnwrap.command.argument.RotationArgumentType rotation() { return new yarnwrap.command.argument.RotationArgumentType(wrapperContained.rotation()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}