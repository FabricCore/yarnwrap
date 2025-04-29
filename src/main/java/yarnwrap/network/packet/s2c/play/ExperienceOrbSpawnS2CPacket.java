package yarnwrap.network.packet.s2c.play;
public class ExperienceOrbSpawnS2CPacket { public net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained; public ExperienceOrbSpawnS2CPacket(net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.x = value; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public static int experience() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.experience; }
// public static void experience(int value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.experience = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.CODEC = value.wrapperContained; }

public ExperienceOrbSpawnS2CPacket(yarnwrap.entity.ExperienceOrbEntity orb,yarnwrap.server.network.EntityTrackerEntry entry) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket(orb.wrapperContained,entry.wrapperContained); }
// public ExperienceOrbSpawnS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket(buf.wrapperContained); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.getZ(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.getY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.getEntityId(); }
public int getExperience() { return wrapperContained.getExperience(); }
// public static int getExperience() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.getExperience(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.getX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket.write(buf.wrapperContained); }

}