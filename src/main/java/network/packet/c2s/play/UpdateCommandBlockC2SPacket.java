package yarnwrap.network.packet.c2s.play;
public class UpdateCommandBlockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket wrapperContained; public UpdateCommandBlockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object type() { return wrapperContained.type; }
// public boolean alwaysActive() { return wrapperContained.alwaysActive; }
// public boolean conditional() { return wrapperContained.conditional; }
// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public java.lang.String command() { return wrapperContained.command; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public int TRACK_OUTPUT_MASK() { return wrapperContained.TRACK_OUTPUT_MASK; }
// public int CONDITIONAL_MASK() { return wrapperContained.CONDITIONAL_MASK; }
// public int ALWAYS_ACTIVE_MASK() { return wrapperContained.ALWAYS_ACTIVE_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object getType() { return wrapperContained.getType(); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
public boolean isConditional() { return wrapperContained.isConditional(); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public boolean isAlwaysActive() { return wrapperContained.isAlwaysActive(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}