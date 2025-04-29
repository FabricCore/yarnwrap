package yarnwrap.item.map;
public class MapDecoration { public net.minecraft.item.map.MapDecoration wrapperContained; public MapDecoration(net.minecraft.item.map.MapDecoration wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte z() { return wrapperContained.z; }
// public void z(byte value) { wrapperContained.z = value; }
// public static byte z() { return net.minecraft.item.map.MapDecoration.z; }
// public static void z(byte value, ) { net.minecraft.item.map.MapDecoration.z = value; }

// public byte rotation() { return wrapperContained.rotation; }
// public void rotation(byte value) { wrapperContained.rotation = value; }
// public static byte rotation() { return net.minecraft.item.map.MapDecoration.rotation; }
// public static void rotation(byte value, ) { net.minecraft.item.map.MapDecoration.rotation = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.map.MapDecoration.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.map.MapDecoration.CODEC = value.wrapperContained; }

// public MapDecoration(yarnwrap.registry.entry.RegistryEntry x,byte z,byte rotation) { this.wrapperContained = new net.minecraft.item.map.MapDecoration(x.wrapperContained,z,rotation); }
// public byte z() { return wrapperContained.z(); }
// // public static byte z() { return net.minecraft.item.map.MapDecoration.z(); }
// public byte rotation() { return wrapperContained.rotation(); }
// // public static byte rotation() { return net.minecraft.item.map.MapDecoration.rotation(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.item.map.MapDecoration.equals(o); }
public yarnwrap.util.Identifier getAssetId() { return new yarnwrap.util.Identifier(wrapperContained.getAssetId()); }
// public static yarnwrap.util.Identifier getAssetId() { return new yarnwrap.util.Identifier(net.minecraft.item.map.MapDecoration.getAssetId()); }
public boolean isAlwaysRendered() { return wrapperContained.isAlwaysRendered(); }
// public static boolean isAlwaysRendered() { return net.minecraft.item.map.MapDecoration.isAlwaysRendered(); }

}