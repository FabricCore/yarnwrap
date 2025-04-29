package yarnwrap.entity.decoration.painting;
public class PaintingVariant { public net.minecraft.entity.decoration.painting.PaintingVariant wrapperContained; public PaintingVariant(net.minecraft.entity.decoration.painting.PaintingVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.decoration.painting.PaintingVariant.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.decoration.painting.PaintingVariant.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.decoration.painting.PaintingVariant.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.decoration.painting.PaintingVariant.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.decoration.painting.PaintingVariant.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.decoration.painting.PaintingVariant.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.decoration.painting.PaintingVariant.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.decoration.painting.PaintingVariant.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public PaintingVariant(int width,int height) { this.wrapperContained = new net.minecraft.entity.decoration.painting.PaintingVariant(width,height); }
public int getArea() { return wrapperContained.getArea(); }
// public static int getArea() { return net.minecraft.entity.decoration.painting.PaintingVariant.getArea(); }
// public com.mojang.datafixers.kinds.App method_59948(Object instance) { return wrapperContained.method_59948(instance); }
// public static com.mojang.datafixers.kinds.App method_59948(Object instance, ) { return net.minecraft.entity.decoration.painting.PaintingVariant.method_59948(instance); }

}