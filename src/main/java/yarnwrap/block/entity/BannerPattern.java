package yarnwrap.block.entity;
public class BannerPattern { public net.minecraft.block.entity.BannerPattern wrapperContained; public BannerPattern(net.minecraft.block.entity.BannerPattern wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.entity.BannerPattern.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.BannerPattern.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.block.entity.BannerPattern.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.block.entity.BannerPattern.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.block.entity.BannerPattern.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.BannerPattern.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.block.entity.BannerPattern.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.block.entity.BannerPattern.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_58123(Object instance) { return wrapperContained.method_58123(instance); }
// public static com.mojang.datafixers.kinds.App method_58123(Object instance, ) { return net.minecraft.block.entity.BannerPattern.method_58123(instance); }

}