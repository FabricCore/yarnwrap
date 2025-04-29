package yarnwrap.registry;
public class RegistryCloner { public net.minecraft.registry.RegistryCloner wrapperContained; public RegistryCloner(net.minecraft.registry.RegistryCloner wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec elementCodec() { return wrapperContained.elementCodec; }
// public void elementCodec(com.mojang.serialization.Codec value) { wrapperContained.elementCodec = value; }
// public static com.mojang.serialization.Codec elementCodec() { return net.minecraft.registry.RegistryCloner.elementCodec; }
// public static void elementCodec(com.mojang.serialization.Codec value, ) { net.minecraft.registry.RegistryCloner.elementCodec = value; }

// public RegistryCloner(com.mojang.serialization.Codec elementCodec) { this.wrapperContained = new net.minecraft.registry.RegistryCloner(elementCodec); }
// public java.lang.Object clone(java.lang.Object value,Object subsetRegistry,Object fullRegistry) { return wrapperContained.clone(value,subsetRegistry,fullRegistry); }
// public static java.lang.Object clone(java.lang.Object value,Object subsetRegistry,Object fullRegistry, ) { return net.minecraft.registry.RegistryCloner.clone(value,subsetRegistry,fullRegistry); }
// public java.lang.IllegalStateException method_55278(java.lang.String error) { return wrapperContained.method_55278(error); }
// public static java.lang.IllegalStateException method_55278(java.lang.String error, ) { return net.minecraft.registry.RegistryCloner.method_55278(error); }
// public java.lang.IllegalStateException method_55279(java.lang.String error) { return wrapperContained.method_55279(error); }
// public static java.lang.IllegalStateException method_55279(java.lang.String error, ) { return net.minecraft.registry.RegistryCloner.method_55279(error); }

}