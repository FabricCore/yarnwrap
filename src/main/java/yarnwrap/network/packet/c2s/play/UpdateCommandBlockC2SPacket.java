package yarnwrap.network.packet.c2s.play;
public class UpdateCommandBlockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket wrapperContained; public UpdateCommandBlockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public boolean alwaysActive() { return wrapperContained.alwaysActive; }
// public void alwaysActive(boolean value) { wrapperContained.alwaysActive = value; }
// public boolean conditional() { return wrapperContained.conditional; }
// public void conditional(boolean value) { wrapperContained.conditional = value; }
// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public void trackOutput(boolean value) { wrapperContained.trackOutput = value; }
// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public int TRACK_OUTPUT_MASK() { return wrapperContained.TRACK_OUTPUT_MASK; }
// public void TRACK_OUTPUT_MASK(int value) { wrapperContained.TRACK_OUTPUT_MASK = value; }
// public int CONDITIONAL_MASK() { return wrapperContained.CONDITIONAL_MASK; }
// public void CONDITIONAL_MASK(int value) { wrapperContained.CONDITIONAL_MASK = value; }
// public int ALWAYS_ACTIVE_MASK() { return wrapperContained.ALWAYS_ACTIVE_MASK; }
// public void ALWAYS_ACTIVE_MASK(int value) { wrapperContained.ALWAYS_ACTIVE_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public UpdateCommandBlockC2SPacket(yarnwrap.util.math.BlockPos pos,java.lang.String command,Object type,boolean trackOutput,boolean conditional,boolean alwaysActive) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket(pos.wrapperContained,command,type,trackOutput,conditional,alwaysActive); }
// public UpdateCommandBlockC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateCommandBlockC2SPacket(buf.wrapperContained); }
public Object getType() { return wrapperContained.getType(); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
public boolean isConditional() { return wrapperContained.isConditional(); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public boolean isAlwaysActive() { return wrapperContained.isAlwaysActive(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}