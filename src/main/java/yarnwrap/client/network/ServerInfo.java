package yarnwrap.client.network;
public class ServerInfo { public net.minecraft.client.network.ServerInfo wrapperContained; public ServerInfo(net.minecraft.client.network.ServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.text.Text playerCountLabel() { return new yarnwrap.text.Text(wrapperContained.playerCountLabel); }
public void playerCountLabel(yarnwrap.text.Text value) { wrapperContained.playerCountLabel = value.wrapperContained; }
// public Object resourcePackPolicy() { return wrapperContained.resourcePackPolicy; }
// // public void resourcePackPolicy(Object value) { wrapperContained.resourcePackPolicy = value; }
public int protocolVersion() { return wrapperContained.protocolVersion; }
public void protocolVersion(int value) { wrapperContained.protocolVersion = value; }
public yarnwrap.text.Text label() { return new yarnwrap.text.Text(wrapperContained.label); }
public void label(yarnwrap.text.Text value) { wrapperContained.label = value.wrapperContained; }
public long ping() { return wrapperContained.ping; }
public void ping(long value) { wrapperContained.ping = value; }
public yarnwrap.text.Text version() { return new yarnwrap.text.Text(wrapperContained.version); }
public void version(yarnwrap.text.Text value) { wrapperContained.version = value.wrapperContained; }
public java.lang.String address() { return wrapperContained.address; }
public void address(java.lang.String value) { wrapperContained.address = value; }
public java.util.List playerListSummary() { return wrapperContained.playerListSummary; }
public void playerListSummary(java.util.List value) { wrapperContained.playerListSummary = value; }
public Object players() { return wrapperContained.players; }
// public void players(Object value) { wrapperContained.players = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public byte[] favicon() { return wrapperContained.favicon; }
// public void favicon(byte[] value) { wrapperContained.favicon = value; }
// public Object serverType() { return wrapperContained.serverType; }
// // public void serverType(Object value) { wrapperContained.serverType = value; }
// public int MAX_FAVICON_SIZE() { return wrapperContained.MAX_FAVICON_SIZE; }
// public void MAX_FAVICON_SIZE(int value) { wrapperContained.MAX_FAVICON_SIZE = value; }
// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// public ServerInfo(java.lang.String name,java.lang.String address,Object serverType) { this.wrapperContained = new net.minecraft.client.network.ServerInfo(name,address,serverType); }
public Object getResourcePackPolicy() { return wrapperContained.getResourcePackPolicy(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public yarnwrap.client.network.ServerInfo fromNbt(yarnwrap.nbt.NbtCompound root) { return new yarnwrap.client.network.ServerInfo(wrapperContained.fromNbt(root.wrapperContained)); }
public boolean isLocal() { return wrapperContained.isLocal(); }
// public void setResourcePackPolicy(Object resourcePackPolicy) { wrapperContained.setResourcePackPolicy(resourcePackPolicy); }
public void copyWithSettingsFrom(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.copyWithSettingsFrom(serverInfo.wrapperContained); }
public void copyFrom(yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.copyFrom(serverInfo.wrapperContained); }
// public void setFavicon(byte favicon) { wrapperContained.setFavicon(favicon); }
public byte[] getFavicon() { return wrapperContained.getFavicon(); }
public boolean isRealm() { return wrapperContained.isRealm(); }
// public byte[] validateFavicon(byte favicon) { return wrapperContained.validateFavicon(favicon); }
public Object getServerType() { return wrapperContained.getServerType(); }
// public void setStatus(Object status) { wrapperContained.setStatus(status); }
public Object getStatus() { return wrapperContained.getStatus(); }

}