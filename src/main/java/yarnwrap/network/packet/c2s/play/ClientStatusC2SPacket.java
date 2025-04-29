package yarnwrap.network.packet.c2s.play;
public class ClientStatusC2SPacket { public net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained; public ClientStatusC2SPacket(net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object mode() { return wrapperContained.mode; }
// // public void mode(Object value) { wrapperContained.mode = value; }
// // public static Object mode() { return net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.mode; }
// // public static void mode(Object value, ) { net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.mode = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.CODEC = value.wrapperContained; }

// public ClientStatusC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket(buf.wrapperContained); }
// public ClientStatusC2SPacket(Object mode) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket(mode); }
public Object getMode() { return wrapperContained.getMode(); }
// public static Object getMode() { return net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.getMode(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.write(buf.wrapperContained); }

}