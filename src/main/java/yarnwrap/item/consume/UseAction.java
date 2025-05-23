package yarnwrap.item.consume;
public class UseAction { public net.minecraft.item.consume.UseAction wrapperContained; public UseAction(net.minecraft.item.consume.UseAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.consume.UseAction.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.consume.UseAction.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.consume.UseAction.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.consume.UseAction.PACKET_CODEC = value.wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.item.consume.UseAction.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.item.consume.UseAction.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.item.consume.UseAction.id; }
// public static void id(int value, ) { net.minecraft.item.consume.UseAction.id = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.item.consume.UseAction.name; }
// public static void name(java.lang.String value, ) { net.minecraft.item.consume.UseAction.name = value; }

// // public UseAction(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.item.consume.UseAction(id,name); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.item.consume.UseAction.getId(); }

}