package yarnwrap.network.packet.s2c.play;
public class EntityEquipmentUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained; public EntityEquipmentUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.entityId = value; }

// public java.util.List equipmentList() { return wrapperContained.equipmentList; }
// public void equipmentList(java.util.List value) { wrapperContained.equipmentList = value; }
// public static java.util.List equipmentList() { return net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.equipmentList; }
// public static void equipmentList(java.util.List value, ) { net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.equipmentList = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.CODEC = value.wrapperContained; }

public EntityEquipmentUpdateS2CPacket(int entityId,java.util.List equipmentList) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket(entityId,equipmentList); }
// public EntityEquipmentUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.getEntityId(); }
public java.util.List getEquipmentList() { return wrapperContained.getEquipmentList(); }
// public static java.util.List getEquipmentList() { return net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.getEquipmentList(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket.write(buf.wrapperContained); }

}