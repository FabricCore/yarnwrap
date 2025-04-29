package yarnwrap.network.packet.c2s.login;
public class LoginQueryResponseC2SPacket { public net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained; public LoginQueryResponseC2SPacket(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
// public static int queryId() { return net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.queryId; }
// public static void queryId(int value, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.queryId = value; }

// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response); }
// public void response(yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload value) { wrapperContained.response = value.wrapperContained; }
// public static yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.response); }
// public static void response(yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload value, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.response = value.wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
// public static int MAX_PAYLOAD_SIZE() { return net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.MAX_PAYLOAD_SIZE; }
// public static void MAX_PAYLOAD_SIZE(int value, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.MAX_PAYLOAD_SIZE = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.CODEC = value.wrapperContained; }

// public int queryId() { return wrapperContained.queryId(); }
// // public static int queryId() { return net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.queryId(); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.response()); }
// // public static yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response() { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.response()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.write(buf.wrapperContained); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload readPayload(int queryId,yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.readPayload(queryId,buf.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload readPayload(int queryId,yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.readPayload(queryId,buf.wrapperContained)); }
// public void method_52291(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response) { wrapperContained.method_52291(buf.wrapperContained,response.wrapperContained); }
// public static void method_52291(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload response, ) { net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.method_52291(buf.wrapperContained,response.wrapperContained); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket read(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket(wrapperContained.read(buf.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket read(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.read(buf.wrapperContained)); }
// public yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload getVanillaPayload(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(wrapperContained.getVanillaPayload(buf.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload getVanillaPayload(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.packet.c2s.login.LoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket.getVanillaPayload(buf.wrapperContained)); }

}