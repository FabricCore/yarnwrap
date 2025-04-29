package yarnwrap.world.gen.placementmodifier;
public class PlacementModifierType { public net.minecraft.world.gen.placementmodifier.PlacementModifierType wrapperContained; public PlacementModifierType(net.minecraft.world.gen.placementmodifier.PlacementModifierType wrapperContained) { this.wrapperContained = wrapperContained; }

// // public yarnwrap.world.gen.placementmodifier.PlacementModifierType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.placementmodifier.PlacementModifierType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.placementmodifier.PlacementModifierType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.placementmodifier.PlacementModifierType(net.minecraft.world.gen.placementmodifier.PlacementModifierType.register(id,codec)); }

}