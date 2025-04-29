package yarnwrap.world.gen.placementmodifier;
public class CountPlacementModifier { public net.minecraft.world.gen.placementmodifier.CountPlacementModifier wrapperContained; public CountPlacementModifier(net.minecraft.world.gen.placementmodifier.CountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.CountPlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.CountPlacementModifier.MODIFIER_CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.count); }
// public void count(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.count = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.placementmodifier.CountPlacementModifier.count); }
// public static void count(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.placementmodifier.CountPlacementModifier.count = value.wrapperContained; }

// public CountPlacementModifier(yarnwrap.util.math.intprovider.IntProvider count) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.CountPlacementModifier(count.wrapperContained); }
// public yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(int count) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(wrapperContained.of(count)); }
// public static yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(int count, ) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(net.minecraft.world.gen.placementmodifier.CountPlacementModifier.of(count)); }
// public yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(yarnwrap.util.math.intprovider.IntProvider count) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(wrapperContained.of(count.wrapperContained)); }
// public static yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(yarnwrap.util.math.intprovider.IntProvider count, ) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(net.minecraft.world.gen.placementmodifier.CountPlacementModifier.of(count.wrapperContained)); }

}