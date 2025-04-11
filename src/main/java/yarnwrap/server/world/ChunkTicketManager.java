package yarnwrap.server.world;
public class ChunkTicketManager { public net.minecraft.server.world.ChunkTicketManager wrapperContained; public ChunkTicketManager(net.minecraft.server.world.ChunkTicketManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public long age() { return wrapperContained.age; }
// public void age(long value) { wrapperContained.age = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap ticketsByPosition() { return wrapperContained.ticketsByPosition; }
// public void ticketsByPosition(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.ticketsByPosition = value; }
// public java.util.Set chunkHoldersWithPendingUpdates() { return wrapperContained.chunkHoldersWithPendingUpdates; }
// public void chunkHoldersWithPendingUpdates(java.util.Set value) { wrapperContained.chunkHoldersWithPendingUpdates = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int NEARBY_PLAYER_TICKET_LEVEL() { return wrapperContained.NEARBY_PLAYER_TICKET_LEVEL; }
// public void NEARBY_PLAYER_TICKET_LEVEL(int value) { wrapperContained.NEARBY_PLAYER_TICKET_LEVEL = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap playersByChunkPos() { return wrapperContained.playersByChunkPos; }
// public void playersByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.playersByChunkPos = value; }
// public Object distanceFromNearestPlayerTracker() { return wrapperContained.distanceFromNearestPlayerTracker; }
// // public void distanceFromNearestPlayerTracker(Object value) { wrapperContained.distanceFromNearestPlayerTracker = value; }
// public Object nearbyChunkTicketUpdater() { return wrapperContained.nearbyChunkTicketUpdater; }
// // public void nearbyChunkTicketUpdater(Object value) { wrapperContained.nearbyChunkTicketUpdater = value; }
// public yarnwrap.server.world.ChunkTaskPrioritySystem levelUpdateListener() { return new yarnwrap.server.world.ChunkTaskPrioritySystem(wrapperContained.levelUpdateListener); }
// public void levelUpdateListener(yarnwrap.server.world.ChunkTaskPrioritySystem value) { wrapperContained.levelUpdateListener = value.wrapperContained; }
// public yarnwrap.util.thread.MessageListener playerTicketThrottler() { return new yarnwrap.util.thread.MessageListener(wrapperContained.playerTicketThrottler); }
// public void playerTicketThrottler(yarnwrap.util.thread.MessageListener value) { wrapperContained.playerTicketThrottler = value.wrapperContained; }
// public yarnwrap.util.thread.MessageListener playerTicketThrottlerUnblocker() { return new yarnwrap.util.thread.MessageListener(wrapperContained.playerTicketThrottlerUnblocker); }
// public void playerTicketThrottlerUnblocker(yarnwrap.util.thread.MessageListener value) { wrapperContained.playerTicketThrottlerUnblocker = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.LongSet freshPlayerTicketPositions() { return wrapperContained.freshPlayerTicketPositions; }
// public void freshPlayerTicketPositions(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.freshPlayerTicketPositions = value; }
// public java.util.concurrent.Executor mainThreadExecutor() { return wrapperContained.mainThreadExecutor; }
// public void mainThreadExecutor(java.util.concurrent.Executor value) { wrapperContained.mainThreadExecutor = value; }
// public Object distanceFromTicketTracker() { return wrapperContained.distanceFromTicketTracker; }
// // public void distanceFromTicketTracker(Object value) { wrapperContained.distanceFromTicketTracker = value; }
// public yarnwrap.world.SimulationDistanceLevelPropagator simulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(wrapperContained.simulationDistanceTracker); }
// public void simulationDistanceTracker(yarnwrap.world.SimulationDistanceLevelPropagator value) { wrapperContained.simulationDistanceTracker = value.wrapperContained; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public ChunkTicketManager(java.util.concurrent.Executor workerExecutor,java.util.concurrent.Executor mainThreadExecutor) { this.wrapperContained = new net.minecraft.server.world.ChunkTicketManager(workerExecutor,mainThreadExecutor); }
// public boolean isUnloaded(long pos) { return wrapperContained.isUnloaded(pos); }
// public void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced) { wrapperContained.setChunkForced(pos.wrapperContained,forced); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public boolean method_14040(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_14040(ticket.wrapperContained); }
// public yarnwrap.util.collection.SortedArraySet method_14041(long pos) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.method_14041(pos)); }
// public void addTicket(long position,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.addTicket(position,ticket.wrapperContained); }
// public void purge() { wrapperContained.purge(); }
// public int getLevel(yarnwrap.util.collection.SortedArraySet tickets) { return wrapperContained.getLevel(tickets.wrapperContained); }
public void handleChunkEnter(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkEnter(pos.wrapperContained,player.wrapperContained); }
// public void setWatchDistance(int viewDistance) { wrapperContained.setWatchDistance(viewDistance); }
// public yarnwrap.util.collection.SortedArraySet getTicketSet(long position) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.getTicketSet(position)); }
public void handleChunkLeave(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkLeave(pos.wrapperContained,player.wrapperContained); }
public int getTickedChunkCount() { return wrapperContained.getTickedChunkCount(); }
// public yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.setLevel(pos,level,holder.wrapperContained)); }
// public void method_15891(yarnwrap.server.world.ServerChunkLoadingManager holder) { wrapperContained.method_15891(holder.wrapperContained); }
public boolean update(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { return wrapperContained.update(chunkLoadingManager.wrapperContained); }
public void addTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.addTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
public void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.addTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
public void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.removeTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
// public void method_17642(long optionalChunk) { wrapperContained.method_17642(optionalChunk); }
// public void removeTicket(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.removeTicket(pos,ticket.wrapperContained); }
// public it.unimi.dsi.fastutil.objects.ObjectSet method_17655(long sectionPos) { return wrapperContained.method_17655(sectionPos); }
public void removeTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.removeTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
public boolean shouldTick(long chunkPos) { return wrapperContained.shouldTick(chunkPos); }
// public java.lang.String getTicket(long pos) { return wrapperContained.getTicket(pos); }
public java.lang.String toDumpString() { return wrapperContained.toDumpString(); }
// public void dump(java.lang.String path) { wrapperContained.dump(path); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
public boolean shouldTickEntities(long chunkPos) { return wrapperContained.shouldTickEntities(chunkPos); }
// public yarnwrap.world.SimulationDistanceLevelPropagator getSimulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(wrapperContained.getSimulationDistanceTracker()); }
public boolean shouldTickBlocks(long chunkPos) { return wrapperContained.shouldTickBlocks(chunkPos); }
// public int getPlayerSimulationLevel() { return wrapperContained.getPlayerSimulationLevel(); }
public void removePersistentTickets() { wrapperContained.removePersistentTickets(); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public void method_60451(yarnwrap.server.world.ServerChunkLoadingManager holder) { wrapperContained.method_60451(holder.wrapperContained); }

}