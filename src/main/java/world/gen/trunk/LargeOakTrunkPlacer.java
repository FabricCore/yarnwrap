package yarnwrap.world.gen.trunk;
public class LargeOakTrunkPlacer { public net.minecraft.world.gen.trunk.LargeOakTrunkPlacer wrapperContained; public LargeOakTrunkPlacer(net.minecraft.world.gen.trunk.LargeOakTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean isHighEnough(int treeHeight,int height) { return wrapperContained.isHighEnough(treeHeight,height); }
// public void makeBranches(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int treeHeight,yarnwrap.util.math.BlockPos startPos,java.util.List branchPositions,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.makeBranches(world.wrapperContained,replacer,random.wrapperContained,treeHeight,startPos.wrapperContained,branchPositions,config.wrapperContained); }
// public boolean makeOrCheckBranch(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos startPos,yarnwrap.util.math.BlockPos branchPos,boolean make,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.makeOrCheckBranch(world.wrapperContained,replacer,random.wrapperContained,startPos.wrapperContained,branchPos.wrapperContained,make,config.wrapperContained); }
// public int getLongestSide(yarnwrap.util.math.BlockPos offset) { return wrapperContained.getLongestSide(offset.wrapperContained); }
// public Object getLogAxis(yarnwrap.util.math.BlockPos branchStart,yarnwrap.util.math.BlockPos branchEnd) { return wrapperContained.getLogAxis(branchStart.wrapperContained,branchEnd.wrapperContained); }
// public float shouldGenerateBranch(int treeHeight,int height) { return wrapperContained.shouldGenerateBranch(treeHeight,height); }

}