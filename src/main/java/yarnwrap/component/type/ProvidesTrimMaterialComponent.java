package yarnwrap.component.type;
public class ProvidesTrimMaterialComponent { public net.minecraft.component.type.ProvidesTrimMaterialComponent wrapperContained; public ProvidesTrimMaterialComponent(net.minecraft.component.type.ProvidesTrimMaterialComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ProvidesTrimMaterialComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ProvidesTrimMaterialComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ProvidesTrimMaterialComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ProvidesTrimMaterialComponent.PACKET_CODEC = value.wrapperContained; }

public ProvidesTrimMaterialComponent(yarnwrap.registry.RegistryKey material) { this.wrapperContained = new net.minecraft.component.type.ProvidesTrimMaterialComponent(material.wrapperContained); }
public ProvidesTrimMaterialComponent(yarnwrap.registry.entry.RegistryEntry material) { this.wrapperContained = new net.minecraft.component.type.ProvidesTrimMaterialComponent(material.wrapperContained); }
// public java.util.Optional getMaterial(Object registries) { return wrapperContained.getMaterial(registries); }
// public static java.util.Optional getMaterial(Object registries, ) { return net.minecraft.component.type.ProvidesTrimMaterialComponent.getMaterial(registries); }

}