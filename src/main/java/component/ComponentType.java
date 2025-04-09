package yarnwrap.component;
public class ComponentType { public net.minecraft.component.ComponentType wrapperContained; public ComponentType(net.minecraft.component.ComponentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.Codec PERSISTENT_CODEC() { return wrapperContained.PERSISTENT_CODEC; }
public com.mojang.serialization.Codec TYPE_TO_VALUE_MAP_CODEC() { return wrapperContained.TYPE_TO_VALUE_MAP_CODEC; }
// public Object builder() { return wrapperContained.builder(); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
public com.mojang.serialization.Codec getCodecOrThrow() { return wrapperContained.getCodecOrThrow(); }
public boolean shouldSkipSerialization() { return wrapperContained.shouldSkipSerialization(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}