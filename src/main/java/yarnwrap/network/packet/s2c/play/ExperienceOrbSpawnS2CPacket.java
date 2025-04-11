package yarnwrap.network.packet.s2c.play;
public class ExperienceOrbSpawnS2CPacket { public net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained; public ExperienceOrbSpawnS2CPacket(net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public ExperienceOrbSpawnS2CPacket(yarnwrap.entity.ExperienceOrbEntity orb,yarnwrap.server.network.EntityTrackerEntry entry) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket(orb.wrapperContained,entry.wrapperContained); }
// public ExperienceOrbSpawnS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket(buf.wrapperContained); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public int getExperience() { return wrapperContained.getExperience(); }
public double getX() { return wrapperContained.getX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}