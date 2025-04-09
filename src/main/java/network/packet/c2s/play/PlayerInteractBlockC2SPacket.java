package yarnwrap.network.packet.c2s.play;
public class PlayerInteractBlockC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket wrapperContained; public PlayerInteractBlockC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public yarnwrap.util.hit.BlockHitResult blockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.blockHitResult); }
// public int sequence() { return wrapperContained.sequence; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.hit.BlockHitResult getBlockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.getBlockHitResult()); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
public int getSequence() { return wrapperContained.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}