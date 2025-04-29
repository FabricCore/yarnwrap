package yarnwrap.network.packet.s2c.play;
public class EntityAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained; public EntityAnimationS2CPacket(net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int animationId() { return wrapperContained.animationId; }
// public void animationId(int value) { wrapperContained.animationId = value; }
// public static int animationId() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.animationId; }
// public static void animationId(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.animationId = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.entityId = value; }

// public int SWING_MAIN_HAND() { return wrapperContained.SWING_MAIN_HAND; }
// public void SWING_MAIN_HAND(int value) { wrapperContained.SWING_MAIN_HAND = value; }
public static int SWING_MAIN_HAND() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.SWING_MAIN_HAND; }
// public static void SWING_MAIN_HAND(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.SWING_MAIN_HAND = value; }

// public int WAKE_UP() { return wrapperContained.WAKE_UP; }
// public void WAKE_UP(int value) { wrapperContained.WAKE_UP = value; }
public static int WAKE_UP() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.WAKE_UP; }
// public static void WAKE_UP(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.WAKE_UP = value; }

// public int SWING_OFF_HAND() { return wrapperContained.SWING_OFF_HAND; }
// public void SWING_OFF_HAND(int value) { wrapperContained.SWING_OFF_HAND = value; }
public static int SWING_OFF_HAND() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.SWING_OFF_HAND; }
// public static void SWING_OFF_HAND(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.SWING_OFF_HAND = value; }

// public int CRIT() { return wrapperContained.CRIT; }
// public void CRIT(int value) { wrapperContained.CRIT = value; }
public static int CRIT() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.CRIT; }
// public static void CRIT(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.CRIT = value; }

// public int ENCHANTED_HIT() { return wrapperContained.ENCHANTED_HIT; }
// public void ENCHANTED_HIT(int value) { wrapperContained.ENCHANTED_HIT = value; }
public static int ENCHANTED_HIT() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.ENCHANTED_HIT; }
// public static void ENCHANTED_HIT(int value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.ENCHANTED_HIT = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.CODEC = value.wrapperContained; }

public EntityAnimationS2CPacket(yarnwrap.entity.Entity entity,int animationId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket(entity.wrapperContained,animationId); }
// public EntityAnimationS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket(buf.wrapperContained); }
public int getAnimationId() { return wrapperContained.getAnimationId(); }
// public static int getAnimationId() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.getAnimationId(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket.write(buf.wrapperContained); }

}