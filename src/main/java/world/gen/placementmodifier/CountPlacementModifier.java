package yarnwrap.world.gen.placementmodifier;
public class CountPlacementModifier { public net.minecraft.world.gen.placementmodifier.CountPlacementModifier wrapperContained; public CountPlacementModifier(net.minecraft.world.gen.placementmodifier.CountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.count); }
public yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(int count) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(wrapperContained.of(count)); }
public yarnwrap.world.gen.placementmodifier.CountPlacementModifier of(yarnwrap.util.math.intprovider.IntProvider count) { return new yarnwrap.world.gen.placementmodifier.CountPlacementModifier(wrapperContained.of(count.wrapperContained)); }

}