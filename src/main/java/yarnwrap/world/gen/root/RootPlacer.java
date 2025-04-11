package yarnwrap.world.gen.root;
public class RootPlacer { public net.minecraft.world.gen.root.RootPlacer wrapperContained; public RootPlacer(net.minecraft.world.gen.root.RootPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider rootProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.rootProvider); }
// public void rootProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.rootProvider = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider trunkOffsetY() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.trunkOffsetY); }
// public void trunkOffsetY(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.trunkOffsetY = value.wrapperContained; }
// public java.util.Optional aboveRootPlacement() { return wrapperContained.aboveRootPlacement; }
// public void aboveRootPlacement(java.util.Optional value) { wrapperContained.aboveRootPlacement = value; }
// public yarnwrap.world.gen.root.RootPlacerType getType() { return new yarnwrap.world.gen.root.RootPlacerType(wrapperContained.getType()); }
// public boolean canGrowThrough(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowThrough(world.wrapperContained,pos.wrapperContained); }
public boolean generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos trunkPos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,trunkPos.wrapperContained,config.wrapperContained); }
// public void placeRoots(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.placeRoots(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public yarnwrap.block.BlockState applyWaterlogging(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.applyWaterlogging(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.util.math.BlockPos trunkOffset(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.BlockPos(wrapperContained.trunkOffset(pos.wrapperContained,random.wrapperContained)); }

}