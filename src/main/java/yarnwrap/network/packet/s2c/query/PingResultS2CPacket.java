package yarnwrap.network.packet.s2c.query;
public class PingResultS2CPacket { public net.minecraft.network.packet.s2c.query.PingResultS2CPacket wrapperContained; public PingResultS2CPacket(net.minecraft.network.packet.s2c.query.PingResultS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PingResultS2CPacket(long startTime) { this.wrapperContained = new net.minecraft.network.packet.s2c.query.PingResultS2CPacket(startTime); }
// public PingResultS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.query.PingResultS2CPacket(buf.wrapperContained); }
// public long startTime() { return wrapperContained.startTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}