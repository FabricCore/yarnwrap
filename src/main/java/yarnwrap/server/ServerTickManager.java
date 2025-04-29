package yarnwrap.server;
public class ServerTickManager { public net.minecraft.server.ServerTickManager wrapperContained; public ServerTickManager(net.minecraft.server.ServerTickManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public long sprintTicks() { return wrapperContained.sprintTicks; }
// public void sprintTicks(long value) { wrapperContained.sprintTicks = value; }
// public static long sprintTicks() { return net.minecraft.server.ServerTickManager.sprintTicks; }
// public static void sprintTicks(long value, ) { net.minecraft.server.ServerTickManager.sprintTicks = value; }

// public long sprintStartTime() { return wrapperContained.sprintStartTime; }
// public void sprintStartTime(long value) { wrapperContained.sprintStartTime = value; }
// public static long sprintStartTime() { return net.minecraft.server.ServerTickManager.sprintStartTime; }
// public static void sprintStartTime(long value, ) { net.minecraft.server.ServerTickManager.sprintStartTime = value; }

// public long sprintTime() { return wrapperContained.sprintTime; }
// public void sprintTime(long value) { wrapperContained.sprintTime = value; }
// public static long sprintTime() { return net.minecraft.server.ServerTickManager.sprintTime; }
// public static void sprintTime(long value, ) { net.minecraft.server.ServerTickManager.sprintTime = value; }

// public long scheduledSprintTicks() { return wrapperContained.scheduledSprintTicks; }
// public void scheduledSprintTicks(long value) { wrapperContained.scheduledSprintTicks = value; }
// public static long scheduledSprintTicks() { return net.minecraft.server.ServerTickManager.scheduledSprintTicks; }
// public static void scheduledSprintTicks(long value, ) { net.minecraft.server.ServerTickManager.scheduledSprintTicks = value; }

// public boolean wasFrozen() { return wrapperContained.wasFrozen; }
// public void wasFrozen(boolean value) { wrapperContained.wasFrozen = value; }
// public static boolean wasFrozen() { return net.minecraft.server.ServerTickManager.wasFrozen; }
// public static void wasFrozen(boolean value, ) { net.minecraft.server.ServerTickManager.wasFrozen = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.ServerTickManager.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.ServerTickManager.server = value.wrapperContained; }

public ServerTickManager(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.ServerTickManager(server.wrapperContained); }
public boolean isSprinting() { return wrapperContained.isSprinting(); }
// public static boolean isSprinting() { return net.minecraft.server.ServerTickManager.isSprinting(); }
public boolean step(int ticks) { return wrapperContained.step(ticks); }
// public static boolean step(int ticks, ) { return net.minecraft.server.ServerTickManager.step(ticks); }
public void sendPackets(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendPackets(player.wrapperContained); }
// public static void sendPackets(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.ServerTickManager.sendPackets(player.wrapperContained); }
public boolean stopStepping() { return wrapperContained.stopStepping(); }
// public static boolean stopStepping() { return net.minecraft.server.ServerTickManager.stopStepping(); }
public boolean startSprint(int ticks) { return wrapperContained.startSprint(ticks); }
// public static boolean startSprint(int ticks, ) { return net.minecraft.server.ServerTickManager.startSprint(ticks); }
public boolean stopSprinting() { return wrapperContained.stopSprinting(); }
// public static boolean stopSprinting() { return net.minecraft.server.ServerTickManager.stopSprinting(); }
public boolean sprint() { return wrapperContained.sprint(); }
// public static boolean sprint() { return net.minecraft.server.ServerTickManager.sprint(); }
public void updateSprintTime() { wrapperContained.updateSprintTime(); }
// public static void updateSprintTime() { net.minecraft.server.ServerTickManager.updateSprintTime(); }
// public void sendUpdateTickRatePacket() { wrapperContained.sendUpdateTickRatePacket(); }
// public static void sendUpdateTickRatePacket() { net.minecraft.server.ServerTickManager.sendUpdateTickRatePacket(); }
// public void sendStepPacket() { wrapperContained.sendStepPacket(); }
// public static void sendStepPacket() { net.minecraft.server.ServerTickManager.sendStepPacket(); }
// public void finishSprinting() { wrapperContained.finishSprinting(); }
// public static void finishSprinting() { net.minecraft.server.ServerTickManager.finishSprinting(); }

}