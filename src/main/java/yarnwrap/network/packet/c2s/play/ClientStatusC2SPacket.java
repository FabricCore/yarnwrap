package yarnwrap.network.packet.c2s.play;
public class ClientStatusC2SPacket { public net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained; public ClientStatusC2SPacket(net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object mode() { return wrapperContained.mode; }
// // public void mode(Object value) { wrapperContained.mode = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public Object getMode() { return wrapperContained.getMode(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}