package yarnwrap.world.chunk;
public class WorldChunk { public net.minecraft.world.chunk.WorldChunk wrapperContained; public WorldChunk(net.minecraft.world.chunk.WorldChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object entityLoader() { return wrapperContained.entityLoader; }
// // public void entityLoader(Object value) { wrapperContained.entityLoader = value; }
// public boolean loadedToWorld() { return wrapperContained.loadedToWorld; }
// public void loadedToWorld(boolean value) { wrapperContained.loadedToWorld = value; }
// public java.util.function.Supplier levelTypeProvider() { return wrapperContained.levelTypeProvider; }
// public void levelTypeProvider(java.util.function.Supplier value) { wrapperContained.levelTypeProvider = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.chunk.BlockEntityTickInvoker EMPTY_BLOCK_ENTITY_TICKER() { return new yarnwrap.world.chunk.BlockEntityTickInvoker(wrapperContained.EMPTY_BLOCK_ENTITY_TICKER); }
// public void EMPTY_BLOCK_ENTITY_TICKER(yarnwrap.world.chunk.BlockEntityTickInvoker value) { wrapperContained.EMPTY_BLOCK_ENTITY_TICKER = value.wrapperContained; }
// public java.util.Map blockEntityTickers() { return wrapperContained.blockEntityTickers; }
// public void blockEntityTickers(java.util.Map value) { wrapperContained.blockEntityTickers = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap gameEventDispatchers() { return wrapperContained.gameEventDispatchers; }
// public void gameEventDispatchers(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.gameEventDispatchers = value; }
// public yarnwrap.world.tick.ChunkTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.ChunkTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public yarnwrap.world.tick.ChunkTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.ChunkTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
public WorldChunk(yarnwrap.world.World world,yarnwrap.util.math.ChunkPos pos) { this.wrapperContained = new net.minecraft.world.chunk.WorldChunk(world.wrapperContained,pos.wrapperContained); }
// public WorldChunk(yarnwrap.world.World world,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.UpgradeData upgradeData,yarnwrap.world.tick.ChunkTickScheduler blockTickScheduler,yarnwrap.world.tick.ChunkTickScheduler fluidTickScheduler,long inhabitedTime,net.minecraft.world.chunk.ChunkSection[] sectionArrayInitializer,Object entityLoader,yarnwrap.world.gen.chunk.BlendingData blendingData) { this.wrapperContained = new net.minecraft.world.chunk.WorldChunk(world.wrapperContained,pos.wrapperContained,upgradeData.wrapperContained,blockTickScheduler.wrapperContained,fluidTickScheduler.wrapperContained,inhabitedTime,sectionArrayInitializer,entityLoader,blendingData.wrapperContained); }
// public WorldChunk(yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.ProtoChunk protoChunk,Object entityLoader) { this.wrapperContained = new net.minecraft.world.chunk.WorldChunk(world.wrapperContained,protoChunk.wrapperContained,entityLoader); }
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
// public void method_31716(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType blockEntityType,yarnwrap.nbt.NbtCompound nbtx) { wrapperContained.method_31716(pos.wrapperContained,blockEntityType.wrapperContained,nbtx.wrapperContained); }
// public yarnwrap.world.chunk.BlockEntityTickInvoker wrapTicker(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.block.entity.BlockEntityTicker blockEntityTicker) { return new yarnwrap.world.chunk.BlockEntityTickInvoker(wrapperContained.wrapTicker(blockEntity.wrapperContained,blockEntityTicker.wrapperContained)); }
// public Object method_31719(yarnwrap.block.entity.BlockEntity pos,yarnwrap.block.entity.BlockEntityTicker ticker) { return wrapperContained.method_31719(pos.wrapperContained,ticker.wrapperContained); }
// public void updateTicker(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.updateTicker(blockEntity.wrapperContained); }
// public boolean canTickBlockEntity(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canTickBlockEntity(pos.wrapperContained); }
// public void removeBlockEntityTicker(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlockEntityTicker(pos.wrapperContained); }
// public yarnwrap.world.event.listener.GameEventDispatcher method_32917(yarnwrap.server.world.ServerWorld sectionCoord) { return new yarnwrap.world.event.listener.GameEventDispatcher(wrapperContained.method_32917(sectionCoord.wrapperContained)); }
// public void removeGameEventListener(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.server.world.ServerWorld world) { wrapperContained.removeGameEventListener(blockEntity.wrapperContained,world.wrapperContained); }
// public void updateGameEventListener(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.server.world.ServerWorld world) { wrapperContained.updateGameEventListener(blockEntity.wrapperContained,world.wrapperContained); }
// public void method_32920(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.method_32920(blockEntity.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public void method_38290(Object ticker) { wrapperContained.method_38290(ticker); }
public void addChunkTickSchedulers(yarnwrap.server.world.ServerWorld world) { wrapperContained.addChunkTickSchedulers(world.wrapperContained); }
public void removeChunkTickSchedulers(yarnwrap.server.world.ServerWorld world) { wrapperContained.removeChunkTickSchedulers(world.wrapperContained); }
public void loadBiomeFromPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.loadBiomeFromPacket(buf.wrapperContained); }
// public void removeGameEventDispatcher(int ySectionCoord) { wrapperContained.removeGameEventDispatcher(ySectionCoord); }

}