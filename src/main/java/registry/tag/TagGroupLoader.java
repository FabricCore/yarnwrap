package yarnwrap.registry.tag;
public class TagGroupLoader { public net.minecraft.registry.tag.TagGroupLoader wrapperContained; public TagGroupLoader(net.minecraft.registry.tag.TagGroupLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String dataType() { return wrapperContained.dataType; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.function.Function registryGetter() { return wrapperContained.registryGetter; }
public java.util.Map buildGroup(java.util.Map tags) { return wrapperContained.buildGroup(tags); }
public java.util.Map loadTags(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadTags(resourceManager.wrapperContained); }
public java.util.Map load(yarnwrap.resource.ResourceManager manager) { return wrapperContained.load(manager.wrapperContained); }
// public com.mojang.datafixers.util.Either resolveAll(Object valueGetter,java.util.List entries) { return wrapperContained.resolveAll(valueGetter,entries); }

}