package yarnwrap.network.packet.s2c.play;
public class EndCombatS2CPacket { public net.minecraft.network.packet.s2c.play.EndCombatS2CPacket wrapperContained; public EndCombatS2CPacket(net.minecraft.network.packet.s2c.play.EndCombatS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int timeSinceLastAttack() { return wrapperContained.timeSinceLastAttack; }
// public void timeSinceLastAttack(int value) { wrapperContained.timeSinceLastAttack = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EndCombatS2CPacket(int timeSinceLastAttack) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EndCombatS2CPacket(timeSinceLastAttack); }
public EndCombatS2CPacket(yarnwrap.entity.damage.DamageTracker damageTracker) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EndCombatS2CPacket(damageTracker.wrapperContained); }
// public EndCombatS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EndCombatS2CPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}