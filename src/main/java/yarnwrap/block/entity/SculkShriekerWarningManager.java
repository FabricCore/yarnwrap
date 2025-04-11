package yarnwrap.block.entity;
public class SculkShriekerWarningManager { public net.minecraft.block.entity.SculkShriekerWarningManager wrapperContained; public SculkShriekerWarningManager(net.minecraft.block.entity.SculkShriekerWarningManager wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int MAX_WARNING_LEVEL() { return wrapperContained.MAX_WARNING_LEVEL; }
// public void MAX_WARNING_LEVEL(int value) { wrapperContained.MAX_WARNING_LEVEL = value; }
// public int WARN_WARDEN_RANGE() { return wrapperContained.WARN_WARDEN_RANGE; }
// public void WARN_WARDEN_RANGE(int value) { wrapperContained.WARN_WARDEN_RANGE = value; }
// public int WARN_DECREASE_COOLDOWN() { return wrapperContained.WARN_DECREASE_COOLDOWN; }
// public void WARN_DECREASE_COOLDOWN(int value) { wrapperContained.WARN_DECREASE_COOLDOWN = value; }
// public int WARN_INCREASE_COOLDOWN() { return wrapperContained.WARN_INCREASE_COOLDOWN; }
// public void WARN_INCREASE_COOLDOWN(int value) { wrapperContained.WARN_INCREASE_COOLDOWN = value; }
// public int ticksSinceLastWarning() { return wrapperContained.ticksSinceLastWarning; }
// public void ticksSinceLastWarning(int value) { wrapperContained.ticksSinceLastWarning = value; }
// public int warningLevel() { return wrapperContained.warningLevel; }
// public void warningLevel(int value) { wrapperContained.warningLevel = value; }
// public int cooldownTicks() { return wrapperContained.cooldownTicks; }
// public void cooldownTicks(int value) { wrapperContained.cooldownTicks = value; }
// public double WARN_RANGE() { return wrapperContained.WARN_RANGE; }
// public void WARN_RANGE(double value) { wrapperContained.WARN_RANGE = value; }
public void tick() { wrapperContained.tick(); }
public void setWarningLevel(int warningLevel) { wrapperContained.setWarningLevel(warningLevel); }
public java.util.OptionalInt warnNearbyPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.warnNearbyPlayers(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void copy(yarnwrap.block.entity.SculkShriekerWarningManager other) { wrapperContained.copy(other.wrapperContained); }
public void reset() { wrapperContained.reset(); }
// public boolean isWardenNearby(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWardenNearby(world.wrapperContained,pos.wrapperContained); }
// public void increaseWarningLevel() { wrapperContained.increaseWarningLevel(); }
// public void decreaseWarningLevel() { wrapperContained.decreaseWarningLevel(); }
// public java.util.List getPlayersInRange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPlayersInRange(world.wrapperContained,pos.wrapperContained); }
public int getWarningLevel() { return wrapperContained.getWarningLevel(); }
// public boolean isInCooldown() { return wrapperContained.isInCooldown(); }

}