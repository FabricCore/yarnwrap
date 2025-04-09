package yarnwrap.command.argument;
public class RegistryEntryReferenceArgumentType { public net.minecraft.command.argument.RegistryEntryReferenceArgumentType wrapperContained; public RegistryEntryReferenceArgumentType(net.minecraft.command.argument.RegistryEntryReferenceArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return wrapperContained.NOT_FOUND_EXCEPTION; }
public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType INVALID_TYPE_EXCEPTION() { return wrapperContained.INVALID_TYPE_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NOT_SUMMONABLE_EXCEPTION() { return wrapperContained.NOT_SUMMONABLE_EXCEPTION; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public Object getEntityAttribute(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntityAttribute(context,name); }
// public Object getRegistryEntry(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getRegistryEntry(context,name,registryRef.wrapperContained); }
public yarnwrap.command.argument.RegistryEntryReferenceArgumentType registryEntry(yarnwrap.command.CommandRegistryAccess registryAccess,yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistryEntryReferenceArgumentType(wrapperContained.registryEntry(registryAccess.wrapperContained,registryRef.wrapperContained)); }
// public Object getConfiguredFeature(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getConfiguredFeature(context,name); }
// public Object getStructure(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getStructure(context,name); }
// public Object getEntityType(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntityType(context,name); }
// public Object getSummonableEntityType(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getSummonableEntityType(context,name); }
// public Object getStatusEffect(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getStatusEffect(context,name); }
// public Object getEnchantment(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEnchantment(context,name); }

}