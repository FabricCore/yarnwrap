package yarnwrap.server.world;
public class ChunkLevels { public net.minecraft.server.world.ChunkLevels wrapperContained; public ChunkLevels(net.minecraft.server.world.ChunkLevels wrapperContained) { this.wrapperContained = wrapperContained; }

public int INACCESSIBLE() { return wrapperContained.INACCESSIBLE; }
// public void INACCESSIBLE(int value) { wrapperContained.INACCESSIBLE = value; }
// public int FULL() { return wrapperContained.FULL; }
// public void FULL(int value) { wrapperContained.FULL = value; }
// public int BLOCK_TICKING() { return wrapperContained.BLOCK_TICKING; }
// public void BLOCK_TICKING(int value) { wrapperContained.BLOCK_TICKING = value; }
// public int ENTITY_TICKING() { return wrapperContained.ENTITY_TICKING; }
// public void ENTITY_TICKING(int value) { wrapperContained.ENTITY_TICKING = value; }
public int FULL_GENERATION_REQUIRED_LEVEL() { return wrapperContained.FULL_GENERATION_REQUIRED_LEVEL; }
// public void FULL_GENERATION_REQUIRED_LEVEL(int value) { wrapperContained.FULL_GENERATION_REQUIRED_LEVEL = value; }
// public yarnwrap.world.chunk.ChunkGenerationStep FULL_GENERATION_STEP() { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.FULL_GENERATION_STEP); }
// public void FULL_GENERATION_STEP(yarnwrap.world.chunk.ChunkGenerationStep value) { wrapperContained.FULL_GENERATION_STEP = value.wrapperContained; }
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