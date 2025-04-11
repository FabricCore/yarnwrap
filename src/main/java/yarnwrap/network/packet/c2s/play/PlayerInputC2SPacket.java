package yarnwrap.network.packet.c2s.play;
public class PlayerInputC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained; public PlayerInputC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float forward() { return wrapperContained.forward; }
// public void forward(float value) { wrapperContained.forward = value; }
// public float sideways() { return wrapperContained.sideways; }
// public void sideways(float value) { wrapperContained.sideways = value; }
// public boolean sneaking() { return wrapperContained.sneaking; }
// public void sneaking(boolean value) { wrapperContained.sneaking = value; }
// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
// public int JUMPING_MASK() { return wrapperContained.JUMPING_MASK; }
// public void JUMPING_MASK(int value) { wrapperContained.JUMPING_MASK = value; }
// public int SNEAKING_MASK() { return wrapperContained.SNEAKING_MASK; }
// public void SNEAKING_MASK(int value) { wrapperContained.SNEAKING_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlayerInputC2SPacket(float sideways,float forward,boolean jumping,boolean sneaking) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket(sideways,forward,jumping,sneaking); }
// public PlayerInputC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket(buf.wrapperContained); }
public boolean isSneaking() { return wrapperContained.isSneaking(); }
public boolean isJumping() { return wrapperContained.isJumping(); }
public float getSideways() { return wrapperContained.getSideways(); }
public float getForward() { return wrapperContained.getForward(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}