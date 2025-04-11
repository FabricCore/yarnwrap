package yarnwrap.network.packet.c2s.play;
public class PlayerInteractBlockC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket wrapperContained; public PlayerInteractBlockC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public yarnwrap.util.hit.BlockHitResult blockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.blockHitResult); }
// public void blockHitResult(yarnwrap.util.hit.BlockHitResult value) { wrapperContained.blockHitResult = value.wrapperContained; }
// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlayerInteractBlockC2SPacket(yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult blockHitResult,int sequence) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket(hand.wrapperContained,blockHitResult.wrapperContained,sequence); }
// public PlayerInteractBlockC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket(buf.wrapperContained); }
public yarnwrap.util.hit.BlockHitResult getBlockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.getBlockHitResult()); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
public int getSequence() { return wrapperContained.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}