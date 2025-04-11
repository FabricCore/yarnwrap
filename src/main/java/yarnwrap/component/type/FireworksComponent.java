package yarnwrap.component.type;
public class FireworksComponent { public net.minecraft.component.type.FireworksComponent wrapperContained; public FireworksComponent(net.minecraft.component.type.FireworksComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public int MAX_EXPLOSIONS() { return wrapperContained.MAX_EXPLOSIONS; }
// public void MAX_EXPLOSIONS(int value) { wrapperContained.MAX_EXPLOSIONS = value; }
// public com.mojang.datafixers.kinds.App method_57478(Object instance) { return wrapperContained.method_57478(instance); }
// public void method_57479(java.util.function.Consumer text) { wrapperContained.method_57479(text); }

}