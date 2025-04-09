package yarnwrap.registry;
public class RegistryCloner { public net.minecraft.registry.RegistryCloner wrapperContained; public RegistryCloner(net.minecraft.registry.RegistryCloner wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec elementCodec() { return wrapperContained.elementCodec; }
// public java.lang.Object clone(java.lang.Object value,Object subsetRegistry,Object fullRegistry) { return wrapperContained.clone(value,subsetRegistry,fullRegistry); }

}