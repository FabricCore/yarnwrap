package yarnwrap.network.packet.s2c.play;
public class DamageTiltS2CPacket { public net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket wrapperContained; public DamageTiltS2CPacket(net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public DamageTiltS2CPacket(yarnwrap.entity.LivingEntity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket(entity.wrapperContained); }
// public DamageTiltS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}