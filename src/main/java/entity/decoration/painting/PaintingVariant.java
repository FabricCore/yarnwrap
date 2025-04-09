package yarnwrap.entity.decoration.painting;
public class PaintingVariant { public net.minecraft.entity.decoration.painting.PaintingVariant wrapperContained; public PaintingVariant(net.minecraft.entity.decoration.painting.PaintingVariant wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
public int getArea() { return wrapperContained.getArea(); }

}