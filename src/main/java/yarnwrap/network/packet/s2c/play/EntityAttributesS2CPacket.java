package yarnwrap.network.packet.s2c.play;
public class EntityAttributesS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained; public EntityAttributesS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getEntityId() { return wrapperContained.getEntityId(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }

}