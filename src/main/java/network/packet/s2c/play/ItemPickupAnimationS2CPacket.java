package yarnwrap.network.packet.s2c.play;
public class ItemPickupAnimationS2CPacket { public net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained; public ItemPickupAnimationS2CPacket(net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int stackAmount() { return wrapperContained.stackAmount; }
// public int collectorEntityId() { return wrapperContained.collectorEntityId; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getCollectorEntityId() { return wrapperContained.getCollectorEntityId(); }
public int getStackAmount() { return wrapperContained.getStackAmount(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}