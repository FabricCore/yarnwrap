package yarnwrap.network.packet.c2s.play;
public class PlayerInteractItemC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained; public PlayerInteractItemC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public int sequence() { return wrapperContained.sequence; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public float yaw() { return wrapperContained.yaw; }
// public float pitch() { return wrapperContained.pitch; }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
public int getSequence() { return wrapperContained.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }

}