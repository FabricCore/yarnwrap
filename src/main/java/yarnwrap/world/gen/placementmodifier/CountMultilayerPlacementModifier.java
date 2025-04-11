package yarnwrap.world.gen.placementmodifier;
public class CountMultilayerPlacementModifier { public net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier wrapperContained; public CountMultilayerPlacementModifier(net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.count); }
// public void count(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.count = value.wrapperContained; }
// public CountMultilayerPlacementModifier(yarnwrap.util.math.intprovider.IntProvider count) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier(count.wrapperContained); }
// public boolean blocksSpawn(yarnwrap.block.BlockState state) { return wrapperContained.blocksSpawn(state.wrapperContained); }
// public int findPos(yarnwrap.world.gen.feature.FeaturePlacementContext context,int x,int y,int z,int targetY) { return wrapperContained.findPos(context.wrapperContained,x,y,z,targetY); }
public yarnwrap.world.gen.placementmodifier.CountMultilayerPlacementModifier of(int count) { return new yarnwrap.world.gen.placementmodifier.CountMultilayerPlacementModifier(wrapperContained.of(count)); }
public yarnwrap.world.gen.placementmodifier.CountMultilayerPlacementModifier of(yarnwrap.util.math.intprovider.IntProvider count) { return new yarnwrap.world.gen.placementmodifier.CountMultilayerPlacementModifier(wrapperContained.of(count.wrapperContained)); }

}