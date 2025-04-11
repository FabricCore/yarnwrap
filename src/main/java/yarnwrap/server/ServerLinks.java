package yarnwrap.server;
public class ServerLinks { public net.minecraft.server.ServerLinks wrapperContained; public ServerLinks(net.minecraft.server.ServerLinks wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.ServerLinks EMPTY() { return new yarnwrap.server.ServerLinks(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.server.ServerLinks value) { wrapperContained.EMPTY = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec TYPE_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.TYPE_CODEC); }
// public void TYPE_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.TYPE_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec LIST_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_CODEC); }
// public void LIST_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LIST_CODEC = value.wrapperContained; }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public java.util.Optional getEntryFor(Object known) { return wrapperContained.getEntryFor(known); }
// public boolean method_60659(Object entry) { return wrapperContained.method_60659(entry); }
// public java.lang.Boolean method_60660(Object type) { return wrapperContained.method_60660(type); }
// public java.lang.Boolean method_60661(yarnwrap.text.Text text) { return wrapperContained.method_60661(text.wrapperContained); }
// public Object method_60937(Object entry) { return wrapperContained.method_60937(entry); }
public java.util.List getLinks() { return wrapperContained.getLinks(); }

}