package yarnwrap.item.map;
public class MapDecoration { public net.minecraft.item.map.MapDecoration wrapperContained; public MapDecoration(net.minecraft.item.map.MapDecoration wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte z() { return wrapperContained.z; }
// public void z(byte value) { wrapperContained.z = value; }
// public byte rotation() { return wrapperContained.rotation; }
// public void rotation(byte value) { wrapperContained.rotation = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public MapDecoration(yarnwrap.registry.entry.RegistryEntry x,byte z,byte rotation) { this.wrapperContained = new net.minecraft.item.map.MapDecoration(x.wrapperContained,z,rotation); }
// public byte z() { return wrapperContained.z(); }
// public byte rotation() { return wrapperContained.rotation(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.Identifier getAssetId() { return new yarnwrap.util.Identifier(wrapperContained.getAssetId()); }
public boolean isAlwaysRendered() { return wrapperContained.isAlwaysRendered(); }

}