package yarnwrap.village.raid;
public class Raid { public net.minecraft.village.raid.Raid wrapperContained; public Raid(net.minecraft.village.raid.Raid wrapperContained) { this.wrapperContained = wrapperContained; }

// public long ticksActive() { return wrapperContained.ticksActive; }
// public void ticksActive(long value) { wrapperContained.ticksActive = value; }
// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public yarnwrap.entity.boss.ServerBossBar bar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bar); }
// public void bar(yarnwrap.entity.boss.ServerBossBar value) { wrapperContained.bar = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public boolean started() { return wrapperContained.started; }
// public void started(boolean value) { wrapperContained.started = value; }
// public yarnwrap.util.math.BlockPos center() { return new yarnwrap.util.math.BlockPos(wrapperContained.center); }
// public void center(yarnwrap.util.math.BlockPos value) { wrapperContained.center = value.wrapperContained; }
// public int preRaidTicks() { return wrapperContained.preRaidTicks; }
// public void preRaidTicks(int value) { wrapperContained.preRaidTicks = value; }
// public java.util.Map waveToCaptain() { return wrapperContained.waveToCaptain; }
// public void waveToCaptain(java.util.Map value) { wrapperContained.waveToCaptain = value; }
// public int postRaidTicks() { return wrapperContained.postRaidTicks; }
// public void postRaidTicks(int value) { wrapperContained.postRaidTicks = value; }
// public java.util.Map waveToRaiders() { return wrapperContained.waveToRaiders; }
// public void waveToRaiders(java.util.Map value) { wrapperContained.waveToRaiders = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public float totalHealth() { return wrapperContained.totalHealth; }
// public void totalHealth(float value) { wrapperContained.totalHealth = value; }
// public int wavesSpawned() { return wrapperContained.wavesSpawned; }
// public void wavesSpawned(int value) { wrapperContained.wavesSpawned = value; }
// public int badOmenLevel() { return wrapperContained.badOmenLevel; }
// public void badOmenLevel(int value) { wrapperContained.badOmenLevel = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public yarnwrap.text.Text EVENT_TEXT() { return new yarnwrap.text.Text(wrapperContained.EVENT_TEXT); }
// public void EVENT_TEXT(yarnwrap.text.Text value) { wrapperContained.EVENT_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text VICTORY_TITLE() { return new yarnwrap.text.Text(wrapperContained.VICTORY_TITLE); }
// public void VICTORY_TITLE(yarnwrap.text.Text value) { wrapperContained.VICTORY_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text DEFEAT_TITLE() { return new yarnwrap.text.Text(wrapperContained.DEFEAT_TITLE); }
// public void DEFEAT_TITLE(yarnwrap.text.Text value) { wrapperContained.DEFEAT_TITLE = value.wrapperContained; }
// public java.util.Set heroesOfTheVillage() { return wrapperContained.heroesOfTheVillage; }
// public void heroesOfTheVillage(java.util.Set value) { wrapperContained.heroesOfTheVillage = value; }
// public int waveCount() { return wrapperContained.waveCount; }
// public void waveCount(int value) { wrapperContained.waveCount = value; }
// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// public int finishCooldown() { return wrapperContained.finishCooldown; }
// public void finishCooldown(int value) { wrapperContained.finishCooldown = value; }
// public java.util.Optional preCalculatedRavagerSpawnLocation() { return wrapperContained.preCalculatedRavagerSpawnLocation; }
// public void preCalculatedRavagerSpawnLocation(java.util.Optional value) { wrapperContained.preCalculatedRavagerSpawnLocation = value; }
public int MAX_DESPAWN_COUNTER() { return wrapperContained.MAX_DESPAWN_COUNTER; }
// public void MAX_DESPAWN_COUNTER(int value) { wrapperContained.MAX_DESPAWN_COUNTER = value; }
public int SQUARED_MAX_RAIDER_DISTANCE() { return wrapperContained.SQUARED_MAX_RAIDER_DISTANCE; }
// public void SQUARED_MAX_RAIDER_DISTANCE(int value) { wrapperContained.SQUARED_MAX_RAIDER_DISTANCE = value; }
// public yarnwrap.text.Text OMINOUS_BANNER_TRANSLATION_KEY() { return new yarnwrap.text.Text(wrapperContained.OMINOUS_BANNER_TRANSLATION_KEY); }
// public void OMINOUS_BANNER_TRANSLATION_KEY(yarnwrap.text.Text value) { wrapperContained.OMINOUS_BANNER_TRANSLATION_KEY = value.wrapperContained; }
// public java.lang.String RAIDERS_REMAINING_TRANSLATION_KEY() { return wrapperContained.RAIDERS_REMAINING_TRANSLATION_KEY; }
// public void RAIDERS_REMAINING_TRANSLATION_KEY(java.lang.String value) { wrapperContained.RAIDERS_REMAINING_TRANSLATION_KEY = value; }
// public int DEFAULT_PRE_RAID_TICKS() { return wrapperContained.DEFAULT_PRE_RAID_TICKS; }
// public void DEFAULT_PRE_RAID_TICKS(int value) { wrapperContained.DEFAULT_PRE_RAID_TICKS = value; }
// public int MAX_ACTIVE_TICKS() { return wrapperContained.MAX_ACTIVE_TICKS; }
// public void MAX_ACTIVE_TICKS(int value) { wrapperContained.MAX_ACTIVE_TICKS = value; }
public Raid(int id,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.village.raid.Raid(id,world.wrapperContained,pos.wrapperContained); }
public Raid(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.village.raid.Raid(world.wrapperContained,nbt.wrapperContained); }
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
// public java.util.Set method_16508(java.lang.Integer wavex) { return wrapperContained.method_16508(wavex); }
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
// public boolean method_19208(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_19208(player.wrapperContained); }
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
// public double method_20510(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_20510(pos.wrapperContained); }
// public void moveRaidCenter() { wrapperContained.moveRaidCenter(); }
public void setBadOmenLevel(int badOmenLevel) { wrapperContained.setBadOmenLevel(badOmenLevel); }
public float getTotalHealth() { return wrapperContained.getTotalHealth(); }
public java.util.Set getAllRaiders() { return wrapperContained.getAllRaiders(); }

}