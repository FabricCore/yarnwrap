package yarnwrap.network.packet.c2s.handshake;
public class ConnectionIntent { public net.minecraft.network.packet.c2s.handshake.ConnectionIntent wrapperContained; public ConnectionIntent(net.minecraft.network.packet.c2s.handshake.ConnectionIntent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int STATUS_ID() { return wrapperContained.STATUS_ID; }
// public int LOGIN_ID() { return wrapperContained.LOGIN_ID; }
// public int TRANSFER_ID() { return wrapperContained.TRANSFER_ID; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.network.packet.c2s.handshake.ConnectionIntent byId(int id) { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.byId(id)); }

}