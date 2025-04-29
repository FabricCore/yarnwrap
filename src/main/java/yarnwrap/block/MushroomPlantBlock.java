package yarnwrap.block;
public class MushroomPlantBlock { public net.minecraft.block.MushroomPlantBlock wrapperContained; public MushroomPlantBlock(net.minecraft.block.MushroomPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.MushroomPlantBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.MushroomPlantBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.featureKey); }
// public void featureKey(yarnwrap.registry.RegistryKey value) { wrapperContained.featureKey = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.block.MushroomPlantBlock.featureKey); }
// public static void featureKey(yarnwrap.registry.RegistryKey value, ) { net.minecraft.block.MushroomPlantBlock.featureKey = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MushroomPlantBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MushroomPlantBlock.CODEC = value; }

// public MushroomPlantBlock(yarnwrap.registry.RegistryKey featureKey,Object settings) { this.wrapperContained = new net.minecraft.block.MushroomPlantBlock(featureKey.wrapperContained,settings); }
public boolean trySpawningBigMushroom(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.trySpawningBigMushroom(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public static boolean trySpawningBigMushroom(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.MushroomPlantBlock.trySpawningBigMushroom(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54034(Object instance) { return wrapperContained.method_54034(instance); }
// public static com.mojang.datafixers.kinds.App method_54034(Object instance, ) { return net.minecraft.block.MushroomPlantBlock.method_54034(instance); }
// public yarnwrap.registry.RegistryKey method_54035(yarnwrap.block.MushroomPlantBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54035(block.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_54035(yarnwrap.block.MushroomPlantBlock block, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.block.MushroomPlantBlock.method_54035(block.wrapperContained)); }

}