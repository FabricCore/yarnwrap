package yarnwrap.network.packet.s2c.play;
public class EntityEquipmentUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained; public EntityEquipmentUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public java.util.List equipmentList() { return wrapperContained.equipmentList; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public java.util.List getEquipmentList() { return wrapperContained.getEquipmentList(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}