package yarnwrap.network.packet.s2c.play;
public class HealthUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket wrapperContained; public HealthUpdateS2CPacket(net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float saturation() { return wrapperContained.saturation; }
// public void saturation(float value) { wrapperContained.saturation = value; }
// public static float saturation() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.saturation; }
// public static void saturation(float value, ) { net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.saturation = value; }

// public float health() { return wrapperContained.health; }
// public void health(float value) { wrapperContained.health = value; }
// public static float health() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.health; }
// public static void health(float value, ) { net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.health = value; }

// public int food() { return wrapperContained.food; }
// public void food(int value) { wrapperContained.food = value; }
// public static int food() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.food; }
// public static void food(int value, ) { net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.food = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.CODEC = value.wrapperContained; }

public HealthUpdateS2CPacket(float health,int food,float saturation) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket(health,food,saturation); }
// public HealthUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket(buf.wrapperContained); }
public int getFood() { return wrapperContained.getFood(); }
// public static int getFood() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.getFood(); }
public float getHealth() { return wrapperContained.getHealth(); }
// public static float getHealth() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.getHealth(); }
public float getSaturation() { return wrapperContained.getSaturation(); }
// public static float getSaturation() { return net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.getSaturation(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket.write(buf.wrapperContained); }

}