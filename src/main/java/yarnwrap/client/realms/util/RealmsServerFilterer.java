package yarnwrap.client.realms.util;
public class RealmsServerFilterer { public net.minecraft.client.realms.util.RealmsServerFilterer wrapperContained; public RealmsServerFilterer(net.minecraft.client.realms.util.RealmsServerFilterer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.realms.util.RealmsServerFilterer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.realms.util.RealmsServerFilterer.client = value.wrapperContained; }

// public java.util.Set removedServers() { return wrapperContained.removedServers; }
// public void removedServers(java.util.Set value) { wrapperContained.removedServers = value; }
// public static java.util.Set removedServers() { return net.minecraft.client.realms.util.RealmsServerFilterer.removedServers; }
// public static void removedServers(java.util.Set value, ) { net.minecraft.client.realms.util.RealmsServerFilterer.removedServers = value; }

// public java.util.List sortedServers() { return wrapperContained.sortedServers; }
// public void sortedServers(java.util.List value) { wrapperContained.sortedServers = value; }
// public static java.util.List sortedServers() { return net.minecraft.client.realms.util.RealmsServerFilterer.sortedServers; }
// public static void sortedServers(java.util.List value, ) { net.minecraft.client.realms.util.RealmsServerFilterer.sortedServers = value; }

public RealmsServerFilterer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.realms.util.RealmsServerFilterer(client.wrapperContained); }
public void remove(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.remove(server.wrapperContained); }
// public static void remove(yarnwrap.client.realms.dto.RealmsServer server, ) { net.minecraft.client.realms.util.RealmsServerFilterer.remove(server.wrapperContained); }
public void filterAndSort(java.util.List servers) { wrapperContained.filterAndSort(servers); }
// public static void filterAndSort(java.util.List servers, ) { net.minecraft.client.realms.util.RealmsServerFilterer.filterAndSort(servers); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.realms.util.RealmsServerFilterer.isEmpty(); }

}