package yarnwrap.network.packet.c2s.play;
public class SpectatorTeleportC2SPacket { public net.minecraft.network.packet.c2s.play.SpectatorTeleportC2SPacket wrapperContained; public SpectatorTeleportC2SPacket(net.minecraft.network.packet.c2s.play.SpectatorTeleportC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID targetUuid() { return wrapperContained.targetUuid; }
// public void targetUuid(java.util.UUID value) { wrapperContained.targetUuid = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public SpectatorTeleportC2SPacket(java.util.UUID targetUuid) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.SpectatorTeleportC2SPacket(targetUuid); }
// public SpectatorTeleportC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.SpectatorTeleportC2SPacket(buf.wrapperContained); }
public yarnwrap.entity.Entity getTarget(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.entity.Entity(wrapperContained.getTarget(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}