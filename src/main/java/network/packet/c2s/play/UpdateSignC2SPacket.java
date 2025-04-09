package yarnwrap.network.packet.c2s.play;
public class UpdateSignC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket wrapperContained; public UpdateSignC2SPacket(net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] text() { return wrapperContained.text; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public int MAX_LINE_LENGTH() { return wrapperContained.MAX_LINE_LENGTH; }
// public boolean front() { return wrapperContained.front; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.lang.String[] getText() { return wrapperContained.getText(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public boolean isFront() { return wrapperContained.isFront(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}