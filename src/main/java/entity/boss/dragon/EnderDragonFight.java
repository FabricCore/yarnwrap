package yarnwrap.entity.boss.dragon;
public class EnderDragonFight { public net.minecraft.entity.boss.dragon.EnderDragonFight wrapperContained; public EnderDragonFight(net.minecraft.entity.boss.dragon.EnderDragonFight wrapperContained) { this.wrapperContained = wrapperContained; }

// public int crystalCountTimer() { return wrapperContained.crystalCountTimer; }
// public int endCrystalsAlive() { return wrapperContained.endCrystalsAlive; }
// public int dragonSeenTimer() { return wrapperContained.dragonSeenTimer; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public java.util.List crystals() { return wrapperContained.crystals; }
// public yarnwrap.block.pattern.BlockPattern endPortalPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.endPortalPattern); }
// public boolean doLegacyCheck() { return wrapperContained.doLegacyCheck; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean previouslyKilled() { return wrapperContained.previouslyKilled; }
// public boolean dragonKilled() { return wrapperContained.dragonKilled; }
// public java.util.UUID dragonUuid() { return wrapperContained.dragonUuid; }
// public yarnwrap.util.math.BlockPos exitPortalLocation() { return new yarnwrap.util.math.BlockPos(wrapperContained.exitPortalLocation); }
// public int spawnStateTimer() { return wrapperContained.spawnStateTimer; }
// public yarnwrap.entity.boss.ServerBossBar bossBar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bossBar); }
// public yarnwrap.entity.boss.dragon.EnderDragonSpawnState dragonSpawnState() { return new yarnwrap.entity.boss.dragon.EnderDragonSpawnState(wrapperContained.dragonSpawnState); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList gateways() { return wrapperContained.gateways; }
// public int playerUpdateTimer() { return wrapperContained.playerUpdateTimer; }
public int SPAWN_Y() { return wrapperContained.SPAWN_Y; }
// public int CHECK_DRAGON_SEEN_INTERVAL() { return wrapperContained.CHECK_DRAGON_SEEN_INTERVAL; }
// public int CRYSTAL_COUNTING_INTERVAL() { return wrapperContained.CRYSTAL_COUNTING_INTERVAL; }
// public int ISLAND_SIZE() { return wrapperContained.ISLAND_SIZE; }
// public int PLAYER_COUNTING_INTERVAL() { return wrapperContained.PLAYER_COUNTING_INTERVAL; }
// public java.util.function.Predicate showBossBarPredicate() { return wrapperContained.showBossBarPredicate; }
// public yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(wrapperContained.origin); }
// public boolean skipChunksLoadedCheck() { return wrapperContained.skipChunksLoadedCheck; }
// public boolean worldContainsEndPortal() { return wrapperContained.worldContainsEndPortal(); }
// public void convertFromLegacy() { wrapperContained.convertFromLegacy(); }
// public void generateEndGateway(yarnwrap.util.math.BlockPos pos) { wrapperContained.generateEndGateway(pos.wrapperContained); }
public int getAliveEndCrystals() { return wrapperContained.getAliveEndCrystals(); }
// public void generateEndPortal(boolean previouslyKilled) { wrapperContained.generateEndPortal(previouslyKilled); }
// public void generateNewEndGateway() { wrapperContained.generateNewEndGateway(); }
// public void updatePlayers() { wrapperContained.updatePlayers(); }
// public void setSpawnState(yarnwrap.entity.boss.dragon.EnderDragonSpawnState spawnState) { wrapperContained.setSpawnState(spawnState.wrapperContained); }
public void respawnDragon() { wrapperContained.respawnDragon(); }
// public yarnwrap.entity.boss.dragon.EnderDragonEntity createDragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.createDragon()); }
public void resetEndCrystals() { wrapperContained.resetEndCrystals(); }
// public void checkDragonSeen() { wrapperContained.checkDragonSeen(); }
public void crystalDestroyed(yarnwrap.entity.decoration.EndCrystalEntity enderCrystal,yarnwrap.entity.damage.DamageSource source) { wrapperContained.crystalDestroyed(enderCrystal.wrapperContained,source.wrapperContained); }
public void dragonKilled(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { wrapperContained.dragonKilled(dragon.wrapperContained); }
// public void respawnDragon(java.util.List crystals) { wrapperContained.respawnDragon(crystals); }
public Object toData() { return wrapperContained.toData(); }
// public Object findEndPortal() { return wrapperContained.findEndPortal(); }
public void updateFight(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { wrapperContained.updateFight(dragon.wrapperContained); }
// public boolean areChunksLoaded() { return wrapperContained.areChunksLoaded(); }
// public void countAliveCrystals() { wrapperContained.countAliveCrystals(); }
public boolean hasPreviouslyKilled() { return wrapperContained.hasPreviouslyKilled(); }
public void tick() { wrapperContained.tick(); }
public void setSkipChunksLoadedCheck() { wrapperContained.setSkipChunksLoadedCheck(); }
public void clearGatewaysList() { wrapperContained.clearGatewaysList(); }
public java.util.UUID getDragonUuid() { return wrapperContained.getDragonUuid(); }

}