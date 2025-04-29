package yarnwrap.world;
public class SimulationDistanceLevelPropagator { public net.minecraft.world.SimulationDistanceLevelPropagator wrapperContained; public SimulationDistanceLevelPropagator(net.minecraft.world.SimulationDistanceLevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap levels() { return wrapperContained.levels; }
// public void levels(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.levels = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ByteMap levels() { return net.minecraft.world.SimulationDistanceLevelPropagator.levels; }
// public static void levels(it.unimi.dsi.fastutil.longs.Long2ByteMap value, ) { net.minecraft.world.SimulationDistanceLevelPropagator.levels = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets() { return wrapperContained.tickets; }
// public void tickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.tickets = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap tickets() { return net.minecraft.world.SimulationDistanceLevelPropagator.tickets; }
// public static void tickets(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.world.SimulationDistanceLevelPropagator.tickets = value; }

public void updateLevels() { wrapperContained.updateLevels(); }
// public static void updateLevels() { net.minecraft.world.SimulationDistanceLevelPropagator.updateLevels(); }
public void updatePlayerTickets(int level) { wrapperContained.updatePlayerTickets(level); }
// public static void updatePlayerTickets(int level, ) { net.minecraft.world.SimulationDistanceLevelPropagator.updatePlayerTickets(level); }
public void add(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.add(pos,ticket.wrapperContained); }
// public static void add(long pos,yarnwrap.server.world.ChunkTicket ticket, ) { net.minecraft.world.SimulationDistanceLevelPropagator.add(pos,ticket.wrapperContained); }
public void add(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.add(type.wrapperContained,pos.wrapperContained,level,argument); }
// public static void add(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument, ) { net.minecraft.world.SimulationDistanceLevelPropagator.add(type.wrapperContained,pos.wrapperContained,level,argument); }
// public int getLevel(yarnwrap.util.collection.SortedArraySet ticket) { return wrapperContained.getLevel(ticket.wrapperContained); }
// public static int getLevel(yarnwrap.util.collection.SortedArraySet ticket, ) { return net.minecraft.world.SimulationDistanceLevelPropagator.getLevel(ticket.wrapperContained); }
public int getLevel(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getLevel(pos.wrapperContained); }
// public static int getLevel(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.SimulationDistanceLevelPropagator.getLevel(pos.wrapperContained); }
public void remove(long pos,yarnwrap.server.world.ChunkTicket ticket) { wrapperContained.remove(pos,ticket.wrapperContained); }
// public static void remove(long pos,yarnwrap.server.world.ChunkTicket ticket, ) { net.minecraft.world.SimulationDistanceLevelPropagator.remove(pos,ticket.wrapperContained); }
public void remove(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument) { wrapperContained.remove(type.wrapperContained,pos.wrapperContained,level,argument); }
// public static void remove(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int level,java.lang.Object argument, ) { net.minecraft.world.SimulationDistanceLevelPropagator.remove(type.wrapperContained,pos.wrapperContained,level,argument); }
public java.lang.String getTickingTicket(long pos) { return wrapperContained.getTickingTicket(pos); }
// public static java.lang.String getTickingTicket(long pos, ) { return net.minecraft.world.SimulationDistanceLevelPropagator.getTickingTicket(pos); }
// public yarnwrap.util.collection.SortedArraySet getTickets(long pos) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.getTickets(pos)); }
// public static yarnwrap.util.collection.SortedArraySet getTickets(long pos, ) { return new yarnwrap.util.collection.SortedArraySet(net.minecraft.world.SimulationDistanceLevelPropagator.getTickets(pos)); }
// public yarnwrap.util.collection.SortedArraySet method_38645(long p) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.method_38645(p)); }
// public static yarnwrap.util.collection.SortedArraySet method_38645(long p, ) { return new yarnwrap.util.collection.SortedArraySet(net.minecraft.world.SimulationDistanceLevelPropagator.method_38645(p)); }

}