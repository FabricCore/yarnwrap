package yarnwrap.component.type;
public class CustomModelDataComponent { public net.minecraft.component.type.CustomModelDataComponent wrapperContained; public CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }

}