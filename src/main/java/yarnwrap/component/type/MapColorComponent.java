package yarnwrap.component.type;
public class MapColorComponent { public net.minecraft.component.type.MapColorComponent wrapperContained; public MapColorComponent(net.minecraft.component.type.MapColorComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.component.type.MapColorComponent DEFAULT() { return new yarnwrap.component.type.MapColorComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.MapColorComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }

}