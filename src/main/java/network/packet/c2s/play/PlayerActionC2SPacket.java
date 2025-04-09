package yarnwrap.network.packet.c2s.play;
public class PlayerActionC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket wrapperContained; public PlayerActionC2SPacket(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public Object action() { return wrapperContained.action; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public int sequence() { return wrapperContained.sequence; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public Object getAction() { return wrapperContained.getAction(); }
public int getSequence() { return wrapperContained.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}