package yarnwrap.world;
public class SimulationDistanceLevelPropagator { public net.minecraft.world.SimulationDistanceLevelPropagator wrapperContained; public SimulationDistanceLevelPropagator(net.minecraft.world.SimulationDistanceLevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap levels() { return wrapperContained.levels; }
// public void levels(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.levels = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets() { return wrapperContained.tickets; }
// public void tickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.tickets = value; }
public void updateLevels() { wrapperContained.updateLevels(); }
public void updatePlayerTickets(int level) { wrapperContained.updatePlayerTickets(level); }
public void add(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.add(pos,ticket.wrapperContained); }
public void add(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.add(type.wrapperContained,pos.wrapperContained,level,argument); }
// public int getLevel(yarnwrap.util.collection.SortedArraySet ticket) { return wrapperContained.getLevel(ticket.wrapperContained); }
public int getLevel(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getLevel(pos.wrapperContained); }
public void remove(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.remove(pos,ticket.wrapperContained); }
public void remove(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.remove(type.wrapperContained,pos.wrapperContained,level,argument); }
public java.lang.String getTickingTicket(long pos) { return wrapperContained.getTickingTicket(pos); }
// public yarnwrap.util.collection.SortedArraySet getTickets(long pos) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.getTickets(pos)); }
// public yarnwrap.util.collection.SortedArraySet method_38645(long p) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.method_38645(p)); }

}