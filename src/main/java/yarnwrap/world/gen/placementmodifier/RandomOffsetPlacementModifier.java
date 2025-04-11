package yarnwrap.world.gen.placementmodifier;
public class RandomOffsetPlacementModifier { public net.minecraft.world.gen.placementmodifier.RandomOffsetPlacementModifier wrapperContained; public RandomOffsetPlacementModifier(net.minecraft.world.gen.placementmodifier.RandomOffsetPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider spreadXz() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.spreadXz); }
// public void spreadXz(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.spreadXz = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider spreadY() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.spreadY); }
// public void spreadY(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.spreadY = value.wrapperContained; }
public yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier vertically(yarnwrap.util.math.intprovider.IntProvider spreadY) { return new yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier(wrapperContained.vertically(spreadY.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier of(yarnwrap.util.math.intprovider.IntProvider spreadXz,yarnwrap.util.math.intprovider.IntProvider spreadY) { return new yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier(wrapperContained.of(spreadXz.wrapperContained,spreadY.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier horizontally(yarnwrap.util.math.intprovider.IntProvider spreadXz) { return new yarnwrap.world.gen.placementmodifier.RandomOffsetPlacementModifier(wrapperContained.horizontally(spreadXz.wrapperContained)); }

}