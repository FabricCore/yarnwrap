package yarnwrap.network.packet.s2c.play;
public class EntityEquipmentUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained; public EntityEquipmentUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public java.util.List equipmentList() { return wrapperContained.equipmentList; }
// public void equipmentList(java.util.List value) { wrapperContained.equipmentList = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EntityEquipmentUpdateS2CPacket(int entityId,java.util.List equipmentList) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket(entityId,equipmentList); }
// public EntityEquipmentUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public java.util.List getEquipmentList() { return wrapperContained.getEquipmentList(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}