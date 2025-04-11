package yarnwrap.component.type;
public class CustomModelDataComponent { public net.minecraft.component.type.CustomModelDataComponent wrapperContained; public CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.CustomModelDataComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }

}