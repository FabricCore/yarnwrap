package yarnwrap.entity.player;
public class PlayerAbilities { public net.minecraft.entity.player.PlayerAbilities wrapperContained; public PlayerAbilities(net.minecraft.entity.player.PlayerAbilities wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean allowModifyWorld() { return wrapperContained.allowModifyWorld; }
public void allowModifyWorld(boolean value) { wrapperContained.allowModifyWorld = value; }
// public static boolean allowModifyWorld() { return net.minecraft.entity.player.PlayerAbilities.allowModifyWorld; }
// public static void allowModifyWorld(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.allowModifyWorld = value; }

public boolean creativeMode() { return wrapperContained.creativeMode; }
public void creativeMode(boolean value) { wrapperContained.creativeMode = value; }
// public static boolean creativeMode() { return net.minecraft.entity.player.PlayerAbilities.creativeMode; }
// public static void creativeMode(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.creativeMode = value; }

public boolean allowFlying() { return wrapperContained.allowFlying; }
public void allowFlying(boolean value) { wrapperContained.allowFlying = value; }
// public static boolean allowFlying() { return net.minecraft.entity.player.PlayerAbilities.allowFlying; }
// public static void allowFlying(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.allowFlying = value; }

public boolean flying() { return wrapperContained.flying; }
public void flying(boolean value) { wrapperContained.flying = value; }
// public static boolean flying() { return net.minecraft.entity.player.PlayerAbilities.flying; }
// public static void flying(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.flying = value; }

public boolean invulnerable() { return wrapperContained.invulnerable; }
public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public static boolean invulnerable() { return net.minecraft.entity.player.PlayerAbilities.invulnerable; }
// public static void invulnerable(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.invulnerable = value; }

// public float flySpeed() { return wrapperContained.flySpeed; }
// public void flySpeed(float value) { wrapperContained.flySpeed = value; }
// public static float flySpeed() { return net.minecraft.entity.player.PlayerAbilities.flySpeed; }
// public static void flySpeed(float value, ) { net.minecraft.entity.player.PlayerAbilities.flySpeed = value; }

// public float walkSpeed() { return wrapperContained.walkSpeed; }
// public void walkSpeed(float value) { wrapperContained.walkSpeed = value; }
// public static float walkSpeed() { return net.minecraft.entity.player.PlayerAbilities.walkSpeed; }
// public static void walkSpeed(float value, ) { net.minecraft.entity.player.PlayerAbilities.walkSpeed = value; }

// public boolean DEFAULT_INVULNERABLE() { return wrapperContained.DEFAULT_INVULNERABLE; }
// public void DEFAULT_INVULNERABLE(boolean value) { wrapperContained.DEFAULT_INVULNERABLE = value; }
// public static boolean DEFAULT_INVULNERABLE() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_INVULNERABLE; }
// public static void DEFAULT_INVULNERABLE(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_INVULNERABLE = value; }

// public boolean DEFAULT_FLYING() { return wrapperContained.DEFAULT_FLYING; }
// public void DEFAULT_FLYING(boolean value) { wrapperContained.DEFAULT_FLYING = value; }
// public static boolean DEFAULT_FLYING() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_FLYING; }
// public static void DEFAULT_FLYING(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_FLYING = value; }

// public boolean DEFAULT_ALLOW_FLYING() { return wrapperContained.DEFAULT_ALLOW_FLYING; }
// public void DEFAULT_ALLOW_FLYING(boolean value) { wrapperContained.DEFAULT_ALLOW_FLYING = value; }
// public static boolean DEFAULT_ALLOW_FLYING() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_ALLOW_FLYING; }
// public static void DEFAULT_ALLOW_FLYING(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_ALLOW_FLYING = value; }

// public boolean DEFAULT_CREATIVE_MODE() { return wrapperContained.DEFAULT_CREATIVE_MODE; }
// public void DEFAULT_CREATIVE_MODE(boolean value) { wrapperContained.DEFAULT_CREATIVE_MODE = value; }
// public static boolean DEFAULT_CREATIVE_MODE() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_CREATIVE_MODE; }
// public static void DEFAULT_CREATIVE_MODE(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_CREATIVE_MODE = value; }

// public boolean DEFAULT_ALLOW_MODIFY_WORLD() { return wrapperContained.DEFAULT_ALLOW_MODIFY_WORLD; }
// public void DEFAULT_ALLOW_MODIFY_WORLD(boolean value) { wrapperContained.DEFAULT_ALLOW_MODIFY_WORLD = value; }
// public static boolean DEFAULT_ALLOW_MODIFY_WORLD() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_ALLOW_MODIFY_WORLD; }
// public static void DEFAULT_ALLOW_MODIFY_WORLD(boolean value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_ALLOW_MODIFY_WORLD = value; }

// public float DEFAULT_FLY_SPEED() { return wrapperContained.DEFAULT_FLY_SPEED; }
// public void DEFAULT_FLY_SPEED(float value) { wrapperContained.DEFAULT_FLY_SPEED = value; }
// public static float DEFAULT_FLY_SPEED() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_FLY_SPEED; }
// public static void DEFAULT_FLY_SPEED(float value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_FLY_SPEED = value; }

// public float DEFAULT_WALK_SPEED() { return wrapperContained.DEFAULT_WALK_SPEED; }
// public void DEFAULT_WALK_SPEED(float value) { wrapperContained.DEFAULT_WALK_SPEED = value; }
// public static float DEFAULT_WALK_SPEED() { return net.minecraft.entity.player.PlayerAbilities.DEFAULT_WALK_SPEED; }
// public static void DEFAULT_WALK_SPEED(float value, ) { net.minecraft.entity.player.PlayerAbilities.DEFAULT_WALK_SPEED = value; }

public void setFlySpeed(float flySpeed) { wrapperContained.setFlySpeed(flySpeed); }
// public static void setFlySpeed(float flySpeed, ) { net.minecraft.entity.player.PlayerAbilities.setFlySpeed(flySpeed); }
public void setWalkSpeed(float walkSpeed) { wrapperContained.setWalkSpeed(walkSpeed); }
// public static void setWalkSpeed(float walkSpeed, ) { net.minecraft.entity.player.PlayerAbilities.setWalkSpeed(walkSpeed); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
// public static float getFlySpeed() { return net.minecraft.entity.player.PlayerAbilities.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }
// public static float getWalkSpeed() { return net.minecraft.entity.player.PlayerAbilities.getWalkSpeed(); }
// public void unpack(Object packed) { wrapperContained.unpack(packed); }
// public static void unpack(Object packed, ) { net.minecraft.entity.player.PlayerAbilities.unpack(packed); }
// public Object pack() { return wrapperContained.pack(); }
// public static Object pack() { return net.minecraft.entity.player.PlayerAbilities.pack(); }

}