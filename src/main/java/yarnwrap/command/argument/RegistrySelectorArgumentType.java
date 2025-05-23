package yarnwrap.command.argument;
public class RegistrySelectorArgumentType { public net.minecraft.command.argument.RegistrySelectorArgumentType wrapperContained; public RegistrySelectorArgumentType(net.minecraft.command.argument.RegistrySelectorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return wrapperContained.NOT_FOUND_EXCEPTION; }
// public void NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NOT_FOUND_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return net.minecraft.command.argument.RegistrySelectorArgumentType.NOT_FOUND_EXCEPTION; }
// public static void NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.command.argument.RegistrySelectorArgumentType.NOT_FOUND_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RegistrySelectorArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RegistrySelectorArgumentType.EXAMPLES = value; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.command.argument.RegistrySelectorArgumentType.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.command.argument.RegistrySelectorArgumentType.registryRef = value.wrapperContained; }

// public yarnwrap.registry.RegistryWrapper registry() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registry); }
// public void registry(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registry = value.wrapperContained; }
// public static yarnwrap.registry.RegistryWrapper registry() { return new yarnwrap.registry.RegistryWrapper(net.minecraft.command.argument.RegistrySelectorArgumentType.registry); }
// public static void registry(yarnwrap.registry.RegistryWrapper value, ) { net.minecraft.command.argument.RegistrySelectorArgumentType.registry = value.wrapperContained; }

// public RegistrySelectorArgumentType(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.registry.RegistryKey registryRef) { this.wrapperContained = new net.minecraft.command.argument.RegistrySelectorArgumentType(registries.wrapperContained,registryRef.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.listSuggestions(context,builder); }
// public boolean isSelectorChar(char c) { return wrapperContained.isSelectorChar(c); }
// public static boolean isSelectorChar(char c, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.isSelectorChar(c); }
// public java.util.Collection select(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registry) { return wrapperContained.select(reader,registry.wrapperContained); }
// public static java.util.Collection select(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registry, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.select(reader,registry.wrapperContained); }
// public java.util.Collection getEntries(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntries(context,name); }
// public static java.util.Collection getEntries(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.getEntries(context,name); }
// public yarnwrap.command.argument.RegistrySelectorArgumentType selector(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistrySelectorArgumentType(wrapperContained.selector(registries.wrapperContained,registryRef.wrapperContained)); }
// public static yarnwrap.command.argument.RegistrySelectorArgumentType selector(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.command.argument.RegistrySelectorArgumentType(net.minecraft.command.argument.RegistrySelectorArgumentType.selector(registries.wrapperContained,registryRef.wrapperContained)); }
// public com.mojang.brigadier.Message method_66825(java.lang.Object selector,java.lang.Object registryRef) { return wrapperContained.method_66825(selector,registryRef); }
// public static com.mojang.brigadier.Message method_66825(java.lang.Object selector,java.lang.Object registryRef, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.method_66825(selector,registryRef); }
// public java.lang.String addNamespace(java.lang.String path) { return wrapperContained.addNamespace(path); }
// public static java.lang.String addNamespace(java.lang.String path, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.addNamespace(path); }
// public boolean matches(java.lang.String selector,yarnwrap.util.Identifier id) { return wrapperContained.matches(selector,id.wrapperContained); }
// public static boolean matches(java.lang.String selector,yarnwrap.util.Identifier id, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.matches(selector,id.wrapperContained); }
// public boolean method_66828(java.lang.String entry) { return wrapperContained.method_66828(entry); }
// public static boolean method_66828(java.lang.String entry, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.method_66828(entry); }
// public java.lang.String read(com.mojang.brigadier.StringReader reader) { return wrapperContained.read(reader); }
// public static java.lang.String read(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.read(reader); }
// public boolean method_66830(java.lang.String entry) { return wrapperContained.method_66830(entry); }
// public static boolean method_66830(java.lang.String entry, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.method_66830(entry); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.RegistrySelectorArgumentType.parse(reader); }

}