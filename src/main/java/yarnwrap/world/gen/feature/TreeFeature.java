package yarnwrap.world.gen.feature;
public class TreeFeature { public net.minecraft.world.gen.feature.TreeFeature wrapperContained; public TreeFeature(net.minecraft.world.gen.feature.TreeFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FORCE_STATE_AND_NOTIFY_ALL() { return wrapperContained.FORCE_STATE_AND_NOTIFY_ALL; }
// public void FORCE_STATE_AND_NOTIFY_ALL(int value) { wrapperContained.FORCE_STATE_AND_NOTIFY_ALL = value; }
// public void setBlockStateWithoutUpdatingNeighbors(yarnwrap.world.ModifiableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setBlockStateWithoutUpdatingNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,java.util.function.BiConsumer rootPlacerReplacer,java.util.function.BiConsumer trunkPlacerReplacer,Object blockPlacer,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,random.wrapperContained,pos.wrapperContained,rootPlacerReplacer,trunkPlacerReplacer,blockPlacer,config.wrapperContained); }
// public boolean isVine(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isVine(world.wrapperContained,pos.wrapperContained); }
// public boolean method_16417(yarnwrap.block.BlockState state) { return wrapperContained.method_16417(state.wrapperContained); }
public boolean isAirOrLeaves(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAirOrLeaves(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelSet placeLogsAndLeaves(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockBox box,java.util.Set trunkPositions,java.util.Set decorationPositions,java.util.Set rootPositions) { return new yarnwrap.util.shape.VoxelSet(wrapperContained.placeLogsAndLeaves(world.wrapperContained,box.wrapperContained,trunkPositions,decorationPositions,rootPositions)); }
// public void method_23381(Object decorator) { wrapperContained.method_23381(decorator); }
// public boolean method_23384(yarnwrap.block.BlockState state) { return wrapperContained.method_23384(state.wrapperContained); }
public boolean canReplace(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplace(world.wrapperContained,pos.wrapperContained); }
// public void method_27372(yarnwrap.world.gen.feature.TreeFeatureConfig node) { wrapperContained.method_27372(node.wrapperContained); }
// public int getTopPosition(yarnwrap.world.TestableWorld world,int height,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getTopPosition(world.wrapperContained,height,pos.wrapperContained,config.wrapperContained); }
// public java.lang.Boolean method_35363(yarnwrap.world.StructureWorldAccess box) { return wrapperContained.method_35363(box.wrapperContained); }
// public void method_35364(java.util.Set pos,yarnwrap.world.StructureWorldAccess state) { wrapperContained.method_35364(pos,state.wrapperContained); }
// public void method_43162(java.util.Set pos,yarnwrap.world.StructureWorldAccess state) { wrapperContained.method_43162(pos,state.wrapperContained); }
// public yarnwrap.util.math.BlockPos method_43293(yarnwrap.util.math.BlockPos rootPlacer) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_43293(rootPlacer.wrapperContained)); }
// public void method_49238(java.util.Set pos,yarnwrap.world.StructureWorldAccess state) { wrapperContained.method_49238(pos,state.wrapperContained); }
// public boolean method_51179(yarnwrap.block.BlockState state) { return wrapperContained.method_51179(state.wrapperContained); }

}