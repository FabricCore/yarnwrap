package yarnwrap.world.gen.placementmodifier;
public class HeightmapPlacementModifier { public net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained; public HeightmapPlacementModifier(net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.MODIFIER_CODEC = value; }

// public Object heightmap() { return wrapperContained.heightmap; }
// // public void heightmap(Object value) { wrapperContained.heightmap = value; }
// // public static Object heightmap() { return net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.heightmap; }
// // public static void heightmap(Object value, ) { net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.heightmap = value; }

// public HeightmapPlacementModifier(Object heightmap) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier(heightmap); }
// public com.mojang.datafixers.kinds.App method_34330(Object instance) { return wrapperContained.method_34330(instance); }
// public static com.mojang.datafixers.kinds.App method_34330(Object instance, ) { return net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.method_34330(instance); }
// public yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier of(Object heightmap) { return new yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier(wrapperContained.of(heightmap)); }
// public static yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier of(Object heightmap, ) { return new yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier(net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier.of(heightmap)); }

}