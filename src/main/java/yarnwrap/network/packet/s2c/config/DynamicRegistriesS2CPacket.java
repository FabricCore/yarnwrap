package yarnwrap.network.packet.s2c.config;
public class DynamicRegistriesS2CPacket { public net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket wrapperContained; public DynamicRegistriesS2CPacket(net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket.CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec REGISTRY_KEY_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.REGISTRY_KEY_CODEC); }
// public void REGISTRY_KEY_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.REGISTRY_KEY_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec REGISTRY_KEY_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket.REGISTRY_KEY_CODEC); }
// public static void REGISTRY_KEY_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket.REGISTRY_KEY_CODEC = value.wrapperContained; }


}