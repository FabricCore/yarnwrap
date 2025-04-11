package yarnwrap.network.packet.s2c.play;
public class EntityAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained; public EntityAnimationS2CPacket(net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int animationId() { return wrapperContained.animationId; }
// public void animationId(int value) { wrapperContained.animationId = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public int SWING_MAIN_HAND() { return wrapperContained.SWING_MAIN_HAND; }
// public void SWING_MAIN_HAND(int value) { wrapperContained.SWING_MAIN_HAND = value; }
public int WAKE_UP() { return wrapperContained.WAKE_UP; }
// public void WAKE_UP(int value) { wrapperContained.WAKE_UP = value; }
public int SWING_OFF_HAND() { return wrapperContained.SWING_OFF_HAND; }
// public void SWING_OFF_HAND(int value) { wrapperContained.SWING_OFF_HAND = value; }
public int CRIT() { return wrapperContained.CRIT; }
// public void CRIT(int value) { wrapperContained.CRIT = value; }
public int ENCHANTED_HIT() { return wrapperContained.ENCHANTED_HIT; }
// public void ENCHANTED_HIT(int value) { wrapperContained.ENCHANTED_HIT = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EntityAnimationS2CPacket(yarnwrap.entity.Entity entity,int animationId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket(entity.wrapperContained,animationId); }
// public EntityAnimationS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket(buf.wrapperContained); }
public int getAnimationId() { return wrapperContained.getAnimationId(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}