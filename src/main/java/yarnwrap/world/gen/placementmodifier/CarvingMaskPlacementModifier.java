package yarnwrap.world.gen.placementmodifier;
public class CarvingMaskPlacementModifier { public net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier wrapperContained; public CarvingMaskPlacementModifier(net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public Object step() { return wrapperContained.step; }
// // public void step(Object value) { wrapperContained.step = value; }
// public yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier of(Object step) { return new yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier(wrapperContained.of(step)); }

}