package yarnwrap.world.gen.trunk;
public class CherryTrunkPlacer { public net.minecraft.world.gen.trunk.CherryTrunkPlacer wrapperContained; public CherryTrunkPlacer(net.minecraft.world.gen.trunk.CherryTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.trunk.CherryTrunkPlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.CODEC = value; }

// public com.mojang.serialization.Codec BRANCH_START_OFFSET_FROM_TOP_CODEC() { return wrapperContained.BRANCH_START_OFFSET_FROM_TOP_CODEC; }
// public void BRANCH_START_OFFSET_FROM_TOP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BRANCH_START_OFFSET_FROM_TOP_CODEC = value; }
// public static com.mojang.serialization.Codec BRANCH_START_OFFSET_FROM_TOP_CODEC() { return net.minecraft.world.gen.trunk.CherryTrunkPlacer.BRANCH_START_OFFSET_FROM_TOP_CODEC; }
// public static void BRANCH_START_OFFSET_FROM_TOP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.BRANCH_START_OFFSET_FROM_TOP_CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider branchCount() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchCount); }
// public void branchCount(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchCount = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider branchCount() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchCount); }
// public static void branchCount(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchCount = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider branchHorizontalLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchHorizontalLength); }
// public void branchHorizontalLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchHorizontalLength = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider branchHorizontalLength() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchHorizontalLength); }
// public static void branchHorizontalLength(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchHorizontalLength = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.branchStartOffsetFromTop); }
// public void branchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.branchStartOffsetFromTop = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchStartOffsetFromTop); }
// public static void branchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchStartOffsetFromTop = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider secondBranchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.secondBranchStartOffsetFromTop); }
// public void secondBranchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.secondBranchStartOffsetFromTop = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider secondBranchStartOffsetFromTop() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.secondBranchStartOffsetFromTop); }
// public static void secondBranchStartOffsetFromTop(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.secondBranchStartOffsetFromTop = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider branchEndOffsetFromTop() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.branchEndOffsetFromTop); }
// public void branchEndOffsetFromTop(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.branchEndOffsetFromTop = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider branchEndOffsetFromTop() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchEndOffsetFromTop); }
// public static void branchEndOffsetFromTop(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.trunk.CherryTrunkPlacer.branchEndOffsetFromTop = value.wrapperContained; }

public CherryTrunkPlacer(int baseHeight,int firstRandomHeight,int secondRandomHeight,yarnwrap.util.math.intprovider.IntProvider branchCount,yarnwrap.util.math.intprovider.IntProvider branchHorizontalLength,yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop,yarnwrap.util.math.intprovider.IntProvider branchEndOffsetFromTop) { this.wrapperContained = new net.minecraft.world.gen.trunk.CherryTrunkPlacer(baseHeight,firstRandomHeight,secondRandomHeight,branchCount.wrapperContained,branchHorizontalLength.wrapperContained,branchStartOffsetFromTop.wrapperContained,branchEndOffsetFromTop.wrapperContained); }
// public com.mojang.serialization.DataResult method_49248(yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop) { return wrapperContained.method_49248(branchStartOffsetFromTop.wrapperContained); }
// public static com.mojang.serialization.DataResult method_49248(yarnwrap.util.math.intprovider.UniformIntProvider branchStartOffsetFromTop, ) { return net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49248(branchStartOffsetFromTop.wrapperContained); }
// public Object generateBranch(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config,java.util.function.Function withAxisFunction,yarnwrap.util.math.Direction direction,int branchStartOffset,boolean branchBelowHeight,Object mutablePos) { return wrapperContained.generateBranch(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained,withAxisFunction,direction.wrapperContained,branchStartOffset,branchBelowHeight,mutablePos); }
// public static Object generateBranch(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config,java.util.function.Function withAxisFunction,yarnwrap.util.math.Direction direction,int branchStartOffset,boolean branchBelowHeight,Object mutablePos, ) { return net.minecraft.world.gen.trunk.CherryTrunkPlacer.generateBranch(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained,withAxisFunction,direction.wrapperContained,branchStartOffset,branchBelowHeight,mutablePos); }
// public yarnwrap.util.math.intprovider.IntProvider method_49250(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_49250(trunkPlacer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_49250(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49250(trunkPlacer.wrapperContained)); }
// public yarnwrap.block.BlockState method_49251(yarnwrap.util.math.Direction state) { return new yarnwrap.block.BlockState(wrapperContained.method_49251(state.wrapperContained)); }
// public static yarnwrap.block.BlockState method_49251(yarnwrap.util.math.Direction state, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49251(state.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_49252(Object instance) { return wrapperContained.method_49252(instance); }
// public static com.mojang.datafixers.kinds.App method_49252(Object instance, ) { return net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49252(instance); }
// public yarnwrap.util.math.intprovider.UniformIntProvider method_49253(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer) { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.method_49253(trunkPlacer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.UniformIntProvider method_49253(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer, ) { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49253(trunkPlacer.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_49254(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_49254(trunkPlacer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_49254(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49254(trunkPlacer.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_49255(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_49255(trunkPlacer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_49255(yarnwrap.world.gen.trunk.CherryTrunkPlacer trunkPlacer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.CherryTrunkPlacer.method_49255(trunkPlacer.wrapperContained)); }

}