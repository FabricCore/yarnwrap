package yarnwrap.network.packet.c2s.login;
public class LoginQueryResponseC2SPacket { public net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained; public LoginQueryResponseC2SPacket(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response); }
// public void response(yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload value) { wrapperContained.response = value.wrapperContained; }
// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public int queryId() { return wrapperContained.queryId(); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload readPayload(int queryId,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.readPayload(queryId,buf.wrapperContained)); }
// public void method_52291(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response) { wrapperContained.method_52291(buf.wrapperContained,response.wrapperContained); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket read(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket(wrapperContained.read(buf.wrapperContained)); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload getVanillaPayload(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.getVanillaPayload(buf.wrapperContained)); }

}