package yarnwrap.world.chunk;
public class GenerationDependencies { public net.minecraft.world.chunk.GenerationDependencies wrapperContained; public GenerationDependencies(net.minecraft.world.chunk.GenerationDependencies wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList dependencies() { return wrapperContained.dependencies; }
// public void dependencies(com.google.common.collect.ImmutableList value) { wrapperContained.dependencies = value; }
// public static com.google.common.collect.ImmutableList dependencies() { return net.minecraft.world.chunk.GenerationDependencies.dependencies; }
// public static void dependencies(com.google.common.collect.ImmutableList value, ) { net.minecraft.world.chunk.GenerationDependencies.dependencies = value; }

// public int[] additionalLevelsByStatus() { return wrapperContained.additionalLevelsByStatus; }
// public void additionalLevelsByStatus(int[] value) { wrapperContained.additionalLevelsByStatus = value; }
// public static int[] additionalLevelsByStatus() { return net.minecraft.world.chunk.GenerationDependencies.additionalLevelsByStatus; }
// public static void additionalLevelsByStatus(int[] value, ) { net.minecraft.world.chunk.GenerationDependencies.additionalLevelsByStatus = value; }

public GenerationDependencies(com.google.common.collect.ImmutableList dependencies) { this.wrapperContained = new net.minecraft.world.chunk.GenerationDependencies(dependencies); }
public com.google.common.collect.ImmutableList getDependencies() { return wrapperContained.getDependencies(); }
// public static com.google.common.collect.ImmutableList getDependencies() { return net.minecraft.world.chunk.GenerationDependencies.getDependencies(); }
public yarnwrap.world.chunk.ChunkStatus get(int index) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.get(index)); }
// public static yarnwrap.world.chunk.ChunkStatus get(int index, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.GenerationDependencies.get(index)); }
public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getAdditionalLevel(status.wrapperContained); }
// public static int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status, ) { return net.minecraft.world.chunk.GenerationDependencies.getAdditionalLevel(status.wrapperContained); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.world.chunk.GenerationDependencies.size(); }
public int getMaxLevel() { return wrapperContained.getMaxLevel(); }
// public static int getMaxLevel() { return net.minecraft.world.chunk.GenerationDependencies.getMaxLevel(); }

}