package yarnwrap.item.map;
public class MapDecorationType { public net.minecraft.item.map.MapDecorationType wrapperContained; public MapDecorationType(net.minecraft.item.map.MapDecorationType wrapperContained) { this.wrapperContained = wrapperContained; }

public int NO_MAP_COLOR() { return wrapperContained.NO_MAP_COLOR; }
// public void NO_MAP_COLOR(int value) { wrapperContained.NO_MAP_COLOR = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public boolean hasMapColor() { return wrapperContained.hasMapColor(); }

}