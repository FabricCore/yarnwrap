package yarnwrap.network.packet.s2c.play;
public class EntityAttributesS2CPacket { public net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained; public EntityAttributesS2CPacket(net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.entityId = value; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.entries = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.CODEC = value.wrapperContained; }

public EntityAttributesS2CPacket(int entityId,java.util.Collection attributes) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket(entityId,attributes); }
public EntityAttributesS2CPacket(int entityId,java.util.List attributes) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket(entityId,attributes); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.getEntityId(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }
// public static java.util.List getEntries() { return net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket.getEntries(); }

}