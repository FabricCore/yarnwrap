package yarnwrap.network.packet.c2s.play;
public class UpdatePlayerAbilitiesC2SPacket { public net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket wrapperContained; public UpdatePlayerAbilitiesC2SPacket(net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean flying() { return wrapperContained.flying; }
// public int FLYING_MASK() { return wrapperContained.FLYING_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public boolean isFlying() { return wrapperContained.isFlying(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}