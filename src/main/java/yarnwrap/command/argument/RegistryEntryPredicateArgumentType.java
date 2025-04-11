package yarnwrap.command.argument;
public class RegistryEntryPredicateArgumentType { public net.minecraft.command.argument.RegistryEntryPredicateArgumentType wrapperContained; public RegistryEntryPredicateArgumentType(net.minecraft.command.argument.RegistryEntryPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return wrapperContained.NOT_FOUND_EXCEPTION; }
// public void NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NOT_FOUND_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType WRONG_TYPE_EXCEPTION() { return wrapperContained.WRONG_TYPE_EXCEPTION; }
// public void WRONG_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.WRONG_TYPE_EXCEPTION = value; }
// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public void registryWrapper(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registryWrapper = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public Object getRegistryEntryPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getRegistryEntryPredicate(context,name,registryRef.wrapperContained); }
public yarnwrap.command.argument.RegistryEntryPredicateArgumentType registryEntryPredicate(yarnwrap.command.CommandRegistryAccess registryRef,yarnwrap.registry.RegistryKey registryAccess) { return new yarnwrap.command.argument.RegistryEntryPredicateArgumentType(wrapperContained.registryEntryPredicate(registryRef.wrapperContained,registryAccess.wrapperContained)); }

}