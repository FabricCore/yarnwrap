package yarnwrap.network.packet.s2c.play;
public class EntitySetHeadYawS2CPacket { public net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket wrapperContained; public EntitySetHeadYawS2CPacket(net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte headYaw() { return wrapperContained.headYaw; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
public byte getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}