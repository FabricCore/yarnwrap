package yarnwrap.network.packet.c2s.play;
public class TeleportConfirmC2SPacket { public net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket wrapperContained; public TeleportConfirmC2SPacket(net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int teleportId() { return wrapperContained.teleportId; }
// public void teleportId(int value) { wrapperContained.teleportId = value; }
// public static int teleportId() { return net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.teleportId; }
// public static void teleportId(int value, ) { net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.teleportId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.CODEC = value.wrapperContained; }

public TeleportConfirmC2SPacket(int teleportId) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket(teleportId); }
// public TeleportConfirmC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket(buf.wrapperContained); }
public int getTeleportId() { return wrapperContained.getTeleportId(); }
// public static int getTeleportId() { return net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.getTeleportId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket.write(buf.wrapperContained); }

}