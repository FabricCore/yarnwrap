package yarnwrap.network.packet.s2c.play;
public class EntityAttachS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained; public EntityAttachS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int holdingEntityId() { return wrapperContained.holdingEntityId; }
// public void holdingEntityId(int value) { wrapperContained.holdingEntityId = value; }
// public static int holdingEntityId() { return net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.holdingEntityId; }
// public static void holdingEntityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.holdingEntityId = value; }

// public int attachedEntityId() { return wrapperContained.attachedEntityId; }
// public void attachedEntityId(int value) { wrapperContained.attachedEntityId = value; }
// public static int attachedEntityId() { return net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.attachedEntityId; }
// public static void attachedEntityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.attachedEntityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.CODEC = value.wrapperContained; }

public EntityAttachS2CPacket(yarnwrap.entity.Entity attachedEntity,yarnwrap.entity.Entity holdingEntity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket(attachedEntity.wrapperContained,holdingEntity.wrapperContained); }
// public EntityAttachS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket(buf.wrapperContained); }
public int getHoldingEntityId() { return wrapperContained.getHoldingEntityId(); }
// public static int getHoldingEntityId() { return net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.getHoldingEntityId(); }
public int getAttachedEntityId() { return wrapperContained.getAttachedEntityId(); }
// public static int getAttachedEntityId() { return net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.getAttachedEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket.write(buf.wrapperContained); }

}