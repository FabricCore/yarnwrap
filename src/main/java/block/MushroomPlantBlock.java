package yarnwrap.block;
public class MushroomPlantBlock { public net.minecraft.block.MushroomPlantBlock wrapperContained; public MushroomPlantBlock(net.minecraft.block.MushroomPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.featureKey); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean trySpawningBigMushroom(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.trySpawningBigMushroom(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }

}