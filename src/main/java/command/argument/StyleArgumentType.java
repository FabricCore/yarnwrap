package yarnwrap.command.argument;
public class StyleArgumentType { public net.minecraft.command.argument.StyleArgumentType wrapperContained; public StyleArgumentType(net.minecraft.command.argument.StyleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return wrapperContained.INVALID_STYLE_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
public yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.StyleArgumentType(wrapperContained.style(registryAccess.wrapperContained)); }
public yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.getStyle(context,style)); }

}