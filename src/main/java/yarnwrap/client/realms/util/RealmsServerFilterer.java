package yarnwrap.client.realms.util;
public class RealmsServerFilterer { public net.minecraft.client.realms.util.RealmsServerFilterer wrapperContained; public RealmsServerFilterer(net.minecraft.client.realms.util.RealmsServerFilterer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Set removedServers() { return wrapperContained.removedServers; }
// public void removedServers(java.util.Set value) { wrapperContained.removedServers = value; }
// public java.util.List sortedServers() { return wrapperContained.sortedServers; }
// public void sortedServers(java.util.List value) { wrapperContained.sortedServers = value; }
public void remove(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.remove(server.wrapperContained); }
public void filterAndSort(java.util.List servers) { wrapperContained.filterAndSort(servers); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}