package yarnwrap.util;
public class Rarity { public net.minecraft.util.Rarity wrapperContained; public Rarity(net.minecraft.util.Rarity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Formatting formatting() { return new yarnwrap.util.Formatting(wrapperContained.formatting); }
// public void formatting(yarnwrap.util.Formatting value) { wrapperContained.formatting = value.wrapperContained; }
// public static yarnwrap.util.Formatting formatting() { return new yarnwrap.util.Formatting(net.minecraft.util.Rarity.formatting); }
// public static void formatting(yarnwrap.util.Formatting value, ) { net.minecraft.util.Rarity.formatting = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Rarity.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Rarity.CODEC = value; }

// public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public static java.util.function.IntFunction ID_TO_VALUE() { return net.minecraft.util.Rarity.ID_TO_VALUE; }
// public static void ID_TO_VALUE(java.util.function.IntFunction value, ) { net.minecraft.util.Rarity.ID_TO_VALUE = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.Rarity.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.Rarity.PACKET_CODEC = value.wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.util.Rarity.index; }
// public static void index(int value, ) { net.minecraft.util.Rarity.index = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.Rarity.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.Rarity.name = value; }

// // public Rarity(java.lang.String index,int name,int formatting) { this.wrapperContained = new net.minecraft.util.Rarity(index,name,formatting); }
public yarnwrap.util.Formatting getFormatting() { return new yarnwrap.util.Formatting(wrapperContained.getFormatting()); }
// public static yarnwrap.util.Formatting getFormatting() { return new yarnwrap.util.Formatting(net.minecraft.util.Rarity.getFormatting()); }
// public int method_58414(yarnwrap.util.Rarity value) { return wrapperContained.method_58414(value.wrapperContained); }
// public static int method_58414(yarnwrap.util.Rarity value, ) { return net.minecraft.util.Rarity.method_58414(value.wrapperContained); }
// public int method_58415(yarnwrap.util.Rarity value) { return wrapperContained.method_58415(value.wrapperContained); }
// public static int method_58415(yarnwrap.util.Rarity value, ) { return net.minecraft.util.Rarity.method_58415(value.wrapperContained); }

}