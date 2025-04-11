package yarnwrap.network.packet.s2c.play;
public class EntitySetHeadYawS2CPacket { public net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket wrapperContained; public EntitySetHeadYawS2CPacket(net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte headYaw() { return wrapperContained.headYaw; }
// public void headYaw(byte value) { wrapperContained.headYaw = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EntitySetHeadYawS2CPacket(yarnwrap.entity.Entity entity,byte headYaw) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket(entity.wrapperContained,headYaw); }
// public EntitySetHeadYawS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket(buf.wrapperContained); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
public byte getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}