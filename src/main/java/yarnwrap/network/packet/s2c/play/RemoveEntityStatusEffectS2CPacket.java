package yarnwrap.network.packet.s2c.play;
public class RemoveEntityStatusEffectS2CPacket { public net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket wrapperContained; public RemoveEntityStatusEffectS2CPacket(net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket.CODEC = value.wrapperContained; }

// public RemoveEntityStatusEffectS2CPacket(int entityId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket(entityId); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.world.World world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket.getEntity(world.wrapperContained)); }

}