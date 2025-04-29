package yarnwrap.network.packet.c2s.play;
public class PlayerInteractItemC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained; public PlayerInteractItemC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public static yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.hand); }
// public static void hand(yarnwrap.util.Hand value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.hand = value.wrapperContained; }

// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
// public static int sequence() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.sequence; }
// public static void sequence(int value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.sequence = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.CODEC = value.wrapperContained; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.pitch = value; }

public PlayerInteractItemC2SPacket(yarnwrap.util.Hand hand,int sequence,float yaw,float pitch) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket(hand.wrapperContained,sequence,yaw,pitch); }
// public PlayerInteractItemC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket(buf.wrapperContained); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public static yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.getHand()); }
public int getSequence() { return wrapperContained.getSequence(); }
// public static int getSequence() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.write(buf.wrapperContained); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.getPitch(); }

}