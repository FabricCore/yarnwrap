package yarnwrap.component.type;
public class BeesComponent { public net.minecraft.component.type.BeesComponent wrapperContained; public BeesComponent(net.minecraft.component.type.BeesComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.BeesComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.BeesComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BeesComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BeesComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.type.BeesComponent DEFAULT() { return new yarnwrap.component.type.BeesComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.BeesComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.BeesComponent DEFAULT() { return new yarnwrap.component.type.BeesComponent(net.minecraft.component.type.BeesComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.BeesComponent value, ) { net.minecraft.component.type.BeesComponent.DEFAULT = value.wrapperContained; }


}