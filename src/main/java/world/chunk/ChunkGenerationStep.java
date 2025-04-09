package yarnwrap.world.chunk;
public class ChunkGenerationStep { public net.minecraft.world.chunk.ChunkGenerationStep wrapperContained; public ChunkGenerationStep(net.minecraft.world.chunk.ChunkGenerationStep wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.Chunk finalizeGeneration(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.function.Finishable finishCallback) { return new yarnwrap.world.chunk.Chunk(wrapperContained.finalizeGeneration(chunk.wrapperContained,finishCallback.wrapperContained)); }
public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getAdditionalLevel(status.wrapperContained); }
// public java.util.concurrent.CompletableFuture run(yarnwrap.world.chunk.ChunkGenerationContext context,yarnwrap.util.collection.BoundedRegionArray chunk) { return wrapperContained.run(context.wrapperContained,chunk.wrapperContained); }

}