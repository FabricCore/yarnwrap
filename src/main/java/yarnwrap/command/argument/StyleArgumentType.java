package yarnwrap.command.argument;
public class StyleArgumentType { public net.minecraft.command.argument.StyleArgumentType wrapperContained; public StyleArgumentType(net.minecraft.command.argument.StyleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.StyleArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.StyleArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return wrapperContained.INVALID_STYLE_EXCEPTION; }
// public void INVALID_STYLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_STYLE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return net.minecraft.command.argument.StyleArgumentType.INVALID_STYLE_EXCEPTION; }
// public static void INVALID_STYLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.StyleArgumentType.INVALID_STYLE_EXCEPTION = value; }

// public yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(wrapperContained.PARSER); }
// public void PARSER(yarnwrap.util.packrat.Parser value) { wrapperContained.PARSER = value.wrapperContained; }
// public static yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(net.minecraft.command.argument.StyleArgumentType.PARSER); }
// public static void PARSER(yarnwrap.util.packrat.Parser value, ) { net.minecraft.command.argument.StyleArgumentType.PARSER = value.wrapperContained; }

// public com.mojang.serialization.DynamicOps OPS() { return wrapperContained.OPS; }
// public void OPS(com.mojang.serialization.DynamicOps value) { wrapperContained.OPS = value; }
// public static com.mojang.serialization.DynamicOps OPS() { return net.minecraft.command.argument.StyleArgumentType.OPS; }
// public static void OPS(com.mojang.serialization.DynamicOps value, ) { net.minecraft.command.argument.StyleArgumentType.OPS = value; }

// public StyleArgumentType(Object registries) { this.wrapperContained = new net.minecraft.command.argument.StyleArgumentType(registries); }
// public yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.StyleArgumentType(wrapperContained.style(registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return new yarnwrap.command.argument.StyleArgumentType(net.minecraft.command.argument.StyleArgumentType.style(registryAccess.wrapperContained)); }
// public yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.getStyle(context,style)); }
// public static yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style, ) { return new yarnwrap.text.Style(net.minecraft.command.argument.StyleArgumentType.getStyle(context,style)); }
// public com.mojang.brigadier.Message method_55449(java.lang.Object style) { return wrapperContained.method_55449(style); }
// public static com.mojang.brigadier.Message method_55449(java.lang.Object style, ) { return net.minecraft.command.argument.StyleArgumentType.method_55449(style); }

}