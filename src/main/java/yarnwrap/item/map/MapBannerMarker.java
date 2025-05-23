package yarnwrap.item.map;
public class MapBannerMarker { public net.minecraft.item.map.MapBannerMarker wrapperContained; public MapBannerMarker(net.minecraft.item.map.MapBannerMarker wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.map.MapBannerMarker.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.map.MapBannerMarker.CODEC = value; }

// public MapBannerMarker(yarnwrap.util.math.BlockPos pos,yarnwrap.util.DyeColor dyeColor) { this.wrapperContained = new net.minecraft.item.map.MapBannerMarker(pos.wrapperContained,dyeColor.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.item.map.MapBannerMarker.equals(o); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public static java.lang.String getKey() { return net.minecraft.item.map.MapBannerMarker.getKey(); }
public yarnwrap.registry.entry.RegistryEntry getDecorationType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDecorationType()); }
// public static yarnwrap.registry.entry.RegistryEntry getDecorationType() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.map.MapBannerMarker.getDecorationType()); }
// public yarnwrap.item.map.MapBannerMarker fromWorldBlock(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.item.map.MapBannerMarker(wrapperContained.fromWorldBlock(blockView.wrapperContained,blockPos.wrapperContained)); }
// public static yarnwrap.item.map.MapBannerMarker fromWorldBlock(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos blockPos, ) { return new yarnwrap.item.map.MapBannerMarker(net.minecraft.item.map.MapBannerMarker.fromWorldBlock(blockView.wrapperContained,blockPos.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_56812(Object instance) { return wrapperContained.method_56812(instance); }
// public static com.mojang.datafixers.kinds.App method_56812(Object instance, ) { return net.minecraft.item.map.MapBannerMarker.method_56812(instance); }

}