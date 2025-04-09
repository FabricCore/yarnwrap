package yarnwrap.world.chunk;
public class GenerationDependencies { public net.minecraft.world.chunk.GenerationDependencies wrapperContained; public GenerationDependencies(net.minecraft.world.chunk.GenerationDependencies wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList dependencies() { return wrapperContained.dependencies; }
// public int[] additionalLevelsByStatus() { return wrapperContained.additionalLevelsByStatus; }
public com.google.common.collect.ImmutableList getDependencies() { return wrapperContained.getDependencies(); }
public yarnwrap.world.chunk.ChunkStatus get(int index) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.get(index)); }
public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getAdditionalLevel(status.wrapperContained); }
public int size() { return wrapperContained.size(); }
public int getMaxLevel() { return wrapperContained.getMaxLevel(); }

}