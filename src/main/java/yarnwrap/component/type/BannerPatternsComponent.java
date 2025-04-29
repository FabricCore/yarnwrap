package yarnwrap.component.type;
public class BannerPatternsComponent { public net.minecraft.component.type.BannerPatternsComponent wrapperContained; public BannerPatternsComponent(net.minecraft.component.type.BannerPatternsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BannerPatternsComponent DEFAULT() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.BannerPatternsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.BannerPatternsComponent DEFAULT() { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.component.type.BannerPatternsComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.BannerPatternsComponent value, ) { net.minecraft.component.type.BannerPatternsComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.BannerPatternsComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.BannerPatternsComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BannerPatternsComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BannerPatternsComponent.PACKET_CODEC = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.component.type.BannerPatternsComponent.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.component.type.BannerPatternsComponent.LOGGER = value; }

public yarnwrap.component.type.BannerPatternsComponent withoutTopLayer() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.withoutTopLayer()); }
// public static yarnwrap.component.type.BannerPatternsComponent withoutTopLayer() { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.component.type.BannerPatternsComponent.withoutTopLayer()); }

}