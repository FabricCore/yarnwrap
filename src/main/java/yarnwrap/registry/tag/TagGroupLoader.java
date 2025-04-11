package yarnwrap.registry.tag;
public class TagGroupLoader { public net.minecraft.registry.tag.TagGroupLoader wrapperContained; public TagGroupLoader(net.minecraft.registry.tag.TagGroupLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String dataType() { return wrapperContained.dataType; }
// public void dataType(java.lang.String value) { wrapperContained.dataType = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.function.Function registryGetter() { return wrapperContained.registryGetter; }
// public void registryGetter(java.util.function.Function value) { wrapperContained.registryGetter = value; }
public TagGroupLoader(java.util.function.Function registryGetter,java.lang.String dataType) { this.wrapperContained = new net.minecraft.registry.tag.TagGroupLoader(registryGetter,dataType); }
public java.util.Map buildGroup(java.util.Map tags) { return wrapperContained.buildGroup(tags); }
// public void method_32840(java.util.Map resolvedEntries) { wrapperContained.method_32840(resolvedEntries); }
public java.util.Map loadTags(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadTags(resourceManager.wrapperContained); }
// public void method_33175(yarnwrap.util.Identifier missingReferences) { wrapperContained.method_33175(missingReferences.wrapperContained); }
public java.util.Map load(yarnwrap.resource.ResourceManager manager) { return wrapperContained.load(manager.wrapperContained); }
// public java.util.List method_43951(yarnwrap.util.Identifier id) { return wrapperContained.method_43951(id.wrapperContained); }
// public com.mojang.datafixers.util.Either resolveAll(Object valueGetter,java.util.List entries) { return wrapperContained.resolveAll(valueGetter,entries); }
// public void method_43954(java.util.List entry) { wrapperContained.method_43954(entry); }
// public void method_51476(Object id,java.util.Map dependencies) { wrapperContained.method_51476(id,dependencies); }
// public void method_51477(yarnwrap.resource.DependencyTracker id,yarnwrap.util.Identifier entries) { wrapperContained.method_51477(id.wrapperContained,entries.wrapperContained); }

}