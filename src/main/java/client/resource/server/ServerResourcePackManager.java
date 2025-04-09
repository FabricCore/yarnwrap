package yarnwrap.client.resource.server;
public class ServerResourcePackManager { public net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained; public ServerResourcePackManager(net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.server.DownloadQueuer queuer() { return new yarnwrap.client.resource.server.DownloadQueuer(wrapperContained.queuer); }
// public yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback() { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.stateChangeCallback); }
// public yarnwrap.client.resource.server.ReloadScheduler reloadScheduler() { return new yarnwrap.client.resource.server.ReloadScheduler(wrapperContained.reloadScheduler); }
// public java.lang.Runnable packChangeCallback() { return wrapperContained.packChangeCallback; }
// public Object acceptanceStatus() { return wrapperContained.acceptanceStatus; }
// public java.util.List packs() { return wrapperContained.packs; }
public void removeAll() { wrapperContained.removeAll(); }
// public void accept(Object pack) { wrapperContained.accept(pack); }
// public void onDownload(java.util.Collection packs,Object result) { wrapperContained.onDownload(packs,result); }
public void remove(java.util.UUID id) { wrapperContained.remove(id); }
// public void onAdd(java.util.UUID id,Object pack) { wrapperContained.onAdd(id,pack); }
public void addResourcePack(java.util.UUID id,java.net.URL url,com.google.common.hash.HashCode hashCode) { wrapperContained.addResourcePack(id,url,hashCode); }
public void addResourcePack(java.util.UUID id,java.nio.file.Path path) { wrapperContained.addResourcePack(id,path); }
public void acceptAll() { wrapperContained.acceptAll(); }
// public void markReplaced(java.util.UUID id) { wrapperContained.markReplaced(id); }
public void declineAll() { wrapperContained.declineAll(); }
// public Object get(java.util.UUID id) { return wrapperContained.get(id); }
public void resetAcceptanceStatus() { wrapperContained.resetAcceptanceStatus(); }
public void update() { wrapperContained.update(); }
// public void onPackChanged() { wrapperContained.onPackChanged(); }
// public void removeInactivePacks() { wrapperContained.removeInactivePacks(); }
// public boolean enqueueDownloads() { return wrapperContained.enqueueDownloads(); }
// public void applyDownloadedPacks() { wrapperContained.applyDownloadedPacks(); }

}