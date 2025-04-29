package yarnwrap.network.packet.s2c.play;
public class EntityStatusS2CPacket { public net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket wrapperContained; public EntityStatusS2CPacket(net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte status() { return wrapperContained.status; }
// public void status(byte value) { wrapperContained.status = value; }
// public static byte status() { return net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.status; }
// public static void status(byte value, ) { net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.status = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.CODEC = value.wrapperContained; }

public EntityStatusS2CPacket(yarnwrap.entity.Entity entity,byte status) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket(entity.wrapperContained,status); }
// public EntityStatusS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket(buf.wrapperContained); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.world.World world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.getEntity(world.wrapperContained)); }
public byte getStatus() { return wrapperContained.getStatus(); }
// public static byte getStatus() { return net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.getStatus(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket.write(buf.wrapperContained); }

}