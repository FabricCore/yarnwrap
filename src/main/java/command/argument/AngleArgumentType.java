package yarnwrap.command.argument;
public class AngleArgumentType { public net.minecraft.command.argument.AngleArgumentType wrapperContained; public AngleArgumentType(net.minecraft.command.argument.AngleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_ANGLE_EXCEPTION() { return wrapperContained.INCOMPLETE_ANGLE_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ANGLE_EXCEPTION() { return wrapperContained.INVALID_ANGLE_EXCEPTION; }
public yarnwrap.command.argument.AngleArgumentType angle() { return new yarnwrap.command.argument.AngleArgumentType(wrapperContained.angle()); }
public float getAngle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getAngle(context,name); }

}