package yarnwrap.registry.tag;
public class TagGroupLoader { public net.minecraft.registry.tag.TagGroupLoader wrapperContained; public TagGroupLoader(net.minecraft.registry.tag.TagGroupLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String dataType() { return wrapperContained.dataType; }
// public void dataType(java.lang.String value) { wrapperContained.dataType = value; }
// public static java.lang.String dataType() { return net.minecraft.registry.tag.TagGroupLoader.dataType; }
// public static void dataType(java.lang.String value, ) { net.minecraft.registry.tag.TagGroupLoader.dataType = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.tag.TagGroupLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.tag.TagGroupLoader.LOGGER = value; }

// public Object entrySupplier() { return wrapperContained.entrySupplier; }
// // public void entrySupplier(Object value) { wrapperContained.entrySupplier = value; }
// // public static Object entrySupplier() { return net.minecraft.registry.tag.TagGroupLoader.entrySupplier; }
// // public static void entrySupplier(Object value, ) { net.minecraft.registry.tag.TagGroupLoader.entrySupplier = value; }

// public TagGroupLoader(Object entrySupplier,java.lang.String dataType) { this.wrapperContained = new net.minecraft.registry.tag.TagGroupLoader(entrySupplier,dataType); }
public java.util.Map buildGroup(java.util.Map tags) { return wrapperContained.buildGroup(tags); }
// public static java.util.Map buildGroup(java.util.Map tags, ) { return net.minecraft.registry.tag.TagGroupLoader.buildGroup(tags); }
// public void method_32840(java.util.Map values) { wrapperContained.method_32840(values); }
// public static void method_32840(java.util.Map values, ) { net.minecraft.registry.tag.TagGroupLoader.method_32840(values); }
public java.util.Map loadTags(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadTags(resourceManager.wrapperContained); }
// public static java.util.Map loadTags(yarnwrap.resource.ResourceManager resourceManager, ) { return net.minecraft.registry.tag.TagGroupLoader.loadTags(resourceManager.wrapperContained); }
// public void method_33175(yarnwrap.util.Identifier missingReferences) { wrapperContained.method_33175(missingReferences.wrapperContained); }
// public static void method_33175(yarnwrap.util.Identifier missingReferences, ) { net.minecraft.registry.tag.TagGroupLoader.method_33175(missingReferences.wrapperContained); }
// public java.util.List method_43951(yarnwrap.util.Identifier id) { return wrapperContained.method_43951(id.wrapperContained); }
// public static java.util.List method_43951(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.tag.TagGroupLoader.method_43951(id.wrapperContained); }
// public com.mojang.datafixers.util.Either resolveAll(Object valueGetter,java.util.List entries) { return wrapperContained.resolveAll(valueGetter,entries); }
// public static com.mojang.datafixers.util.Either resolveAll(Object valueGetter,java.util.List entries, ) { return net.minecraft.registry.tag.TagGroupLoader.resolveAll(valueGetter,entries); }
// public void method_43954(java.util.List entry) { wrapperContained.method_43954(entry); }
// public static void method_43954(java.util.List entry, ) { net.minecraft.registry.tag.TagGroupLoader.method_43954(entry); }
// public void method_51476(Object id,java.util.Map dependencies) { wrapperContained.method_51476(id,dependencies); }
// public static void method_51476(Object id,java.util.Map dependencies, ) { net.minecraft.registry.tag.TagGroupLoader.method_51476(id,dependencies); }
// public void method_51477(yarnwrap.resource.DependencyTracker id,yarnwrap.util.Identifier entries) { wrapperContained.method_51477(id.wrapperContained,entries.wrapperContained); }
// public static void method_51477(yarnwrap.resource.DependencyTracker id,yarnwrap.util.Identifier entries, ) { net.minecraft.registry.tag.TagGroupLoader.method_51477(id.wrapperContained,entries.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_61303(yarnwrap.registry.RegistryKey entry) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_61303(entry.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_61303(yarnwrap.registry.RegistryKey entry, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagGroupLoader.method_61303(entry.wrapperContained)); }
// public java.util.Map toTagKeyedMap(yarnwrap.registry.RegistryKey registryRef,java.util.Map tags) { return wrapperContained.toTagKeyedMap(registryRef.wrapperContained,tags); }
// public static java.util.Map toTagKeyedMap(yarnwrap.registry.RegistryKey registryRef,java.util.Map tags, ) { return net.minecraft.registry.tag.TagGroupLoader.toTagKeyedMap(registryRef.wrapperContained,tags); }
// public java.util.Optional startReload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.Registry registry) { return wrapperContained.startReload(resourceManager.wrapperContained,registry.wrapperContained); }
// public static java.util.Optional startReload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.tag.TagGroupLoader.startReload(resourceManager.wrapperContained,registry.wrapperContained); }
// public java.util.Optional method_61306(yarnwrap.resource.ResourceManager registry) { return wrapperContained.method_61306(registry.wrapperContained); }
// public static java.util.Optional method_61306(yarnwrap.resource.ResourceManager registry, ) { return net.minecraft.registry.tag.TagGroupLoader.method_61306(registry.wrapperContained); }
// public java.util.List startReload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.startReload(resourceManager.wrapperContained,registryManager.wrapperContained); }
// public static java.util.List startReload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.DynamicRegistryManager registryManager, ) { return net.minecraft.registry.tag.TagGroupLoader.startReload(resourceManager.wrapperContained,registryManager.wrapperContained); }
// public void loadInitial(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.MutableRegistry registry) { wrapperContained.loadInitial(resourceManager.wrapperContained,registry.wrapperContained); }
// public static void loadInitial(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.MutableRegistry registry, ) { net.minecraft.registry.tag.TagGroupLoader.loadInitial(resourceManager.wrapperContained,registry.wrapperContained); }
// public void loadFromNetwork(Object tags,yarnwrap.registry.MutableRegistry registry) { wrapperContained.loadFromNetwork(tags,registry.wrapperContained); }
// public static void loadFromNetwork(Object tags,yarnwrap.registry.MutableRegistry registry, ) { net.minecraft.registry.tag.TagGroupLoader.loadFromNetwork(tags,registry.wrapperContained); }
// public Object find(java.util.List pendingTags,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.find(pendingTags,registryRef.wrapperContained); }
// public static Object find(java.util.List pendingTags,yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagGroupLoader.find(pendingTags,registryRef.wrapperContained); }
// public void method_61311(java.util.List registry) { wrapperContained.method_61311(registry); }
// public static void method_61311(java.util.List registry, ) { net.minecraft.registry.tag.TagGroupLoader.method_61311(registry); }
// public java.util.List collectRegistries(Object registryManager,java.util.List tagLoads) { return wrapperContained.collectRegistries(registryManager,tagLoads); }
// public static java.util.List collectRegistries(Object registryManager,java.util.List tagLoads, ) { return net.minecraft.registry.tag.TagGroupLoader.collectRegistries(registryManager,tagLoads); }
// public void method_61314(yarnwrap.registry.MutableRegistry id,yarnwrap.registry.RegistryKey entries) { wrapperContained.method_61314(id.wrapperContained,entries.wrapperContained); }
// public static void method_61314(yarnwrap.registry.MutableRegistry id,yarnwrap.registry.RegistryKey entries, ) { net.minecraft.registry.tag.TagGroupLoader.method_61314(id.wrapperContained,entries.wrapperContained); }

}