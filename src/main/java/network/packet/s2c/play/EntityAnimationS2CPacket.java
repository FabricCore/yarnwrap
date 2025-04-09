package yarnwrap.network.packet.s2c.play;
public class EntityAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained; public EntityAnimationS2CPacket(net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int animationId() { return wrapperContained.animationId; }
// public int entityId() { return wrapperContained.entityId; }
public int SWING_MAIN_HAND() { return wrapperContained.SWING_MAIN_HAND; }
public int WAKE_UP() { return wrapperContained.WAKE_UP; }
public int SWING_OFF_HAND() { return wrapperContained.SWING_OFF_HAND; }
public int CRIT() { return wrapperContained.CRIT; }
public int ENCHANTED_HIT() { return wrapperContained.ENCHANTED_HIT; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getAnimationId() { return wrapperContained.getAnimationId(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}