package yarnwrap.server.dedicated;
public class DedicatedPlayerManager { public net.minecraft.server.dedicated.DedicatedPlayerManager wrapperContained; public DedicatedPlayerManager(net.minecraft.server.dedicated.DedicatedPlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void saveUserBanList() { wrapperContained.saveUserBanList(); }
// public void loadIpBanList() { wrapperContained.loadIpBanList(); }
// public void saveIpBanList() { wrapperContained.saveIpBanList(); }
// public void loadUserBanList() { wrapperContained.loadUserBanList(); }
// public void loadOpList() { wrapperContained.loadOpList(); }
// public void saveOpList() { wrapperContained.saveOpList(); }
// public void loadWhitelist() { wrapperContained.loadWhitelist(); }
// public void saveWhitelist() { wrapperContained.saveWhitelist(); }

}