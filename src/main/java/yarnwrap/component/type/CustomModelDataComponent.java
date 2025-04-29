package yarnwrap.component.type;
public class CustomModelDataComponent { public net.minecraft.component.type.CustomModelDataComponent wrapperContained; public CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.CustomModelDataComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.CustomModelDataComponent value, ) { net.minecraft.component.type.CustomModelDataComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.CustomModelDataComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.CustomModelDataComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.CustomModelDataComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.CustomModelDataComponent.PACKET_CODEC = value.wrapperContained; }


}