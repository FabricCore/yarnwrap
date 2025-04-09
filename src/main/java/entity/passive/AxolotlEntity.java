package yarnwrap.entity.passive;
public class AxolotlEntity { public net.minecraft.entity.passive.AxolotlEntity wrapperContained; public AxolotlEntity(net.minecraft.entity.passive.AxolotlEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public yarnwrap.entity.data.TrackedData PLAYING_DEAD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PLAYING_DEAD); }
// public yarnwrap.entity.data.TrackedData FROM_BUCKET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROM_BUCKET); }
public int PLAY_DEAD_TICKS() { return wrapperContained.PLAY_DEAD_TICKS; }
public double BUFF_RANGE() { return wrapperContained.BUFF_RANGE; }
public int BLUE_BABY_CHANCE() { return wrapperContained.BLUE_BABY_CHANCE; }
public java.lang.String VARIANT_KEY() { return wrapperContained.VARIANT_KEY; }
// public int MAX_AIR() { return wrapperContained.MAX_AIR; }
// public int BUFF_DURATION() { return wrapperContained.BUFF_DURATION; }
// public int HYDRATION_BY_POTION() { return wrapperContained.HYDRATION_BY_POTION; }
// public java.util.Map modelAngles() { return wrapperContained.modelAngles; }
// public int MAX_REGENERATION_BUFF_DURATION() { return wrapperContained.MAX_REGENERATION_BUFF_DURATION; }
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