package yarnwrap.client.world;
public class ClientChunkManager { public net.minecraft.client.world.ClientChunkManager wrapperContained; public ClientChunkManager(net.minecraft.client.world.ClientChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object chunks() { return wrapperContained.chunks; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.world.chunk.WorldChunk emptyChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.emptyChunk); }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.chunk.WorldChunk loadChunkFromPacket(int x,int z,yarnwrap.network.PacketByteBuf buf,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.loadChunkFromPacket(x,z,buf.wrapperContained,nbt.wrapperContained)); }
public void updateLoadDistance(int loadDistance) { wrapperContained.updateLoadDistance(loadDistance); }
// public boolean positionEquals(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { return wrapperContained.positionEquals(chunk.wrapperContained,x,z); }
// public int getChunkMapRadius(int loadDistance) { return wrapperContained.getChunkMapRadius(loadDistance); }
public void setChunkMapCenter(int x,int z) { wrapperContained.setChunkMapCenter(x,z); }
public void unload(yarnwrap.util.math.ChunkPos pos) { wrapperContained.unload(pos.wrapperContained); }
public void onChunkBiomeData(int x,int z,yarnwrap.network.PacketByteBuf buf) { wrapperContained.onChunkBiomeData(x,z,buf.wrapperContained); }

}