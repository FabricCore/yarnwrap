package yarnwrap.world.chunk;
public class ChunkGenerationSteps { public net.minecraft.world.chunk.ChunkGenerationSteps wrapperContained; public ChunkGenerationSteps(net.minecraft.world.chunk.ChunkGenerationSteps wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.ChunkGenerationSteps GENERATION() { return new yarnwrap.world.chunk.ChunkGenerationSteps(wrapperContained.GENERATION); }
public yarnwrap.world.chunk.ChunkGenerationSteps LOADING() { return new yarnwrap.world.chunk.ChunkGenerationSteps(wrapperContained.LOADING); }
public yarnwrap.world.chunk.ChunkGenerationStep get(yarnwrap.world.chunk.ChunkStatus status) { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.get(status.wrapperContained)); }

}