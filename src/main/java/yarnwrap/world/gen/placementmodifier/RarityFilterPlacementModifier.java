package yarnwrap.world.gen.placementmodifier;
public class RarityFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier wrapperContained; public RarityFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.MODIFIER_CODEC = value; }

// public int chance() { return wrapperContained.chance; }
// public void chance(int value) { wrapperContained.chance = value; }
// public static int chance() { return net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.chance; }
// public static void chance(int value, ) { net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.chance = value; }

// public RarityFilterPlacementModifier(int chance) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier(chance); }
// public yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier of(int chance) { return new yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier(wrapperContained.of(chance)); }
// public static yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier of(int chance, ) { return new yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.of(chance)); }
// public java.lang.Integer method_39660(yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier placementModifier) { return wrapperContained.method_39660(placementModifier.wrapperContained); }
// public static java.lang.Integer method_39660(yarnwrap.world.gen.placementmodifier.RarityFilterPlacementModifier placementModifier, ) { return net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier.method_39660(placementModifier.wrapperContained); }

}