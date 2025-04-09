package yarnwrap.network.packet.c2s.login;
public class LoginQueryResponseC2SPacket { public net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained; public LoginQueryResponseC2SPacket(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response); }
// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int queryId() { return wrapperContained.queryId(); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload readPayload(int queryId,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.readPayload(queryId,buf.wrapperContained)); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket read(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket(wrapperContained.read(buf.wrapperContained)); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload getVanillaPayload(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.getVanillaPayload(buf.wrapperContained)); }

}