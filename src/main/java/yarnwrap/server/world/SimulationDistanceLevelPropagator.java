package yarnwrap.server.world;
public class SimulationDistanceLevelPropagator { public net.minecraft.server.world.SimulationDistanceLevelPropagator wrapperContained; public SimulationDistanceLevelPropagator(net.minecraft.server.world.SimulationDistanceLevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap levels() { return wrapperContained.levels; }
// public void levels(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.levels = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ByteMap levels() { return net.minecraft.server.world.SimulationDistanceLevelPropagator.levels; }
// public static void levels(it.unimi.dsi.fastutil.longs.Long2ByteMap value, ) { net.minecraft.server.world.SimulationDistanceLevelPropagator.levels = value; }

// public yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.ticketManager); }
// public void ticketManager(yarnwrap.server.world.ChunkTicketManager value) { wrapperContained.ticketManager = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(net.minecraft.server.world.SimulationDistanceLevelPropagator.ticketManager); }
// public static void ticketManager(yarnwrap.server.world.ChunkTicketManager value, ) { net.minecraft.server.world.SimulationDistanceLevelPropagator.ticketManager = value.wrapperContained; }

public SimulationDistanceLevelPropagator(yarnwrap.server.world.ChunkTicketManager ticketManager) { this.wrapperContained = new net.minecraft.server.world.SimulationDistanceLevelPropagator(ticketManager.wrapperContained); }
public void updateLevels() { wrapperContained.updateLevels(); }
// public static void updateLevels() { net.minecraft.server.world.SimulationDistanceLevelPropagator.updateLevels(); }
public int getLevel(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getLevel(pos.wrapperContained); }
// public static int getLevel(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.SimulationDistanceLevelPropagator.getLevel(pos.wrapperContained); }

}