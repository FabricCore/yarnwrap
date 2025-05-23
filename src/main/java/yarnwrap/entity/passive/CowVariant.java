package yarnwrap.entity.passive;
public class CowVariant { public net.minecraft.entity.passive.CowVariant wrapperContained; public CowVariant(net.minecraft.entity.passive.CowVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.passive.CowVariant.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.CowVariant.CODEC = value; }

// public com.mojang.serialization.Codec NETWORK_CODEC() { return wrapperContained.NETWORK_CODEC; }
// public void NETWORK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NETWORK_CODEC = value; }
public static com.mojang.serialization.Codec NETWORK_CODEC() { return net.minecraft.entity.passive.CowVariant.NETWORK_CODEC; }
// public static void NETWORK_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.CowVariant.NETWORK_CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.passive.CowVariant.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.CowVariant.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.passive.CowVariant.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.passive.CowVariant.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public CowVariant(yarnwrap.util.ModelAndTexture modelAndTexture) { this.wrapperContained = new net.minecraft.entity.passive.CowVariant(modelAndTexture.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67350(Object instance) { return wrapperContained.method_67350(instance); }
// public static com.mojang.datafixers.kinds.App method_67350(Object instance, ) { return net.minecraft.entity.passive.CowVariant.method_67350(instance); }
// public com.mojang.datafixers.kinds.App method_67351(Object instance) { return wrapperContained.method_67351(instance); }
// public static com.mojang.datafixers.kinds.App method_67351(Object instance, ) { return net.minecraft.entity.passive.CowVariant.method_67351(instance); }

}