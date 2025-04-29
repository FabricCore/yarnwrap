package yarnwrap.network.packet.s2c.play;
public class SetCameraEntityS2CPacket { public net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket wrapperContained; public SetCameraEntityS2CPacket(net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.CODEC = value.wrapperContained; }

public SetCameraEntityS2CPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket(entity.wrapperContained); }
// public SetCameraEntityS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket(buf.wrapperContained); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.world.World world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.getEntity(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket.write(buf.wrapperContained); }

}