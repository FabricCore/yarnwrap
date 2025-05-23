package yarnwrap.command.argument;
public class TextArgumentType { public net.minecraft.command.argument.TextArgumentType wrapperContained; public TextArgumentType(net.minecraft.command.argument.TextArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.TextArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.TextArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return wrapperContained.INVALID_COMPONENT_EXCEPTION; }
// public void INVALID_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_COMPONENT_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COMPONENT_EXCEPTION() { return net.minecraft.command.argument.TextArgumentType.INVALID_COMPONENT_EXCEPTION; }
// public static void INVALID_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.TextArgumentType.INVALID_COMPONENT_EXCEPTION = value; }

// public yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(wrapperContained.PARSER); }
// public void PARSER(yarnwrap.util.packrat.Parser value) { wrapperContained.PARSER = value.wrapperContained; }
// public static yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(net.minecraft.command.argument.TextArgumentType.PARSER); }
// public static void PARSER(yarnwrap.util.packrat.Parser value, ) { net.minecraft.command.argument.TextArgumentType.PARSER = value.wrapperContained; }

// public com.mojang.serialization.DynamicOps OPS() { return wrapperContained.OPS; }
// public void OPS(com.mojang.serialization.DynamicOps value) { wrapperContained.OPS = value; }
// public static com.mojang.serialization.DynamicOps OPS() { return net.minecraft.command.argument.TextArgumentType.OPS; }
// public static void OPS(com.mojang.serialization.DynamicOps value, ) { net.minecraft.command.argument.TextArgumentType.OPS = value; }

// public TextArgumentType(Object registries) { this.wrapperContained = new net.minecraft.command.argument.TextArgumentType(registries); }
// public yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.TextArgumentType(wrapperContained.text(registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.TextArgumentType text(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return new yarnwrap.command.argument.TextArgumentType(net.minecraft.command.argument.TextArgumentType.text(registryAccess.wrapperContained)); }
// public com.mojang.brigadier.Message method_9282(java.lang.Object text) { return wrapperContained.method_9282(text); }
// public static com.mojang.brigadier.Message method_9282(java.lang.Object text, ) { return net.minecraft.command.argument.TextArgumentType.method_9282(text); }
// public yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.getTextArgument(context,name)); }
// public static yarnwrap.text.Text getTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.text.Text(net.minecraft.command.argument.TextArgumentType.getTextArgument(context,name)); }
// public yarnwrap.text.Text parseTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.entity.Entity sender) { return new yarnwrap.text.Text(wrapperContained.parseTextArgument(context,name,sender.wrapperContained)); }
// public static yarnwrap.text.Text parseTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.entity.Entity sender, ) { return new yarnwrap.text.Text(net.minecraft.command.argument.TextArgumentType.parseTextArgument(context,name,sender.wrapperContained)); }
// public yarnwrap.text.Text parseTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.parseTextArgument(context,name)); }
// public static yarnwrap.text.Text parseTextArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.text.Text(net.minecraft.command.argument.TextArgumentType.parseTextArgument(context,name)); }

}