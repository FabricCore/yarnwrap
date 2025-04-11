package yarnwrap.network.packet.c2s.play;
public class PlayerInteractItemC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained; public PlayerInteractItemC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public PlayerInteractItemC2SPacket(yarnwrap.util.Hand hand,int sequence,float yaw,float pitch) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket(hand.wrapperContained,sequence,yaw,pitch); }
// public PlayerInteractItemC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket(buf.wrapperContained); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
public int getSequence() { return wrapperContained.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }

}