package yarnwrap.server.integrated;
public class IntegratedServer { public net.minecraft.server.integrated.IntegratedServer wrapperContained; public IntegratedServer(net.minecraft.server.integrated.IntegratedServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode forcedGameMode() { return new yarnwrap.world.GameMode(wrapperContained.forcedGameMode); }
// public void forcedGameMode(yarnwrap.world.GameMode value) { wrapperContained.forcedGameMode = value.wrapperContained; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.network.LanServerPinger lanPinger() { return new yarnwrap.client.network.LanServerPinger(wrapperContained.lanPinger); }
// public void lanPinger(yarnwrap.client.network.LanServerPinger value) { wrapperContained.lanPinger = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.UUID localPlayerUuid() { return wrapperContained.localPlayerUuid; }
// public void localPlayerUuid(java.util.UUID value) { wrapperContained.localPlayerUuid = value; }
// public int lanPort() { return wrapperContained.lanPort; }
// public void lanPort(int value) { wrapperContained.lanPort = value; }
// public boolean paused() { return wrapperContained.paused; }
// public void paused(boolean value) { wrapperContained.paused = value; }
// public void incrementTotalWorldTimeStat() { wrapperContained.incrementTotalWorldTimeStat(); }
public void setLocalPlayerUuid(java.util.UUID localPlayerUuid) { wrapperContained.setLocalPlayerUuid(localPlayerUuid); }
// public void checkLowDiskSpaceWarning() { wrapperContained.checkLowDiskSpaceWarning(); }

}