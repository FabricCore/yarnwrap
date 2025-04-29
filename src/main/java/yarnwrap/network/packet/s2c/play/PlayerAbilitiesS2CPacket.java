package yarnwrap.network.packet.s2c.play;
public class PlayerAbilitiesS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained; public PlayerAbilitiesS2CPacket(net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float walkSpeed() { return wrapperContained.walkSpeed; }
// public void walkSpeed(float value) { wrapperContained.walkSpeed = value; }
// public static float walkSpeed() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.walkSpeed; }
// public static void walkSpeed(float value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.walkSpeed = value; }

// public float flySpeed() { return wrapperContained.flySpeed; }
// public void flySpeed(float value) { wrapperContained.flySpeed = value; }
// public static float flySpeed() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.flySpeed; }
// public static void flySpeed(float value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.flySpeed = value; }

// public boolean creativeMode() { return wrapperContained.creativeMode; }
// public void creativeMode(boolean value) { wrapperContained.creativeMode = value; }
// public static boolean creativeMode() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.creativeMode; }
// public static void creativeMode(boolean value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.creativeMode = value; }

// public boolean allowFlying() { return wrapperContained.allowFlying; }
// public void allowFlying(boolean value) { wrapperContained.allowFlying = value; }
// public static boolean allowFlying() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.allowFlying; }
// public static void allowFlying(boolean value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.allowFlying = value; }

// public boolean flying() { return wrapperContained.flying; }
// public void flying(boolean value) { wrapperContained.flying = value; }
// public static boolean flying() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.flying; }
// public static void flying(boolean value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.flying = value; }

// public boolean invulnerable() { return wrapperContained.invulnerable; }
// public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public static boolean invulnerable() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.invulnerable; }
// public static void invulnerable(boolean value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.invulnerable = value; }

// public int INVULNERABLE_MASK() { return wrapperContained.INVULNERABLE_MASK; }
// public void INVULNERABLE_MASK(int value) { wrapperContained.INVULNERABLE_MASK = value; }
// public static int INVULNERABLE_MASK() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.INVULNERABLE_MASK; }
// public static void INVULNERABLE_MASK(int value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.INVULNERABLE_MASK = value; }

// public int FLYING_MASK() { return wrapperContained.FLYING_MASK; }
// public void FLYING_MASK(int value) { wrapperContained.FLYING_MASK = value; }
// public static int FLYING_MASK() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.FLYING_MASK; }
// public static void FLYING_MASK(int value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.FLYING_MASK = value; }

// public int ALLOW_FLYING_MASK() { return wrapperContained.ALLOW_FLYING_MASK; }
// public void ALLOW_FLYING_MASK(int value) { wrapperContained.ALLOW_FLYING_MASK = value; }
// public static int ALLOW_FLYING_MASK() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.ALLOW_FLYING_MASK; }
// public static void ALLOW_FLYING_MASK(int value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.ALLOW_FLYING_MASK = value; }

// public int CREATIVE_MODE_MASK() { return wrapperContained.CREATIVE_MODE_MASK; }
// public void CREATIVE_MODE_MASK(int value) { wrapperContained.CREATIVE_MODE_MASK = value; }
// public static int CREATIVE_MODE_MASK() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.CREATIVE_MODE_MASK; }
// public static void CREATIVE_MODE_MASK(int value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.CREATIVE_MODE_MASK = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.CODEC = value.wrapperContained; }

public PlayerAbilitiesS2CPacket(yarnwrap.entity.player.PlayerAbilities abilities) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket(abilities.wrapperContained); }
// public PlayerAbilitiesS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket(buf.wrapperContained); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
// public static float getFlySpeed() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }
// public static float getWalkSpeed() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.getWalkSpeed(); }
public boolean isInvulnerable() { return wrapperContained.isInvulnerable(); }
// public static boolean isInvulnerable() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.isInvulnerable(); }
public boolean isCreativeMode() { return wrapperContained.isCreativeMode(); }
// public static boolean isCreativeMode() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.isCreativeMode(); }
public boolean isFlying() { return wrapperContained.isFlying(); }
// public static boolean isFlying() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.isFlying(); }
// public boolean allowFlying() { return wrapperContained.allowFlying(); }
// // public static boolean allowFlying() { return net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.allowFlying(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket.write(buf.wrapperContained); }

}