package yarnwrap.util.profiling.jfr.event;
public class ChunkGenerationEvent { public net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent wrapperContained; public ChunkGenerationEvent(net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkGenerationEvent(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.registry.RegistryKey world,java.lang.String targetStatus) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent(chunkPos.wrapperContained,world.wrapperContained,targetStatus); }

}