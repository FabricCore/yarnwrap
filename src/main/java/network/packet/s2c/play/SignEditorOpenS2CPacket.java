package yarnwrap.network.packet.s2c.play;
public class SignEditorOpenS2CPacket { public net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket wrapperContained; public SignEditorOpenS2CPacket(net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public boolean front() { return wrapperContained.front; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public boolean isFront() { return wrapperContained.isFront(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}