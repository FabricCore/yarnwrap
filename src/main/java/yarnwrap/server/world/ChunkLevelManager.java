package yarnwrap.server.world;
public class ChunkLevelManager { public net.minecraft.server.world.ChunkLevelManager wrapperContained; public ChunkLevelManager(net.minecraft.server.world.ChunkLevelManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set chunkHoldersWithPendingUpdates() { return wrapperContained.chunkHoldersWithPendingUpdates; }
// public void chunkHoldersWithPendingUpdates(java.util.Set value) { wrapperContained.chunkHoldersWithPendingUpdates = value; }
// public static java.util.Set chunkHoldersWithPendingUpdates() { return net.minecraft.server.world.ChunkLevelManager.chunkHoldersWithPendingUpdates; }
// public static void chunkHoldersWithPendingUpdates(java.util.Set value, ) { net.minecraft.server.world.ChunkLevelManager.chunkHoldersWithPendingUpdates = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ChunkLevelManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ChunkLevelManager.LOGGER = value; }

// public int NEARBY_PLAYER_TICKET_LEVEL() { return wrapperContained.NEARBY_PLAYER_TICKET_LEVEL; }
// public void NEARBY_PLAYER_TICKET_LEVEL(int value) { wrapperContained.NEARBY_PLAYER_TICKET_LEVEL = value; }
// public static int NEARBY_PLAYER_TICKET_LEVEL() { return net.minecraft.server.world.ChunkLevelManager.NEARBY_PLAYER_TICKET_LEVEL; }
// public static void NEARBY_PLAYER_TICKET_LEVEL(int value, ) { net.minecraft.server.world.ChunkLevelManager.NEARBY_PLAYER_TICKET_LEVEL = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap playersByChunkPos() { return wrapperContained.playersByChunkPos; }
// public void playersByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.playersByChunkPos = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap playersByChunkPos() { return net.minecraft.server.world.ChunkLevelManager.playersByChunkPos; }
// public static void playersByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.server.world.ChunkLevelManager.playersByChunkPos = value; }

// public Object distanceFromNearestPlayerTracker() { return wrapperContained.distanceFromNearestPlayerTracker; }
// // public void distanceFromNearestPlayerTracker(Object value) { wrapperContained.distanceFromNearestPlayerTracker = value; }
// // public static Object distanceFromNearestPlayerTracker() { return net.minecraft.server.world.ChunkLevelManager.distanceFromNearestPlayerTracker; }
// // public static void distanceFromNearestPlayerTracker(Object value, ) { net.minecraft.server.world.ChunkLevelManager.distanceFromNearestPlayerTracker = value; }

// public Object nearbyChunkTicketUpdater() { return wrapperContained.nearbyChunkTicketUpdater; }
// // public void nearbyChunkTicketUpdater(Object value) { wrapperContained.nearbyChunkTicketUpdater = value; }
// // public static Object nearbyChunkTicketUpdater() { return net.minecraft.server.world.ChunkLevelManager.nearbyChunkTicketUpdater; }
// // public static void nearbyChunkTicketUpdater(Object value, ) { net.minecraft.server.world.ChunkLevelManager.nearbyChunkTicketUpdater = value; }

// public it.unimi.dsi.fastutil.longs.LongSet freshPlayerTicketPositions() { return wrapperContained.freshPlayerTicketPositions; }
// public void freshPlayerTicketPositions(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.freshPlayerTicketPositions = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet freshPlayerTicketPositions() { return net.minecraft.server.world.ChunkLevelManager.freshPlayerTicketPositions; }
// public static void freshPlayerTicketPositions(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ChunkLevelManager.freshPlayerTicketPositions = value; }

// public java.util.concurrent.Executor mainThreadExecutor() { return wrapperContained.mainThreadExecutor; }
// public void mainThreadExecutor(java.util.concurrent.Executor value) { wrapperContained.mainThreadExecutor = value; }
// public static java.util.concurrent.Executor mainThreadExecutor() { return net.minecraft.server.world.ChunkLevelManager.mainThreadExecutor; }
// public static void mainThreadExecutor(java.util.concurrent.Executor value, ) { net.minecraft.server.world.ChunkLevelManager.mainThreadExecutor = value; }

// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.server.world.ChunkLevelManager.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.server.world.ChunkLevelManager.simulationDistance = value; }

// public yarnwrap.server.world.ThrottledChunkTaskScheduler scheduler() { return new yarnwrap.server.world.ThrottledChunkTaskScheduler(wrapperContained.scheduler); }
// public void scheduler(yarnwrap.server.world.ThrottledChunkTaskScheduler value) { wrapperContained.scheduler = value.wrapperContained; }
// public static yarnwrap.server.world.ThrottledChunkTaskScheduler scheduler() { return new yarnwrap.server.world.ThrottledChunkTaskScheduler(net.minecraft.server.world.ChunkLevelManager.scheduler); }
// public static void scheduler(yarnwrap.server.world.ThrottledChunkTaskScheduler value, ) { net.minecraft.server.world.ChunkLevelManager.scheduler = value.wrapperContained; }

// public yarnwrap.server.world.TicketDistanceLevelPropagator ticketDistanceLevelPropagator() { return new yarnwrap.server.world.TicketDistanceLevelPropagator(wrapperContained.ticketDistanceLevelPropagator); }
// public void ticketDistanceLevelPropagator(yarnwrap.server.world.TicketDistanceLevelPropagator value) { wrapperContained.ticketDistanceLevelPropagator = value.wrapperContained; }
// public static yarnwrap.server.world.TicketDistanceLevelPropagator ticketDistanceLevelPropagator() { return new yarnwrap.server.world.TicketDistanceLevelPropagator(net.minecraft.server.world.ChunkLevelManager.ticketDistanceLevelPropagator); }
// public static void ticketDistanceLevelPropagator(yarnwrap.server.world.TicketDistanceLevelPropagator value, ) { net.minecraft.server.world.ChunkLevelManager.ticketDistanceLevelPropagator = value.wrapperContained; }

// public yarnwrap.server.world.SimulationDistanceLevelPropagator simulationDistanceLevelPropagator() { return new yarnwrap.server.world.SimulationDistanceLevelPropagator(wrapperContained.simulationDistanceLevelPropagator); }
// public void simulationDistanceLevelPropagator(yarnwrap.server.world.SimulationDistanceLevelPropagator value) { wrapperContained.simulationDistanceLevelPropagator = value.wrapperContained; }
// public static yarnwrap.server.world.SimulationDistanceLevelPropagator simulationDistanceLevelPropagator() { return new yarnwrap.server.world.SimulationDistanceLevelPropagator(net.minecraft.server.world.ChunkLevelManager.simulationDistanceLevelPropagator); }
// public static void simulationDistanceLevelPropagator(yarnwrap.server.world.SimulationDistanceLevelPropagator value, ) { net.minecraft.server.world.ChunkLevelManager.simulationDistanceLevelPropagator = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.ticketManager); }
// public void ticketManager(yarnwrap.server.world.ChunkTicketManager value) { wrapperContained.ticketManager = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(net.minecraft.server.world.ChunkLevelManager.ticketManager); }
// public static void ticketManager(yarnwrap.server.world.ChunkTicketManager value, ) { net.minecraft.server.world.ChunkLevelManager.ticketManager = value.wrapperContained; }

// public ChunkLevelManager(yarnwrap.server.world.ChunkTicketManager ticketManager,java.util.concurrent.Executor executor,java.util.concurrent.Executor mainThreadExecutor) { this.wrapperContained = new net.minecraft.server.world.ChunkLevelManager(ticketManager.wrapperContained,executor,mainThreadExecutor); }
// public boolean isUnloaded(long pos) { return wrapperContained.isUnloaded(pos); }
// public static boolean isUnloaded(long pos, ) { return net.minecraft.server.world.ChunkLevelManager.isUnloaded(pos); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public static yarnwrap.server.world.ChunkHolder getChunkHolder(long pos, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ChunkLevelManager.getChunkHolder(pos)); }
// public boolean method_14040(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_14040(ticket.wrapperContained); }
// public static boolean method_14040(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkLevelManager.method_14040(ticket.wrapperContained); }
public void handleChunkEnter(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkEnter(pos.wrapperContained,player.wrapperContained); }
// public static void handleChunkEnter(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ChunkLevelManager.handleChunkEnter(pos.wrapperContained,player.wrapperContained); }
// public void setWatchDistance(int viewDistance) { wrapperContained.setWatchDistance(viewDistance); }
// public static void setWatchDistance(int viewDistance, ) { net.minecraft.server.world.ChunkLevelManager.setWatchDistance(viewDistance); }
public void handleChunkLeave(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkLeave(pos.wrapperContained,player.wrapperContained); }
// public static void handleChunkLeave(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ChunkLevelManager.handleChunkLeave(pos.wrapperContained,player.wrapperContained); }
public int getTickedChunkCount() { return wrapperContained.getTickedChunkCount(); }
// public static int getTickedChunkCount() { return net.minecraft.server.world.ChunkLevelManager.getTickedChunkCount(); }
// public yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.setLevel(pos,level,holder.wrapperContained)); }
// public static yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ChunkLevelManager.setLevel(pos,level,holder.wrapperContained)); }
public boolean update(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { return wrapperContained.update(chunkLoadingManager.wrapperContained); }
// public static boolean update(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager, ) { return net.minecraft.server.world.ChunkLevelManager.update(chunkLoadingManager.wrapperContained); }
// public void method_17642(long optionalChunk) { wrapperContained.method_17642(optionalChunk); }
// public static void method_17642(long optionalChunk, ) { net.minecraft.server.world.ChunkLevelManager.method_17642(optionalChunk); }
// public it.unimi.dsi.fastutil.objects.ObjectSet method_17655(long sectionPos) { return wrapperContained.method_17655(sectionPos); }
// public static it.unimi.dsi.fastutil.objects.ObjectSet method_17655(long sectionPos, ) { return net.minecraft.server.world.ChunkLevelManager.method_17655(sectionPos); }
public yarnwrap.util.TriState shouldTick(long chunkPos) { return new yarnwrap.util.TriState(wrapperContained.shouldTick(chunkPos)); }
// public static yarnwrap.util.TriState shouldTick(long chunkPos, ) { return new yarnwrap.util.TriState(net.minecraft.server.world.ChunkLevelManager.shouldTick(chunkPos)); }
public java.lang.String toDumpString() { return wrapperContained.toDumpString(); }
// public static java.lang.String toDumpString() { return net.minecraft.server.world.ChunkLevelManager.toDumpString(); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
// public static void setSimulationDistance(int simulationDistance, ) { net.minecraft.server.world.ChunkLevelManager.setSimulationDistance(simulationDistance); }
public boolean shouldTickEntities(long chunkPos) { return wrapperContained.shouldTickEntities(chunkPos); }
// public static boolean shouldTickEntities(long chunkPos, ) { return net.minecraft.server.world.ChunkLevelManager.shouldTickEntities(chunkPos); }
public boolean shouldTickBlocks(long chunkPos) { return wrapperContained.shouldTickBlocks(chunkPos); }
// public static boolean shouldTickBlocks(long chunkPos, ) { return net.minecraft.server.world.ChunkLevelManager.shouldTickBlocks(chunkPos); }
// public int getPlayerSimulationLevel() { return wrapperContained.getPlayerSimulationLevel(); }
// public static int getPlayerSimulationLevel() { return net.minecraft.server.world.ChunkLevelManager.getPlayerSimulationLevel(); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public static boolean shouldDelayShutdown() { return net.minecraft.server.world.ChunkLevelManager.shouldDelayShutdown(); }
public it.unimi.dsi.fastutil.longs.LongIterator iterateChunkPosToTick() { return wrapperContained.iterateChunkPosToTick(); }
// public static it.unimi.dsi.fastutil.longs.LongIterator iterateChunkPosToTick() { return net.minecraft.server.world.ChunkLevelManager.iterateChunkPosToTick(); }
public int getLevel(long pos,boolean forSimulation) { return wrapperContained.getLevel(pos,forSimulation); }
// public static int getLevel(long pos,boolean forSimulation, ) { return net.minecraft.server.world.ChunkLevelManager.getLevel(pos,forSimulation); }
public void forEachBlockTickingChunk(it.unimi.dsi.fastutil.longs.LongConsumer chunkPosConsumer) { wrapperContained.forEachBlockTickingChunk(chunkPosConsumer); }
// public static void forEachBlockTickingChunk(it.unimi.dsi.fastutil.longs.LongConsumer chunkPosConsumer, ) { net.minecraft.server.world.ChunkLevelManager.forEachBlockTickingChunk(chunkPosConsumer); }

}