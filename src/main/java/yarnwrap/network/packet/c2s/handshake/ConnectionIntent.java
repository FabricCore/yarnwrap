package yarnwrap.network.packet.c2s.handshake;
public class ConnectionIntent { public net.minecraft.network.packet.c2s.handshake.ConnectionIntent wrapperContained; public ConnectionIntent(net.minecraft.network.packet.c2s.handshake.ConnectionIntent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int STATUS_ID() { return wrapperContained.STATUS_ID; }
// public void STATUS_ID(int value) { wrapperContained.STATUS_ID = value; }
// public static int STATUS_ID() { return net.minecraft.network.packet.c2s.handshake.ConnectionIntent.STATUS_ID; }
// public static void STATUS_ID(int value, ) { net.minecraft.network.packet.c2s.handshake.ConnectionIntent.STATUS_ID = value; }

// public int LOGIN_ID() { return wrapperContained.LOGIN_ID; }
// public void LOGIN_ID(int value) { wrapperContained.LOGIN_ID = value; }
// public static int LOGIN_ID() { return net.minecraft.network.packet.c2s.handshake.ConnectionIntent.LOGIN_ID; }
// public static void LOGIN_ID(int value, ) { net.minecraft.network.packet.c2s.handshake.ConnectionIntent.LOGIN_ID = value; }

// public int TRANSFER_ID() { return wrapperContained.TRANSFER_ID; }
// public void TRANSFER_ID(int value) { wrapperContained.TRANSFER_ID = value; }
// public static int TRANSFER_ID() { return net.minecraft.network.packet.c2s.handshake.ConnectionIntent.TRANSFER_ID; }
// public static void TRANSFER_ID(int value, ) { net.minecraft.network.packet.c2s.handshake.ConnectionIntent.TRANSFER_ID = value; }

public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.network.packet.c2s.handshake.ConnectionIntent.getId(); }
// public yarnwrap.network.packet.c2s.handshake.ConnectionIntent byId(int id) { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.byId(id)); }
// public static yarnwrap.network.packet.c2s.handshake.ConnectionIntent byId(int id, ) { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(net.minecraft.network.packet.c2s.handshake.ConnectionIntent.byId(id)); }

}