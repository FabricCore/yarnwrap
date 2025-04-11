package yarnwrap.block;
public class NyliumBlock { public net.minecraft.block.NyliumBlock wrapperContained; public NyliumBlock(net.minecraft.block.NyliumBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean stayAlive(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.stayAlive(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void generate(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { wrapperContained.generate(registry.wrapperContained,key.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}