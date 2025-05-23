package yarnwrap.entity.passive;
public class WolfSoundVariant { public net.minecraft.entity.passive.WolfSoundVariant wrapperContained; public WolfSoundVariant(net.minecraft.entity.passive.WolfSoundVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.passive.WolfSoundVariant.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfSoundVariant.CODEC = value; }

// public com.mojang.serialization.Codec NETWORK_CODEC() { return wrapperContained.NETWORK_CODEC; }
// public void NETWORK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NETWORK_CODEC = value; }
public static com.mojang.serialization.Codec NETWORK_CODEC() { return net.minecraft.entity.passive.WolfSoundVariant.NETWORK_CODEC; }
// public static void NETWORK_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfSoundVariant.NETWORK_CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.passive.WolfSoundVariant.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.WolfSoundVariant.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.passive.WolfSoundVariant.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.passive.WolfSoundVariant.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_68133(Object instance) { return wrapperContained.method_68133(instance); }
// public static com.mojang.datafixers.kinds.App method_68133(Object instance, ) { return net.minecraft.entity.passive.WolfSoundVariant.method_68133(instance); }
// public com.mojang.serialization.Codec createCodec() { return wrapperContained.createCodec(); }
// public static com.mojang.serialization.Codec createCodec() { return net.minecraft.entity.passive.WolfSoundVariant.createCodec(); }

}