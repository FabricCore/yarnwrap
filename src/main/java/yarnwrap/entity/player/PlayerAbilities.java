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

public void setFlySpeed(float flySpeed) { wrapperContained.setFlySpeed(flySpeed); }
// public static void setFlySpeed(float flySpeed, ) { net.minecraft.entity.player.PlayerAbilities.setFlySpeed(flySpeed); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.player.PlayerAbilities.readNbt(nbt.wrapperContained); }
public void setWalkSpeed(float walkSpeed) { wrapperContained.setWalkSpeed(walkSpeed); }
// public static void setWalkSpeed(float walkSpeed, ) { net.minecraft.entity.player.PlayerAbilities.setWalkSpeed(walkSpeed); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
// public static void writeNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.player.PlayerAbilities.writeNbt(nbt.wrapperContained); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
// public static float getFlySpeed() { return net.minecraft.entity.player.PlayerAbilities.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }
// public static float getWalkSpeed() { return net.minecraft.entity.player.PlayerAbilities.getWalkSpeed(); }

}