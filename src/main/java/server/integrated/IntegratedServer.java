package yarnwrap.server.integrated;
public class IntegratedServer { public net.minecraft.server.integrated.IntegratedServer wrapperContained; public IntegratedServer(net.minecraft.server.integrated.IntegratedServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode forcedGameMode() { return new yarnwrap.world.GameMode(wrapperContained.forcedGameMode); }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.network.LanServerPinger lanPinger() { return new yarnwrap.client.network.LanServerPinger(wrapperContained.lanPinger); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.UUID localPlayerUuid() { return wrapperContained.localPlayerUuid; }
// public int lanPort() { return wrapperContained.lanPort; }
// public boolean paused() { return wrapperContained.paused; }
// public void incrementTotalWorldTimeStat() { wrapperContained.incrementTotalWorldTimeStat(); }
public void setLocalPlayerUuid(java.util.UUID localPlayerUuid) { wrapperContained.setLocalPlayerUuid(localPlayerUuid); }
// public void checkLowDiskSpaceWarning() { wrapperContained.checkLowDiskSpaceWarning(); }

}