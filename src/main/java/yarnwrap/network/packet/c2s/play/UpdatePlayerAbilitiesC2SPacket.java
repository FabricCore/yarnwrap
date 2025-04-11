package yarnwrap.network.packet.c2s.play;
public class UpdatePlayerAbilitiesC2SPacket { public net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket wrapperContained; public UpdatePlayerAbilitiesC2SPacket(net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean flying() { return wrapperContained.flying; }
// public void flying(boolean value) { wrapperContained.flying = value; }
// public int FLYING_MASK() { return wrapperContained.FLYING_MASK; }
// public void FLYING_MASK(int value) { wrapperContained.FLYING_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public UpdatePlayerAbilitiesC2SPacket(yarnwrap.entity.player.PlayerAbilities abilities) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket(abilities.wrapperContained); }
// public UpdatePlayerAbilitiesC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket(buf.wrapperContained); }
public boolean isFlying() { return wrapperContained.isFlying(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}