package yarnwrap.network.packet.s2c.play;
public class HealthUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket wrapperContained; public HealthUpdateS2CPacket(net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float saturation() { return wrapperContained.saturation; }
// public float health() { return wrapperContained.health; }
// public int food() { return wrapperContained.food; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getFood() { return wrapperContained.getFood(); }
public float getHealth() { return wrapperContained.getHealth(); }
public float getSaturation() { return wrapperContained.getSaturation(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}