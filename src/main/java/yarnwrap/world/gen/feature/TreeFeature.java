package yarnwrap.world.gen.feature;
public class TreeFeature { public net.minecraft.world.gen.feature.TreeFeature wrapperContained; public TreeFeature(net.minecraft.world.gen.feature.TreeFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FORCE_STATE_AND_NOTIFY_ALL() { return wrapperContained.FORCE_STATE_AND_NOTIFY_ALL; }
// public void FORCE_STATE_AND_NOTIFY_ALL(int value) { wrapperContained.FORCE_STATE_AND_NOTIFY_ALL = value; }
// public void setBlockStateWithoutUpdatingNeighbors(yarnwrap.world.ModifiableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setBlockStateWithoutUpdatingNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,java.util.function.BiConsumer rootPlacerReplacer,java.util.function.BiConsumer trunkPlacerReplacer,Object blockPlacer,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,random.wrapperContained,pos.wrapperContained,rootPlacerReplacer,trunkPlacerReplacer,blockPlacer,config.wrapperContained); }
// public boolean isVine(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isVine(world.wrapperContained,pos.wrapperContained); }
public boolean isAirOrLeaves(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAirOrLeaves(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelSet placeLogsAndLeaves(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockBox box,java.util.Set trunkPositions,java.util.Set decorationPositions,java.util.Set rootPositions) { return new yarnwrap.util.shape.VoxelSet(wrapperContained.placeLogsAndLeaves(world.wrapperContained,box.wrapperContained,trunkPositions,decorationPositions,rootPositions)); }
public boolean canReplace(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplace(world.wrapperContained,pos.wrapperContained); }
// public int getTopPosition(yarnwrap.world.TestableWorld world,int height,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getTopPosition(world.wrapperContained,height,pos.wrapperContained,config.wrapperContained); }

}