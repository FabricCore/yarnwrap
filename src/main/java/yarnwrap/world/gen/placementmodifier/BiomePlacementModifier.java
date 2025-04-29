package yarnwrap.world.gen.placementmodifier;
public class BiomePlacementModifier { public net.minecraft.world.gen.placementmodifier.BiomePlacementModifier wrapperContained; public BiomePlacementModifier(net.minecraft.world.gen.placementmodifier.BiomePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.BiomePlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.BiomePlacementModifier.MODIFIER_CODEC = value; }

// public yarnwrap.world.gen.placementmodifier.BiomePlacementModifier INSTANCE() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.gen.placementmodifier.BiomePlacementModifier value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.world.gen.placementmodifier.BiomePlacementModifier INSTANCE() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(net.minecraft.world.gen.placementmodifier.BiomePlacementModifier.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.gen.placementmodifier.BiomePlacementModifier value, ) { net.minecraft.world.gen.placementmodifier.BiomePlacementModifier.INSTANCE = value.wrapperContained; }

// public yarnwrap.world.gen.placementmodifier.BiomePlacementModifier of() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(wrapperContained.of()); }
public static yarnwrap.world.gen.placementmodifier.BiomePlacementModifier of() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(net.minecraft.world.gen.placementmodifier.BiomePlacementModifier.of()); }

}