package yarnwrap.server;
public class ServerTickManager { public net.minecraft.server.ServerTickManager wrapperContained; public ServerTickManager(net.minecraft.server.ServerTickManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public long sprintTicks() { return wrapperContained.sprintTicks; }
// public long sprintStartTime() { return wrapperContained.sprintStartTime; }
// public long sprintTime() { return wrapperContained.sprintTime; }
// public long scheduledSprintTicks() { return wrapperContained.scheduledSprintTicks; }
// public boolean wasFrozen() { return wrapperContained.wasFrozen; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
public boolean isSprinting() { return wrapperContained.isSprinting(); }
public boolean step(int ticks) { return wrapperContained.step(ticks); }
public void sendPackets(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendPackets(player.wrapperContained); }
public boolean stopStepping() { return wrapperContained.stopStepping(); }
public boolean startSprint(int ticks) { return wrapperContained.startSprint(ticks); }
public boolean stopSprinting() { return wrapperContained.stopSprinting(); }
public boolean sprint() { return wrapperContained.sprint(); }
public void updateSprintTime() { wrapperContained.updateSprintTime(); }
// public void sendUpdateTickRatePacket() { wrapperContained.sendUpdateTickRatePacket(); }
// public void sendStepPacket() { wrapperContained.sendStepPacket(); }
// public void finishSprinting() { wrapperContained.finishSprinting(); }

}