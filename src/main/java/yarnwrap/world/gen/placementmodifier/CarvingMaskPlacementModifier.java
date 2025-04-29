package yarnwrap.world.gen.placementmodifier;
public class CarvingMaskPlacementModifier { public net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier wrapperContained; public CarvingMaskPlacementModifier(net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.MapCodec MODIFIER_CODEC() { return net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.MODIFIER_CODEC = value; }

// public Object step() { return wrapperContained.step; }
// // public void step(Object value) { wrapperContained.step = value; }
// // public static Object step() { return net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.step; }
// // public static void step(Object value, ) { net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.step = value; }

// public CarvingMaskPlacementModifier(Object step) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier(step); }
// public Object method_33862(yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier placementModifier) { return wrapperContained.method_33862(placementModifier.wrapperContained); }
// public static Object method_33862(yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier placementModifier, ) { return net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.method_33862(placementModifier.wrapperContained); }
// public yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier of(Object step) { return new yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier(wrapperContained.of(step)); }
// public static yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier of(Object step, ) { return new yarnwrap.world.gen.placementmodifier.CarvingMaskPlacementModifier(net.minecraft.world.gen.placementmodifier.CarvingMaskPlacementModifier.of(step)); }

}