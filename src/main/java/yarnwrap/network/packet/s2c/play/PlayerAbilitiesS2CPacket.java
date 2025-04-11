package yarnwrap.network.packet.s2c.play;
public class PlayerAbilitiesS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained; public PlayerAbilitiesS2CPacket(net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float walkSpeed() { return wrapperContained.walkSpeed; }
// public void walkSpeed(float value) { wrapperContained.walkSpeed = value; }
// public float flySpeed() { return wrapperContained.flySpeed; }
// public void flySpeed(float value) { wrapperContained.flySpeed = value; }
// public boolean creativeMode() { return wrapperContained.creativeMode; }
// public void creativeMode(boolean value) { wrapperContained.creativeMode = value; }
// public boolean allowFlying() { return wrapperContained.allowFlying; }
// public void allowFlying(boolean value) { wrapperContained.allowFlying = value; }
// public boolean flying() { return wrapperContained.flying; }
// public void flying(boolean value) { wrapperContained.flying = value; }
// public boolean invulnerable() { return wrapperContained.invulnerable; }
// public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public int INVULNERABLE_MASK() { return wrapperContained.INVULNERABLE_MASK; }
// public void INVULNERABLE_MASK(int value) { wrapperContained.INVULNERABLE_MASK = value; }
// public int FLYING_MASK() { return wrapperContained.FLYING_MASK; }
// public void FLYING_MASK(int value) { wrapperContained.FLYING_MASK = value; }
// public int ALLOW_FLYING_MASK() { return wrapperContained.ALLOW_FLYING_MASK; }
// public void ALLOW_FLYING_MASK(int value) { wrapperContained.ALLOW_FLYING_MASK = value; }
// public int CREATIVE_MODE_MASK() { return wrapperContained.CREATIVE_MODE_MASK; }
// public void CREATIVE_MODE_MASK(int value) { wrapperContained.CREATIVE_MODE_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlayerAbilitiesS2CPacket(yarnwrap.entity.player.PlayerAbilities abilities) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket(abilities.wrapperContained); }
// public PlayerAbilitiesS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket(buf.wrapperContained); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }
public boolean isInvulnerable() { return wrapperContained.isInvulnerable(); }
public boolean isCreativeMode() { return wrapperContained.isCreativeMode(); }
public boolean isFlying() { return wrapperContained.isFlying(); }
// public boolean allowFlying() { return wrapperContained.allowFlying(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}