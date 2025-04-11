package yarnwrap.util;
public class Rarity { public net.minecraft.util.Rarity wrapperContained; public Rarity(net.minecraft.util.Rarity wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public yarnwrap.util.Formatting formatting() { return new yarnwrap.util.Formatting(wrapperContained.formatting); }
// public void formatting(yarnwrap.util.Formatting value) { wrapperContained.formatting = value.wrapperContained; }
// // public Rarity(java.lang.String index,int name,int formatting) { this.wrapperContained = new net.minecraft.util.Rarity(index,name,formatting); }
public yarnwrap.util.Formatting getFormatting() { return new yarnwrap.util.Formatting(wrapperContained.getFormatting()); }
// public int method_58414(yarnwrap.util.Rarity value) { return wrapperContained.method_58414(value.wrapperContained); }
// public int method_58415(yarnwrap.util.Rarity value) { return wrapperContained.method_58415(value.wrapperContained); }

}