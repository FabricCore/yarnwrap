package yarnwrap.village.raid;
public class Raid { public net.minecraft.village.raid.Raid wrapperContained; public Raid(net.minecraft.village.raid.Raid wrapperContained) { this.wrapperContained = wrapperContained; }

// public long ticksActive() { return wrapperContained.ticksActive; }
// public boolean active() { return wrapperContained.active; }
// public yarnwrap.entity.boss.ServerBossBar bar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bar); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public boolean started() { return wrapperContained.started; }
// public yarnwrap.util.math.BlockPos center() { return new yarnwrap.util.math.BlockPos(wrapperContained.center); }
// public int preRaidTicks() { return wrapperContained.preRaidTicks; }
// public java.util.Map waveToCaptain() { return wrapperContained.waveToCaptain; }
// public int postRaidTicks() { return wrapperContained.postRaidTicks; }
// public java.util.Map waveToRaiders() { return wrapperContained.waveToRaiders; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public float totalHealth() { return wrapperContained.totalHealth; }
// public int wavesSpawned() { return wrapperContained.wavesSpawned; }
// public int badOmenLevel() { return wrapperContained.badOmenLevel; }
// public int id() { return wrapperContained.id; }
// public yarnwrap.text.Text EVENT_TEXT() { return new yarnwrap.text.Text(wrapperContained.EVENT_TEXT); }
// public yarnwrap.text.Text VICTORY_TITLE() { return new yarnwrap.text.Text(wrapperContained.VICTORY_TITLE); }
// public yarnwrap.text.Text DEFEAT_TITLE() { return new yarnwrap.text.Text(wrapperContained.DEFEAT_TITLE); }
// public java.util.Set heroesOfTheVillage() { return wrapperContained.heroesOfTheVillage; }
// public int waveCount() { return wrapperContained.waveCount; }
// public Object status() { return wrapperContained.status; }
// public int finishCooldown() { return wrapperContained.finishCooldown; }
// public java.util.Optional preCalculatedRavagerSpawnLocation() { return wrapperContained.preCalculatedRavagerSpawnLocation; }
public int MAX_DESPAWN_COUNTER() { return wrapperContained.MAX_DESPAWN_COUNTER; }
public int SQUARED_MAX_RAIDER_DISTANCE() { return wrapperContained.SQUARED_MAX_RAIDER_DISTANCE; }
// public yarnwrap.text.Text OMINOUS_BANNER_TRANSLATION_KEY() { return new yarnwrap.text.Text(wrapperContained.OMINOUS_BANNER_TRANSLATION_KEY); }
// public java.lang.String RAIDERS_REMAINING_TRANSLATION_KEY() { return wrapperContained.RAIDERS_REMAINING_TRANSLATION_KEY; }
// public int DEFAULT_PRE_RAID_TICKS() { return wrapperContained.DEFAULT_PRE_RAID_TICKS; }
// public int MAX_ACTIVE_TICKS() { return wrapperContained.MAX_ACTIVE_TICKS; }
public boolean addToWave(int wave,yarnwrap.entity.raid.RaiderEntity entity,boolean countHealth) { return wrapperContained.addToWave(wave,entity.wrapperContained,countHealth); }
public int getGroupsSpawned() { return wrapperContained.getGroupsSpawned(); }
public void setWaveCaptain(int wave,yarnwrap.entity.raid.RaiderEntity entity) { wrapperContained.setWaveCaptain(wave,entity.wrapperContained); }
public int getBadOmenLevel() { return wrapperContained.getBadOmenLevel(); }
public int getRaidId() { return wrapperContained.getRaidId(); }
public yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenter()); }
public yarnwrap.entity.raid.RaiderEntity getCaptain(int wave) { return new yarnwrap.entity.raid.RaiderEntity(wrapperContained.getCaptain(wave)); }
// public void updateBarToPlayers() { wrapperContained.updateBarToPlayers(); }
public void removeLeader(int wave) { wrapperContained.removeLeader(wave); }
// public java.util.function.Predicate isInRaidDistance() { return wrapperContained.isInRaidDistance(); }
public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained)); }
public boolean isActive() { return wrapperContained.isActive(); }
// public boolean addToWave(int wave,yarnwrap.entity.raid.RaiderEntity entity) { return wrapperContained.addToWave(wave,entity.wrapperContained); }
public void invalidate() { wrapperContained.invalidate(); }
public void tick() { wrapperContained.tick(); }
public void removeFromWave(yarnwrap.entity.raid.RaiderEntity entity,boolean countHealth) { wrapperContained.removeFromWave(entity.wrapperContained,countHealth); }
public float getCurrentRaiderHealth() { return wrapperContained.getCurrentRaiderHealth(); }
public int getMaxAcceptableBadOmenLevel() { return wrapperContained.getMaxAcceptableBadOmenLevel(); }
public yarnwrap.item.ItemStack getOminousBanner(yarnwrap.registry.RegistryEntryLookup bannerPatternLookup) { return new yarnwrap.item.ItemStack(wrapperContained.getOminousBanner(bannerPatternLookup.wrapperContained)); }
public void addRaider(int wave,yarnwrap.entity.raid.RaiderEntity raider,yarnwrap.util.math.BlockPos pos,boolean existing) { wrapperContained.addRaider(wave,raider.wrapperContained,pos.wrapperContained,existing); }
public int getRaiderCount() { return wrapperContained.getRaiderCount(); }
// public boolean start() { return wrapperContained.start(); }
// public boolean canSpawnRaiders() { return wrapperContained.canSpawnRaiders(); }
// public void markDirty() { wrapperContained.markDirty(); }
// public void playRaidHorn(yarnwrap.util.math.BlockPos pos) { wrapperContained.playRaidHorn(pos.wrapperContained); }
// public void spawnNextWave(yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnNextWave(pos.wrapperContained); }
public void updateBar() { wrapperContained.updateBar(); }
public boolean hasStarted() { return wrapperContained.hasStarted(); }
// public yarnwrap.util.math.BlockPos getRavagerSpawnLocation(int proximity,int tries) { return new yarnwrap.util.math.BlockPos(wrapperContained.getRavagerSpawnLocation(proximity,tries)); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public boolean isFinished() { return wrapperContained.isFinished(); }
// public boolean shouldSpawnMoreGroups() { return wrapperContained.shouldSpawnMoreGroups(); }
// public void removeObsoleteRaiders() { wrapperContained.removeObsoleteRaiders(); }
// public boolean hasSpawnedFinalWave() { return wrapperContained.hasSpawnedFinalWave(); }
// public boolean hasExtraWave() { return wrapperContained.hasExtraWave(); }
// public boolean hasSpawnedExtraWave() { return wrapperContained.hasSpawnedExtraWave(); }
// public boolean isSpawningExtraWave() { return wrapperContained.isSpawningExtraWave(); }
public int getMaxWaves(yarnwrap.world.Difficulty difficulty) { return wrapperContained.getMaxWaves(difficulty.wrapperContained); }
public void addHero(yarnwrap.entity.Entity entity) { wrapperContained.addHero(entity.wrapperContained); }
// public int getCount(Object member,int wave,boolean extra) { return wrapperContained.getCount(member,wave,extra); }
// public int getBonusCount(Object member,yarnwrap.util.math.random.Random random,int wave,yarnwrap.world.LocalDifficulty localDifficulty,boolean extra) { return wrapperContained.getBonusCount(member,random.wrapperContained,wave,localDifficulty.wrapperContained,extra); }
public boolean isPreRaid() { return wrapperContained.isPreRaid(); }
public boolean hasSpawned() { return wrapperContained.hasSpawned(); }
public boolean hasStopped() { return wrapperContained.hasStopped(); }
public boolean hasWon() { return wrapperContained.hasWon(); }
public boolean hasLost() { return wrapperContained.hasLost(); }
public float getEnchantmentChance() { return wrapperContained.getEnchantmentChance(); }
// public java.util.Optional preCalculateRavagerSpawnLocation(int proximity) { return wrapperContained.preCalculateRavagerSpawnLocation(proximity); }
// public void setCenter(yarnwrap.util.math.BlockPos center) { wrapperContained.setCenter(center.wrapperContained); }
// public void moveRaidCenter() { wrapperContained.moveRaidCenter(); }
public void setBadOmenLevel(int badOmenLevel) { wrapperContained.setBadOmenLevel(badOmenLevel); }
public float getTotalHealth() { return wrapperContained.getTotalHealth(); }
public java.util.Set getAllRaiders() { return wrapperContained.getAllRaiders(); }

}