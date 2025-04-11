package yarnwrap.client.resource.server;
public class ServerResourcePackManager { public net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained; public ServerResourcePackManager(net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.server.DownloadQueuer queuer() { return new yarnwrap.client.resource.server.DownloadQueuer(wrapperContained.queuer); }
// public void queuer(yarnwrap.client.resource.server.DownloadQueuer value) { wrapperContained.queuer = value.wrapperContained; }
// public yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback() { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.stateChangeCallback); }
// public void stateChangeCallback(yarnwrap.client.resource.server.PackStateChangeCallback value) { wrapperContained.stateChangeCallback = value.wrapperContained; }
// public yarnwrap.client.resource.server.ReloadScheduler reloadScheduler() { return new yarnwrap.client.resource.server.ReloadScheduler(wrapperContained.reloadScheduler); }
// public void reloadScheduler(yarnwrap.client.resource.server.ReloadScheduler value) { wrapperContained.reloadScheduler = value.wrapperContained; }
// public java.lang.Runnable packChangeCallback() { return wrapperContained.packChangeCallback; }
// public void packChangeCallback(java.lang.Runnable value) { wrapperContained.packChangeCallback = value; }
// public Object acceptanceStatus() { return wrapperContained.acceptanceStatus; }
// // public void acceptanceStatus(Object value) { wrapperContained.acceptanceStatus = value; }
// public java.util.List packs() { return wrapperContained.packs; }
// public void packs(java.util.List value) { wrapperContained.packs = value; }
// public ServerResourcePackManager(yarnwrap.client.resource.server.DownloadQueuer queuer,yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback,yarnwrap.client.resource.server.ReloadScheduler reloadScheduler,java.lang.Runnable packChangeCallback,Object acceptanceStatus) { this.wrapperContained = new net.minecraft.client.resource.server.ServerResourcePackManager(queuer.wrapperContained,stateChangeCallback.wrapperContained,reloadScheduler.wrapperContained,packChangeCallback,acceptanceStatus); }
public void removeAll() { wrapperContained.removeAll(); }
// public void accept(Object pack) { wrapperContained.accept(pack); }
// public void onDownload(java.util.Collection packs,Object result) { wrapperContained.onDownload(packs,result); }
// public void method_55555(java.util.List result) { wrapperContained.method_55555(result); }
public void remove(java.util.UUID id) { wrapperContained.remove(id); }
// public void onAdd(java.util.UUID id,Object pack) { wrapperContained.onAdd(id,pack); }
public void addResourcePack(java.util.UUID id,java.net.URL url,com.google.common.hash.HashCode hashCode) { wrapperContained.addResourcePack(id,url,hashCode); }
public void addResourcePack(java.util.UUID id,java.nio.file.Path path) { wrapperContained.addResourcePack(id,path); }
public void acceptAll() { wrapperContained.acceptAll(); }
// public boolean method_55561(Object pack) { return wrapperContained.method_55561(pack); }
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