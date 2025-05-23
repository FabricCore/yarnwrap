package yarnwrap.util;
public class AssetInfo { public net.minecraft.util.AssetInfo wrapperContained; public AssetInfo(net.minecraft.util.AssetInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.AssetInfo.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.AssetInfo.CODEC = value; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.util.AssetInfo.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.AssetInfo.MAP_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.AssetInfo.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.AssetInfo.PACKET_CODEC = value.wrapperContained; }

public AssetInfo(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.util.AssetInfo(id.wrapperContained); }
// public java.lang.String method_67294(java.lang.String path) { return wrapperContained.method_67294(path); }
// public static java.lang.String method_67294(java.lang.String path, ) { return net.minecraft.util.AssetInfo.method_67294(path); }

}