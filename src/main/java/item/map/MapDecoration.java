package yarnwrap.item.map;
public class MapDecoration { public net.minecraft.item.map.MapDecoration wrapperContained; public MapDecoration(net.minecraft.item.map.MapDecoration wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte z() { return wrapperContained.z; }
// public byte rotation() { return wrapperContained.rotation; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public byte z() { return wrapperContained.z(); }
// public byte rotation() { return wrapperContained.rotation(); }
public yarnwrap.util.Identifier getAssetId() { return new yarnwrap.util.Identifier(wrapperContained.getAssetId()); }
public boolean isAlwaysRendered() { return wrapperContained.isAlwaysRendered(); }

}