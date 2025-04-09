package yarnwrap.server.world;
public class ChunkLevels { public net.minecraft.server.world.ChunkLevels wrapperContained; public ChunkLevels(net.minecraft.server.world.ChunkLevels wrapperContained) { this.wrapperContained = wrapperContained; }

public int INACCESSIBLE() { return wrapperContained.INACCESSIBLE; }
// public int FULL() { return wrapperContained.FULL; }
// public int BLOCK_TICKING() { return wrapperContained.BLOCK_TICKING; }
// public int ENTITY_TICKING() { return wrapperContained.ENTITY_TICKING; }
public int FULL_GENERATION_REQUIRED_LEVEL() { return wrapperContained.FULL_GENERATION_REQUIRED_LEVEL; }
// public yarnwrap.world.chunk.ChunkGenerationStep FULL_GENERATION_STEP() { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.FULL_GENERATION_STEP); }
public yarnwrap.world.chunk.ChunkStatus getStatus(int level) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getStatus(level)); }
public int getLevelFromType(yarnwrap.server.world.ChunkLevelType type) { return wrapperContained.getLevelFromType(type.wrapperContained); }
public int getLevelFromStatus(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getLevelFromStatus(status.wrapperContained); }
public yarnwrap.server.world.ChunkLevelType getType(int level) { return new yarnwrap.server.world.ChunkLevelType(wrapperContained.getType(level)); }
public boolean shouldTickEntities(int level) { return wrapperContained.shouldTickEntities(level); }
public boolean shouldTickBlocks(int level) { return wrapperContained.shouldTickBlocks(level); }
public boolean isAccessible(int level) { return wrapperContained.isAccessible(level); }
public yarnwrap.world.chunk.ChunkStatus getStatusForAdditionalLevel(int additionalLevel,yarnwrap.world.chunk.ChunkStatus emptyStatus) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getStatusForAdditionalLevel(additionalLevel,emptyStatus.wrapperContained)); }
public yarnwrap.world.chunk.ChunkStatus getStatusForAdditionalLevel(int level) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getStatusForAdditionalLevel(level)); }

}