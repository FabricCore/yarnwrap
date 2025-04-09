package yarnwrap.network.packet.s2c.play;
public class PlayerAbilitiesS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained; public PlayerAbilitiesS2CPacket(net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float walkSpeed() { return wrapperContained.walkSpeed; }
// public float flySpeed() { return wrapperContained.flySpeed; }
// public boolean creativeMode() { return wrapperContained.creativeMode; }
// public boolean allowFlying() { return wrapperContained.allowFlying; }
// public boolean flying() { return wrapperContained.flying; }
// public boolean invulnerable() { return wrapperContained.invulnerable; }
// public int INVULNERABLE_MASK() { return wrapperContained.INVULNERABLE_MASK; }
// public int FLYING_MASK() { return wrapperContained.FLYING_MASK; }
// public int ALLOW_FLYING_MASK() { return wrapperContained.ALLOW_FLYING_MASK; }
// public int CREATIVE_MODE_MASK() { return wrapperContained.CREATIVE_MODE_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }
public boolean isInvulnerable() { return wrapperContained.isInvulnerable(); }
public boolean isCreativeMode() { return wrapperContained.isCreativeMode(); }
public boolean isFlying() { return wrapperContained.isFlying(); }
// public boolean allowFlying() { return wrapperContained.allowFlying(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}