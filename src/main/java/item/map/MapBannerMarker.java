package yarnwrap.item.map;
public class MapBannerMarker { public net.minecraft.item.map.MapBannerMarker wrapperContained; public MapBannerMarker(net.minecraft.item.map.MapBannerMarker wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
public java.lang.String getKey() { return wrapperContained.getKey(); }
public yarnwrap.registry.entry.RegistryEntry getDecorationType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDecorationType()); }
public yarnwrap.item.map.MapBannerMarker fromWorldBlock(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.item.map.MapBannerMarker(wrapperContained.fromWorldBlock(blockView.wrapperContained,blockPos.wrapperContained)); }

}