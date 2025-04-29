package yarnwrap.block.entity;
public class SculkShriekerWarningManager { public net.minecraft.block.entity.SculkShriekerWarningManager wrapperContained; public SculkShriekerWarningManager(net.minecraft.block.entity.SculkShriekerWarningManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.entity.SculkShriekerWarningManager.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.CODEC = value; }

// public int MAX_WARNING_LEVEL() { return wrapperContained.MAX_WARNING_LEVEL; }
// public void MAX_WARNING_LEVEL(int value) { wrapperContained.MAX_WARNING_LEVEL = value; }
public static int MAX_WARNING_LEVEL() { return net.minecraft.block.entity.SculkShriekerWarningManager.MAX_WARNING_LEVEL; }
// public static void MAX_WARNING_LEVEL(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.MAX_WARNING_LEVEL = value; }

// public int WARN_WARDEN_RANGE() { return wrapperContained.WARN_WARDEN_RANGE; }
// public void WARN_WARDEN_RANGE(int value) { wrapperContained.WARN_WARDEN_RANGE = value; }
// public static int WARN_WARDEN_RANGE() { return net.minecraft.block.entity.SculkShriekerWarningManager.WARN_WARDEN_RANGE; }
// public static void WARN_WARDEN_RANGE(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.WARN_WARDEN_RANGE = value; }

// public int WARN_DECREASE_COOLDOWN() { return wrapperContained.WARN_DECREASE_COOLDOWN; }
// public void WARN_DECREASE_COOLDOWN(int value) { wrapperContained.WARN_DECREASE_COOLDOWN = value; }
// public static int WARN_DECREASE_COOLDOWN() { return net.minecraft.block.entity.SculkShriekerWarningManager.WARN_DECREASE_COOLDOWN; }
// public static void WARN_DECREASE_COOLDOWN(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.WARN_DECREASE_COOLDOWN = value; }

// public int WARN_INCREASE_COOLDOWN() { return wrapperContained.WARN_INCREASE_COOLDOWN; }
// public void WARN_INCREASE_COOLDOWN(int value) { wrapperContained.WARN_INCREASE_COOLDOWN = value; }
// public static int WARN_INCREASE_COOLDOWN() { return net.minecraft.block.entity.SculkShriekerWarningManager.WARN_INCREASE_COOLDOWN; }
// public static void WARN_INCREASE_COOLDOWN(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.WARN_INCREASE_COOLDOWN = value; }

// public int ticksSinceLastWarning() { return wrapperContained.ticksSinceLastWarning; }
// public void ticksSinceLastWarning(int value) { wrapperContained.ticksSinceLastWarning = value; }
// public static int ticksSinceLastWarning() { return net.minecraft.block.entity.SculkShriekerWarningManager.ticksSinceLastWarning; }
// public static void ticksSinceLastWarning(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.ticksSinceLastWarning = value; }

// public int warningLevel() { return wrapperContained.warningLevel; }
// public void warningLevel(int value) { wrapperContained.warningLevel = value; }
// public static int warningLevel() { return net.minecraft.block.entity.SculkShriekerWarningManager.warningLevel; }
// public static void warningLevel(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.warningLevel = value; }

// public int cooldownTicks() { return wrapperContained.cooldownTicks; }
// public void cooldownTicks(int value) { wrapperContained.cooldownTicks = value; }
// public static int cooldownTicks() { return net.minecraft.block.entity.SculkShriekerWarningManager.cooldownTicks; }
// public static void cooldownTicks(int value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.cooldownTicks = value; }

// public double WARN_RANGE() { return wrapperContained.WARN_RANGE; }
// public void WARN_RANGE(double value) { wrapperContained.WARN_RANGE = value; }
// public static double WARN_RANGE() { return net.minecraft.block.entity.SculkShriekerWarningManager.WARN_RANGE; }
// public static void WARN_RANGE(double value, ) { net.minecraft.block.entity.SculkShriekerWarningManager.WARN_RANGE = value; }

public SculkShriekerWarningManager(int ticksSinceLastWarning,int warningLevel,int cooldownTicks) { this.wrapperContained = new net.minecraft.block.entity.SculkShriekerWarningManager(ticksSinceLastWarning,warningLevel,cooldownTicks); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.block.entity.SculkShriekerWarningManager.tick(); }
public void setWarningLevel(int warningLevel) { wrapperContained.setWarningLevel(warningLevel); }
// public static void setWarningLevel(int warningLevel, ) { net.minecraft.block.entity.SculkShriekerWarningManager.setWarningLevel(warningLevel); }
// public java.util.OptionalInt warnNearbyPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.warnNearbyPlayers(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static java.util.OptionalInt warnNearbyPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.warnNearbyPlayers(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void copy(yarnwrap.block.entity.SculkShriekerWarningManager other) { wrapperContained.copy(other.wrapperContained); }
// public static void copy(yarnwrap.block.entity.SculkShriekerWarningManager other, ) { net.minecraft.block.entity.SculkShriekerWarningManager.copy(other.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_42254(Object instance) { return wrapperContained.method_42254(instance); }
// public static com.mojang.datafixers.kinds.App method_42254(Object instance, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_42254(instance); }
// public boolean method_42255(yarnwrap.util.math.Vec3d player) { return wrapperContained.method_42255(player.wrapperContained); }
// public static boolean method_42255(yarnwrap.util.math.Vec3d player, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_42255(player.wrapperContained); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.block.entity.SculkShriekerWarningManager.reset(); }
// public boolean isWardenNearby(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWardenNearby(world.wrapperContained,pos.wrapperContained); }
// public static boolean isWardenNearby(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.isWardenNearby(world.wrapperContained,pos.wrapperContained); }
// public void increaseWarningLevel() { wrapperContained.increaseWarningLevel(); }
// public static void increaseWarningLevel() { net.minecraft.block.entity.SculkShriekerWarningManager.increaseWarningLevel(); }
// public java.lang.Integer method_42263(yarnwrap.block.entity.SculkShriekerWarningManager manager) { return wrapperContained.method_42263(manager.wrapperContained); }
// public static java.lang.Integer method_42263(yarnwrap.block.entity.SculkShriekerWarningManager manager, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_42263(manager.wrapperContained); }
// public void decreaseWarningLevel() { wrapperContained.decreaseWarningLevel(); }
// public static void decreaseWarningLevel() { net.minecraft.block.entity.SculkShriekerWarningManager.decreaseWarningLevel(); }
// public java.util.List getPlayersInRange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPlayersInRange(world.wrapperContained,pos.wrapperContained); }
// public static java.util.List getPlayersInRange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.getPlayersInRange(world.wrapperContained,pos.wrapperContained); }
// public java.lang.Integer method_42266(yarnwrap.block.entity.SculkShriekerWarningManager manager) { return wrapperContained.method_42266(manager.wrapperContained); }
// public static java.lang.Integer method_42266(yarnwrap.block.entity.SculkShriekerWarningManager manager, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_42266(manager.wrapperContained); }
public int getWarningLevel() { return wrapperContained.getWarningLevel(); }
// public static int getWarningLevel() { return net.minecraft.block.entity.SculkShriekerWarningManager.getWarningLevel(); }
// public java.lang.Integer method_42269(yarnwrap.block.entity.SculkShriekerWarningManager manager) { return wrapperContained.method_42269(manager.wrapperContained); }
// public static java.lang.Integer method_42269(yarnwrap.block.entity.SculkShriekerWarningManager manager, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_42269(manager.wrapperContained); }
// public boolean method_44001(yarnwrap.server.network.ServerPlayerEntity nearbyPlayer) { return wrapperContained.method_44001(nearbyPlayer.wrapperContained); }
// public static boolean method_44001(yarnwrap.server.network.ServerPlayerEntity nearbyPlayer, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_44001(nearbyPlayer.wrapperContained); }
// public void method_44002(yarnwrap.block.entity.SculkShriekerWarningManager nearbyPlayer) { wrapperContained.method_44002(nearbyPlayer.wrapperContained); }
// public static void method_44002(yarnwrap.block.entity.SculkShriekerWarningManager nearbyPlayer, ) { net.minecraft.block.entity.SculkShriekerWarningManager.method_44002(nearbyPlayer.wrapperContained); }
// public boolean isInCooldown() { return wrapperContained.isInCooldown(); }
// public static boolean isInCooldown() { return net.minecraft.block.entity.SculkShriekerWarningManager.isInCooldown(); }
// public java.util.stream.Stream method_45380(yarnwrap.server.network.ServerPlayerEntity playerx) { return wrapperContained.method_45380(playerx.wrapperContained); }
// public static java.util.stream.Stream method_45380(yarnwrap.server.network.ServerPlayerEntity playerx, ) { return net.minecraft.block.entity.SculkShriekerWarningManager.method_45380(playerx.wrapperContained); }
// public void method_45381(yarnwrap.block.entity.SculkShriekerWarningManager warningManager) { wrapperContained.method_45381(warningManager.wrapperContained); }
// public static void method_45381(yarnwrap.block.entity.SculkShriekerWarningManager warningManager, ) { net.minecraft.block.entity.SculkShriekerWarningManager.method_45381(warningManager.wrapperContained); }

}