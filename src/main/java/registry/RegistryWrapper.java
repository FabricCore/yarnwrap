package yarnwrap.registry;
public class RegistryWrapper { public net.minecraft.registry.RegistryWrapper wrapperContained; public RegistryWrapper(net.minecraft.registry.RegistryWrapper wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream streamEntries() { return wrapperContained.streamEntries(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
public java.util.stream.Stream streamKeys() { return wrapperContained.streamKeys(); }
public java.util.stream.Stream streamTagKeys() { return wrapperContained.streamTagKeys(); }

}