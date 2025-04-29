package yarnwrap.server.dedicated;
public class DedicatedPlayerManager { public net.minecraft.server.dedicated.DedicatedPlayerManager wrapperContained; public DedicatedPlayerManager(net.minecraft.server.dedicated.DedicatedPlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.DedicatedPlayerManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.DedicatedPlayerManager.LOGGER = value; }

public DedicatedPlayerManager(yarnwrap.server.dedicated.MinecraftDedicatedServer server,yarnwrap.registry.CombinedDynamicRegistries tracker,yarnwrap.world.PlayerSaveHandler saveHandler) { this.wrapperContained = new net.minecraft.server.dedicated.DedicatedPlayerManager(server.wrapperContained,tracker.wrapperContained,saveHandler.wrapperContained); }
// public void saveUserBanList() { wrapperContained.saveUserBanList(); }
// public static void saveUserBanList() { net.minecraft.server.dedicated.DedicatedPlayerManager.saveUserBanList(); }
// public void loadIpBanList() { wrapperContained.loadIpBanList(); }
// public static void loadIpBanList() { net.minecraft.server.dedicated.DedicatedPlayerManager.loadIpBanList(); }
// public void saveIpBanList() { wrapperContained.saveIpBanList(); }
// public static void saveIpBanList() { net.minecraft.server.dedicated.DedicatedPlayerManager.saveIpBanList(); }
// public void loadUserBanList() { wrapperContained.loadUserBanList(); }
// public static void loadUserBanList() { net.minecraft.server.dedicated.DedicatedPlayerManager.loadUserBanList(); }
// public void loadOpList() { wrapperContained.loadOpList(); }
// public static void loadOpList() { net.minecraft.server.dedicated.DedicatedPlayerManager.loadOpList(); }
// public void saveOpList() { wrapperContained.saveOpList(); }
// public static void saveOpList() { net.minecraft.server.dedicated.DedicatedPlayerManager.saveOpList(); }
// public void loadWhitelist() { wrapperContained.loadWhitelist(); }
// public static void loadWhitelist() { net.minecraft.server.dedicated.DedicatedPlayerManager.loadWhitelist(); }
// public void saveWhitelist() { wrapperContained.saveWhitelist(); }
// public static void saveWhitelist() { net.minecraft.server.dedicated.DedicatedPlayerManager.saveWhitelist(); }

}