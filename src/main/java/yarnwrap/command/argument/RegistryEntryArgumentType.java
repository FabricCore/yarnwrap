package yarnwrap.command.argument;
public class RegistryEntryArgumentType { public net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained; public RegistryEntryArgumentType(net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return wrapperContained.FAILED_TO_PARSE_EXCEPTION; }
// public void FAILED_TO_PARSE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_TO_PARSE_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_EXCEPTION() { return wrapperContained.INVALID_EXCEPTION; }
// public void INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_EXCEPTION = value; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// public boolean canLookupRegistry() { return wrapperContained.canLookupRegistry; }
// public void canLookupRegistry(boolean value) { wrapperContained.canLookupRegistry = value; }
// public com.mojang.serialization.Codec entryCodec() { return wrapperContained.entryCodec; }
// public void entryCodec(com.mojang.serialization.Codec value) { wrapperContained.entryCodec = value; }
// public yarnwrap.registry.entry.RegistryEntry getLootTable(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootTable(context,argument)); }
public Object lootTable(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootTable(registryAccess.wrapperContained); }
// public yarnwrap.nbt.NbtElement parseAsNbt(com.mojang.brigadier.StringReader stringReader) { return new yarnwrap.nbt.NbtElement(wrapperContained.parseAsNbt(stringReader)); }
public yarnwrap.registry.entry.RegistryEntry getLootFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootFunction(context,argument)); }
public Object lootFunction(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootFunction(registryAccess.wrapperContained); }
// public boolean hasFinishedReading(com.mojang.brigadier.StringReader stringReader) { return wrapperContained.hasFinishedReading(stringReader); }
public yarnwrap.registry.entry.RegistryEntry getLootCondition(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootCondition(context,argument)); }
public Object lootCondition(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootCondition(registryAccess.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getArgument(context,argument)); }

}