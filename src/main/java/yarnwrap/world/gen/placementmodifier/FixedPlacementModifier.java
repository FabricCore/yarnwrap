package yarnwrap.world.gen.placementmodifier;
public class FixedPlacementModifier { public net.minecraft.world.gen.placementmodifier.FixedPlacementModifier wrapperContained; public FixedPlacementModifier(net.minecraft.world.gen.placementmodifier.FixedPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.CODEC = value; }

// public java.util.List positions() { return wrapperContained.positions; }
// public void positions(java.util.List value) { wrapperContained.positions = value; }
// public static java.util.List positions() { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.positions; }
// public static void positions(java.util.List value, ) { net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.positions = value; }

// public FixedPlacementModifier(java.util.List positions) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.FixedPlacementModifier(positions); }
// public boolean chunkSectionMatchesPos(int chunkSectionX,int chunkSectionZ,yarnwrap.util.math.BlockPos pos) { return wrapperContained.chunkSectionMatchesPos(chunkSectionX,chunkSectionZ,pos.wrapperContained); }
// public static boolean chunkSectionMatchesPos(int chunkSectionX,int chunkSectionZ,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.chunkSectionMatchesPos(chunkSectionX,chunkSectionZ,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_61120(Object instance) { return wrapperContained.method_61120(instance); }
// public static com.mojang.datafixers.kinds.App method_61120(Object instance, ) { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.method_61120(instance); }
// public java.util.List method_61121(yarnwrap.world.gen.placementmodifier.FixedPlacementModifier placementModifier) { return wrapperContained.method_61121(placementModifier.wrapperContained); }
// public static java.util.List method_61121(yarnwrap.world.gen.placementmodifier.FixedPlacementModifier placementModifier, ) { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.method_61121(placementModifier.wrapperContained); }
// public yarnwrap.world.gen.placementmodifier.FixedPlacementModifier of(net.minecraft.util.math.BlockPos[] positions) { return new yarnwrap.world.gen.placementmodifier.FixedPlacementModifier(wrapperContained.of(positions)); }
// public static yarnwrap.world.gen.placementmodifier.FixedPlacementModifier of(net.minecraft.util.math.BlockPos[] positions, ) { return new yarnwrap.world.gen.placementmodifier.FixedPlacementModifier(net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.of(positions)); }
// public boolean method_61123(int posx) { return wrapperContained.method_61123(posx); }
// public static boolean method_61123(int posx, ) { return net.minecraft.world.gen.placementmodifier.FixedPlacementModifier.method_61123(posx); }

}