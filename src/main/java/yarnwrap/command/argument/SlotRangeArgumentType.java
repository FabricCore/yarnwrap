package yarnwrap.command.argument;
public class SlotRangeArgumentType { public net.minecraft.command.argument.SlotRangeArgumentType wrapperContained; public SlotRangeArgumentType(net.minecraft.command.argument.SlotRangeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SLOT_EXCEPTION() { return wrapperContained.UNKNOWN_SLOT_EXCEPTION; }
// public void UNKNOWN_SLOT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_SLOT_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.listSuggestions(context,suggestionsBuilder); }
public yarnwrap.command.argument.SlotRangeArgumentType slotRange() { return new yarnwrap.command.argument.SlotRangeArgumentType(wrapperContained.slotRange()); }
public yarnwrap.inventory.SlotRange getSlotRange(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.inventory.SlotRange(wrapperContained.getSlotRange(context,name)); }
// public com.mojang.brigadier.Message method_58134(java.lang.Object slotRange) { return wrapperContained.method_58134(slotRange); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader stringReader) { return wrapperContained.parse(stringReader); }

}