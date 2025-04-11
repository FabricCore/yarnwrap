package yarnwrap.world.gen.placementmodifier;
public class RarityFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier wrapperContained; public RarityFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public int chance() { return wrapperContained.chance; }
// public void chance(int value) { wrapperContained.chance = value; }
// public RarityFilterPlacementModifier(int chance) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier(chance); }
public yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier of(int chance) { return new yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier(wrapperContained.of(chance)); }

}