package yarnwrap.registry.tag;
public class TagPacketSerializer { public net.minecraft.registry.tag.TagPacketSerializer wrapperContained; public TagPacketSerializer(net.minecraft.registry.tag.TagPacketSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object serializeTags(yarnwrap.registry.Registry registry) { return wrapperContained.serializeTags(registry.wrapperContained); }
public java.util.Map serializeTags(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistryManager) { return wrapperContained.serializeTags(dynamicRegistryManager.wrapperContained); }
// public void loadTags(yarnwrap.registry.RegistryKey registryKey,yarnwrap.registry.Registry registry,Object serialized,Object loader) { wrapperContained.loadTags(registryKey.wrapperContained,registry.wrapperContained,serialized,loader); }

}