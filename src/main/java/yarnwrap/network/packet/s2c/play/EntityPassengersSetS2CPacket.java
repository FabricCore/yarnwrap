package yarnwrap.network.packet.s2c.play;
public class EntityPassengersSetS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained; public EntityPassengersSetS2CPacket(net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] passengerIds() { return wrapperContained.passengerIds; }
// public void passengerIds(int[] value) { wrapperContained.passengerIds = value; }
// public static int[] passengerIds() { return net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.passengerIds; }
// public static void passengerIds(int[] value, ) { net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.passengerIds = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.CODEC = value.wrapperContained; }

public EntityPassengersSetS2CPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket(entity.wrapperContained); }
// public EntityPassengersSetS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket(buf.wrapperContained); }
public int[] getPassengerIds() { return wrapperContained.getPassengerIds(); }
// public static int[] getPassengerIds() { return net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.getPassengerIds(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket.write(buf.wrapperContained); }

}