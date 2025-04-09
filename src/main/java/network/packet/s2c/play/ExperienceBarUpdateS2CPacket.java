package yarnwrap.network.packet.s2c.play;
public class ExperienceBarUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket wrapperContained; public ExperienceBarUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float barProgress() { return wrapperContained.barProgress; }
// public int experience() { return wrapperContained.experience; }
// public int experienceLevel() { return wrapperContained.experienceLevel; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getExperienceLevel() { return wrapperContained.getExperienceLevel(); }
public int getExperience() { return wrapperContained.getExperience(); }
public float getBarProgress() { return wrapperContained.getBarProgress(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}