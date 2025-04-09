package yarnwrap.world.gen.placementmodifier;
public class HeightRangePlacementModifier { public net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier wrapperContained; public HeightRangePlacementModifier(net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.world.gen.heightprovider.HeightProvider height() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.height); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier uniform(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.uniform(minOffset.wrapperContained,maxOffset.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier of(yarnwrap.world.gen.heightprovider.HeightProvider height) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.of(height.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier trapezoid(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.trapezoid(minOffset.wrapperContained,maxOffset.wrapperContained)); }

}