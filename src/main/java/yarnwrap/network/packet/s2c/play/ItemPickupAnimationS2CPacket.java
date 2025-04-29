package yarnwrap.network.packet.s2c.play;
public class ItemPickupAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained; public ItemPickupAnimationS2CPacket(net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int stackAmount() { return wrapperContained.stackAmount; }
// public void stackAmount(int value) { wrapperContained.stackAmount = value; }
// public static int stackAmount() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.stackAmount; }
// public static void stackAmount(int value, ) { net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.stackAmount = value; }

// public int collectorEntityId() { return wrapperContained.collectorEntityId; }
// public void collectorEntityId(int value) { wrapperContained.collectorEntityId = value; }
// public static int collectorEntityId() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.collectorEntityId; }
// public static void collectorEntityId(int value, ) { net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.collectorEntityId = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.CODEC = value.wrapperContained; }

public ItemPickupAnimationS2CPacket(int entityId,int collectorId,int stackAmount) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket(entityId,collectorId,stackAmount); }
// public ItemPickupAnimationS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket(buf.wrapperContained); }
public int getCollectorEntityId() { return wrapperContained.getCollectorEntityId(); }
// public static int getCollectorEntityId() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.getCollectorEntityId(); }
public int getStackAmount() { return wrapperContained.getStackAmount(); }
// public static int getStackAmount() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.getStackAmount(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket.write(buf.wrapperContained); }

}