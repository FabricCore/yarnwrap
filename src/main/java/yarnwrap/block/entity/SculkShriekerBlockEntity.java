package yarnwrap.block.entity;
public class SculkShriekerBlockEntity { public net.minecraft.block.entity.SculkShriekerBlockEntity wrapperContained; public SculkShriekerBlockEntity(net.minecraft.block.entity.SculkShriekerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.SculkShriekerBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.LOGGER = value; }

// public Object vibrationListener() { return wrapperContained.vibrationListener; }
// // public void vibrationListener(Object value) { wrapperContained.vibrationListener = value; }
// // public static Object vibrationListener() { return net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationListener; }
// // public static void vibrationListener(Object value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationListener = value; }

// public int WARDEN_SPAWN_TRIES() { return wrapperContained.WARDEN_SPAWN_TRIES; }
// public void WARDEN_SPAWN_TRIES(int value) { wrapperContained.WARDEN_SPAWN_TRIES = value; }
// public static int WARDEN_SPAWN_TRIES() { return net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_TRIES; }
// public static void WARDEN_SPAWN_TRIES(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_TRIES = value; }

// public int WARDEN_SPAWN_HORIZONTAL_RANGE() { return wrapperContained.WARDEN_SPAWN_HORIZONTAL_RANGE; }
// public void WARDEN_SPAWN_HORIZONTAL_RANGE(int value) { wrapperContained.WARDEN_SPAWN_HORIZONTAL_RANGE = value; }
// public static int WARDEN_SPAWN_HORIZONTAL_RANGE() { return net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_HORIZONTAL_RANGE; }
// public static void WARDEN_SPAWN_HORIZONTAL_RANGE(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_HORIZONTAL_RANGE = value; }

// public int WARDEN_SPAWN_VERTICAL_RANGE() { return wrapperContained.WARDEN_SPAWN_VERTICAL_RANGE; }
// public void WARDEN_SPAWN_VERTICAL_RANGE(int value) { wrapperContained.WARDEN_SPAWN_VERTICAL_RANGE = value; }
// public static int WARDEN_SPAWN_VERTICAL_RANGE() { return net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_VERTICAL_RANGE; }
// public static void WARDEN_SPAWN_VERTICAL_RANGE(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.WARDEN_SPAWN_VERTICAL_RANGE = value; }

// public int DARKNESS_RANGE() { return wrapperContained.DARKNESS_RANGE; }
// public void DARKNESS_RANGE(int value) { wrapperContained.DARKNESS_RANGE = value; }
// public static int DARKNESS_RANGE() { return net.minecraft.block.entity.SculkShriekerBlockEntity.DARKNESS_RANGE; }
// public static void DARKNESS_RANGE(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.DARKNESS_RANGE = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap WARNING_SOUNDS() { return wrapperContained.WARNING_SOUNDS; }
// public void WARNING_SOUNDS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.WARNING_SOUNDS = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap WARNING_SOUNDS() { return net.minecraft.block.entity.SculkShriekerBlockEntity.WARNING_SOUNDS; }
// public static void WARNING_SOUNDS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.WARNING_SOUNDS = value; }

// public int SHRIEK_DELAY() { return wrapperContained.SHRIEK_DELAY; }
// public void SHRIEK_DELAY(int value) { wrapperContained.SHRIEK_DELAY = value; }
// public static int SHRIEK_DELAY() { return net.minecraft.block.entity.SculkShriekerBlockEntity.SHRIEK_DELAY; }
// public static void SHRIEK_DELAY(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.SHRIEK_DELAY = value; }

// public int warningLevel() { return wrapperContained.warningLevel; }
// public void warningLevel(int value) { wrapperContained.warningLevel = value; }
// public static int warningLevel() { return net.minecraft.block.entity.SculkShriekerBlockEntity.warningLevel; }
// public static void warningLevel(int value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.warningLevel = value; }

// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// // public void vibrationCallback(Object value) { wrapperContained.vibrationCallback = value; }
// // public static Object vibrationCallback() { return net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationCallback; }
// // public static void vibrationCallback(Object value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationCallback = value; }

// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
// // public void vibrationListenerData(Object value) { wrapperContained.vibrationListenerData = value; }
// // public static Object vibrationListenerData() { return net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationListenerData; }
// // public static void vibrationListenerData(Object value, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.vibrationListenerData = value; }

public SculkShriekerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SculkShriekerBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void method_42322(Object vibrationListener) { wrapperContained.method_42322(vibrationListener); }
// public static void method_42322(Object vibrationListener, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.method_42322(vibrationListener); }
public void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.shriek(world.wrapperContained,player.wrapperContained); }
// public static void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.shriek(world.wrapperContained,player.wrapperContained); }
// public boolean trySyncWarningLevel(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.trySyncWarningLevel(world.wrapperContained,player.wrapperContained); }
// public static boolean trySyncWarningLevel(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.block.entity.SculkShriekerBlockEntity.trySyncWarningLevel(world.wrapperContained,player.wrapperContained); }
// public void method_43146(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap warningSounds) { wrapperContained.method_43146(warningSounds); }
// public static void method_43146(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap warningSounds, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.method_43146(warningSounds); }
public void warn(yarnwrap.server.world.ServerWorld world) { wrapperContained.warn(world.wrapperContained); }
// public static void warn(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.warn(world.wrapperContained); }
// public boolean trySpawnWarden(yarnwrap.server.world.ServerWorld world) { return wrapperContained.trySpawnWarden(world.wrapperContained); }
// public static boolean trySpawnWarden(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.block.entity.SculkShriekerBlockEntity.trySpawnWarden(world.wrapperContained); }
// public boolean canWarn(yarnwrap.server.world.ServerWorld world) { return wrapperContained.canWarn(world.wrapperContained); }
// public static boolean canWarn(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.block.entity.SculkShriekerBlockEntity.canWarn(world.wrapperContained); }
// public void playWarningSound(yarnwrap.world.World world) { wrapperContained.playWarningSound(world.wrapperContained); }
// public static void playWarningSound(yarnwrap.world.World world, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.playWarningSound(world.wrapperContained); }
// public void method_44016(int warningLevel) { wrapperContained.method_44016(warningLevel); }
// public static void method_44016(int warningLevel, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.method_44016(warningLevel); }
// public void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { wrapperContained.shriek(world.wrapperContained,entity.wrapperContained); }
// public static void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity, ) { net.minecraft.block.entity.SculkShriekerBlockEntity.shriek(world.wrapperContained,entity.wrapperContained); }
// public yarnwrap.server.network.ServerPlayerEntity findResponsiblePlayerFromEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.findResponsiblePlayerFromEntity(entity.wrapperContained)); }
// public static yarnwrap.server.network.ServerPlayerEntity findResponsiblePlayerFromEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.block.entity.SculkShriekerBlockEntity.findResponsiblePlayerFromEntity(entity.wrapperContained)); }

}