package yarnwrap.component;
public class ComponentType { public net.minecraft.component.ComponentType wrapperContained; public ComponentType(net.minecraft.component.ComponentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.ComponentType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.ComponentType.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.ComponentType.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec PERSISTENT_CODEC() { return wrapperContained.PERSISTENT_CODEC; }
// public void PERSISTENT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PERSISTENT_CODEC = value; }
public static com.mojang.serialization.Codec PERSISTENT_CODEC() { return net.minecraft.component.ComponentType.PERSISTENT_CODEC; }
// public static void PERSISTENT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.ComponentType.PERSISTENT_CODEC = value; }

// public com.mojang.serialization.Codec TYPE_TO_VALUE_MAP_CODEC() { return wrapperContained.TYPE_TO_VALUE_MAP_CODEC; }
// public void TYPE_TO_VALUE_MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_TO_VALUE_MAP_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_TO_VALUE_MAP_CODEC() { return net.minecraft.component.ComponentType.TYPE_TO_VALUE_MAP_CODEC; }
// public static void TYPE_TO_VALUE_MAP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.ComponentType.TYPE_TO_VALUE_MAP_CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.component.ComponentType.builder(); }
// public yarnwrap.network.codec.PacketCodec method_57874(yarnwrap.network.codec.PacketCodec packetCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_57874(packetCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec method_57874(yarnwrap.network.codec.PacketCodec packetCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentType.method_57874(packetCodec.wrapperContained)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.Codec getCodec() { return net.minecraft.component.ComponentType.getCodec(); }
public com.mojang.serialization.Codec getCodecOrThrow() { return wrapperContained.getCodecOrThrow(); }
// public static com.mojang.serialization.Codec getCodecOrThrow() { return net.minecraft.component.ComponentType.getCodecOrThrow(); }
public boolean shouldSkipSerialization() { return wrapperContained.shouldSkipSerialization(); }
// public static boolean shouldSkipSerialization() { return net.minecraft.component.ComponentType.shouldSkipSerialization(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }
// public static yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentType.getPacketCodec()); }
// public com.mojang.serialization.DataResult method_58761(yarnwrap.component.ComponentType componentType) { return wrapperContained.method_58761(componentType.wrapperContained); }
// public static com.mojang.serialization.DataResult method_58761(yarnwrap.component.ComponentType componentType, ) { return net.minecraft.component.ComponentType.method_58761(componentType.wrapperContained); }

}