package yarnwrap.world.chunk;
public class ChunkProvider { public net.minecraft.world.chunk.ChunkProvider wrapperContained; public ChunkProvider(net.minecraft.world.chunk.ChunkProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.LightSourceView(wrapperContained.getChunk(chunkX,chunkZ)); }
public void onLightUpdate(yarnwrap.world.LightType type,yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.onLightUpdate(type.wrapperContained,pos.wrapperContained); }
public yarnwrap.world.BlockView getWorld() { return new yarnwrap.world.BlockView(wrapperContained.getWorld()); }

}