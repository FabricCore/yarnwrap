package yarnwrap.command.argument;
public class StyleArgumentType { public net.minecraft.command.argument.StyleArgumentType wrapperContained; public StyleArgumentType(net.minecraft.command.argument.StyleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return wrapperContained.INVALID_STYLE_EXCEPTION; }
// public void INVALID_STYLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_STYLE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STYLE_EXCEPTION() { return net.minecraft.command.argument.StyleArgumentType.INVALID_STYLE_EXCEPTION; }
// public static void INVALID_STYLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.StyleArgumentType.INVALID_STYLE_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.StyleArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.StyleArgumentType.EXAMPLES = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.command.argument.StyleArgumentType.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.command.argument.StyleArgumentType.registryLookup = value; }

// public StyleArgumentType(Object registryLookup) { this.wrapperContained = new net.minecraft.command.argument.StyleArgumentType(registryLookup); }
// public yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.StyleArgumentType(wrapperContained.style(registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.StyleArgumentType style(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return new yarnwrap.command.argument.StyleArgumentType(net.minecraft.command.argument.StyleArgumentType.style(registryAccess.wrapperContained)); }
// public yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.getStyle(context,style)); }
// public static yarnwrap.text.Style getStyle(com.mojang.brigadier.context.CommandContext context,java.lang.String style, ) { return new yarnwrap.text.Style(net.minecraft.command.argument.StyleArgumentType.getStyle(context,style)); }
// public com.mojang.brigadier.Message method_55449(java.lang.Object style) { return wrapperContained.method_55449(style); }
// public static com.mojang.brigadier.Message method_55449(java.lang.Object style, ) { return net.minecraft.command.argument.StyleArgumentType.method_55449(style); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.StyleArgumentType.parse(reader); }

}