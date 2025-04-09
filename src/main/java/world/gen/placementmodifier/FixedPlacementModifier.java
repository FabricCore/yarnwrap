package yarnwrap.world.gen.placementmodifier;
public class FixedPlacementModifier { public net.minecraft.world.gen.placementmodifier.FixedPlacementModifier wrapperContained; public FixedPlacementModifier(net.minecraft.world.gen.placementmodifier.FixedPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.List positions() { return wrapperContained.positions; }
// public boolean chunkSectionMatchesPos(int chunkSectionX,int chunkSectionZ,yarnwrap.util.math.BlockPos pos) { return wrapperContained.chunkSectionMatchesPos(chunkSectionX,chunkSectionZ,pos.wrapperContained); }
public yarnwrap.world.gen.placementmodifier.FixedPlacementModifier of(net.minecraft.util.math.BlockPos[] positions) { return new yarnwrap.world.gen.placementmodifier.FixedPlacementModifier(wrapperContained.of(positions)); }

}