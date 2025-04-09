package yarnwrap.item.map;
public class MapDecorationType { public net.minecraft.item.map.MapDecorationType wrapperContained; public MapDecorationType(net.minecraft.item.map.MapDecorationType wrapperContained) { this.wrapperContained = wrapperContained; }

public int NO_MAP_COLOR() { return wrapperContained.NO_MAP_COLOR; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public boolean hasMapColor() { return wrapperContained.hasMapColor(); }

}