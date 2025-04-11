package yarnwrap.command.argument;
public class StyleArgumentType { public net.minecraft.command.argument.StyleArgumentType wrapperContained; public StyleArgumentType(net.minecraft.command.argument.StyleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return wrapperContained.INVALID_STYLE_EXCEPTION; }
// public void INVALID_STYLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_STYLE_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
public yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.StyleArgumentType(wrapperContained.style(registryAccess.wrapperContained)); }
public yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.getStyle(context,style)); }

}