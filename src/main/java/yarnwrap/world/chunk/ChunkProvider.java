package yarnwrap.world.chunk;
public class ChunkProvider { public net.minecraft.world.chunk.ChunkProvider wrapperContained; public ChunkProvider(net.minecraft.world.chunk.ChunkProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.LightSourceView(wrapperContained.getChunk(chunkX,chunkZ)); }
// public static yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ, ) { return new yarnwrap.world.chunk.light.LightSourceView(net.minecraft.world.chunk.ChunkProvider.getChunk(chunkX,chunkZ)); }
public void onLightUpdate(yarnwrap.world.LightType type,yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.onLightUpdate(type.wrapperContained,pos.wrapperContained); }
// public static void onLightUpdate(yarnwrap.world.LightType type,yarnwrap.util.math.ChunkSectionPos pos, ) { net.minecraft.world.chunk.ChunkProvider.onLightUpdate(type.wrapperContained,pos.wrapperContained); }
public yarnwrap.world.BlockView getWorld() { return new yarnwrap.world.BlockView(wrapperContained.getWorld()); }
// public static yarnwrap.world.BlockView getWorld() { return new yarnwrap.world.BlockView(net.minecraft.world.chunk.ChunkProvider.getWorld()); }

}