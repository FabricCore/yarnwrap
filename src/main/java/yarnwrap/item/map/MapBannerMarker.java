package yarnwrap.item.map;
public class MapBannerMarker { public net.minecraft.item.map.MapBannerMarker wrapperContained; public MapBannerMarker(net.minecraft.item.map.MapBannerMarker wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
// public MapBannerMarker(yarnwrap.util.math.BlockPos pos,yarnwrap.util.DyeColor dyeColor) { this.wrapperContained = new net.minecraft.item.map.MapBannerMarker(pos.wrapperContained,dyeColor.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public com.mojang.datafixers.kinds.App method_56812(Object instance) { return wrapperContained.method_56812(instance); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
public yarnwrap.registry.entry.RegistryEntry getDecorationType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDecorationType()); }
public yarnwrap.item.map.MapBannerMarker fromWorldBlock(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.item.map.MapBannerMarker(wrapperContained.fromWorldBlock(blockView.wrapperContained,blockPos.wrapperContained)); }

}