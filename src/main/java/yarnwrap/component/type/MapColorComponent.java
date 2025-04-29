package yarnwrap.component.type;
public class MapColorComponent { public net.minecraft.component.type.MapColorComponent wrapperContained; public MapColorComponent(net.minecraft.component.type.MapColorComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.MapColorComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.MapColorComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.MapColorComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.MapColorComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.type.MapColorComponent DEFAULT() { return new yarnwrap.component.type.MapColorComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.MapColorComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.MapColorComponent DEFAULT() { return new yarnwrap.component.type.MapColorComponent(net.minecraft.component.type.MapColorComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.MapColorComponent value, ) { net.minecraft.component.type.MapColorComponent.DEFAULT = value.wrapperContained; }


}