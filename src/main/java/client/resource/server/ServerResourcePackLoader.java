package yarnwrap.client.resource.server;
public class ServerResourcePackLoader { public net.minecraft.client.resource.server.ServerResourcePackLoader wrapperContained; public ServerResourcePackLoader(net.minecraft.client.resource.server.ServerResourcePackLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SERVER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.SERVER_NAME_TEXT); }
// public yarnwrap.resource.ResourcePackProvider NOOP_PROVIDER() { return new yarnwrap.resource.ResourcePackProvider(wrapperContained.NOOP_PROVIDER); }
// public yarnwrap.client.resource.server.PackStateChangeCallback DEBUG_PACK_STATE_CHANGE_CALLBACK() { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.DEBUG_PACK_STATE_CHANGE_CALLBACK); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.resource.ResourcePackProvider packProvider() { return new yarnwrap.resource.ResourcePackProvider(wrapperContained.packProvider); }
// public Object reloadContext() { return wrapperContained.reloadContext; }
// public yarnwrap.client.resource.server.ServerResourcePackManager manager() { return new yarnwrap.client.resource.server.ServerResourcePackManager(wrapperContained.manager); }
// public yarnwrap.util.Downloader downloader() { return new yarnwrap.util.Downloader(wrapperContained.downloader); }
// public yarnwrap.resource.ResourcePackSource packSource() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.packSource); }
// public yarnwrap.client.resource.server.PackStateChangeCallback packStateChangeCallback() { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.packStateChangeCallback); }
// public int packIndex() { return wrapperContained.packIndex; }
// public yarnwrap.resource.ResourcePackPosition POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.POSITION); }
// public java.util.regex.Pattern SHA1_PATTERN() { return wrapperContained.SHA1_PATTERN; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.resource.ResourcePackProvider getPassthroughPackProvider() { return new yarnwrap.resource.ResourcePackProvider(wrapperContained.getPassthroughPackProvider()); }
// public Object createListener(int entryCount) { return wrapperContained.createListener(entryCount); }
// public yarnwrap.client.resource.server.DownloadQueuer createDownloadQueuer(yarnwrap.util.Downloader downloader,java.util.concurrent.Executor executor,yarnwrap.client.session.Session session,java.net.Proxy proxy) { return new yarnwrap.client.resource.server.DownloadQueuer(wrapperContained.createDownloadQueuer(downloader.wrapperContained,executor,session.wrapperContained,proxy)); }
// public void reload(Object context) { wrapperContained.reload(context); }
// public com.google.common.hash.HashCode toHashCode(java.lang.String hash) { return wrapperContained.toHashCode(hash); }
// public java.util.List toProfiles(java.util.List packs) { return wrapperContained.toProfiles(packs); }
public void remove(java.util.UUID id) { wrapperContained.remove(id); }
public void addResourcePack(java.util.UUID id,java.net.URL url,java.lang.String hash) { wrapperContained.addResourcePack(id,url,hash); }
public void addResourcePack(java.util.UUID id,java.nio.file.Path path) { wrapperContained.addResourcePack(id,path); }
// public java.lang.Runnable createPackChangeCallback(java.util.concurrent.Executor executor) { return wrapperContained.createPackChangeCallback(executor); }
// public yarnwrap.client.resource.server.PackStateChangeCallback getStateChangeCallback(yarnwrap.network.ClientConnection connection) { return new yarnwrap.client.resource.server.PackStateChangeCallback(wrapperContained.getStateChangeCallback(connection.wrapperContained)); }
// public void init(yarnwrap.network.ClientConnection connection,Object acceptanceStatus) { wrapperContained.init(connection.wrapperContained,acceptanceStatus); }
public void onReloadFailure() { wrapperContained.onReloadFailure(); }
// public yarnwrap.resource.ResourcePackProvider getPackProvider(java.util.List serverPacks) { return new yarnwrap.resource.ResourcePackProvider(wrapperContained.getPackProvider(serverPacks)); }
public java.util.concurrent.CompletableFuture getPackLoadFuture(java.util.UUID id) { return wrapperContained.getPackLoadFuture(id); }
public void onForcedReloadFailure() { wrapperContained.onForcedReloadFailure(); }
public void onReloadSuccess() { wrapperContained.onReloadSuccess(); }
public void removeAll() { wrapperContained.removeAll(); }
public void initWorldPack() { wrapperContained.initWorldPack(); }
public void acceptAll() { wrapperContained.acceptAll(); }
public void declineAll() { wrapperContained.declineAll(); }
public void clear() { wrapperContained.clear(); }
// public yarnwrap.client.resource.server.ReloadScheduler getReloadScheduler() { return new yarnwrap.client.resource.server.ReloadScheduler(wrapperContained.getReloadScheduler()); }

}