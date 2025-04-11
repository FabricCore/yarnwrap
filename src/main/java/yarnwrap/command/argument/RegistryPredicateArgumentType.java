package yarnwrap.command.argument;
public class RegistryPredicateArgumentType { public net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained; public RegistryPredicateArgumentType(net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
public RegistryPredicateArgumentType(yarnwrap.registry.RegistryKey registryRef) { this.wrapperContained = new net.minecraft.command.argument.RegistryPredicateArgumentType(registryRef.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public Object getPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException) { return wrapperContained.getPredicate(context,name,registryRef.wrapperContained,invalidException); }
public yarnwrap.command.argument.RegistryPredicateArgumentType registryPredicate(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistryPredicateArgumentType(wrapperContained.registryPredicate(registryRef.wrapperContained)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}