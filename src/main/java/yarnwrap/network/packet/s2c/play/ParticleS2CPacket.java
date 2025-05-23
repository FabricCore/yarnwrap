package yarnwrap.network.packet.s2c.play;
public class ParticleS2CPacket { public net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained; public ParticleS2CPacket(net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float offsetZ() { return wrapperContained.offsetZ; }
// public void offsetZ(float value) { wrapperContained.offsetZ = value; }
// public static float offsetZ() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetZ; }
// public static void offsetZ(float value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetZ = value; }

// public float offsetY() { return wrapperContained.offsetY; }
// public void offsetY(float value) { wrapperContained.offsetY = value; }
// public static float offsetY() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetY; }
// public static void offsetY(float value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetY = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.count; }
// public static void count(int value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.count = value; }

// public boolean forceSpawn() { return wrapperContained.forceSpawn; }
// public void forceSpawn(boolean value) { wrapperContained.forceSpawn = value; }
// public static boolean forceSpawn() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.forceSpawn; }
// public static void forceSpawn(boolean value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.forceSpawn = value; }

// public float offsetX() { return wrapperContained.offsetX; }
// public void offsetX(float value) { wrapperContained.offsetX = value; }
// public static float offsetX() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetX; }
// public static void offsetX(float value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.offsetX = value; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.x = value; }

// public yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.parameters); }
// public void parameters(yarnwrap.particle.ParticleEffect value) { wrapperContained.parameters = value.wrapperContained; }
// public static yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(net.minecraft.network.packet.s2c.play.ParticleS2CPacket.parameters); }
// public static void parameters(yarnwrap.particle.ParticleEffect value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.parameters = value.wrapperContained; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.speed; }
// public static void speed(float value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.speed = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ParticleS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.CODEC = value.wrapperContained; }

// public boolean important() { return wrapperContained.important; }
// public void important(boolean value) { wrapperContained.important = value; }
// public static boolean important() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.important; }
// public static void important(boolean value, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.important = value; }

public ParticleS2CPacket(yarnwrap.particle.ParticleEffect parameters,boolean forceSpawn,boolean important,double x,double y,double z,float offsetX,float offsetY,float offsetZ,float speed,int count) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ParticleS2CPacket(parameters.wrapperContained,forceSpawn,important,x,y,z,offsetX,offsetY,offsetZ,speed,count); }
// public ParticleS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ParticleS2CPacket(buf.wrapperContained); }
public float getSpeed() { return wrapperContained.getSpeed(); }
// public static float getSpeed() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getSpeed(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getX(); }
public int getCount() { return wrapperContained.getCount(); }
// public static int getCount() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getCount(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getZ(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getY(); }
public float getOffsetX() { return wrapperContained.getOffsetX(); }
// public static float getOffsetX() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getOffsetX(); }
public float getOffsetY() { return wrapperContained.getOffsetY(); }
// public static float getOffsetY() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getOffsetY(); }
public float getOffsetZ() { return wrapperContained.getOffsetZ(); }
// public static float getOffsetZ() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getOffsetZ(); }
public yarnwrap.particle.ParticleEffect getParameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParameters()); }
// public static yarnwrap.particle.ParticleEffect getParameters() { return new yarnwrap.particle.ParticleEffect(net.minecraft.network.packet.s2c.play.ParticleS2CPacket.getParameters()); }
public boolean shouldForceSpawn() { return wrapperContained.shouldForceSpawn(); }
// public static boolean shouldForceSpawn() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.shouldForceSpawn(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ParticleS2CPacket.write(buf.wrapperContained); }
public boolean isImportant() { return wrapperContained.isImportant(); }
// public static boolean isImportant() { return net.minecraft.network.packet.s2c.play.ParticleS2CPacket.isImportant(); }

}