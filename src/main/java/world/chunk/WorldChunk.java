package yarnwrap.world.chunk;
public class WorldChunk { public net.minecraft.world.chunk.WorldChunk wrapperContained; public WorldChunk(net.minecraft.world.chunk.WorldChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object entityLoader() { return wrapperContained.entityLoader; }
// public boolean loadedToWorld() { return wrapperContained.loadedToWorld; }
// public java.util.function.Supplier levelTypeProvider() { return wrapperContained.levelTypeProvider; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public yarnwrap.world.chunk.BlockEntityTickInvoker EMPTY_BLOCK_ENTITY_TICKER() { return new yarnwrap.world.chunk.BlockEntityTickInvoker(wrapperContained.EMPTY_BLOCK_ENTITY_TICKER); }
// public java.util.Map blockEntityTickers() { return wrapperContained.blockEntityTickers; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap gameEventDispatchers() { return wrapperContained.gameEventDispatchers; }
// public yarnwrap.world.tick.ChunkTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.blockTickScheduler); }
// public yarnwrap.world.tick.ChunkTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.fluidTickScheduler); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public yarnwrap.block.entity.BlockEntity getBlockEntity(yarnwrap.util.math.BlockPos pos,Object creationType) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.getBlockEntity(pos.wrapperContained,creationType)); }
// public yarnwrap.block.entity.BlockEntity loadBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.loadBlockEntity(pos.wrapperContained,nbt.wrapperContained)); }
public void loadEntities() { wrapperContained.loadEntities(); }
public void setLevelTypeProvider(java.util.function.Supplier levelTypeProvider) { wrapperContained.setLevelTypeProvider(levelTypeProvider); }
// public yarnwrap.block.entity.BlockEntity createBlockEntity(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.createBlockEntity(pos.wrapperContained)); }
public java.util.Map getBlockEntities() { return wrapperContained.getBlockEntities(); }
public void addBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.addBlockEntity(blockEntity.wrapperContained); }
public void runPostProcessing() { wrapperContained.runPostProcessing(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public void loadFromPacket(yarnwrap.network.PacketByteBuf buf,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.loadFromPacket(buf.wrapperContained,nbt.wrapperContained); }
public yarnwrap.server.world.ChunkLevelType getLevelType() { return new yarnwrap.server.world.ChunkLevelType(wrapperContained.getLevelType()); }
public void setLoadedToWorld(boolean loadedToWorld) { wrapperContained.setLoadedToWorld(loadedToWorld); }
public yarnwrap.fluid.FluidState getFluidState(int x,int y,int z) { return new yarnwrap.fluid.FluidState(wrapperContained.getFluidState(x,y,z)); }
public void disableTickSchedulers(long time) { wrapperContained.disableTickSchedulers(time); }
public void updateAllBlockEntities() { wrapperContained.updateAllBlockEntities(); }
// public boolean canTickBlockEntities() { return wrapperContained.canTickBlockEntities(); }
// public yarnwrap.world.chunk.BlockEntityTickInvoker wrapTicker(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.block.entity.BlockEntityTicker blockEntityTicker) { return new yarnwrap.world.chunk.BlockEntityTickInvoker(wrapperContained.wrapTicker(blockEntity.wrapperContained,blockEntityTicker.wrapperContained)); }
// public void updateTicker(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.updateTicker(blockEntity.wrapperContained); }
// public boolean canTickBlockEntity(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canTickBlockEntity(pos.wrapperContained); }
// public void removeBlockEntityTicker(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlockEntityTicker(pos.wrapperContained); }
// public void removeGameEventListener(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.server.world.ServerWorld world) { wrapperContained.removeGameEventListener(blockEntity.wrapperContained,world.wrapperContained); }
// public void updateGameEventListener(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.server.world.ServerWorld world) { wrapperContained.updateGameEventListener(blockEntity.wrapperContained,world.wrapperContained); }
public void clear() { wrapperContained.clear(); }
public void addChunkTickSchedulers(yarnwrap.server.world.ServerWorld world) { wrapperContained.addChunkTickSchedulers(world.wrapperContained); }
public void removeChunkTickSchedulers(yarnwrap.server.world.ServerWorld world) { wrapperContained.removeChunkTickSchedulers(world.wrapperContained); }
public void loadBiomeFromPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.loadBiomeFromPacket(buf.wrapperContained); }
// public void removeGameEventDispatcher(int ySectionCoord) { wrapperContained.removeGameEventDispatcher(ySectionCoord); }

}