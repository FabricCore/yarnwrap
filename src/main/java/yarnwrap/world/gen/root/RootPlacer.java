package yarnwrap.world.gen.root;
public class RootPlacer { public net.minecraft.world.gen.root.RootPlacer wrapperContained; public RootPlacer(net.minecraft.world.gen.root.RootPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.world.gen.root.RootPlacer.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.root.RootPlacer.TYPE_CODEC = value; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider rootProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.rootProvider); }
// public void rootProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.rootProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider rootProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.root.RootPlacer.rootProvider); }
// public static void rootProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.root.RootPlacer.rootProvider = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider trunkOffsetY() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.trunkOffsetY); }
// public void trunkOffsetY(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.trunkOffsetY = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider trunkOffsetY() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.root.RootPlacer.trunkOffsetY); }
// public static void trunkOffsetY(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.root.RootPlacer.trunkOffsetY = value.wrapperContained; }

// public java.util.Optional aboveRootPlacement() { return wrapperContained.aboveRootPlacement; }
// public void aboveRootPlacement(java.util.Optional value) { wrapperContained.aboveRootPlacement = value; }
// public static java.util.Optional aboveRootPlacement() { return net.minecraft.world.gen.root.RootPlacer.aboveRootPlacement; }
// public static void aboveRootPlacement(java.util.Optional value, ) { net.minecraft.world.gen.root.RootPlacer.aboveRootPlacement = value; }

// public RootPlacer(yarnwrap.util.math.intprovider.IntProvider trunkOffsetY,yarnwrap.world.gen.stateprovider.BlockStateProvider rootProvider,java.util.Optional aboveRootPlacement) { this.wrapperContained = new net.minecraft.world.gen.root.RootPlacer(trunkOffsetY.wrapperContained,rootProvider.wrapperContained,aboveRootPlacement); }
// public yarnwrap.world.gen.root.RootPlacerType getType() { return new yarnwrap.world.gen.root.RootPlacerType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.root.RootPlacerType getType() { return new yarnwrap.world.gen.root.RootPlacerType(net.minecraft.world.gen.root.RootPlacer.getType()); }
// public boolean canGrowThrough(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowThrough(world.wrapperContained,pos.wrapperContained); }
// public static boolean canGrowThrough(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.root.RootPlacer.canGrowThrough(world.wrapperContained,pos.wrapperContained); }
public boolean generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos trunkPos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,trunkPos.wrapperContained,config.wrapperContained); }
// public static boolean generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos trunkPos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.root.RootPlacer.generate(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,trunkPos.wrapperContained,config.wrapperContained); }
// public void placeRoots(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.placeRoots(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public static void placeRoots(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { net.minecraft.world.gen.root.RootPlacer.placeRoots(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public yarnwrap.block.BlockState applyWaterlogging(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.applyWaterlogging(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState applyWaterlogging(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.root.RootPlacer.applyWaterlogging(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_43183(yarnwrap.world.gen.root.RootPlacer rootPlacer) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_43183(rootPlacer.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_43183(yarnwrap.world.gen.root.RootPlacer rootPlacer, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.root.RootPlacer.method_43183(rootPlacer.wrapperContained)); }
// public boolean method_43184(yarnwrap.fluid.FluidState fluidState) { return wrapperContained.method_43184(fluidState.wrapperContained); }
// public static boolean method_43184(yarnwrap.fluid.FluidState fluidState, ) { return net.minecraft.world.gen.root.RootPlacer.method_43184(fluidState.wrapperContained); }
// public java.util.Optional method_43308(yarnwrap.world.gen.root.RootPlacer rootPlacer) { return wrapperContained.method_43308(rootPlacer.wrapperContained); }
// public static java.util.Optional method_43308(yarnwrap.world.gen.root.RootPlacer rootPlacer, ) { return net.minecraft.world.gen.root.RootPlacer.method_43308(rootPlacer.wrapperContained); }
public yarnwrap.util.math.BlockPos trunkOffset(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.BlockPos(wrapperContained.trunkOffset(pos.wrapperContained,random.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos trunkOffset(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.root.RootPlacer.trunkOffset(pos.wrapperContained,random.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_43310(yarnwrap.world.gen.root.RootPlacer rootPlacer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_43310(rootPlacer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_43310(yarnwrap.world.gen.root.RootPlacer rootPlacer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.root.RootPlacer.method_43310(rootPlacer.wrapperContained)); }

}