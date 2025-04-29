package yarnwrap.client.resource.server;
public class ServerResourcePackManager { public net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained; public ServerResourcePackManager(net.minecraft.client.resource.server.ServerResourcePackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.server.DownloadQueuer queuer() { return new yarnwrap.client.resource.server.DownloadQueuer(wrapperContained.queuer); }
// public void queuer(yarnwrap.client.resource.server.DownloadQueuer value) { wrapperContained.queuer = value.wrapperContained; }
// public static yarnwrap.client.resource.server.DownloadQueuer queuer() { return new yarnwrap.client.resource.server.DownloadQueuer(net.minecraft.client.resource.server.ServerResourcePackManager.queuer); }
// public static void queuer(yarnwrap.client.resource.server.DownloadQueuer value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.queuer = value.wrapperContained; }

// public yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback() { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.stateChangeCallback); }
// public void stateChangeCallback(yarnwrap.client.resource.server.PackStateChangeCallback value) { wrapperContained.stateChangeCallback = value.wrapperContained; }
// public static yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback() { return new yarnwrap.client.resource.server.PackStateChangeCallback(net.minecraft.client.resource.server.ServerResourcePackManager.stateChangeCallback); }
// public static void stateChangeCallback(yarnwrap.client.resource.server.PackStateChangeCallback value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.stateChangeCallback = value.wrapperContained; }

// public yarnwrap.client.resource.server.ReloadScheduler reloadScheduler() { return new yarnwrap.client.resource.server.ReloadScheduler(wrapperContained.reloadScheduler); }
// public void reloadScheduler(yarnwrap.client.resource.server.ReloadScheduler value) { wrapperContained.reloadScheduler = value.wrapperContained; }
// public static yarnwrap.client.resource.server.ReloadScheduler reloadScheduler() { return new yarnwrap.client.resource.server.ReloadScheduler(net.minecraft.client.resource.server.ServerResourcePackManager.reloadScheduler); }
// public static void reloadScheduler(yarnwrap.client.resource.server.ReloadScheduler value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.reloadScheduler = value.wrapperContained; }

// public java.lang.Runnable packChangeCallback() { return wrapperContained.packChangeCallback; }
// public void packChangeCallback(java.lang.Runnable value) { wrapperContained.packChangeCallback = value; }
// public static java.lang.Runnable packChangeCallback() { return net.minecraft.client.resource.server.ServerResourcePackManager.packChangeCallback; }
// public static void packChangeCallback(java.lang.Runnable value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.packChangeCallback = value; }

// public Object acceptanceStatus() { return wrapperContained.acceptanceStatus; }
// // public void acceptanceStatus(Object value) { wrapperContained.acceptanceStatus = value; }
// // public static Object acceptanceStatus() { return net.minecraft.client.resource.server.ServerResourcePackManager.acceptanceStatus; }
// // public static void acceptanceStatus(Object value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.acceptanceStatus = value; }

// public java.util.List packs() { return wrapperContained.packs; }
// public void packs(java.util.List value) { wrapperContained.packs = value; }
// public static java.util.List packs() { return net.minecraft.client.resource.server.ServerResourcePackManager.packs; }
// public static void packs(java.util.List value, ) { net.minecraft.client.resource.server.ServerResourcePackManager.packs = value; }

// public ServerResourcePackManager(yarnwrap.client.resource.server.DownloadQueuer queuer,yarnwrap.client.resource.server.PackStateChangeCallback stateChangeCallback,yarnwrap.client.resource.server.ReloadScheduler reloadScheduler,java.lang.Runnable packChangeCallback,Object acceptanceStatus) { this.wrapperContained = new net.minecraft.client.resource.server.ServerResourcePackManager(queuer.wrapperContained,stateChangeCallback.wrapperContained,reloadScheduler.wrapperContained,packChangeCallback,acceptanceStatus); }
public void removeAll() { wrapperContained.removeAll(); }
// public static void removeAll() { net.minecraft.client.resource.server.ServerResourcePackManager.removeAll(); }
// public void accept(Object pack) { wrapperContained.accept(pack); }
// public static void accept(Object pack, ) { net.minecraft.client.resource.server.ServerResourcePackManager.accept(pack); }
// public void onDownload(java.util.Collection packs,Object result) { wrapperContained.onDownload(packs,result); }
// public static void onDownload(java.util.Collection packs,Object result, ) { net.minecraft.client.resource.server.ServerResourcePackManager.onDownload(packs,result); }
// public void method_55555(java.util.List result) { wrapperContained.method_55555(result); }
// public static void method_55555(java.util.List result, ) { net.minecraft.client.resource.server.ServerResourcePackManager.method_55555(result); }
public void remove(java.util.UUID id) { wrapperContained.remove(id); }
// public static void remove(java.util.UUID id, ) { net.minecraft.client.resource.server.ServerResourcePackManager.remove(id); }
// public void onAdd(java.util.UUID id,Object pack) { wrapperContained.onAdd(id,pack); }
// public static void onAdd(java.util.UUID id,Object pack, ) { net.minecraft.client.resource.server.ServerResourcePackManager.onAdd(id,pack); }
public void addResourcePack(java.util.UUID id,java.net.URL url,com.google.common.hash.HashCode hashCode) { wrapperContained.addResourcePack(id,url,hashCode); }
// public static void addResourcePack(java.util.UUID id,java.net.URL url,com.google.common.hash.HashCode hashCode, ) { net.minecraft.client.resource.server.ServerResourcePackManager.addResourcePack(id,url,hashCode); }
public void addResourcePack(java.util.UUID id,java.nio.file.Path path) { wrapperContained.addResourcePack(id,path); }
// public static void addResourcePack(java.util.UUID id,java.nio.file.Path path, ) { net.minecraft.client.resource.server.ServerResourcePackManager.addResourcePack(id,path); }
public void acceptAll() { wrapperContained.acceptAll(); }
// public static void acceptAll() { net.minecraft.client.resource.server.ServerResourcePackManager.acceptAll(); }
// public boolean method_55561(Object pack) { return wrapperContained.method_55561(pack); }
// public static boolean method_55561(Object pack, ) { return net.minecraft.client.resource.server.ServerResourcePackManager.method_55561(pack); }
// public void markReplaced(java.util.UUID id) { wrapperContained.markReplaced(id); }
// public static void markReplaced(java.util.UUID id, ) { net.minecraft.client.resource.server.ServerResourcePackManager.markReplaced(id); }
public void declineAll() { wrapperContained.declineAll(); }
// public static void declineAll() { net.minecraft.client.resource.server.ServerResourcePackManager.declineAll(); }
// public Object get(java.util.UUID id) { return wrapperContained.get(id); }
// public static Object get(java.util.UUID id, ) { return net.minecraft.client.resource.server.ServerResourcePackManager.get(id); }
public void resetAcceptanceStatus() { wrapperContained.resetAcceptanceStatus(); }
// public static void resetAcceptanceStatus() { net.minecraft.client.resource.server.ServerResourcePackManager.resetAcceptanceStatus(); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.client.resource.server.ServerResourcePackManager.update(); }
// public void onPackChanged() { wrapperContained.onPackChanged(); }
// public static void onPackChanged() { net.minecraft.client.resource.server.ServerResourcePackManager.onPackChanged(); }
// public void removeInactivePacks() { wrapperContained.removeInactivePacks(); }
// public static void removeInactivePacks() { net.minecraft.client.resource.server.ServerResourcePackManager.removeInactivePacks(); }
// public boolean enqueueDownloads() { return wrapperContained.enqueueDownloads(); }
// public static boolean enqueueDownloads() { return net.minecraft.client.resource.server.ServerResourcePackManager.enqueueDownloads(); }
// public void applyDownloadedPacks() { wrapperContained.applyDownloadedPacks(); }
// public static void applyDownloadedPacks() { net.minecraft.client.resource.server.ServerResourcePackManager.applyDownloadedPacks(); }

}