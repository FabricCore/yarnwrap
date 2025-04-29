package yarnwrap.command.argument;
public class TextArgumentType { public net.minecraft.command.argument.TextArgumentType wrapperContained; public TextArgumentType(net.minecraft.command.argument.TextArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.command.argument.TextArgumentType.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.command.argument.TextArgumentType.registryLookup = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.TextArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.TextArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return wrapperContained.INVALID_COMPONENT_EXCEPTION; }
// public void INVALID_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_COMPONENT_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return net.minecraft.command.argument.TextArgumentType.INVALID_COMPONENT_EXCEPTION; }
// public static void INVALID_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.TextArgumentType.INVALID_COMPONENT_EXCEPTION = value; }

// public TextArgumentType(Object registryLookup) { this.wrapperContained = new net.minecraft.command.argument.TextArgumentType(registryLookup); }
// public yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.getTextArgument(context,name)); }
// public static yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.text.Text(net.minecraft.command.argument.TextArgumentType.getTextArgument(context,name)); }
// public yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.TextArgumentType(wrapperContained.text(registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return new yarnwrap.command.argument.TextArgumentType(net.minecraft.command.argument.TextArgumentType.text(registryAccess.wrapperContained)); }
// public com.mojang.brigadier.Message method_9282(java.lang.Object text) { return wrapperContained.method_9282(text); }
// public static com.mojang.brigadier.Message method_9282(java.lang.Object text, ) { return net.minecraft.command.argument.TextArgumentType.method_9282(text); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.TextArgumentType.parse(reader); }

}