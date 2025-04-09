package yarnwrap.client.network;
public class ServerInfo { public net.minecraft.client.network.ServerInfo wrapperContained; public ServerInfo(net.minecraft.client.network.ServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.text.Text playerCountLabel() { return new yarnwrap.text.Text(wrapperContained.playerCountLabel); }
// public Object resourcePackPolicy() { return wrapperContained.resourcePackPolicy; }
public int protocolVersion() { return wrapperContained.protocolVersion; }
public yarnwrap.text.Text label() { return new yarnwrap.text.Text(wrapperContained.label); }
public long ping() { return wrapperContained.ping; }
public yarnwrap.text.Text version() { return new yarnwrap.text.Text(wrapperContained.version); }
public java.lang.String address() { return wrapperContained.address; }
public java.util.List playerListSummary() { return wrapperContained.playerListSummary; }
public Object players() { return wrapperContained.players; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public byte[] favicon() { return wrapperContained.favicon; }
// public Object serverType() { return wrapperContained.serverType; }
// public int MAX_FAVICON_SIZE() { return wrapperContained.MAX_FAVICON_SIZE; }
// public Object status() { return wrapperContained.status; }
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