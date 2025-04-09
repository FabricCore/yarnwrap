package yarnwrap.component.type;
public class FireworksComponent { public net.minecraft.component.type.FireworksComponent wrapperContained; public FireworksComponent(net.minecraft.component.type.FireworksComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public int MAX_EXPLOSIONS() { return wrapperContained.MAX_EXPLOSIONS; }

}