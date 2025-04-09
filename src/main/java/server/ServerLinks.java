package yarnwrap.server;
public class ServerLinks { public net.minecraft.server.ServerLinks wrapperContained; public ServerLinks(net.minecraft.server.ServerLinks wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.ServerLinks EMPTY() { return new yarnwrap.server.ServerLinks(wrapperContained.EMPTY); }
public yarnwrap.network.codec.PacketCodec TYPE_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.TYPE_CODEC); }
public yarnwrap.network.codec.PacketCodec LIST_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_CODEC); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public java.util.Optional getEntryFor(Object known) { return wrapperContained.getEntryFor(known); }
public java.util.List getLinks() { return wrapperContained.getLinks(); }

}