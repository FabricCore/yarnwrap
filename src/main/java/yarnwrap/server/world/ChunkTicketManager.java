package yarnwrap.server.world;
public class ChunkTicketManager { public net.minecraft.server.world.ChunkTicketManager wrapperContained; public ChunkTicketManager(net.minecraft.server.world.ChunkTicketManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public long age() { return wrapperContained.age; }
// public void age(long value) { wrapperContained.age = value; }
// public static long age() { return net.minecraft.server.world.ChunkTicketManager.age; }
// public static void age(long value, ) { net.minecraft.server.world.ChunkTicketManager.age = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap ticketsByPosition() { return wrapperContained.ticketsByPosition; }
// public void ticketsByPosition(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.ticketsByPosition = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap ticketsByPosition() { return net.minecraft.server.world.ChunkTicketManager.ticketsByPosition; }
// public static void ticketsByPosition(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.server.world.ChunkTicketManager.ticketsByPosition = value; }

// public java.util.Set chunkHoldersWithPendingUpdates() { return wrapperContained.chunkHoldersWithPendingUpdates; }
// public void chunkHoldersWithPendingUpdates(java.util.Set value) { wrapperContained.chunkHoldersWithPendingUpdates = value; }
// public static java.util.Set chunkHoldersWithPendingUpdates() { return net.minecraft.server.world.ChunkTicketManager.chunkHoldersWithPendingUpdates; }
// public static void chunkHoldersWithPendingUpdates(java.util.Set value, ) { net.minecraft.server.world.ChunkTicketManager.chunkHoldersWithPendingUpdates = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ChunkTicketManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ChunkTicketManager.LOGGER = value; }

// public int NEARBY_PLAYER_TICKET_LEVEL() { return wrapperContained.NEARBY_PLAYER_TICKET_LEVEL; }
// public void NEARBY_PLAYER_TICKET_LEVEL(int value) { wrapperContained.NEARBY_PLAYER_TICKET_LEVEL = value; }
// public static int NEARBY_PLAYER_TICKET_LEVEL() { return net.minecraft.server.world.ChunkTicketManager.NEARBY_PLAYER_TICKET_LEVEL; }
// public static void NEARBY_PLAYER_TICKET_LEVEL(int value, ) { net.minecraft.server.world.ChunkTicketManager.NEARBY_PLAYER_TICKET_LEVEL = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap playersByChunkPos() { return wrapperContained.playersByChunkPos; }
// public void playersByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.playersByChunkPos = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap playersByChunkPos() { return net.minecraft.server.world.ChunkTicketManager.playersByChunkPos; }
// public static void playersByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.server.world.ChunkTicketManager.playersByChunkPos = value; }

// public Object distanceFromNearestPlayerTracker() { return wrapperContained.distanceFromNearestPlayerTracker; }
// // public void distanceFromNearestPlayerTracker(Object value) { wrapperContained.distanceFromNearestPlayerTracker = value; }
// // public static Object distanceFromNearestPlayerTracker() { return net.minecraft.server.world.ChunkTicketManager.distanceFromNearestPlayerTracker; }
// // public static void distanceFromNearestPlayerTracker(Object value, ) { net.minecraft.server.world.ChunkTicketManager.distanceFromNearestPlayerTracker = value; }

// public Object nearbyChunkTicketUpdater() { return wrapperContained.nearbyChunkTicketUpdater; }
// // public void nearbyChunkTicketUpdater(Object value) { wrapperContained.nearbyChunkTicketUpdater = value; }
// // public static Object nearbyChunkTicketUpdater() { return net.minecraft.server.world.ChunkTicketManager.nearbyChunkTicketUpdater; }
// // public static void nearbyChunkTicketUpdater(Object value, ) { net.minecraft.server.world.ChunkTicketManager.nearbyChunkTicketUpdater = value; }

// public yarnwrap.server.world.ChunkTaskPrioritySystem levelUpdateListener() { return new yarnwrap.server.world.ChunkTaskPrioritySystem(wrapperContained.levelUpdateListener); }
// public void levelUpdateListener(yarnwrap.server.world.ChunkTaskPrioritySystem value) { wrapperContained.levelUpdateListener = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTaskPrioritySystem levelUpdateListener() { return new yarnwrap.server.world.ChunkTaskPrioritySystem(net.minecraft.server.world.ChunkTicketManager.levelUpdateListener); }
// public static void levelUpdateListener(yarnwrap.server.world.ChunkTaskPrioritySystem value, ) { net.minecraft.server.world.ChunkTicketManager.levelUpdateListener = value.wrapperContained; }

// public yarnwrap.util.thread.MessageListener playerTicketThrottler() { return new yarnwrap.util.thread.MessageListener(wrapperContained.playerTicketThrottler); }
// public void playerTicketThrottler(yarnwrap.util.thread.MessageListener value) { wrapperContained.playerTicketThrottler = value.wrapperContained; }
// public static yarnwrap.util.thread.MessageListener playerTicketThrottler() { return new yarnwrap.util.thread.MessageListener(net.minecraft.server.world.ChunkTicketManager.playerTicketThrottler); }
// public static void playerTicketThrottler(yarnwrap.util.thread.MessageListener value, ) { net.minecraft.server.world.ChunkTicketManager.playerTicketThrottler = value.wrapperContained; }

// public yarnwrap.util.thread.MessageListener playerTicketThrottlerUnblocker() { return new yarnwrap.util.thread.MessageListener(wrapperContained.playerTicketThrottlerUnblocker); }
// public void playerTicketThrottlerUnblocker(yarnwrap.util.thread.MessageListener value) { wrapperContained.playerTicketThrottlerUnblocker = value.wrapperContained; }
// public static yarnwrap.util.thread.MessageListener playerTicketThrottlerUnblocker() { return new yarnwrap.util.thread.MessageListener(net.minecraft.server.world.ChunkTicketManager.playerTicketThrottlerUnblocker); }
// public static void playerTicketThrottlerUnblocker(yarnwrap.util.thread.MessageListener value, ) { net.minecraft.server.world.ChunkTicketManager.playerTicketThrottlerUnblocker = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet freshPlayerTicketPositions() { return wrapperContained.freshPlayerTicketPositions; }
// public void freshPlayerTicketPositions(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.freshPlayerTicketPositions = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet freshPlayerTicketPositions() { return net.minecraft.server.world.ChunkTicketManager.freshPlayerTicketPositions; }
// public static void freshPlayerTicketPositions(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ChunkTicketManager.freshPlayerTicketPositions = value; }

// public java.util.concurrent.Executor mainThreadExecutor() { return wrapperContained.mainThreadExecutor; }
// public void mainThreadExecutor(java.util.concurrent.Executor value) { wrapperContained.mainThreadExecutor = value; }
// public static java.util.concurrent.Executor mainThreadExecutor() { return net.minecraft.server.world.ChunkTicketManager.mainThreadExecutor; }
// public static void mainThreadExecutor(java.util.concurrent.Executor value, ) { net.minecraft.server.world.ChunkTicketManager.mainThreadExecutor = value; }

// public Object distanceFromTicketTracker() { return wrapperContained.distanceFromTicketTracker; }
// // public void distanceFromTicketTracker(Object value) { wrapperContained.distanceFromTicketTracker = value; }
// // public static Object distanceFromTicketTracker() { return net.minecraft.server.world.ChunkTicketManager.distanceFromTicketTracker; }
// // public static void distanceFromTicketTracker(Object value, ) { net.minecraft.server.world.ChunkTicketManager.distanceFromTicketTracker = value; }

// public yarnwrap.world.SimulationDistanceLevelPropagator simulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(wrapperContained.simulationDistanceTracker); }
// public void simulationDistanceTracker(yarnwrap.world.SimulationDistanceLevelPropagator value) { wrapperContained.simulationDistanceTracker = value.wrapperContained; }
// public static yarnwrap.world.SimulationDistanceLevelPropagator simulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(net.minecraft.server.world.ChunkTicketManager.simulationDistanceTracker); }
// public static void simulationDistanceTracker(yarnwrap.world.SimulationDistanceLevelPropagator value, ) { net.minecraft.server.world.ChunkTicketManager.simulationDistanceTracker = value.wrapperContained; }

// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.server.world.ChunkTicketManager.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.server.world.ChunkTicketManager.simulationDistance = value; }

// public ChunkTicketManager(java.util.concurrent.Executor workerExecutor,java.util.concurrent.Executor mainThreadExecutor) { this.wrapperContained = new net.minecraft.server.world.ChunkTicketManager(workerExecutor,mainThreadExecutor); }
// public boolean isUnloaded(long pos) { return wrapperContained.isUnloaded(pos); }
// public static boolean isUnloaded(long pos, ) { return net.minecraft.server.world.ChunkTicketManager.isUnloaded(pos); }
// public void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced) { wrapperContained.setChunkForced(pos.wrapperContained,forced); }
// public static void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced, ) { net.minecraft.server.world.ChunkTicketManager.setChunkForced(pos.wrapperContained,forced); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public static yarnwrap.server.world.ChunkHolder getChunkHolder(long pos, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ChunkTicketManager.getChunkHolder(pos)); }
// public boolean method_14040(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_14040(ticket.wrapperContained); }
// public static boolean method_14040(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.method_14040(ticket.wrapperContained); }
// public yarnwrap.util.collection.SortedArraySet method_14041(long pos) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.method_14041(pos)); }
// public static yarnwrap.util.collection.SortedArraySet method_14041(long pos, ) { return new yarnwrap.util.collection.SortedArraySet(net.minecraft.server.world.ChunkTicketManager.method_14041(pos)); }
// public void addTicket(long position,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.addTicket(position,ticket.wrapperContained); }
// public static void addTicket(long position,yarnwrap.server.world.ChunkTicket ticket, ) { net.minecraft.server.world.ChunkTicketManager.addTicket(position,ticket.wrapperContained); }
// public void purge() { wrapperContained.purge(); }
// public static void purge() { net.minecraft.server.world.ChunkTicketManager.purge(); }
// public int getLevel(yarnwrap.util.collection.SortedArraySet tickets) { return wrapperContained.getLevel(tickets.wrapperContained); }
// public static int getLevel(yarnwrap.util.collection.SortedArraySet tickets, ) { return net.minecraft.server.world.ChunkTicketManager.getLevel(tickets.wrapperContained); }
public void handleChunkEnter(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkEnter(pos.wrapperContained,player.wrapperContained); }
// public static void handleChunkEnter(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ChunkTicketManager.handleChunkEnter(pos.wrapperContained,player.wrapperContained); }
// public void setWatchDistance(int viewDistance) { wrapperContained.setWatchDistance(viewDistance); }
// public static void setWatchDistance(int viewDistance, ) { net.minecraft.server.world.ChunkTicketManager.setWatchDistance(viewDistance); }
// public yarnwrap.util.collection.SortedArraySet getTicketSet(long position) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.getTicketSet(position)); }
// public static yarnwrap.util.collection.SortedArraySet getTicketSet(long position, ) { return new yarnwrap.util.collection.SortedArraySet(net.minecraft.server.world.ChunkTicketManager.getTicketSet(position)); }
public void handleChunkLeave(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.handleChunkLeave(pos.wrapperContained,player.wrapperContained); }
// public static void handleChunkLeave(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ChunkTicketManager.handleChunkLeave(pos.wrapperContained,player.wrapperContained); }
public int getTickedChunkCount() { return wrapperContained.getTickedChunkCount(); }
// public static int getTickedChunkCount() { return net.minecraft.server.world.ChunkTicketManager.getTickedChunkCount(); }
// public yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.setLevel(pos,level,holder.wrapperContained)); }
// public static yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ChunkTicketManager.setLevel(pos,level,holder.wrapperContained)); }
// public void method_15891(yarnwrap.server.world.ServerChunkLoadingManager holder) { wrapperContained.method_15891(holder.wrapperContained); }
// public static void method_15891(yarnwrap.server.world.ServerChunkLoadingManager holder, ) { net.minecraft.server.world.ChunkTicketManager.method_15891(holder.wrapperContained); }
public boolean update(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { return wrapperContained.update(chunkLoadingManager.wrapperContained); }
// public static boolean update(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager, ) { return net.minecraft.server.world.ChunkTicketManager.update(chunkLoadingManager.wrapperContained); }
public void addTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.addTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
// public static void addTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument, ) { net.minecraft.server.world.ChunkTicketManager.addTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
public void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.addTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
// public static void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument, ) { net.minecraft.server.world.ChunkTicketManager.addTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
public void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.removeTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
// public static void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument, ) { net.minecraft.server.world.ChunkTicketManager.removeTicket(type.wrapperContained,pos.wrapperContained,radius,argument); }
// public void method_17642(long optionalChunk) { wrapperContained.method_17642(optionalChunk); }
// public static void method_17642(long optionalChunk, ) { net.minecraft.server.world.ChunkTicketManager.method_17642(optionalChunk); }
// public void removeTicket(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.removeTicket(pos,ticket.wrapperContained); }
// public static void removeTicket(long pos,yarnwrap.server.world.ChunkTicket ticket, ) { net.minecraft.server.world.ChunkTicketManager.removeTicket(pos,ticket.wrapperContained); }
// public it.unimi.dsi.fastutil.objects.ObjectSet method_17655(long sectionPos) { return wrapperContained.method_17655(sectionPos); }
// public static it.unimi.dsi.fastutil.objects.ObjectSet method_17655(long sectionPos, ) { return net.minecraft.server.world.ChunkTicketManager.method_17655(sectionPos); }
public void removeTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.removeTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
// public static void removeTicketWithLevel(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument, ) { net.minecraft.server.world.ChunkTicketManager.removeTicketWithLevel(type.wrapperContained,pos.wrapperContained,level,argument); }
public boolean shouldTick(long chunkPos) { return wrapperContained.shouldTick(chunkPos); }
// public static boolean shouldTick(long chunkPos, ) { return net.minecraft.server.world.ChunkTicketManager.shouldTick(chunkPos); }
// public java.lang.String getTicket(long pos) { return wrapperContained.getTicket(pos); }
// public static java.lang.String getTicket(long pos, ) { return net.minecraft.server.world.ChunkTicketManager.getTicket(pos); }
public java.lang.String toDumpString() { return wrapperContained.toDumpString(); }
// public static java.lang.String toDumpString() { return net.minecraft.server.world.ChunkTicketManager.toDumpString(); }
// public void dump(java.lang.String path) { wrapperContained.dump(path); }
// public static void dump(java.lang.String path, ) { net.minecraft.server.world.ChunkTicketManager.dump(path); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
// public static void setSimulationDistance(int simulationDistance, ) { net.minecraft.server.world.ChunkTicketManager.setSimulationDistance(simulationDistance); }
public boolean shouldTickEntities(long chunkPos) { return wrapperContained.shouldTickEntities(chunkPos); }
// public static boolean shouldTickEntities(long chunkPos, ) { return net.minecraft.server.world.ChunkTicketManager.shouldTickEntities(chunkPos); }
// public yarnwrap.world.SimulationDistanceLevelPropagator getSimulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(wrapperContained.getSimulationDistanceTracker()); }
// public static yarnwrap.world.SimulationDistanceLevelPropagator getSimulationDistanceTracker() { return new yarnwrap.world.SimulationDistanceLevelPropagator(net.minecraft.server.world.ChunkTicketManager.getSimulationDistanceTracker()); }
public boolean shouldTickBlocks(long chunkPos) { return wrapperContained.shouldTickBlocks(chunkPos); }
// public static boolean shouldTickBlocks(long chunkPos, ) { return net.minecraft.server.world.ChunkTicketManager.shouldTickBlocks(chunkPos); }
// public int getPlayerSimulationLevel() { return wrapperContained.getPlayerSimulationLevel(); }
// public static int getPlayerSimulationLevel() { return net.minecraft.server.world.ChunkTicketManager.getPlayerSimulationLevel(); }
public void removePersistentTickets() { wrapperContained.removePersistentTickets(); }
// public static void removePersistentTickets() { net.minecraft.server.world.ChunkTicketManager.removePersistentTickets(); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public static boolean shouldDelayShutdown() { return net.minecraft.server.world.ChunkTicketManager.shouldDelayShutdown(); }
// public void method_60451(yarnwrap.server.world.ServerChunkLoadingManager holder) { wrapperContained.method_60451(holder.wrapperContained); }
// public static void method_60451(yarnwrap.server.world.ServerChunkLoadingManager holder, ) { net.minecraft.server.world.ChunkTicketManager.method_60451(holder.wrapperContained); }

}