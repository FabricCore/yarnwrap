package yarnwrap.item.map;
public class MapDecorationType { public net.minecraft.item.map.MapDecorationType wrapperContained; public MapDecorationType(net.minecraft.item.map.MapDecorationType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int NO_MAP_COLOR() { return wrapperContained.NO_MAP_COLOR; }
// public void NO_MAP_COLOR(int value) { wrapperContained.NO_MAP_COLOR = value; }
public static int NO_MAP_COLOR() { return net.minecraft.item.map.MapDecorationType.NO_MAP_COLOR; }
// public static void NO_MAP_COLOR(int value, ) { net.minecraft.item.map.MapDecorationType.NO_MAP_COLOR = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.map.MapDecorationType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.map.MapDecorationType.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.map.MapDecorationType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.map.MapDecorationType.PACKET_CODEC = value.wrapperContained; }

public boolean hasMapColor() { return wrapperContained.hasMapColor(); }
// public static boolean hasMapColor() { return net.minecraft.item.map.MapDecorationType.hasMapColor(); }

}