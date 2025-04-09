package yarnwrap.util;
public class Rarity { public net.minecraft.util.Rarity wrapperContained; public Rarity(net.minecraft.util.Rarity wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int index() { return wrapperContained.index; }
// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.util.Formatting formatting() { return new yarnwrap.util.Formatting(wrapperContained.formatting); }
public yarnwrap.util.Formatting getFormatting() { return new yarnwrap.util.Formatting(wrapperContained.getFormatting()); }

}