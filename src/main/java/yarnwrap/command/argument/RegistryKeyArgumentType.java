package yarnwrap.command.argument;
public class RegistryKeyArgumentType { public net.minecraft.command.argument.RegistryKeyArgumentType wrapperContained; public RegistryKeyArgumentType(net.minecraft.command.argument.RegistryKeyArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_FEATURE_EXCEPTION() { return wrapperContained.INVALID_FEATURE_EXCEPTION; }
// public void INVALID_FEATURE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_FEATURE_EXCEPTION = value; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_STRUCTURE_EXCEPTION() { return wrapperContained.INVALID_STRUCTURE_EXCEPTION; }
// public void INVALID_STRUCTURE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_STRUCTURE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_JIGSAW_EXCEPTION() { return wrapperContained.INVALID_JIGSAW_EXCEPTION; }
// public void INVALID_JIGSAW_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_JIGSAW_EXCEPTION = value; }
public RegistryKeyArgumentType(yarnwrap.registry.RegistryKey registryRef) { this.wrapperContained = new net.minecraft.command.argument.RegistryKeyArgumentType(registryRef.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public yarnwrap.registry.RegistryKey getKey(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException) { return new yarnwrap.registry.RegistryKey(wrapperContained.getKey(context,name,registryRef.wrapperContained,invalidException)); }
// public yarnwrap.registry.Registry getRegistry(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.Registry(wrapperContained.getRegistry(context,registryRef.wrapperContained)); }
public yarnwrap.command.argument.RegistryKeyArgumentType registryKey(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistryKeyArgumentType(wrapperContained.registryKey(registryRef.wrapperContained)); }
// public Object getConfiguredFeatureEntry(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getConfiguredFeatureEntry(context,name); }
// public com.mojang.brigadier.Message method_41226(java.lang.Object id) { return wrapperContained.method_41226(id); }
// public com.mojang.brigadier.Message method_43776(java.lang.Object id) { return wrapperContained.method_43776(id); }
// public Object getRegistryEntry(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException) { return wrapperContained.getRegistryEntry(context,name,registryRef.wrapperContained,invalidException); }
// public com.mojang.brigadier.Message method_43778(java.lang.Object id) { return wrapperContained.method_43778(id); }
// public Object getStructureEntry(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getStructureEntry(context,name); }
// public Object getStructurePoolEntry(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getStructurePoolEntry(context,name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}