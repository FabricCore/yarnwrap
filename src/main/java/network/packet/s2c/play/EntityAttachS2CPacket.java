package yarnwrap.network.packet.s2c.play;
public class EntityAttachS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained; public EntityAttachS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int holdingEntityId() { return wrapperContained.holdingEntityId; }
// public int attachedEntityId() { return wrapperContained.attachedEntityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getHoldingEntityId() { return wrapperContained.getHoldingEntityId(); }
public int getAttachedEntityId() { return wrapperContained.getAttachedEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}