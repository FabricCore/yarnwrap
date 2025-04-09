package yarnwrap.network.packet.s2c.play;
public class WorldTimeUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained; public WorldTimeUpdateS2CPacket(net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long timeOfDay() { return wrapperContained.timeOfDay; }
// public long time() { return wrapperContained.time; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public long getTime() { return wrapperContained.getTime(); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}