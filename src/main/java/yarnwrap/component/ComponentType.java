package yarnwrap.component;
public class ComponentType { public net.minecraft.component.ComponentType wrapperContained; public ComponentType(net.minecraft.component.ComponentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec PERSISTENT_CODEC() { return wrapperContained.PERSISTENT_CODEC; }
// public void PERSISTENT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PERSISTENT_CODEC = value; }
public com.mojang.serialization.Codec TYPE_TO_VALUE_MAP_CODEC() { return wrapperContained.TYPE_TO_VALUE_MAP_CODEC; }
// public void TYPE_TO_VALUE_MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_TO_VALUE_MAP_CODEC = value; }
// public Object builder() { return wrapperContained.builder(); }
// public yarnwrap.network.codec.PacketCodec method_57874(yarnwrap.network.codec.PacketCodec packetCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_57874(packetCodec.wrapperContained)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
public com.mojang.serialization.Codec getCodecOrThrow() { return wrapperContained.getCodecOrThrow(); }
public boolean shouldSkipSerialization() { return wrapperContained.shouldSkipSerialization(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }
// public com.mojang.serialization.DataResult method_58761(yarnwrap.component.ComponentType componentType) { return wrapperContained.method_58761(componentType.wrapperContained); }

}