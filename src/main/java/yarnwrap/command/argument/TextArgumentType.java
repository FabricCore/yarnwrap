package yarnwrap.command.argument;
public class TextArgumentType { public net.minecraft.command.argument.TextArgumentType wrapperContained; public TextArgumentType(net.minecraft.command.argument.TextArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return wrapperContained.INVALID_COMPONENT_EXCEPTION; }
// public void INVALID_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_COMPONENT_EXCEPTION = value; }
public yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.getTextArgument(context,name)); }
public yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.TextArgumentType(wrapperContained.text(registryAccess.wrapperContained)); }

}