package yarnwrap.network.packet.s2c.play;
public class WorldEventS2CPacket { public net.minecraft.network.packet.s2c.play.WorldEventS2CPacket wrapperContained; public WorldEventS2CPacket(net.minecraft.network.packet.s2c.play.WorldEventS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int data() { return wrapperContained.data; }
// public boolean global() { return wrapperContained.global; }
// public int eventId() { return wrapperContained.eventId; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getEventId() { return wrapperContained.getEventId(); }
public boolean isGlobal() { return wrapperContained.isGlobal(); }
public int getData() { return wrapperContained.getData(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}