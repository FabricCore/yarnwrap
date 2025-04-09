package yarnwrap.network.packet.s2c.play;
public class ExperienceOrbSpawnS2CPacket { public net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained; public ExperienceOrbSpawnS2CPacket(net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public double x() { return wrapperContained.x; }
// public int experience() { return wrapperContained.experience; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public int getExperience() { return wrapperContained.getExperience(); }
public double getX() { return wrapperContained.getX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}