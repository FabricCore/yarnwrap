package yarnwrap.client.option;
public class ServerList { public net.minecraft.client.option.ServerList wrapperContained; public ServerList(net.minecraft.client.option.ServerList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List servers() { return wrapperContained.servers; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.thread.TaskExecutor IO_EXECUTOR() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.IO_EXECUTOR); }
// public int MAX_HIDDEN_ENTRIES() { return wrapperContained.MAX_HIDDEN_ENTRIES; }
// public java.util.List hiddenServers() { return wrapperContained.hiddenServers; }
public void set(int index,yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.set(index,serverInfo.wrapperContained); }
public void loadFile() { wrapperContained.loadFile(); }
public yarnwrap.client.network.ServerInfo get(int index) { return new yarnwrap.client.network.ServerInfo(wrapperContained.get(index)); }
public void remove(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.remove(serverInfo.wrapperContained); }
public int size() { return wrapperContained.size(); }
public void swapEntries(int index1,int index2) { wrapperContained.swapEntries(index1,index2); }
public void updateServerListEntry(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.updateServerListEntry(serverInfo.wrapperContained); }
public void saveFile() { wrapperContained.saveFile(); }
public void add(yarnwrap.client.network.ServerInfo serverInfo,boolean hidden) { wrapperContained.add(serverInfo.wrapperContained,hidden); }
// public boolean replace(yarnwrap.client.network.ServerInfo serverInfo,java.util.List serverInfos) { return wrapperContained.replace(serverInfo.wrapperContained,serverInfos); }
public yarnwrap.client.network.ServerInfo get(java.lang.String address) { return new yarnwrap.client.network.ServerInfo(wrapperContained.get(address)); }
public yarnwrap.client.network.ServerInfo tryUnhide(java.lang.String address) { return new yarnwrap.client.network.ServerInfo(wrapperContained.tryUnhide(address)); }

}