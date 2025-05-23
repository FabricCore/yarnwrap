package yarnwrap.entity.passive;
public class WolfVariant { public net.minecraft.entity.passive.WolfVariant wrapperContained; public WolfVariant(net.minecraft.entity.passive.WolfVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.passive.WolfVariant.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfVariant.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.passive.WolfVariant.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfVariant.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.passive.WolfVariant.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.passive.WolfVariant.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec NETWORK_CODEC() { return wrapperContained.NETWORK_CODEC; }
// public void NETWORK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NETWORK_CODEC = value; }
public static com.mojang.serialization.Codec NETWORK_CODEC() { return net.minecraft.entity.passive.WolfVariant.NETWORK_CODEC; }
// public static void NETWORK_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfVariant.NETWORK_CODEC = value; }

// public WolfVariant(Object assetInfo) { this.wrapperContained = new net.minecraft.entity.passive.WolfVariant(assetInfo); }
// public com.mojang.datafixers.kinds.App method_67136(Object instance) { return wrapperContained.method_67136(instance); }
// public static com.mojang.datafixers.kinds.App method_67136(Object instance, ) { return net.minecraft.entity.passive.WolfVariant.method_67136(instance); }
// public com.mojang.datafixers.kinds.App method_67137(Object instance) { return wrapperContained.method_67137(instance); }
// public static com.mojang.datafixers.kinds.App method_67137(Object instance, ) { return net.minecraft.entity.passive.WolfVariant.method_67137(instance); }

}