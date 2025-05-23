package yarnwrap.util.profiling.jfr.event;
public class StructureGenerationEvent { public net.minecraft.util.profiling.jfr.event.StructureGenerationEvent wrapperContained; public StructureGenerationEvent(net.minecraft.util.profiling.jfr.event.StructureGenerationEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public StructureGenerationEvent(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.registry.entry.RegistryEntry structure,yarnwrap.registry.RegistryKey dimension) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.StructureGenerationEvent(chunkPos.wrapperContained,structure.wrapperContained,dimension.wrapperContained); }

}