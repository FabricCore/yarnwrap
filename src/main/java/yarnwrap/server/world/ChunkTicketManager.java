package yarnwrap.server.world;
public class ChunkTicketManager { public net.minecraft.server.world.ChunkTicketManager wrapperContained; public ChunkTicketManager(net.minecraft.server.world.ChunkTicketManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_TICKETS_MAP_SIZE() { return wrapperContained.DEFAULT_TICKETS_MAP_SIZE; }
// public void DEFAULT_TICKETS_MAP_SIZE(int value) { wrapperContained.DEFAULT_TICKETS_MAP_SIZE = value; }
// public static int DEFAULT_TICKETS_MAP_SIZE() { return net.minecraft.server.world.ChunkTicketManager.DEFAULT_TICKETS_MAP_SIZE; }
// public static void DEFAULT_TICKETS_MAP_SIZE(int value, ) { net.minecraft.server.world.ChunkTicketManager.DEFAULT_TICKETS_MAP_SIZE = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ChunkTicketManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ChunkTicketManager.LOGGER = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets() { return wrapperContained.tickets; }
// public void tickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.tickets = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets() { return net.minecraft.server.world.ChunkTicketManager.tickets; }
// public static void tickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.server.world.ChunkTicketManager.tickets = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap savedTickets() { return wrapperContained.savedTickets; }
// public void savedTickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.savedTickets = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap savedTickets() { return net.minecraft.server.world.ChunkTicketManager.savedTickets; }
// public static void savedTickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.server.world.ChunkTicketManager.savedTickets = value; }

// public it.unimi.dsi.fastutil.longs.LongSet forcedChunks() { return wrapperContained.forcedChunks; }
// public void forcedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.forcedChunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet forcedChunks() { return net.minecraft.server.world.ChunkTicketManager.forcedChunks; }
// public static void forcedChunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ChunkTicketManager.forcedChunks = value; }

// public Object loadingLevelUpdater() { return wrapperContained.loadingLevelUpdater; }
// // public void loadingLevelUpdater(Object value) { wrapperContained.loadingLevelUpdater = value; }
// // public static Object loadingLevelUpdater() { return net.minecraft.server.world.ChunkTicketManager.loadingLevelUpdater; }
// // public static void loadingLevelUpdater(Object value, ) { net.minecraft.server.world.ChunkTicketManager.loadingLevelUpdater = value; }

// public Object simulationLevelUpdater() { return wrapperContained.simulationLevelUpdater; }
// // public void simulationLevelUpdater(Object value) { wrapperContained.simulationLevelUpdater = value; }
// // public static Object simulationLevelUpdater() { return net.minecraft.server.world.ChunkTicketManager.simulationLevelUpdater; }
// // public static void simulationLevelUpdater(Object value, ) { net.minecraft.server.world.ChunkTicketManager.simulationLevelUpdater = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.server.world.ChunkTicketManager.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.server.world.ChunkTicketManager.CODEC = value; }

// public yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.STATE_TYPE); }
// public void STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.server.world.ChunkTicketManager.STATE_TYPE); }
// public static void STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.server.world.ChunkTicketManager.STATE_TYPE = value.wrapperContained; }

// public com.mojang.serialization.Codec TICKET_POS_CODEC() { return wrapperContained.TICKET_POS_CODEC; }
// public void TICKET_POS_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TICKET_POS_CODEC = value; }
// public static com.mojang.serialization.Codec TICKET_POS_CODEC() { return net.minecraft.server.world.ChunkTicketManager.TICKET_POS_CODEC; }
// public static void TICKET_POS_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.server.world.ChunkTicketManager.TICKET_POS_CODEC = value; }

// public ChunkTicketManager(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap savedTickets) { this.wrapperContained = new net.minecraft.server.world.ChunkTicketManager(tickets,savedTickets); }
public void updateLevel(int level,yarnwrap.server.world.ChunkTicketType type) { wrapperContained.updateLevel(level,type.wrapperContained); }
// public static void updateLevel(int level,yarnwrap.server.world.ChunkTicketType type, ) { net.minecraft.server.world.ChunkTicketManager.updateLevel(level,type.wrapperContained); }
public java.util.List getTickets(long pos) { return wrapperContained.getTickets(pos); }
// public static java.util.List getTickets(long pos, ) { return net.minecraft.server.world.ChunkTicketManager.getTickets(pos); }
public boolean addTicket(long pos,yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.addTicket(pos,ticket.wrapperContained); }
// public static boolean addTicket(long pos,yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.addTicket(pos,ticket.wrapperContained); }
public int getLevel(long pos,boolean forSimulation) { return wrapperContained.getLevel(pos,forSimulation); }
// public static int getLevel(long pos,boolean forSimulation, ) { return net.minecraft.server.world.ChunkTicketManager.getLevel(pos,forSimulation); }
// public boolean method_66355(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_66355(ticket.wrapperContained); }
// public static boolean method_66355(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.method_66355(ticket.wrapperContained); }
// public boolean ticketsEqual(yarnwrap.server.world.ChunkTicket a,yarnwrap.server.world.ChunkTicket b) { return wrapperContained.ticketsEqual(a.wrapperContained,b.wrapperContained); }
// public static boolean ticketsEqual(yarnwrap.server.world.ChunkTicket a,yarnwrap.server.world.ChunkTicket b, ) { return net.minecraft.server.world.ChunkTicketManager.ticketsEqual(a.wrapperContained,b.wrapperContained); }
public void addTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addTicket(ticket.wrapperContained,pos.wrapperContained); }
// public static void addTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ChunkTicketManager.addTicket(ticket.wrapperContained,pos.wrapperContained); }
public void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius) { wrapperContained.addTicket(type.wrapperContained,pos.wrapperContained,radius); }
// public static void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius, ) { net.minecraft.server.world.ChunkTicketManager.addTicket(type.wrapperContained,pos.wrapperContained,radius); }
public boolean setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced) { return wrapperContained.setChunkForced(pos.wrapperContained,forced); }
// public static boolean setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced, ) { return net.minecraft.server.world.ChunkTicketManager.setChunkForced(pos.wrapperContained,forced); }
// public void setLoadingLevelUpdater(Object loadingLevelUpdater) { wrapperContained.setLoadingLevelUpdater(loadingLevelUpdater); }
// public static void setLoadingLevelUpdater(Object loadingLevelUpdater, ) { net.minecraft.server.world.ChunkTicketManager.setLoadingLevelUpdater(loadingLevelUpdater); }
// public java.util.List method_66361(Object pos) { return wrapperContained.method_66361(pos); }
// public static java.util.List method_66361(Object pos, ) { return net.minecraft.server.world.ChunkTicketManager.method_66361(pos); }
// public int getLevel(java.util.List tickets,boolean forSimulation) { return wrapperContained.getLevel(tickets,forSimulation); }
// public static int getLevel(java.util.List tickets,boolean forSimulation, ) { return net.minecraft.server.world.ChunkTicketManager.getLevel(tickets,forSimulation); }
// public it.unimi.dsi.fastutil.longs.LongSet getAllChunksMatching(java.util.function.Predicate predicate) { return wrapperContained.getAllChunksMatching(predicate); }
// public static it.unimi.dsi.fastutil.longs.LongSet getAllChunksMatching(java.util.function.Predicate predicate, ) { return net.minecraft.server.world.ChunkTicketManager.getAllChunksMatching(predicate); }
public void removeTicketsIf(java.util.function.Predicate predicate,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap transferTo) { wrapperContained.removeTicketsIf(predicate,transferTo); }
// public static void removeTicketsIf(java.util.function.Predicate predicate,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap transferTo, ) { net.minecraft.server.world.ChunkTicketManager.removeTicketsIf(predicate,transferTo); }
public void promoteToRealTickets() { wrapperContained.promoteToRealTickets(); }
// public static void promoteToRealTickets() { net.minecraft.server.world.ChunkTicketManager.promoteToRealTickets(); }
// public java.util.List getTicketsMutable(long pos) { return wrapperContained.getTicketsMutable(pos); }
// public static java.util.List getTicketsMutable(long pos, ) { return net.minecraft.server.world.ChunkTicketManager.getTicketsMutable(pos); }
public boolean removeTicket(long pos,yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.removeTicket(pos,ticket.wrapperContained); }
// public static boolean removeTicket(long pos,yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.removeTicket(pos,ticket.wrapperContained); }
public java.lang.String getDebugString(long pos,boolean forSimulation) { return wrapperContained.getDebugString(pos,forSimulation); }
// public static java.lang.String getDebugString(long pos,boolean forSimulation, ) { return net.minecraft.server.world.ChunkTicketManager.getDebugString(pos,forSimulation); }
// public boolean method_66371(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_66371(ticket.wrapperContained); }
// public static boolean method_66371(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.method_66371(ticket.wrapperContained); }
public void removeTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos) { wrapperContained.removeTicket(ticket.wrapperContained,pos.wrapperContained); }
// public static void removeTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ChunkTicketManager.removeTicket(ticket.wrapperContained,pos.wrapperContained); }
public void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius) { wrapperContained.removeTicket(type.wrapperContained,pos.wrapperContained,radius); }
// public static void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius, ) { net.minecraft.server.world.ChunkTicketManager.removeTicket(type.wrapperContained,pos.wrapperContained,radius); }
// public void setSimulationLevelUpdater(Object simulationLevelUpdater) { wrapperContained.setSimulationLevelUpdater(simulationLevelUpdater); }
// public static void setSimulationLevelUpdater(Object simulationLevelUpdater, ) { net.minecraft.server.world.ChunkTicketManager.setSimulationLevelUpdater(simulationLevelUpdater); }
// public yarnwrap.server.world.ChunkTicket getActiveTicket(java.util.List tickets,boolean forSimulation) { return new yarnwrap.server.world.ChunkTicket(wrapperContained.getActiveTicket(tickets,forSimulation)); }
// public static yarnwrap.server.world.ChunkTicket getActiveTicket(java.util.List tickets,boolean forSimulation, ) { return new yarnwrap.server.world.ChunkTicket(net.minecraft.server.world.ChunkTicketManager.getActiveTicket(tickets,forSimulation)); }
public boolean hasTickets() { return wrapperContained.hasTickets(); }
// public static boolean hasTickets() { return net.minecraft.server.world.ChunkTicketManager.hasTickets(); }
// public java.util.List method_66379(long chunkPos) { return wrapperContained.method_66379(chunkPos); }
// public static java.util.List method_66379(long chunkPos, ) { return net.minecraft.server.world.ChunkTicketManager.method_66379(chunkPos); }
// public boolean method_66380(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_66380(ticket.wrapperContained); }
// public static boolean method_66380(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicketManager.method_66380(ticket.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.world.ChunkTicketManager.tick(); }
public void shutdown() { wrapperContained.shutdown(); }
// public static void shutdown() { net.minecraft.server.world.ChunkTicketManager.shutdown(); }
public it.unimi.dsi.fastutil.longs.LongSet getForcedChunks() { return wrapperContained.getForcedChunks(); }
// public static it.unimi.dsi.fastutil.longs.LongSet getForcedChunks() { return net.minecraft.server.world.ChunkTicketManager.getForcedChunks(); }
// public void recomputeForcedChunks() { wrapperContained.recomputeForcedChunks(); }
// public static void recomputeForcedChunks() { net.minecraft.server.world.ChunkTicketManager.recomputeForcedChunks(); }
// public com.mojang.datafixers.kinds.App method_67394(Object instance) { return wrapperContained.method_67394(instance); }
// public static com.mojang.datafixers.kinds.App method_67394(Object instance, ) { return net.minecraft.server.world.ChunkTicketManager.method_67394(instance); }
// public yarnwrap.server.world.ChunkTicketManager create(java.util.List tickets) { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.create(tickets)); }
// public static yarnwrap.server.world.ChunkTicketManager create(java.util.List tickets, ) { return new yarnwrap.server.world.ChunkTicketManager(net.minecraft.server.world.ChunkTicketManager.create(tickets)); }
// public void method_67396(java.util.List pos,yarnwrap.util.math.ChunkPos ticket) { wrapperContained.method_67396(pos,ticket.wrapperContained); }
// public static void method_67396(java.util.List pos,yarnwrap.util.math.ChunkPos ticket, ) { net.minecraft.server.world.ChunkTicketManager.method_67396(pos,ticket.wrapperContained); }
// public void forEachTicket(java.util.function.BiConsumer ticketConsumer) { wrapperContained.forEachTicket(ticketConsumer); }
// public static void forEachTicket(java.util.function.BiConsumer ticketConsumer, ) { net.minecraft.server.world.ChunkTicketManager.forEachTicket(ticketConsumer); }
// public void forEachTicket(java.util.function.BiConsumer ticketConsumer,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets) { wrapperContained.forEachTicket(ticketConsumer,tickets); }
// public static void forEachTicket(java.util.function.BiConsumer ticketConsumer,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets, ) { net.minecraft.server.world.ChunkTicketManager.forEachTicket(ticketConsumer,tickets); }
// public java.util.List getTickets() { return wrapperContained.getTickets(); }
// public static java.util.List getTickets() { return net.minecraft.server.world.ChunkTicketManager.getTickets(); }

}