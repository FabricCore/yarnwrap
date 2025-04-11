package yarnwrap.world.chunk;
public class GenerationTask { public net.minecraft.world.chunk.GenerationTask wrapperContained; public GenerationTask(net.minecraft.world.chunk.GenerationTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture doWork(yarnwrap.world.chunk.ChunkGenerationContext context,yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.util.collection.BoundedRegionArray chunk) { return wrapperContained.doWork(context.wrapperContained,step.wrapperContained,chunk.wrapperContained); }

}