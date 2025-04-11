package yarnwrap.network.packet.s2c.login;
public class LoginQueryRequestS2CPacket { public net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained; public LoginQueryRequestS2CPacket(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public LoginQueryRequestS2CPacket(int queryId) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket(queryId); }
// public LoginQueryRequestS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket(buf.wrapperContained); }
// public int queryId() { return wrapperContained.queryId(); }
// public yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload readPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload(wrapperContained.readPayload(id.wrapperContained,buf.wrapperContained)); }
// public yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload readUnknownPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload(wrapperContained.readUnknownPayload(id.wrapperContained,buf.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}