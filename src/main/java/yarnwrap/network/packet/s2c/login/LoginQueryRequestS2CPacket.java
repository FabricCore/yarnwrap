package yarnwrap.network.packet.s2c.login;
public class LoginQueryRequestS2CPacket { public net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained; public LoginQueryRequestS2CPacket(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
// public static int queryId() { return net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.queryId; }
// public static void queryId(int value, ) { net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.queryId = value; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
// public static int MAX_PAYLOAD_SIZE() { return net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.MAX_PAYLOAD_SIZE; }
// public static void MAX_PAYLOAD_SIZE(int value, ) { net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.MAX_PAYLOAD_SIZE = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.CODEC = value.wrapperContained; }

// public LoginQueryRequestS2CPacket(int queryId) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket(queryId); }
// public LoginQueryRequestS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket(buf.wrapperContained); }
// public int queryId() { return wrapperContained.queryId(); }
// // public static int queryId() { return net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.queryId(); }
// public yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload readPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload(wrapperContained.readPayload(id.wrapperContained,buf.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload readPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.readPayload(id.wrapperContained,buf.wrapperContained)); }
// public yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload readUnknownPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload(wrapperContained.readUnknownPayload(id.wrapperContained,buf.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload readUnknownPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.readUnknownPayload(id.wrapperContained,buf.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket.write(buf.wrapperContained); }

}