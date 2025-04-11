package yarnwrap.entity.player;
public class PlayerAbilities { public net.minecraft.entity.player.PlayerAbilities wrapperContained; public PlayerAbilities(net.minecraft.entity.player.PlayerAbilities wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean allowModifyWorld() { return wrapperContained.allowModifyWorld; }
public void allowModifyWorld(boolean value) { wrapperContained.allowModifyWorld = value; }
public boolean creativeMode() { return wrapperContained.creativeMode; }
public void creativeMode(boolean value) { wrapperContained.creativeMode = value; }
public boolean allowFlying() { return wrapperContained.allowFlying; }
public void allowFlying(boolean value) { wrapperContained.allowFlying = value; }
public boolean flying() { return wrapperContained.flying; }
public void flying(boolean value) { wrapperContained.flying = value; }
public boolean invulnerable() { return wrapperContained.invulnerable; }
public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public float flySpeed() { return wrapperContained.flySpeed; }
// public void flySpeed(float value) { wrapperContained.flySpeed = value; }
// public float walkSpeed() { return wrapperContained.walkSpeed; }
// public void walkSpeed(float value) { wrapperContained.walkSpeed = value; }
public void setFlySpeed(float flySpeed) { wrapperContained.setFlySpeed(flySpeed); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public void setWalkSpeed(float walkSpeed) { wrapperContained.setWalkSpeed(walkSpeed); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }

}