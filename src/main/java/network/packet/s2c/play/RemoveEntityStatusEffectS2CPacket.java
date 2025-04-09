package yarnwrap.network.packet.s2c.play;
public class RemoveEntityStatusEffectS2CPacket { public net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket wrapperContained; public RemoveEntityStatusEffectS2CPacket(net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }

}