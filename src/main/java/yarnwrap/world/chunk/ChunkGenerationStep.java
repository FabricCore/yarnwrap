package yarnwrap.world.chunk;
public class ChunkGenerationStep { public net.minecraft.world.chunk.ChunkGenerationStep wrapperContained; public ChunkGenerationStep(net.minecraft.world.chunk.ChunkGenerationStep wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.Chunk method_60557(yarnwrap.util.function.Finishable generated) { return new yarnwrap.world.chunk.Chunk(wrapperContained.method_60557(generated.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk method_60557(yarnwrap.util.function.Finishable generated, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.ChunkGenerationStep.method_60557(generated.wrapperContained)); }
// public yarnwrap.world.chunk.Chunk finalizeGeneration(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.function.Finishable finishCallback) { return new yarnwrap.world.chunk.Chunk(wrapperContained.finalizeGeneration(chunk.wrapperContained,finishCallback.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk finalizeGeneration(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.function.Finishable finishCallback, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.ChunkGenerationStep.finalizeGeneration(chunk.wrapperContained,finishCallback.wrapperContained)); }
public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getAdditionalLevel(status.wrapperContained); }
// public static int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status, ) { return net.minecraft.world.chunk.ChunkGenerationStep.getAdditionalLevel(status.wrapperContained); }
// public java.util.concurrent.CompletableFuture run(yarnwrap.world.chunk.ChunkGenerationContext context,yarnwrap.util.collection.BoundedRegionArray chunk) { return wrapperContained.run(context.wrapperContained,chunk.wrapperContained); }
// public static java.util.concurrent.CompletableFuture run(yarnwrap.world.chunk.ChunkGenerationContext context,yarnwrap.util.collection.BoundedRegionArray chunk, ) { return net.minecraft.world.chunk.ChunkGenerationStep.run(context.wrapperContained,chunk.wrapperContained); }

}