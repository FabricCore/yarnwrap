package yarnwrap.server.function;
public class FunctionLoader { public net.minecraft.server.function.FunctionLoader wrapperContained; public FunctionLoader(net.minecraft.server.function.FunctionLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map functions() { return wrapperContained.functions; }
// public void functions(java.util.Map value) { wrapperContained.functions = value; }
// public yarnwrap.registry.tag.TagGroupLoader tagLoader() { return new yarnwrap.registry.tag.TagGroupLoader(wrapperContained.tagLoader); }
// public void tagLoader(yarnwrap.registry.tag.TagGroupLoader value) { wrapperContained.tagLoader = value.wrapperContained; }
// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public void commandDispatcher(com.mojang.brigadier.CommandDispatcher value) { wrapperContained.commandDispatcher = value; }
// public java.util.Map tags() { return wrapperContained.tags; }
// public void tags(java.util.Map value) { wrapperContained.tags = value; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
public yarnwrap.registry.RegistryKey FUNCTION_REGISTRY_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.FUNCTION_REGISTRY_KEY); }
// public void FUNCTION_REGISTRY_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.FUNCTION_REGISTRY_KEY = value.wrapperContained; }
public java.util.Map getFunctions() { return wrapperContained.getFunctions(); }
// public java.util.List readLines(yarnwrap.resource.Resource resource) { return wrapperContained.readLines(resource.wrapperContained); }
public java.util.Optional get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
public java.lang.Iterable getTags() { return wrapperContained.getTags(); }
public java.util.Collection getTagOrEmpty(yarnwrap.util.Identifier id) { return wrapperContained.getTagOrEmpty(id.wrapperContained); }

}