package yarnwrap.network.packet.s2c.play;
public class EntityAttributesS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained; public EntityAttributesS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public java.util.List entries() { return wrapperContained.entries; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }

}