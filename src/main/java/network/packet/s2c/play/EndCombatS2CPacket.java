package yarnwrap.network.packet.s2c.play;
public class EndCombatS2CPacket { public net.minecraft.network.packet.s2c.play.EndCombatS2CPacket wrapperContained; public EndCombatS2CPacket(net.minecraft.network.packet.s2c.play.EndCombatS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int timeSinceLastAttack() { return wrapperContained.timeSinceLastAttack; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}