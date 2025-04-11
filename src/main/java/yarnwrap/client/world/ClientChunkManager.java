package yarnwrap.client.world;
public class ClientChunkManager { public net.minecraft.client.world.ClientChunkManager wrapperContained; public ClientChunkManager(net.minecraft.client.world.ClientChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object chunks() { return wrapperContained.chunks; }
// // public void chunks(Object value) { wrapperContained.chunks = value; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.chunk.WorldChunk emptyChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.emptyChunk); }
// public void emptyChunk(yarnwrap.world.chunk.WorldChunk value) { wrapperContained.emptyChunk = value.wrapperContained; }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public ClientChunkManager(yarnwrap.client.world.ClientWorld world,int loadDistance) { this.wrapperContained = new net.minecraft.client.world.ClientChunkManager(world.wrapperContained,loadDistance); }
// public yarnwrap.world.chunk.WorldChunk loadChunkFromPacket(int x,int z,yarnwrap.network.PacketByteBuf buf,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.loadChunkFromPacket(x,z,buf.wrapperContained,nbt.wrapperContained)); }
public void updateLoadDistance(int loadDistance) { wrapperContained.updateLoadDistance(loadDistance); }
// public boolean positionEquals(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { return wrapperContained.positionEquals(chunk.wrapperContained,x,z); }
// public int getChunkMapRadius(int loadDistance) { return wrapperContained.getChunkMapRadius(loadDistance); }
public void setChunkMapCenter(int x,int z) { wrapperContained.setChunkMapCenter(x,z); }
public void unload(yarnwrap.util.math.ChunkPos pos) { wrapperContained.unload(pos.wrapperContained); }
public void onChunkBiomeData(int x,int z,yarnwrap.network.PacketByteBuf buf) { wrapperContained.onChunkBiomeData(x,z,buf.wrapperContained); }

}