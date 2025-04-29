package yarnwrap.client.network;
public class ServerInfo { public net.minecraft.client.network.ServerInfo wrapperContained; public ServerInfo(net.minecraft.client.network.ServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.network.ServerInfo.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.network.ServerInfo.name = value; }

public yarnwrap.text.Text playerCountLabel() { return new yarnwrap.text.Text(wrapperContained.playerCountLabel); }
public void playerCountLabel(yarnwrap.text.Text value) { wrapperContained.playerCountLabel = value.wrapperContained; }
// public static yarnwrap.text.Text playerCountLabel() { return new yarnwrap.text.Text(net.minecraft.client.network.ServerInfo.playerCountLabel); }
// public static void playerCountLabel(yarnwrap.text.Text value, ) { net.minecraft.client.network.ServerInfo.playerCountLabel = value.wrapperContained; }

// public Object resourcePackPolicy() { return wrapperContained.resourcePackPolicy; }
// // public void resourcePackPolicy(Object value) { wrapperContained.resourcePackPolicy = value; }
// // public static Object resourcePackPolicy() { return net.minecraft.client.network.ServerInfo.resourcePackPolicy; }
// // public static void resourcePackPolicy(Object value, ) { net.minecraft.client.network.ServerInfo.resourcePackPolicy = value; }

public int protocolVersion() { return wrapperContained.protocolVersion; }
public void protocolVersion(int value) { wrapperContained.protocolVersion = value; }
// public static int protocolVersion() { return net.minecraft.client.network.ServerInfo.protocolVersion; }
// public static void protocolVersion(int value, ) { net.minecraft.client.network.ServerInfo.protocolVersion = value; }

public yarnwrap.text.Text label() { return new yarnwrap.text.Text(wrapperContained.label); }
public void label(yarnwrap.text.Text value) { wrapperContained.label = value.wrapperContained; }
// public static yarnwrap.text.Text label() { return new yarnwrap.text.Text(net.minecraft.client.network.ServerInfo.label); }
// public static void label(yarnwrap.text.Text value, ) { net.minecraft.client.network.ServerInfo.label = value.wrapperContained; }

public long ping() { return wrapperContained.ping; }
public void ping(long value) { wrapperContained.ping = value; }
// public static long ping() { return net.minecraft.client.network.ServerInfo.ping; }
// public static void ping(long value, ) { net.minecraft.client.network.ServerInfo.ping = value; }

public yarnwrap.text.Text version() { return new yarnwrap.text.Text(wrapperContained.version); }
public void version(yarnwrap.text.Text value) { wrapperContained.version = value.wrapperContained; }
// public static yarnwrap.text.Text version() { return new yarnwrap.text.Text(net.minecraft.client.network.ServerInfo.version); }
// public static void version(yarnwrap.text.Text value, ) { net.minecraft.client.network.ServerInfo.version = value.wrapperContained; }

public java.lang.String address() { return wrapperContained.address; }
public void address(java.lang.String value) { wrapperContained.address = value; }
// public static java.lang.String address() { return net.minecraft.client.network.ServerInfo.address; }
// public static void address(java.lang.String value, ) { net.minecraft.client.network.ServerInfo.address = value; }

public java.util.List playerListSummary() { return wrapperContained.playerListSummary; }
public void playerListSummary(java.util.List value) { wrapperContained.playerListSummary = value; }
// public static java.util.List playerListSummary() { return net.minecraft.client.network.ServerInfo.playerListSummary; }
// public static void playerListSummary(java.util.List value, ) { net.minecraft.client.network.ServerInfo.playerListSummary = value; }

public Object players() { return wrapperContained.players; }
// public void players(Object value) { wrapperContained.players = value; }
// // public static Object players() { return net.minecraft.client.network.ServerInfo.players; }
// // public static void players(Object value, ) { net.minecraft.client.network.ServerInfo.players = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ServerInfo.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ServerInfo.LOGGER = value; }

// public byte[] favicon() { return wrapperContained.favicon; }
// public void favicon(byte[] value) { wrapperContained.favicon = value; }
// public static byte[] favicon() { return net.minecraft.client.network.ServerInfo.favicon; }
// public static void favicon(byte[] value, ) { net.minecraft.client.network.ServerInfo.favicon = value; }

// public Object serverType() { return wrapperContained.serverType; }
// // public void serverType(Object value) { wrapperContained.serverType = value; }
// // public static Object serverType() { return net.minecraft.client.network.ServerInfo.serverType; }
// // public static void serverType(Object value, ) { net.minecraft.client.network.ServerInfo.serverType = value; }

// public int MAX_FAVICON_SIZE() { return wrapperContained.MAX_FAVICON_SIZE; }
// public void MAX_FAVICON_SIZE(int value) { wrapperContained.MAX_FAVICON_SIZE = value; }
// public static int MAX_FAVICON_SIZE() { return net.minecraft.client.network.ServerInfo.MAX_FAVICON_SIZE; }
// public static void MAX_FAVICON_SIZE(int value, ) { net.minecraft.client.network.ServerInfo.MAX_FAVICON_SIZE = value; }

// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// // public static Object status() { return net.minecraft.client.network.ServerInfo.status; }
// // public static void status(Object value, ) { net.minecraft.client.network.ServerInfo.status = value; }

// public ServerInfo(java.lang.String name,java.lang.String address,Object serverType) { this.wrapperContained = new net.minecraft.client.network.ServerInfo(name,address,serverType); }
public Object getResourcePackPolicy() { return wrapperContained.getResourcePackPolicy(); }
// public static Object getResourcePackPolicy() { return net.minecraft.client.network.ServerInfo.getResourcePackPolicy(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.client.network.ServerInfo.toNbt()); }
// public yarnwrap.client.network.ServerInfo fromNbt(yarnwrap.nbt.NbtCompound root) { return new yarnwrap.client.network.ServerInfo(wrapperContained.fromNbt(root.wrapperContained)); }
// public static yarnwrap.client.network.ServerInfo fromNbt(yarnwrap.nbt.NbtCompound root, ) { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ServerInfo.fromNbt(root.wrapperContained)); }
public boolean isLocal() { return wrapperContained.isLocal(); }
// public static boolean isLocal() { return net.minecraft.client.network.ServerInfo.isLocal(); }
// public void setResourcePackPolicy(Object resourcePackPolicy) { wrapperContained.setResourcePackPolicy(resourcePackPolicy); }
// public static void setResourcePackPolicy(Object resourcePackPolicy, ) { net.minecraft.client.network.ServerInfo.setResourcePackPolicy(resourcePackPolicy); }
public void copyWithSettingsFrom(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.copyWithSettingsFrom(serverInfo.wrapperContained); }
// public static void copyWithSettingsFrom(yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.network.ServerInfo.copyWithSettingsFrom(serverInfo.wrapperContained); }
public void copyFrom(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.copyFrom(serverInfo.wrapperContained); }
// public static void copyFrom(yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.network.ServerInfo.copyFrom(serverInfo.wrapperContained); }
// public void setFavicon(byte favicon) { wrapperContained.setFavicon(favicon); }
// public static void setFavicon(byte favicon, ) { net.minecraft.client.network.ServerInfo.setFavicon(favicon); }
public byte[] getFavicon() { return wrapperContained.getFavicon(); }
// public static byte[] getFavicon() { return net.minecraft.client.network.ServerInfo.getFavicon(); }
public boolean isRealm() { return wrapperContained.isRealm(); }
// public static boolean isRealm() { return net.minecraft.client.network.ServerInfo.isRealm(); }
// public byte[] validateFavicon(byte favicon) { return wrapperContained.validateFavicon(favicon); }
// public static byte[] validateFavicon(byte favicon, ) { return net.minecraft.client.network.ServerInfo.validateFavicon(favicon); }
public Object getServerType() { return wrapperContained.getServerType(); }
// public static Object getServerType() { return net.minecraft.client.network.ServerInfo.getServerType(); }
// public void setStatus(Object status) { wrapperContained.setStatus(status); }
// public static void setStatus(Object status, ) { net.minecraft.client.network.ServerInfo.setStatus(status); }
public Object getStatus() { return wrapperContained.getStatus(); }
// public static Object getStatus() { return net.minecraft.client.network.ServerInfo.getStatus(); }

}