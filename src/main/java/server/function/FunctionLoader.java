package yarnwrap.server.function;
public class FunctionLoader { public net.minecraft.server.function.FunctionLoader wrapperContained; public FunctionLoader(net.minecraft.server.function.FunctionLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map functions() { return wrapperContained.functions; }
// public yarnwrap.registry.tag.TagGroupLoader tagLoader() { return new yarnwrap.registry.tag.TagGroupLoader(wrapperContained.tagLoader); }
// public int level() { return wrapperContained.level; }
// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public java.util.Map tags() { return wrapperContained.tags; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
public yarnwrap.registry.RegistryKey FUNCTION_REGISTRY_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.FUNCTION_REGISTRY_KEY); }
public java.util.Map getFunctions() { return wrapperContained.getFunctions(); }
// public java.util.List readLines(yarnwrap.resource.Resource resource) { return wrapperContained.readLines(resource.wrapperContained); }
public java.util.Optional get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
public java.lang.Iterable getTags() { return wrapperContained.getTags(); }
public java.util.Collection getTagOrEmpty(yarnwrap.util.Identifier id) { return wrapperContained.getTagOrEmpty(id.wrapperContained); }

}