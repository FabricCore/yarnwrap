package yarnwrap.server.function;
public class FunctionLoader { public net.minecraft.server.function.FunctionLoader wrapperContained; public FunctionLoader(net.minecraft.server.function.FunctionLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.function.FunctionLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.function.FunctionLoader.LOGGER = value; }

// public java.util.Map functions() { return wrapperContained.functions; }
// public void functions(java.util.Map value) { wrapperContained.functions = value; }
// public static java.util.Map functions() { return net.minecraft.server.function.FunctionLoader.functions; }
// public static void functions(java.util.Map value, ) { net.minecraft.server.function.FunctionLoader.functions = value; }

// public yarnwrap.registry.tag.TagGroupLoader tagLoader() { return new yarnwrap.registry.tag.TagGroupLoader(wrapperContained.tagLoader); }
// public void tagLoader(yarnwrap.registry.tag.TagGroupLoader value) { wrapperContained.tagLoader = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagGroupLoader tagLoader() { return new yarnwrap.registry.tag.TagGroupLoader(net.minecraft.server.function.FunctionLoader.tagLoader); }
// public static void tagLoader(yarnwrap.registry.tag.TagGroupLoader value, ) { net.minecraft.server.function.FunctionLoader.tagLoader = value.wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.server.function.FunctionLoader.level; }
// public static void level(int value, ) { net.minecraft.server.function.FunctionLoader.level = value; }

// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public void commandDispatcher(com.mojang.brigadier.CommandDispatcher value) { wrapperContained.commandDispatcher = value; }
// public static com.mojang.brigadier.CommandDispatcher commandDispatcher() { return net.minecraft.server.function.FunctionLoader.commandDispatcher; }
// public static void commandDispatcher(com.mojang.brigadier.CommandDispatcher value, ) { net.minecraft.server.function.FunctionLoader.commandDispatcher = value; }

// public java.util.Map tags() { return wrapperContained.tags; }
// public void tags(java.util.Map value) { wrapperContained.tags = value; }
// public static java.util.Map tags() { return net.minecraft.server.function.FunctionLoader.tags; }
// public static void tags(java.util.Map value, ) { net.minecraft.server.function.FunctionLoader.tags = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.server.function.FunctionLoader.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.server.function.FunctionLoader.FINDER = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey FUNCTION_REGISTRY_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.FUNCTION_REGISTRY_KEY); }
// public void FUNCTION_REGISTRY_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.FUNCTION_REGISTRY_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey FUNCTION_REGISTRY_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.server.function.FunctionLoader.FUNCTION_REGISTRY_KEY); }
// public static void FUNCTION_REGISTRY_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.server.function.FunctionLoader.FUNCTION_REGISTRY_KEY = value.wrapperContained; }

public FunctionLoader(int level,com.mojang.brigadier.CommandDispatcher commandDispatcher) { this.wrapperContained = new net.minecraft.server.function.FunctionLoader(level,commandDispatcher); }
public java.util.Map getFunctions() { return wrapperContained.getFunctions(); }
// public static java.util.Map getFunctions() { return net.minecraft.server.function.FunctionLoader.getFunctions(); }
// public java.util.concurrent.CompletionStage method_29449(java.util.concurrent.Executor functions) { return wrapperContained.method_29449(functions); }
// public static java.util.concurrent.CompletionStage method_29449(java.util.concurrent.Executor functions, ) { return net.minecraft.server.function.FunctionLoader.method_29449(functions); }
// public java.util.List readLines(yarnwrap.resource.Resource resource) { return wrapperContained.readLines(resource.wrapperContained); }
// public static java.util.List readLines(yarnwrap.resource.Resource resource, ) { return net.minecraft.server.function.FunctionLoader.readLines(resource.wrapperContained); }
// public void method_29452(Object id,yarnwrap.util.Identifier functionFuture) { wrapperContained.method_29452(id,functionFuture.wrapperContained); }
// public static void method_29452(Object id,yarnwrap.util.Identifier functionFuture, ) { net.minecraft.server.function.FunctionLoader.method_29452(id,functionFuture.wrapperContained); }
// public void method_29453(com.mojang.datafixers.util.Pair intermediate) { wrapperContained.method_29453(intermediate); }
// public static void method_29453(com.mojang.datafixers.util.Pair intermediate, ) { net.minecraft.server.function.FunctionLoader.method_29453(intermediate); }
// public java.util.Map method_29455(java.util.Map unused,java.lang.Void ex) { return wrapperContained.method_29455(unused,ex); }
// public static java.util.Map method_29455(java.util.Map unused,java.lang.Void ex, ) { return net.minecraft.server.function.FunctionLoader.method_29455(unused,ex); }
public java.util.Optional get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
// public static java.util.Optional get(yarnwrap.util.Identifier id, ) { return net.minecraft.server.function.FunctionLoader.get(id.wrapperContained); }
// public java.lang.Object method_29457(yarnwrap.util.Identifier function,Object ex) { return wrapperContained.method_29457(function.wrapperContained,ex); }
// public static java.lang.Object method_29457(yarnwrap.util.Identifier function,Object ex, ) { return net.minecraft.server.function.FunctionLoader.method_29457(function.wrapperContained,ex); }
public java.lang.Iterable getTags() { return wrapperContained.getTags(); }
// public static java.lang.Iterable getTags() { return net.minecraft.server.function.FunctionLoader.getTags(); }
public java.util.Collection getTagOrEmpty(yarnwrap.util.Identifier id) { return wrapperContained.getTagOrEmpty(id.wrapperContained); }
// public static java.util.Collection getTagOrEmpty(yarnwrap.util.Identifier id, ) { return net.minecraft.server.function.FunctionLoader.getTagOrEmpty(id.wrapperContained); }

}