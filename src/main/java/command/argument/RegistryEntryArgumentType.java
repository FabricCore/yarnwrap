package yarnwrap.command.argument;
public class RegistryEntryArgumentType { public net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained; public RegistryEntryArgumentType(net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return wrapperContained.FAILED_TO_PARSE_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_EXCEPTION() { return wrapperContained.INVALID_EXCEPTION; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// public boolean canLookupRegistry() { return wrapperContained.canLookupRegistry; }
// public com.mojang.serialization.Codec entryCodec() { return wrapperContained.entryCodec; }
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