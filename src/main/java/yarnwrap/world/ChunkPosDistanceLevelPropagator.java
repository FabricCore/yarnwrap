package yarnwrap.world;
public class ChunkPosDistanceLevelPropagator { public net.minecraft.world.ChunkPosDistanceLevelPropagator wrapperContained; public ChunkPosDistanceLevelPropagator(net.minecraft.world.ChunkPosDistanceLevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

public void updateLevel(long chunkPos,int distance,boolean decrease) { wrapperContained.updateLevel(chunkPos,distance,decrease); }
// public int getInitialLevel(long id) { return wrapperContained.getInitialLevel(id); }

}