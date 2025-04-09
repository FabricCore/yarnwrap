package yarnwrap.network.packet.c2s.play;
public class PlayerInputC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained; public PlayerInputC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float forward() { return wrapperContained.forward; }
// public float sideways() { return wrapperContained.sideways; }
// public boolean sneaking() { return wrapperContained.sneaking; }
// public boolean jumping() { return wrapperContained.jumping; }
// public int JUMPING_MASK() { return wrapperContained.JUMPING_MASK; }
// public int SNEAKING_MASK() { return wrapperContained.SNEAKING_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public boolean isSneaking() { return wrapperContained.isSneaking(); }
public boolean isJumping() { return wrapperContained.isJumping(); }
public float getSideways() { return wrapperContained.getSideways(); }
public float getForward() { return wrapperContained.getForward(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}