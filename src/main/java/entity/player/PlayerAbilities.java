package yarnwrap.entity.player;
public class PlayerAbilities { public net.minecraft.entity.player.PlayerAbilities wrapperContained; public PlayerAbilities(net.minecraft.entity.player.PlayerAbilities wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean allowModifyWorld() { return wrapperContained.allowModifyWorld; }
public boolean creativeMode() { return wrapperContained.creativeMode; }
public boolean allowFlying() { return wrapperContained.allowFlying; }
public boolean flying() { return wrapperContained.flying; }
public boolean invulnerable() { return wrapperContained.invulnerable; }
// public float flySpeed() { return wrapperContained.flySpeed; }
// public float walkSpeed() { return wrapperContained.walkSpeed; }
public void setFlySpeed(float flySpeed) { wrapperContained.setFlySpeed(flySpeed); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public void setWalkSpeed(float walkSpeed) { wrapperContained.setWalkSpeed(walkSpeed); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public float getFlySpeed() { return wrapperContained.getFlySpeed(); }
public float getWalkSpeed() { return wrapperContained.getWalkSpeed(); }

}