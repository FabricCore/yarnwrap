package yarnwrap.network.packet.s2c.play;
public class ItemPickupAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained; public ItemPickupAnimationS2CPacket(net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int stackAmount() { return wrapperContained.stackAmount; }
// public void stackAmount(int value) { wrapperContained.stackAmount = value; }
// public int collectorEntityId() { return wrapperContained.collectorEntityId; }
// public void collectorEntityId(int value) { wrapperContained.collectorEntityId = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getCollectorEntityId() { return wrapperContained.getCollectorEntityId(); }
public int getStackAmount() { return wrapperContained.getStackAmount(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}