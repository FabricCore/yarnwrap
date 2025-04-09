package yarnwrap.component.type;
public class MapIdComponent { public net.minecraft.component.type.MapIdComponent wrapperContained; public MapIdComponent(net.minecraft.component.type.MapIdComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.lang.String asString() { return wrapperContained.asString(); }

}