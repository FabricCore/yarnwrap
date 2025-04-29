package yarnwrap.command.argument;
public class RegistryEntryArgumentType { public net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained; public RegistryEntryArgumentType(net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return wrapperContained.FAILED_TO_PARSE_EXCEPTION; }
// public void FAILED_TO_PARSE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_TO_PARSE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryArgumentType.FAILED_TO_PARSE_EXCEPTION; }
// public static void FAILED_TO_PARSE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.FAILED_TO_PARSE_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RegistryEntryArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_EXCEPTION() { return wrapperContained.INVALID_EXCEPTION; }
// public void INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryArgumentType.INVALID_EXCEPTION; }
// public static void INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.INVALID_EXCEPTION = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.command.argument.RegistryEntryArgumentType.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.registryLookup = value; }

// public boolean canLookupRegistry() { return wrapperContained.canLookupRegistry; }
// public void canLookupRegistry(boolean value) { wrapperContained.canLookupRegistry = value; }
// public static boolean canLookupRegistry() { return net.minecraft.command.argument.RegistryEntryArgumentType.canLookupRegistry; }
// public static void canLookupRegistry(boolean value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.canLookupRegistry = value; }

// public com.mojang.serialization.Codec entryCodec() { return wrapperContained.entryCodec; }
// public void entryCodec(com.mojang.serialization.Codec value) { wrapperContained.entryCodec = value; }
// public static com.mojang.serialization.Codec entryCodec() { return net.minecraft.command.argument.RegistryEntryArgumentType.entryCodec; }
// public static void entryCodec(com.mojang.serialization.Codec value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.entryCodec = value; }

// public RegistryEntryArgumentType(yarnwrap.command.CommandRegistryAccess registryAccess,yarnwrap.registry.RegistryKey registry,com.mojang.serialization.Codec entryCodec) { this.wrapperContained = new net.minecraft.command.argument.RegistryEntryArgumentType(registryAccess.wrapperContained,registry.wrapperContained,entryCodec); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_58480(com.mojang.brigadier.StringReader argument) { return wrapperContained.method_58480(argument); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_58480(com.mojang.brigadier.StringReader argument, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.method_58480(argument); }
// public yarnwrap.registry.entry.RegistryEntry getLootTable(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootTable(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootTable(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootTable(context,argument)); }
// public Object lootTable(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootTable(registryAccess.wrapperContained); }
// public static Object lootTable(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootTable(registryAccess.wrapperContained); }
// public com.mojang.brigadier.Message method_58483(java.lang.Object argument) { return wrapperContained.method_58483(argument); }
// public static com.mojang.brigadier.Message method_58483(java.lang.Object argument, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.method_58483(argument); }
// public yarnwrap.nbt.NbtElement parseAsNbt(com.mojang.brigadier.StringReader stringReader) { return new yarnwrap.nbt.NbtElement(wrapperContained.parseAsNbt(stringReader)); }
// public static yarnwrap.nbt.NbtElement parseAsNbt(com.mojang.brigadier.StringReader stringReader, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.command.argument.RegistryEntryArgumentType.parseAsNbt(stringReader)); }
// public yarnwrap.registry.entry.RegistryEntry getLootFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootFunction(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootFunction(context,argument)); }
// public Object lootFunction(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootFunction(registryAccess.wrapperContained); }
// public static Object lootFunction(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootFunction(registryAccess.wrapperContained); }
// public boolean hasFinishedReading(com.mojang.brigadier.StringReader stringReader) { return wrapperContained.hasFinishedReading(stringReader); }
// public static boolean hasFinishedReading(com.mojang.brigadier.StringReader stringReader, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.hasFinishedReading(stringReader); }
// public yarnwrap.registry.entry.RegistryEntry getLootCondition(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootCondition(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootCondition(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootCondition(context,argument)); }
// public Object lootCondition(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootCondition(registryAccess.wrapperContained); }
// public static Object lootCondition(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootCondition(registryAccess.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getArgument(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getArgument(context,argument)); }

}