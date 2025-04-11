package yarnwrap.world.gen.trunk;
public class CherryTrunkPlacer { public net.minecraft.world.gen.trunk.CherryTrunkPlacer wrapperContained; public CherryTrunkPlacer(net.minecraft.world.gen.trunk.CherryTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec BRANCH_START_OFFSET_FROM_TOP_CODEC() { return wrapperContained.BRANCH_START_OFFSET_FROM_TOP_CODEC; }
// public void BRANCH_START_OFFSET_FROM_TOP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BRANCH_START_OFFSET_FROM_TOP_CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider branchCount() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchCount); }
// public void branchCount(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchCount = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider branchHorizontalLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchHorizontalLength); }
// public void branchHorizontalLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchHorizontalLength = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.branchStartOffsetFromTop); }
// public void branchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.branchStartOffsetFromTop = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.UniformIntProvider secondBranchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.secondBranchStartOffsetFromTop); }
// public void secondBranchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.secondBranchStartOffsetFromTop = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider branchEndOffsetFromTop() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchEndOffsetFromTop); }
// public void branchEndOffsetFromTop(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchEndOffsetFromTop = value.wrapperContained; }
// public Object generateBranch(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config,java.util.function.Function withAxisFunction,yarnwrap.util.math.Direction direction,int branchStartOffset,boolean branchBelowHeight,Object mutablePos) { return wrapperContained.generateBranch(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained,withAxisFunction,direction.wrapperContained,branchStartOffset,branchBelowHeight,mutablePos); }

}