package yarnwrap.registry.tag;
public class TagPacketSerializer { public net.minecraft.registry.tag.TagPacketSerializer wrapperContained; public TagPacketSerializer(net.minecraft.registry.tag.TagPacketSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_40101(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_40101(pair); }
// public Object serializeTags(yarnwrap.registry.Registry registry) { return wrapperContained.serializeTags(registry.wrapperContained); }
// public void method_40103(yarnwrap.registry.Registry pair) { wrapperContained.method_40103(pair.wrapperContained); }
// public com.mojang.datafixers.util.Pair method_40104(Object registry) { return wrapperContained.method_40104(registry); }
public java.util.Map serializeTags(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistryManager) { return wrapperContained.serializeTags(dynamicRegistryManager.wrapperContained); }
// public void loadTags(yarnwrap.registry.RegistryKey registryKey,yarnwrap.registry.Registry registry,Object serialized,Object loader) { wrapperContained.loadTags(registryKey.wrapperContained,registry.wrapperContained,serialized,loader); }
// public void method_40107(yarnwrap.registry.RegistryKey tagId,yarnwrap.registry.Registry rawIds) { wrapperContained.method_40107(tagId.wrapperContained,rawIds.wrapperContained); }

}