package yarnwrap.registry;
public class RegistryWrapper { public net.minecraft.registry.RegistryWrapper wrapperContained; public RegistryWrapper(net.minecraft.registry.RegistryWrapper wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream streamEntries() { return wrapperContained.streamEntries(); }
// public static java.util.stream.Stream streamEntries() { return net.minecraft.registry.RegistryWrapper.streamEntries(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
// public static java.util.stream.Stream streamTags() { return net.minecraft.registry.RegistryWrapper.streamTags(); }
public java.util.stream.Stream streamKeys() { return wrapperContained.streamKeys(); }
// public static java.util.stream.Stream streamKeys() { return net.minecraft.registry.RegistryWrapper.streamKeys(); }
public java.util.stream.Stream streamTagKeys() { return wrapperContained.streamTagKeys(); }
// public static java.util.stream.Stream streamTagKeys() { return net.minecraft.registry.RegistryWrapper.streamTagKeys(); }

}