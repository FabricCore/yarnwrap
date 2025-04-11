package yarnwrap.network.packet.s2c.play;
public class EntityAttachS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained; public EntityAttachS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int holdingEntityId() { return wrapperContained.holdingEntityId; }
// public void holdingEntityId(int value) { wrapperContained.holdingEntityId = value; }
// public int attachedEntityId() { return wrapperContained.attachedEntityId; }
// public void attachedEntityId(int value) { wrapperContained.attachedEntityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EntityAttachS2CPacket(yarnwrap.entity.Entity attachedEntity,yarnwrap.entity.Entity holdingEntity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket(attachedEntity.wrapperContained,holdingEntity.wrapperContained); }
// public EntityAttachS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket(buf.wrapperContained); }
public int getHoldingEntityId() { return wrapperContained.getHoldingEntityId(); }
public int getAttachedEntityId() { return wrapperContained.getAttachedEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}