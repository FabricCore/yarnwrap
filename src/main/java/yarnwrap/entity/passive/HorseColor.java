package yarnwrap.entity.passive;
public class HorseColor { public net.minecraft.entity.passive.HorseColor wrapperContained; public HorseColor(net.minecraft.entity.passive.HorseColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.entity.passive.HorseColor.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.entity.passive.HorseColor.INDEX_MAPPER = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.entity.passive.HorseColor.index; }
// public static void index(int value, ) { net.minecraft.entity.passive.HorseColor.index = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.passive.HorseColor.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.HorseColor.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.entity.passive.HorseColor.id; }
// public static void id(java.lang.String value, ) { net.minecraft.entity.passive.HorseColor.id = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.passive.HorseColor.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.passive.HorseColor.PACKET_CODEC = value.wrapperContained; }

// // public HorseColor(java.lang.String index,int id) { this.wrapperContained = new net.minecraft.entity.passive.HorseColor(index,id); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.entity.passive.HorseColor.getIndex(); }
// public yarnwrap.entity.passive.HorseColor byIndex(int index) { return new yarnwrap.entity.passive.HorseColor(wrapperContained.byIndex(index)); }
// public static yarnwrap.entity.passive.HorseColor byIndex(int index, ) { return new yarnwrap.entity.passive.HorseColor(net.minecraft.entity.passive.HorseColor.byIndex(index)); }

}