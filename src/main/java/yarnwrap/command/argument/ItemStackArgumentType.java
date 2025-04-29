package yarnwrap.command.argument;
public class ItemStackArgumentType { public net.minecraft.command.argument.ItemStackArgumentType wrapperContained; public ItemStackArgumentType(net.minecraft.command.argument.ItemStackArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ItemStackArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ItemStackArgumentType.EXAMPLES = value; }

// public yarnwrap.command.argument.ItemStringReader reader() { return new yarnwrap.command.argument.ItemStringReader(wrapperContained.reader); }
// public void reader(yarnwrap.command.argument.ItemStringReader value) { wrapperContained.reader = value.wrapperContained; }
// public static yarnwrap.command.argument.ItemStringReader reader() { return new yarnwrap.command.argument.ItemStringReader(net.minecraft.command.argument.ItemStackArgumentType.reader); }
// public static void reader(yarnwrap.command.argument.ItemStringReader value, ) { net.minecraft.command.argument.ItemStackArgumentType.reader = value.wrapperContained; }

public ItemStackArgumentType(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { this.wrapperContained = new net.minecraft.command.argument.ItemStackArgumentType(commandRegistryAccess.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ItemStackArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.ItemStackArgumentType itemStack(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.ItemStackArgumentType(wrapperContained.itemStack(commandRegistryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.ItemStackArgumentType itemStack(yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { return new yarnwrap.command.argument.ItemStackArgumentType(net.minecraft.command.argument.ItemStackArgumentType.itemStack(commandRegistryAccess.wrapperContained)); }
// public yarnwrap.command.argument.ItemStackArgument getItemStackArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.ItemStackArgument(wrapperContained.getItemStackArgument(context,name)); }
// public static yarnwrap.command.argument.ItemStackArgument getItemStackArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.command.argument.ItemStackArgument(net.minecraft.command.argument.ItemStackArgumentType.getItemStackArgument(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ItemStackArgumentType.parse(reader); }

}