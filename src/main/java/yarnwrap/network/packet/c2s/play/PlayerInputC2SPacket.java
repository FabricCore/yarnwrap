package yarnwrap.network.packet.c2s.play;
public class PlayerInputC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained; public PlayerInputC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float forward() { return wrapperContained.forward; }
// public void forward(float value) { wrapperContained.forward = value; }
// public static float forward() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.forward; }
// public static void forward(float value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.forward = value; }

// public float sideways() { return wrapperContained.sideways; }
// public void sideways(float value) { wrapperContained.sideways = value; }
// public static float sideways() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.sideways; }
// public static void sideways(float value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.sideways = value; }

// public boolean sneaking() { return wrapperContained.sneaking; }
// public void sneaking(boolean value) { wrapperContained.sneaking = value; }
// public static boolean sneaking() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.sneaking; }
// public static void sneaking(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.sneaking = value; }

// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
// public static boolean jumping() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.jumping; }
// public static void jumping(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.jumping = value; }

// public int JUMPING_MASK() { return wrapperContained.JUMPING_MASK; }
// public void JUMPING_MASK(int value) { wrapperContained.JUMPING_MASK = value; }
// public static int JUMPING_MASK() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.JUMPING_MASK; }
// public static void JUMPING_MASK(int value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.JUMPING_MASK = value; }

// public int SNEAKING_MASK() { return wrapperContained.SNEAKING_MASK; }
// public void SNEAKING_MASK(int value) { wrapperContained.SNEAKING_MASK = value; }
// public static int SNEAKING_MASK() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.SNEAKING_MASK; }
// public static void SNEAKING_MASK(int value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.SNEAKING_MASK = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.CODEC = value.wrapperContained; }

public PlayerInputC2SPacket(float sideways,float forward,boolean jumping,boolean sneaking) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket(sideways,forward,jumping,sneaking); }
// public PlayerInputC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket(buf.wrapperContained); }
public boolean isSneaking() { return wrapperContained.isSneaking(); }
// public static boolean isSneaking() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.isSneaking(); }
public boolean isJumping() { return wrapperContained.isJumping(); }
// public static boolean isJumping() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.isJumping(); }
public float getSideways() { return wrapperContained.getSideways(); }
// public static float getSideways() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.getSideways(); }
public float getForward() { return wrapperContained.getForward(); }
// public static float getForward() { return net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.getForward(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.write(buf.wrapperContained); }

}