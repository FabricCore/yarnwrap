package yarnwrap.command.argument;
public class ColorArgumentType { public net.minecraft.command.argument.ColorArgumentType wrapperContained; public ColorArgumentType(net.minecraft.command.argument.ColorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COLOR_EXCEPTION() { return wrapperContained.INVALID_COLOR_EXCEPTION; }
// public void INVALID_COLOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_COLOR_EXCEPTION = value; }
public yarnwrap.command.argument.ColorArgumentType color() { return new yarnwrap.command.argument.ColorArgumentType(wrapperContained.color()); }
public yarnwrap.util.Formatting getColor(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.Formatting(wrapperContained.getColor(context,name)); }

}