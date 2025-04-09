package yarnwrap.network.packet.s2c.login;
public class LoginQueryRequestS2CPacket { public net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained; public LoginQueryRequestS2CPacket(net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int queryId() { return wrapperContained.queryId(); }
// public yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload readPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.LoginQueryRequestPayload(wrapperContained.readPayload(id.wrapperContained,buf.wrapperContained)); }
// public yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload readUnknownPayload(yarnwrap.util.Identifier id,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.s2c.login.UnknownLoginQueryRequestPayload(wrapperContained.readUnknownPayload(id.wrapperContained,buf.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}