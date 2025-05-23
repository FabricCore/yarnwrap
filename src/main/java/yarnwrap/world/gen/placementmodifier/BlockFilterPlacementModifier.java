package yarnwrap.world.gen.placementmodifier;
public class BlockFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier wrapperContained; public BlockFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.MODIFIER_CODEC = value; }

// public yarnwrap.world.gen.blockpredicate.BlockPredicate predicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.predicate); }
// public void predicate(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.predicate = value.wrapperContained; }
// public static yarnwrap.world.gen.blockpredicate.BlockPredicate predicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.predicate); }
// public static void predicate(yarnwrap.world.gen.blockpredicate.BlockPredicate value, ) { net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.predicate = value.wrapperContained; }

// public BlockFilterPlacementModifier(yarnwrap.world.gen.blockpredicate.BlockPredicate predicate) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier(predicate.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_38916(Object instance) { return wrapperContained.method_38916(instance); }
// public static com.mojang.datafixers.kinds.App method_38916(Object instance, ) { return net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.method_38916(instance); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate method_38917(yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier placementModifier) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.method_38917(placementModifier.wrapperContained)); }
// public static yarnwrap.world.gen.blockpredicate.BlockPredicate method_38917(yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier placementModifier, ) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.method_38917(placementModifier.wrapperContained)); }
// public yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier of(yarnwrap.world.gen.blockpredicate.BlockPredicate predicate) { return new yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier(wrapperContained.of(predicate.wrapperContained)); }
// public static yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier of(yarnwrap.world.gen.blockpredicate.BlockPredicate predicate, ) { return new yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier.of(predicate.wrapperContained)); }

}