package yarnwrap.entity.passive;
public class GoatEntity { public net.minecraft.entity.passive.GoatEntity wrapperContained; public GoatEntity(net.minecraft.entity.passive.GoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.EntityDimensions LONG_JUMPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.LONG_JUMPING_DIMENSIONS); }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
public int FALL_DAMAGE_SUBTRACTOR() { return wrapperContained.FALL_DAMAGE_SUBTRACTOR; }
public double SCREAMING_CHANCE() { return wrapperContained.SCREAMING_CHANCE; }
// public yarnwrap.entity.data.TrackedData SCREAMING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCREAMING); }
// public boolean preparingRam() { return wrapperContained.preparingRam; }
// public int headPitch() { return wrapperContained.headPitch; }
// public int DEFAULT_ATTACK_DAMAGE() { return wrapperContained.DEFAULT_ATTACK_DAMAGE; }
// public int BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public yarnwrap.entity.data.TrackedData LEFT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_HORN); }
// public yarnwrap.entity.data.TrackedData RIGHT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_HORN); }
public boolean isScreaming() { return wrapperContained.isScreaming(); }
public Object createGoatAttributes() { return wrapperContained.createGoatAttributes(); }
// public yarnwrap.sound.SoundEvent getMilkingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getMilkingSound()); }
public float getHeadPitch() { return wrapperContained.getHeadPitch(); }
public void setScreaming(boolean screaming) { wrapperContained.setScreaming(screaming); }
public boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean hasLeftHorn() { return wrapperContained.hasLeftHorn(); }
public boolean hasRightHorn() { return wrapperContained.hasRightHorn(); }
public boolean dropHorn() { return wrapperContained.dropHorn(); }
public void addHorns() { wrapperContained.addHorns(); }
public void removeHorns() { wrapperContained.removeHorns(); }
public yarnwrap.item.ItemStack getGoatHornStack() { return new yarnwrap.item.ItemStack(wrapperContained.getGoatHornStack()); }

}