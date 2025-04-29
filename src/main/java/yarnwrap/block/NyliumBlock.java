package yarnwrap.block;
public class NyliumBlock { public net.minecraft.block.NyliumBlock wrapperContained; public NyliumBlock(net.minecraft.block.NyliumBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.NyliumBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.NyliumBlock.CODEC = value; }

// public boolean stayAlive(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.stayAlive(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean stayAlive(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.NyliumBlock.stayAlive(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void method_46686(yarnwrap.server.world.ServerWorld entry) { wrapperContained.method_46686(entry.wrapperContained); }
// public static void method_46686(yarnwrap.server.world.ServerWorld entry, ) { net.minecraft.block.NyliumBlock.method_46686(entry.wrapperContained); }
// public void generate(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { wrapperContained.generate(registry.wrapperContained,key.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public static void generate(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.NyliumBlock.generate(registry.wrapperContained,key.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}