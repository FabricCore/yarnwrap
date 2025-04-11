package yarnwrap.command.argument;
public class ItemSlotArgumentType { public net.minecraft.command.argument.ItemSlotArgumentType wrapperContained; public ItemSlotArgumentType(net.minecraft.command.argument.ItemSlotArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ONLY_SINGLE_ALLOWED_EXCEPTION() { return wrapperContained.ONLY_SINGLE_ALLOWED_EXCEPTION; }
// public void ONLY_SINGLE_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ONLY_SINGLE_ALLOWED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SLOT_EXCEPTION() { return wrapperContained.UNKNOWN_SLOT_EXCEPTION; }
// public void UNKNOWN_SLOT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_SLOT_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public boolean method_58129(char c) { return wrapperContained.method_58129(c); }
public int getItemSlot(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getItemSlot(context,name); }
// public com.mojang.brigadier.Message method_9471(java.lang.Object name) { return wrapperContained.method_9471(name); }
// public com.mojang.brigadier.Message method_9472(java.lang.Object name) { return wrapperContained.method_9472(name); }
public yarnwrap.command.argument.ItemSlotArgumentType itemSlot() { return new yarnwrap.command.argument.ItemSlotArgumentType(wrapperContained.itemSlot()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}