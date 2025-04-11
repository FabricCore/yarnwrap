package yarnwrap.entity.passive;
public class AxolotlEntity { public net.minecraft.entity.passive.AxolotlEntity wrapperContained; public AxolotlEntity(net.minecraft.entity.passive.AxolotlEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData PLAYING_DEAD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PLAYING_DEAD); }
// public void PLAYING_DEAD(yarnwrap.entity.data.TrackedData value) { wrapperContained.PLAYING_DEAD = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData FROM_BUCKET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROM_BUCKET); }
// public void FROM_BUCKET(yarnwrap.entity.data.TrackedData value) { wrapperContained.FROM_BUCKET = value.wrapperContained; }
public int PLAY_DEAD_TICKS() { return wrapperContained.PLAY_DEAD_TICKS; }
// public void PLAY_DEAD_TICKS(int value) { wrapperContained.PLAY_DEAD_TICKS = value; }
public double BUFF_RANGE() { return wrapperContained.BUFF_RANGE; }
// public void BUFF_RANGE(double value) { wrapperContained.BUFF_RANGE = value; }
public int BLUE_BABY_CHANCE() { return wrapperContained.BLUE_BABY_CHANCE; }
// public void BLUE_BABY_CHANCE(int value) { wrapperContained.BLUE_BABY_CHANCE = value; }
public java.lang.String VARIANT_KEY() { return wrapperContained.VARIANT_KEY; }
// public void VARIANT_KEY(java.lang.String value) { wrapperContained.VARIANT_KEY = value; }
// public int MAX_AIR() { return wrapperContained.MAX_AIR; }
// public void MAX_AIR(int value) { wrapperContained.MAX_AIR = value; }
// public int BUFF_DURATION() { return wrapperContained.BUFF_DURATION; }
// public void BUFF_DURATION(int value) { wrapperContained.BUFF_DURATION = value; }
// public int HYDRATION_BY_POTION() { return wrapperContained.HYDRATION_BY_POTION; }
// public void HYDRATION_BY_POTION(int value) { wrapperContained.HYDRATION_BY_POTION = value; }
// public java.util.Map modelAngles() { return wrapperContained.modelAngles; }
// public void modelAngles(java.util.Map value) { wrapperContained.modelAngles = value; }
// public int MAX_REGENERATION_BUFF_DURATION() { return wrapperContained.MAX_REGENERATION_BUFF_DURATION; }
// public void MAX_REGENERATION_BUFF_DURATION(int value) { wrapperContained.MAX_REGENERATION_BUFF_DURATION = value; }
// public void setVariant(Object variant) { wrapperContained.setVariant(variant); }
// public boolean shouldBabyBeDifferent(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldBabyBeDifferent(random.wrapperContained); }
public void buffPlayer(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.buffPlayer(player.wrapperContained); }
public boolean isPlayingDead() { return wrapperContained.isPlayingDead(); }
public Object createAxolotlAttributes() { return wrapperContained.createAxolotlAttributes(); }
// public void tickAir(int air) { wrapperContained.tickAir(air); }
public void setPlayingDead(boolean playingDead) { wrapperContained.setPlayingDead(playingDead); }
public void appreciatePlayer(yarnwrap.entity.passive.AxolotlEntity axolotl,yarnwrap.entity.LivingEntity entity) { wrapperContained.appreciatePlayer(axolotl.wrapperContained,entity.wrapperContained); }
public void hydrateFromPotion() { wrapperContained.hydrateFromPotion(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}