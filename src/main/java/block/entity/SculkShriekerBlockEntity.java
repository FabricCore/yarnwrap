package yarnwrap.block.entity;
public class SculkShriekerBlockEntity { public net.minecraft.block.entity.SculkShriekerBlockEntity wrapperContained; public SculkShriekerBlockEntity(net.minecraft.block.entity.SculkShriekerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object vibrationListener() { return wrapperContained.vibrationListener; }
// public int WARDEN_SPAWN_TRIES() { return wrapperContained.WARDEN_SPAWN_TRIES; }
// public int WARDEN_SPAWN_HORIZONTAL_RANGE() { return wrapperContained.WARDEN_SPAWN_HORIZONTAL_RANGE; }
// public int WARDEN_SPAWN_VERTICAL_RANGE() { return wrapperContained.WARDEN_SPAWN_VERTICAL_RANGE; }
// public int DARKNESS_RANGE() { return wrapperContained.DARKNESS_RANGE; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap WARNING_SOUNDS() { return wrapperContained.WARNING_SOUNDS; }
// public int SHRIEK_DELAY() { return wrapperContained.SHRIEK_DELAY; }
// public int warningLevel() { return wrapperContained.warningLevel; }
// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
public void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.shriek(world.wrapperContained,player.wrapperContained); }
// public boolean trySyncWarningLevel(yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.trySyncWarningLevel(world.wrapperContained,player.wrapperContained); }
public void warn(yarnwrap.server.world.ServerWorld world) { wrapperContained.warn(world.wrapperContained); }
// public boolean trySpawnWarden(yarnwrap.server.world.ServerWorld world) { return wrapperContained.trySpawnWarden(world.wrapperContained); }
// public boolean canWarn(yarnwrap.server.world.ServerWorld world) { return wrapperContained.canWarn(world.wrapperContained); }
// public void playWarningSound(yarnwrap.world.World world) { wrapperContained.playWarningSound(world.wrapperContained); }
// public void shriek(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { wrapperContained.shriek(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity findResponsiblePlayerFromEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.findResponsiblePlayerFromEntity(entity.wrapperContained)); }

}