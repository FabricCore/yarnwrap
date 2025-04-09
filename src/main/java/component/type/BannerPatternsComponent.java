package yarnwrap.component.type;
public class BannerPatternsComponent { public net.minecraft.component.type.BannerPatternsComponent wrapperContained; public BannerPatternsComponent(net.minecraft.component.type.BannerPatternsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.BannerPatternsComponent DEFAULT() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.component.type.BannerPatternsComponent withoutTopLayer() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.withoutTopLayer()); }

}