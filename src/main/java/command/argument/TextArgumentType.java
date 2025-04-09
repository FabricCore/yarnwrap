package yarnwrap.command.argument;
public class TextArgumentType { public net.minecraft.command.argument.TextArgumentType wrapperContained; public TextArgumentType(net.minecraft.command.argument.TextArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return wrapperContained.INVALID_COMPONENT_EXCEPTION; }
public yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.getTextArgument(context,name)); }
public yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.TextArgumentType(wrapperContained.text(registryAccess.wrapperContained)); }

}