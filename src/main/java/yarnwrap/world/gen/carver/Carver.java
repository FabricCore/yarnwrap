package yarnwrap.world.gen.carver;
public class Carver { public net.minecraft.world.gen.carver.Carver wrapperContained; public Carver(net.minecraft.world.gen.carver.Carver wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(wrapperContained.CAVE_AIR); }
// public void CAVE_AIR(yarnwrap.block.BlockState value) { wrapperContained.CAVE_AIR = value.wrapperContained; }
// public static yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.carver.Carver.CAVE_AIR); }
// public static void CAVE_AIR(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.carver.Carver.CAVE_AIR = value.wrapperContained; }

// public yarnwrap.world.gen.carver.Carver RAVINE() { return new yarnwrap.world.gen.carver.Carver(wrapperContained.RAVINE); }
// public void RAVINE(yarnwrap.world.gen.carver.Carver value) { wrapperContained.RAVINE = value.wrapperContained; }
public static yarnwrap.world.gen.carver.Carver RAVINE() { return new yarnwrap.world.gen.carver.Carver(net.minecraft.world.gen.carver.Carver.RAVINE); }
// public static void RAVINE(yarnwrap.world.gen.carver.Carver value, ) { net.minecraft.world.gen.carver.Carver.RAVINE = value.wrapperContained; }

// public yarnwrap.fluid.FluidState LAVA() { return new yarnwrap.fluid.FluidState(wrapperContained.LAVA); }
// public void LAVA(yarnwrap.fluid.FluidState value) { wrapperContained.LAVA = value.wrapperContained; }
// public static yarnwrap.fluid.FluidState LAVA() { return new yarnwrap.fluid.FluidState(net.minecraft.world.gen.carver.Carver.LAVA); }
// public static void LAVA(yarnwrap.fluid.FluidState value, ) { net.minecraft.world.gen.carver.Carver.LAVA = value.wrapperContained; }

// public java.util.Set carvableFluids() { return wrapperContained.carvableFluids; }
// public void carvableFluids(java.util.Set value) { wrapperContained.carvableFluids = value; }
// public static java.util.Set carvableFluids() { return net.minecraft.world.gen.carver.Carver.carvableFluids; }
// public static void carvableFluids(java.util.Set value, ) { net.minecraft.world.gen.carver.Carver.carvableFluids = value; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public static yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.carver.Carver.AIR); }
// public static void AIR(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.carver.Carver.AIR = value.wrapperContained; }

// public yarnwrap.fluid.FluidState WATER() { return new yarnwrap.fluid.FluidState(wrapperContained.WATER); }
// public void WATER(yarnwrap.fluid.FluidState value) { wrapperContained.WATER = value.wrapperContained; }
// public static yarnwrap.fluid.FluidState WATER() { return new yarnwrap.fluid.FluidState(net.minecraft.world.gen.carver.Carver.WATER); }
// public static void WATER(yarnwrap.fluid.FluidState value, ) { net.minecraft.world.gen.carver.Carver.WATER = value.wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.carver.Carver.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.carver.Carver.codec = value; }

// public Carver(com.mojang.serialization.Codec configCodec) { this.wrapperContained = new net.minecraft.world.gen.carver.Carver(configCodec); }
public boolean carve(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.carver.CarvingMask mask) { return wrapperContained.carve(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,random.wrapperContained,aquiferSampler.wrapperContained,pos.wrapperContained,mask.wrapperContained); }
// public static boolean carve(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.carver.CarvingMask mask, ) { return net.minecraft.world.gen.carver.Carver.carve(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,random.wrapperContained,aquiferSampler.wrapperContained,pos.wrapperContained,mask.wrapperContained); }
// public yarnwrap.world.gen.carver.Carver register(java.lang.String name,yarnwrap.world.gen.carver.Carver carver) { return new yarnwrap.world.gen.carver.Carver(wrapperContained.register(name,carver.wrapperContained)); }
// public static yarnwrap.world.gen.carver.Carver register(java.lang.String name,yarnwrap.world.gen.carver.Carver carver, ) { return new yarnwrap.world.gen.carver.Carver(net.minecraft.world.gen.carver.Carver.register(name,carver.wrapperContained)); }
public boolean shouldCarve(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.random.Random random) { return wrapperContained.shouldCarve(config.wrapperContained,random.wrapperContained); }
// public static boolean shouldCarve(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.random.Random random, ) { return net.minecraft.world.gen.carver.Carver.shouldCarve(config.wrapperContained,random.wrapperContained); }
// public boolean canAlwaysCarveBlock(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state) { return wrapperContained.canAlwaysCarveBlock(config.wrapperContained,state.wrapperContained); }
// public static boolean canAlwaysCarveBlock(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.carver.Carver.canAlwaysCarveBlock(config.wrapperContained,state.wrapperContained); }
public int getBranchFactor() { return wrapperContained.getBranchFactor(); }
// public static int getBranchFactor() { return net.minecraft.world.gen.carver.Carver.getBranchFactor(); }
// public boolean carveAtPoint(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.carver.CarvingMask mask,Object pos,Object tmp,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,org.apache.commons.lang3.mutable.MutableBoolean replacedGrassy) { return wrapperContained.carveAtPoint(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,mask.wrapperContained,pos,tmp,aquiferSampler.wrapperContained,replacedGrassy); }
// public static boolean carveAtPoint(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.carver.CarvingMask mask,Object pos,Object tmp,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,org.apache.commons.lang3.mutable.MutableBoolean replacedGrassy, ) { return net.minecraft.world.gen.carver.Carver.carveAtPoint(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,mask.wrapperContained,pos,tmp,aquiferSampler.wrapperContained,replacedGrassy); }
public yarnwrap.world.gen.carver.ConfiguredCarver configure(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.world.gen.carver.ConfiguredCarver(wrapperContained.configure(config.wrapperContained)); }
// public static yarnwrap.world.gen.carver.ConfiguredCarver configure(yarnwrap.world.gen.carver.CarverConfig config, ) { return new yarnwrap.world.gen.carver.ConfiguredCarver(net.minecraft.world.gen.carver.Carver.configure(config.wrapperContained)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.carver.Carver.getCodec(); }
// public boolean canCarveBranch(yarnwrap.util.math.ChunkPos pos,double x,double z,int branchIndex,int branchCount,float baseWidth) { return wrapperContained.canCarveBranch(pos.wrapperContained,x,z,branchIndex,branchCount,baseWidth); }
// public static boolean canCarveBranch(yarnwrap.util.math.ChunkPos pos,double x,double z,int branchIndex,int branchCount,float baseWidth, ) { return net.minecraft.world.gen.carver.Carver.canCarveBranch(pos.wrapperContained,x,z,branchIndex,branchCount,baseWidth); }
// public boolean carveRegion(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,double x,double y,double z,double width,double height,yarnwrap.world.gen.carver.CarvingMask mask,Object skipPredicate) { return wrapperContained.carveRegion(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,aquiferSampler.wrapperContained,x,y,z,width,height,mask.wrapperContained,skipPredicate); }
// public static boolean carveRegion(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,double x,double y,double z,double width,double height,yarnwrap.world.gen.carver.CarvingMask mask,Object skipPredicate, ) { return net.minecraft.world.gen.carver.Carver.carveRegion(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,aquiferSampler.wrapperContained,x,y,z,width,height,mask.wrapperContained,skipPredicate); }
// public boolean isDebug(yarnwrap.world.gen.carver.CarverConfig config) { return wrapperContained.isDebug(config.wrapperContained); }
// public static boolean isDebug(yarnwrap.world.gen.carver.CarverConfig config, ) { return net.minecraft.world.gen.carver.Carver.isDebug(config.wrapperContained); }
// public yarnwrap.block.BlockState getDebugState(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getDebugState(config.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState getDebugState(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.carver.Carver.getDebugState(config.wrapperContained,state.wrapperContained)); }
// public yarnwrap.block.BlockState getState(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.chunk.AquiferSampler sampler) { return new yarnwrap.block.BlockState(wrapperContained.getState(context.wrapperContained,config.wrapperContained,pos.wrapperContained,sampler.wrapperContained)); }
// public static yarnwrap.block.BlockState getState(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.chunk.AquiferSampler sampler, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.carver.Carver.getState(context.wrapperContained,config.wrapperContained,pos.wrapperContained,sampler.wrapperContained)); }
// public void method_39116(yarnwrap.world.chunk.Chunk state) { wrapperContained.method_39116(state.wrapperContained); }
// public static void method_39116(yarnwrap.world.chunk.Chunk state, ) { net.minecraft.world.gen.carver.Carver.method_39116(state.wrapperContained); }

}