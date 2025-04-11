package yarnwrap.world.gen.chunk;
public class ChunkGenerators { public net.minecraft.world.gen.chunk.ChunkGenerators wrapperContained; public ChunkGenerators(net.minecraft.world.gen.chunk.ChunkGenerators wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }

}