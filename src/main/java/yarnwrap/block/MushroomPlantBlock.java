package yarnwrap.block;
public class MushroomPlantBlock { public net.minecraft.block.MushroomPlantBlock wrapperContained; public MushroomPlantBlock(net.minecraft.block.MushroomPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.featureKey); }
// public void featureKey(yarnwrap.registry.RegistryKey value) { wrapperContained.featureKey = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean trySpawningBigMushroom(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.trySpawningBigMushroom(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }

}