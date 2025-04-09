package yarnwrap.component.type;
public class MapColorComponent { public net.minecraft.component.type.MapColorComponent wrapperContained; public MapColorComponent(net.minecraft.component.type.MapColorComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.component.type.MapColorComponent DEFAULT() { return new yarnwrap.component.type.MapColorComponent(wrapperContained.DEFAULT); }

}