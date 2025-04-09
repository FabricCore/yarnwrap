package yarnwrap.network.packet.c2s.play;
public class ClientStatusC2SPacket { public net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained; public ClientStatusC2SPacket(net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object mode() { return wrapperContained.mode; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object getMode() { return wrapperContained.getMode(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}