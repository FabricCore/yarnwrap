package yarnwrap.client.option;
public class ServerList { public net.minecraft.client.option.ServerList wrapperContained; public ServerList(net.minecraft.client.option.ServerList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List servers() { return wrapperContained.servers; }
// public void servers(java.util.List value) { wrapperContained.servers = value; }
// public static java.util.List servers() { return net.minecraft.client.option.ServerList.servers; }
// public static void servers(java.util.List value, ) { net.minecraft.client.option.ServerList.servers = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.option.ServerList.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.option.ServerList.client = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.option.ServerList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.option.ServerList.LOGGER = value; }

// public int MAX_HIDDEN_ENTRIES() { return wrapperContained.MAX_HIDDEN_ENTRIES; }
// public void MAX_HIDDEN_ENTRIES(int value) { wrapperContained.MAX_HIDDEN_ENTRIES = value; }
// public static int MAX_HIDDEN_ENTRIES() { return net.minecraft.client.option.ServerList.MAX_HIDDEN_ENTRIES; }
// public static void MAX_HIDDEN_ENTRIES(int value, ) { net.minecraft.client.option.ServerList.MAX_HIDDEN_ENTRIES = value; }

// public java.util.List hiddenServers() { return wrapperContained.hiddenServers; }
// public void hiddenServers(java.util.List value) { wrapperContained.hiddenServers = value; }
// public static java.util.List hiddenServers() { return net.minecraft.client.option.ServerList.hiddenServers; }
// public static void hiddenServers(java.util.List value, ) { net.minecraft.client.option.ServerList.hiddenServers = value; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor IO_EXECUTOR() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.IO_EXECUTOR); }
// public void IO_EXECUTOR(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.IO_EXECUTOR = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor IO_EXECUTOR() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.client.option.ServerList.IO_EXECUTOR); }
// public static void IO_EXECUTOR(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.client.option.ServerList.IO_EXECUTOR = value.wrapperContained; }

public ServerList(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.option.ServerList(client.wrapperContained); }
public void set(int index,yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.set(index,serverInfo.wrapperContained); }
// public static void set(int index,yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.option.ServerList.set(index,serverInfo.wrapperContained); }
public void loadFile() { wrapperContained.loadFile(); }
// public static void loadFile() { net.minecraft.client.option.ServerList.loadFile(); }
public yarnwrap.client.network.ServerInfo get(int index) { return new yarnwrap.client.network.ServerInfo(wrapperContained.get(index)); }
// public static yarnwrap.client.network.ServerInfo get(int index, ) { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.option.ServerList.get(index)); }
public void remove(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.remove(serverInfo.wrapperContained); }
// public static void remove(yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.option.ServerList.remove(serverInfo.wrapperContained); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.client.option.ServerList.size(); }
public void swapEntries(int index1,int index2) { wrapperContained.swapEntries(index1,index2); }
// public static void swapEntries(int index1,int index2, ) { net.minecraft.client.option.ServerList.swapEntries(index1,index2); }
// public void updateServerListEntry(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.updateServerListEntry(serverInfo.wrapperContained); }
// public static void updateServerListEntry(yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.option.ServerList.updateServerListEntry(serverInfo.wrapperContained); }
public void saveFile() { wrapperContained.saveFile(); }
// public static void saveFile() { net.minecraft.client.option.ServerList.saveFile(); }
public void add(yarnwrap.client.network.ServerInfo serverInfo,boolean hidden) { wrapperContained.add(serverInfo.wrapperContained,hidden); }
// public static void add(yarnwrap.client.network.ServerInfo serverInfo,boolean hidden, ) { net.minecraft.client.option.ServerList.add(serverInfo.wrapperContained,hidden); }
// public boolean replace(yarnwrap.client.network.ServerInfo serverInfo,java.util.List serverInfos) { return wrapperContained.replace(serverInfo.wrapperContained,serverInfos); }
// public static boolean replace(yarnwrap.client.network.ServerInfo serverInfo,java.util.List serverInfos, ) { return net.minecraft.client.option.ServerList.replace(serverInfo.wrapperContained,serverInfos); }
public yarnwrap.client.network.ServerInfo get(java.lang.String address) { return new yarnwrap.client.network.ServerInfo(wrapperContained.get(address)); }
// public static yarnwrap.client.network.ServerInfo get(java.lang.String address, ) { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.option.ServerList.get(address)); }
public yarnwrap.client.network.ServerInfo tryUnhide(java.lang.String address) { return new yarnwrap.client.network.ServerInfo(wrapperContained.tryUnhide(address)); }
// public static yarnwrap.client.network.ServerInfo tryUnhide(java.lang.String address, ) { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.option.ServerList.tryUnhide(address)); }
// public void method_68474(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_68474(nbt.wrapperContained); }
// public static void method_68474(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.client.option.ServerList.method_68474(nbt.wrapperContained); }

}