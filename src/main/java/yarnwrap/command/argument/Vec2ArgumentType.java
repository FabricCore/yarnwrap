package yarnwrap.command.argument;
public class Vec2ArgumentType { public net.minecraft.command.argument.Vec2ArgumentType wrapperContained; public Vec2ArgumentType(net.minecraft.command.argument.Vec2ArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return wrapperContained.INCOMPLETE_EXCEPTION; }
// public void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_EXCEPTION = value; }
// public boolean centerIntegers() { return wrapperContained.centerIntegers; }
// public void centerIntegers(boolean value) { wrapperContained.centerIntegers = value; }
public yarnwrap.command.argument.Vec2ArgumentType vec2(boolean centerIntegers) { return new yarnwrap.command.argument.Vec2ArgumentType(wrapperContained.vec2(centerIntegers)); }
public yarnwrap.command.argument.Vec2ArgumentType vec2() { return new yarnwrap.command.argument.Vec2ArgumentType(wrapperContained.vec2()); }
public yarnwrap.util.math.Vec2f getVec2(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.Vec2f(wrapperContained.getVec2(context,name)); }

}