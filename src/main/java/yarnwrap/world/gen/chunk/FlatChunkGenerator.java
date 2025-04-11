package yarnwrap.world.gen.chunk;
public class FlatChunkGenerator { public net.minecraft.world.gen.chunk.FlatChunkGenerator wrapperContained; public FlatChunkGenerator(net.minecraft.world.gen.chunk.FlatChunkGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig value) { wrapperContained.config = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getConfig() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getConfig()); }

}