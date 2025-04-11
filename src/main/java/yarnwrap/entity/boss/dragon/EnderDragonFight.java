package yarnwrap.entity.boss.dragon;
public class EnderDragonFight { public net.minecraft.entity.boss.dragon.EnderDragonFight wrapperContained; public EnderDragonFight(net.minecraft.entity.boss.dragon.EnderDragonFight wrapperContained) { this.wrapperContained = wrapperContained; }

// public int crystalCountTimer() { return wrapperContained.crystalCountTimer; }
// public void crystalCountTimer(int value) { wrapperContained.crystalCountTimer = value; }
// public int endCrystalsAlive() { return wrapperContained.endCrystalsAlive; }
// public void endCrystalsAlive(int value) { wrapperContained.endCrystalsAlive = value; }
// public int dragonSeenTimer() { return wrapperContained.dragonSeenTimer; }
// public void dragonSeenTimer(int value) { wrapperContained.dragonSeenTimer = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.util.List crystals() { return wrapperContained.crystals; }
// public void crystals(java.util.List value) { wrapperContained.crystals = value; }
// public yarnwrap.block.pattern.BlockPattern endPortalPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.endPortalPattern); }
// public void endPortalPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.endPortalPattern = value.wrapperContained; }
// public boolean doLegacyCheck() { return wrapperContained.doLegacyCheck; }
// public void doLegacyCheck(boolean value) { wrapperContained.doLegacyCheck = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean previouslyKilled() { return wrapperContained.previouslyKilled; }
// public void previouslyKilled(boolean value) { wrapperContained.previouslyKilled = value; }
// public boolean dragonKilled() { return wrapperContained.dragonKilled; }
// public void dragonKilled(boolean value) { wrapperContained.dragonKilled = value; }
// public java.util.UUID dragonUuid() { return wrapperContained.dragonUuid; }
// public void dragonUuid(java.util.UUID value) { wrapperContained.dragonUuid = value; }
// public yarnwrap.util.math.BlockPos exitPortalLocation() { return new yarnwrap.util.math.BlockPos(wrapperContained.exitPortalLocation); }
// public void exitPortalLocation(yarnwrap.util.math.BlockPos value) { wrapperContained.exitPortalLocation = value.wrapperContained; }
// public int spawnStateTimer() { return wrapperContained.spawnStateTimer; }
// public void spawnStateTimer(int value) { wrapperContained.spawnStateTimer = value; }
// public yarnwrap.entity.boss.ServerBossBar bossBar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bossBar); }
// public void bossBar(yarnwrap.entity.boss.ServerBossBar value) { wrapperContained.bossBar = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonSpawnState dragonSpawnState() { return new yarnwrap.entity.boss.dragon.EnderDragonSpawnState(wrapperContained.dragonSpawnState); }
// public void dragonSpawnState(yarnwrap.entity.boss.dragon.EnderDragonSpawnState value) { wrapperContained.dragonSpawnState = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList gateways() { return wrapperContained.gateways; }
// public void gateways(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.gateways = value; }
// public int playerUpdateTimer() { return wrapperContained.playerUpdateTimer; }
// public void playerUpdateTimer(int value) { wrapperContained.playerUpdateTimer = value; }
public int SPAWN_Y() { return wrapperContained.SPAWN_Y; }
// public void SPAWN_Y(int value) { wrapperContained.SPAWN_Y = value; }
// public int CHECK_DRAGON_SEEN_INTERVAL() { return wrapperContained.CHECK_DRAGON_SEEN_INTERVAL; }
// public void CHECK_DRAGON_SEEN_INTERVAL(int value) { wrapperContained.CHECK_DRAGON_SEEN_INTERVAL = value; }
// public int CRYSTAL_COUNTING_INTERVAL() { return wrapperContained.CRYSTAL_COUNTING_INTERVAL; }
// public void CRYSTAL_COUNTING_INTERVAL(int value) { wrapperContained.CRYSTAL_COUNTING_INTERVAL = value; }
// public int ISLAND_SIZE() { return wrapperContained.ISLAND_SIZE; }
// public void ISLAND_SIZE(int value) { wrapperContained.ISLAND_SIZE = value; }
// public int PLAYER_COUNTING_INTERVAL() { return wrapperContained.PLAYER_COUNTING_INTERVAL; }
// public void PLAYER_COUNTING_INTERVAL(int value) { wrapperContained.PLAYER_COUNTING_INTERVAL = value; }
// public java.util.function.Predicate showBossBarPredicate() { return wrapperContained.showBossBarPredicate; }
// public void showBossBarPredicate(java.util.function.Predicate value) { wrapperContained.showBossBarPredicate = value; }
// public yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(wrapperContained.origin); }
// public void origin(yarnwrap.util.math.BlockPos value) { wrapperContained.origin = value.wrapperContained; }
// public boolean skipChunksLoadedCheck() { return wrapperContained.skipChunksLoadedCheck; }
// public void skipChunksLoadedCheck(boolean value) { wrapperContained.skipChunksLoadedCheck = value; }
// public EnderDragonFight(yarnwrap.server.world.ServerWorld world,long gatewaysSeed,Object data) { this.wrapperContained = new net.minecraft.entity.boss.dragon.EnderDragonFight(world.wrapperContained,gatewaysSeed,data); }
// public EnderDragonFight(yarnwrap.server.world.ServerWorld world,long gatewaysSeed,Object data,yarnwrap.util.math.BlockPos origin) { this.wrapperContained = new net.minecraft.entity.boss.dragon.EnderDragonFight(world.wrapperContained,gatewaysSeed,data,origin.wrapperContained); }
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