package yarnwrap.world.gen.placementmodifier;
public class HeightRangePlacementModifier { public net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier wrapperContained; public HeightRangePlacementModifier(net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public yarnwrap.world.gen.heightprovider.HeightProvider height() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.height); }
// public void height(yarnwrap.world.gen.heightprovider.HeightProvider value) { wrapperContained.height = value.wrapperContained; }
// public HeightRangePlacementModifier(yarnwrap.world.gen.heightprovider.HeightProvider height) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier(height.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39633(Object instance) { return wrapperContained.method_39633(instance); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier uniform(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.uniform(minOffset.wrapperContained,maxOffset.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier of(yarnwrap.world.gen.heightprovider.HeightProvider height) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.of(height.wrapperContained)); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_39636(yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier placementModifier) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_39636(placementModifier.wrapperContained)); }
public yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier trapezoid(yarnwrap.world.gen.YOffset minOffset,yarnwrap.world.gen.YOffset maxOffset) { return new yarnwrap.world.gen.placementmodifier.HeightRangePlacementModifier(wrapperContained.trapezoid(minOffset.wrapperContained,maxOffset.wrapperContained)); }

}