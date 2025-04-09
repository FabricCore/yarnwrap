package yarnwrap.network.packet.c2s.play;
public class TeleportConfirmC2SPacket { public net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket wrapperContained; public TeleportConfirmC2SPacket(net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int teleportId() { return wrapperContained.teleportId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getTeleportId() { return wrapperContained.getTeleportId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}