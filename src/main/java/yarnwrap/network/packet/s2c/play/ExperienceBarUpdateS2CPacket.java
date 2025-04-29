package yarnwrap.network.packet.s2c.play;
public class ExperienceBarUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket wrapperContained; public ExperienceBarUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float barProgress() { return wrapperContained.barProgress; }
// public void barProgress(float value) { wrapperContained.barProgress = value; }
// public static float barProgress() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.barProgress; }
// public static void barProgress(float value, ) { net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.barProgress = value; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public static int experience() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.experience; }
// public static void experience(int value, ) { net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.experience = value; }

// public int experienceLevel() { return wrapperContained.experienceLevel; }
// public void experienceLevel(int value) { wrapperContained.experienceLevel = value; }
// public static int experienceLevel() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.experienceLevel; }
// public static void experienceLevel(int value, ) { net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.experienceLevel = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.CODEC = value.wrapperContained; }

public ExperienceBarUpdateS2CPacket(float barProgress,int experienceLevel,int experience) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket(barProgress,experienceLevel,experience); }
// public ExperienceBarUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket(buf.wrapperContained); }
public int getExperienceLevel() { return wrapperContained.getExperienceLevel(); }
// public static int getExperienceLevel() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.getExperienceLevel(); }
public int getExperience() { return wrapperContained.getExperience(); }
// public static int getExperience() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.getExperience(); }
public float getBarProgress() { return wrapperContained.getBarProgress(); }
// public static float getBarProgress() { return net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.getBarProgress(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket.write(buf.wrapperContained); }

}