package yarnwrap.client.world;
public class ClientChunkManager { public net.minecraft.client.world.ClientChunkManager wrapperContained; public ClientChunkManager(net.minecraft.client.world.ClientChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.WorldChunk emptyChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.emptyChunk); }
// public void emptyChunk(yarnwrap.world.chunk.WorldChunk value) { wrapperContained.emptyChunk = value.wrapperContained; }
// public static yarnwrap.world.chunk.WorldChunk emptyChunk() { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.client.world.ClientChunkManager.emptyChunk); }
// public static void emptyChunk(yarnwrap.world.chunk.WorldChunk value, ) { net.minecraft.client.world.ClientChunkManager.emptyChunk = value.wrapperContained; }

// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.client.world.ClientChunkManager.lightingProvider); }
// public static void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value, ) { net.minecraft.client.world.ClientChunkManager.lightingProvider = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.world.ClientChunkManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.world.ClientChunkManager.LOGGER = value; }

// public Object chunks() { return wrapperContained.chunks; }
// // public void chunks(Object value) { wrapperContained.chunks = value; }
// // public static Object chunks() { return net.minecraft.client.world.ClientChunkManager.chunks; }
// // public static void chunks(Object value, ) { net.minecraft.client.world.ClientChunkManager.chunks = value; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.world.ClientChunkManager.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.world.ClientChunkManager.world = value.wrapperContained; }

public ClientChunkManager(yarnwrap.client.world.ClientWorld world,int loadDistance) { this.wrapperContained = new net.minecraft.client.world.ClientChunkManager(world.wrapperContained,loadDistance); }
public void unload(yarnwrap.util.math.ChunkPos pos) { wrapperContained.unload(pos.wrapperContained); }
// public static void unload(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.client.world.ClientChunkManager.unload(pos.wrapperContained); }
// public yarnwrap.world.chunk.WorldChunk loadChunkFromPacket(int x,int z,yarnwrap.network.PacketByteBuf buf,java.util.Map heightmaps) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.loadChunkFromPacket(x,z,buf.wrapperContained,heightmaps)); }
// public static yarnwrap.world.chunk.WorldChunk loadChunkFromPacket(int x,int z,yarnwrap.network.PacketByteBuf buf,java.util.Map heightmaps, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.client.world.ClientChunkManager.loadChunkFromPacket(x,z,buf.wrapperContained,heightmaps)); }
public void updateLoadDistance(int loadDistance) { wrapperContained.updateLoadDistance(loadDistance); }
// public static void updateLoadDistance(int loadDistance, ) { net.minecraft.client.world.ClientChunkManager.updateLoadDistance(loadDistance); }
// public boolean positionEquals(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { return wrapperContained.positionEquals(chunk.wrapperContained,x,z); }
// public static boolean positionEquals(yarnwrap.world.chunk.WorldChunk chunk,int x,int z, ) { return net.minecraft.client.world.ClientChunkManager.positionEquals(chunk.wrapperContained,x,z); }
// public int getChunkMapRadius(int loadDistance) { return wrapperContained.getChunkMapRadius(loadDistance); }
// public static int getChunkMapRadius(int loadDistance, ) { return net.minecraft.client.world.ClientChunkManager.getChunkMapRadius(loadDistance); }
public void setChunkMapCenter(int x,int z) { wrapperContained.setChunkMapCenter(x,z); }
// public static void setChunkMapCenter(int x,int z, ) { net.minecraft.client.world.ClientChunkManager.setChunkMapCenter(x,z); }
public void onChunkBiomeData(int x,int z,yarnwrap.network.PacketByteBuf buf) { wrapperContained.onChunkBiomeData(x,z,buf.wrapperContained); }
// public static void onChunkBiomeData(int x,int z,yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.client.world.ClientChunkManager.onChunkBiomeData(x,z,buf.wrapperContained); }
public it.unimi.dsi.fastutil.longs.LongOpenHashSet getActiveSections() { return wrapperContained.getActiveSections(); }
// public static it.unimi.dsi.fastutil.longs.LongOpenHashSet getActiveSections() { return net.minecraft.client.world.ClientChunkManager.getActiveSections(); }

}