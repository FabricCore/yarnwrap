package yarnwrap.world.gen.carver;
public class Carver { public net.minecraft.world.gen.carver.Carver wrapperContained; public Carver(net.minecraft.world.gen.carver.Carver wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(wrapperContained.CAVE_AIR); }
// public void CAVE_AIR(yarnwrap.block.BlockState value) { wrapperContained.CAVE_AIR = value.wrapperContained; }
public yarnwrap.world.gen.carver.Carver RAVINE() { return new yarnwrap.world.gen.carver.Carver(wrapperContained.RAVINE); }
// public void RAVINE(yarnwrap.world.gen.carver.Carver value) { wrapperContained.RAVINE = value.wrapperContained; }
// public yarnwrap.fluid.FluidState LAVA() { return new yarnwrap.fluid.FluidState(wrapperContained.LAVA); }
// public void LAVA(yarnwrap.fluid.FluidState value) { wrapperContained.LAVA = value.wrapperContained; }
// public java.util.Set carvableFluids() { return wrapperContained.carvableFluids; }
// public void carvableFluids(java.util.Set value) { wrapperContained.carvableFluids = value; }
// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public yarnwrap.fluid.FluidState WATER() { return new yarnwrap.fluid.FluidState(wrapperContained.WATER); }
// public void WATER(yarnwrap.fluid.FluidState value) { wrapperContained.WATER = value.wrapperContained; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
public boolean carve(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.carver.CarvingMask mask) { return wrapperContained.carve(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,random.wrapperContained,aquiferSampler.wrapperContained,pos.wrapperContained,mask.wrapperContained); }
// public yarnwrap.world.gen.carver.Carver register(java.lang.String name,yarnwrap.world.gen.carver.Carver carver) { return new yarnwrap.world.gen.carver.Carver(wrapperContained.register(name,carver.wrapperContained)); }
public boolean shouldCarve(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.random.Random random) { return wrapperContained.shouldCarve(config.wrapperContained,random.wrapperContained); }
// public boolean canAlwaysCarveBlock(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state) { return wrapperContained.canAlwaysCarveBlock(config.wrapperContained,state.wrapperContained); }
public int getBranchFactor() { return wrapperContained.getBranchFactor(); }
// public boolean carveAtPoint(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.carver.CarvingMask mask,Object pos,Object tmp,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,org.apache.commons.lang3.mutable.MutableBoolean replacedGrassy) { return wrapperContained.carveAtPoint(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,mask.wrapperContained,pos,tmp,aquiferSampler.wrapperContained,replacedGrassy); }
public yarnwrap.world.gen.carver.ConfiguredCarver configure(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.world.gen.carver.ConfiguredCarver(wrapperContained.configure(config.wrapperContained)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public boolean canCarveBranch(yarnwrap.util.math.ChunkPos pos,double x,double z,int branchIndex,int branchCount,float baseWidth) { return wrapperContained.canCarveBranch(pos.wrapperContained,x,z,branchIndex,branchCount,baseWidth); }
// public boolean carveRegion(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,double x,double y,double z,double width,double height,yarnwrap.world.gen.carver.CarvingMask mask,Object skipPredicate) { return wrapperContained.carveRegion(context.wrapperContained,config.wrapperContained,chunk.wrapperContained,posToBiome,aquiferSampler.wrapperContained,x,y,z,width,height,mask.wrapperContained,skipPredicate); }
// public boolean isDebug(yarnwrap.world.gen.carver.CarverConfig config) { return wrapperContained.isDebug(config.wrapperContained); }
// public yarnwrap.block.BlockState getDebugState(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getDebugState(config.wrapperContained,state.wrapperContained)); }
// public yarnwrap.block.BlockState getState(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.chunk.AquiferSampler sampler) { return new yarnwrap.block.BlockState(wrapperContained.getState(context.wrapperContained,config.wrapperContained,pos.wrapperContained,sampler.wrapperContained)); }

}