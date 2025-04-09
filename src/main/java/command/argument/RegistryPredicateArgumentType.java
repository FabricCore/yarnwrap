package yarnwrap.command.argument;
public class RegistryPredicateArgumentType { public net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained; public RegistryPredicateArgumentType(net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public Object getPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException) { return wrapperContained.getPredicate(context,name,registryRef.wrapperContained,invalidException); }
public yarnwrap.command.argument.RegistryPredicateArgumentType registryPredicate(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistryPredicateArgumentType(wrapperContained.registryPredicate(registryRef.wrapperContained)); }

}