package yarnwrap.command.argument;
public class EntityAnchorArgumentType { public net.minecraft.command.argument.EntityAnchorArgumentType wrapperContained; public EntityAnchorArgumentType(net.minecraft.command.argument.EntityAnchorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ANCHOR_EXCEPTION() { return wrapperContained.INVALID_ANCHOR_EXCEPTION; }
// public void INVALID_ANCHOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_ANCHOR_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ANCHOR_EXCEPTION() { return net.minecraft.command.argument.EntityAnchorArgumentType.INVALID_ANCHOR_EXCEPTION; }
// public static void INVALID_ANCHOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.EntityAnchorArgumentType.INVALID_ANCHOR_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.EntityAnchorArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.EntityAnchorArgumentType.EXAMPLES = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.EntityAnchorArgumentType.listSuggestions(context,builder); }
// public com.mojang.brigadier.Message method_9293(java.lang.Object name) { return wrapperContained.method_9293(name); }
// public static com.mojang.brigadier.Message method_9293(java.lang.Object name, ) { return net.minecraft.command.argument.EntityAnchorArgumentType.method_9293(name); }
// public Object getEntityAnchor(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntityAnchor(context,name); }
// public static Object getEntityAnchor(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.EntityAnchorArgumentType.getEntityAnchor(context,name); }
// public yarnwrap.command.argument.EntityAnchorArgumentType entityAnchor() { return new yarnwrap.command.argument.EntityAnchorArgumentType(wrapperContained.entityAnchor()); }
public static yarnwrap.command.argument.EntityAnchorArgumentType entityAnchor() { return new yarnwrap.command.argument.EntityAnchorArgumentType(net.minecraft.command.argument.EntityAnchorArgumentType.entityAnchor()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.EntityAnchorArgumentType.parse(reader); }

}