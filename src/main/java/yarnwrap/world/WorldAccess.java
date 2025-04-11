package yarnwrap.world;
public class WorldAccess { public net.minecraft.world.WorldAccess wrapperContained; public WorldAccess(net.minecraft.world.WorldAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public void syncWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.syncWorldEvent(eventId,pos.wrapperContained,data); }
// public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d emitterPos,Object emitter) { wrapperContained.emitGameEvent(event.wrapperContained,emitterPos.wrapperContained,emitter); }
public void emitGameEvent(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.BlockPos pos) { wrapperContained.emitGameEvent(entity.wrapperContained,event.wrapperContained,pos.wrapperContained); }
public long getTickOrder() { return wrapperContained.getTickOrder(); }
public void scheduleBlockTick(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int delay) { wrapperContained.scheduleBlockTick(pos.wrapperContained,block.wrapperContained,delay); }
public void scheduleBlockTick(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int delay,yarnwrap.world.tick.TickPriority priority) { wrapperContained.scheduleBlockTick(pos.wrapperContained,block.wrapperContained,delay,priority.wrapperContained); }
public void scheduleFluidTick(yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,int delay) { wrapperContained.scheduleFluidTick(pos.wrapperContained,fluid.wrapperContained,delay); }
public void scheduleFluidTick(yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,int delay,yarnwrap.world.tick.TickPriority priority) { wrapperContained.scheduleFluidTick(pos.wrapperContained,fluid.wrapperContained,delay,priority.wrapperContained); }
// public yarnwrap.world.tick.OrderedTick createOrderedTick(yarnwrap.util.math.BlockPos pos,java.lang.Object type,int delay) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.createOrderedTick(pos.wrapperContained,type,delay)); }
// public yarnwrap.world.tick.OrderedTick createOrderedTick(yarnwrap.util.math.BlockPos pos,java.lang.Object type,int delay,yarnwrap.world.tick.TickPriority priority) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.createOrderedTick(pos.wrapperContained,type,delay,priority.wrapperContained)); }
public void replaceWithStateForNeighborUpdate(yarnwrap.util.math.Direction direction,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos neighborPos,int flags,int maxUpdateDepth) { wrapperContained.replaceWithStateForNeighborUpdate(direction.wrapperContained,neighborState.wrapperContained,pos.wrapperContained,neighborPos.wrapperContained,flags,maxUpdateDepth); }
public void emitGameEvent(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos) { wrapperContained.emitGameEvent(entity.wrapperContained,event.wrapperContained,pos.wrapperContained); }
// public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.BlockPos pos,Object emitter) { wrapperContained.emitGameEvent(event.wrapperContained,pos.wrapperContained,emitter); }
public void playSound(yarnwrap.entity.player.PlayerEntity except,yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category) { wrapperContained.playSound(except.wrapperContained,pos.wrapperContained,sound.wrapperContained,category.wrapperContained); }
// public void emitGameEvent(yarnwrap.registry.RegistryKey event,yarnwrap.util.math.BlockPos pos,Object emitter) { wrapperContained.emitGameEvent(event.wrapperContained,pos.wrapperContained,emitter); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,pos.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public yarnwrap.world.tick.QueryableTickScheduler getBlockTickScheduler() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.getBlockTickScheduler()); }
public yarnwrap.world.chunk.ChunkManager getChunkManager() { return new yarnwrap.world.chunk.ChunkManager(wrapperContained.getChunkManager()); }
public yarnwrap.world.WorldProperties getLevelProperties() { return new yarnwrap.world.WorldProperties(wrapperContained.getLevelProperties()); }
public yarnwrap.world.LocalDifficulty getLocalDifficulty(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.LocalDifficulty(wrapperContained.getLocalDifficulty(pos.wrapperContained)); }
public yarnwrap.world.tick.QueryableTickScheduler getFluidTickScheduler() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.getFluidTickScheduler()); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
public void updateNeighbors(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.updateNeighbors(pos.wrapperContained,block.wrapperContained); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
public void syncWorldEvent(yarnwrap.entity.player.PlayerEntity player,int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.syncWorldEvent(player.wrapperContained,eventId,pos.wrapperContained,data); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }

}