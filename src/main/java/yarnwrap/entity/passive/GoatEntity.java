package yarnwrap.entity.passive;
public class GoatEntity { public net.minecraft.entity.passive.GoatEntity wrapperContained; public GoatEntity(net.minecraft.entity.passive.GoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.EntityDimensions LONG_JUMPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.LONG_JUMPING_DIMENSIONS); }
// public void LONG_JUMPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.LONG_JUMPING_DIMENSIONS = value.wrapperContained; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
public int FALL_DAMAGE_SUBTRACTOR() { return wrapperContained.FALL_DAMAGE_SUBTRACTOR; }
// public void FALL_DAMAGE_SUBTRACTOR(int value) { wrapperContained.FALL_DAMAGE_SUBTRACTOR = value; }
public double SCREAMING_CHANCE() { return wrapperContained.SCREAMING_CHANCE; }
// public void SCREAMING_CHANCE(double value) { wrapperContained.SCREAMING_CHANCE = value; }
// public yarnwrap.entity.data.TrackedData SCREAMING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCREAMING); }
// public void SCREAMING(yarnwrap.entity.data.TrackedData value) { wrapperContained.SCREAMING = value.wrapperContained; }
// public boolean preparingRam() { return wrapperContained.preparingRam; }
// public void preparingRam(boolean value) { wrapperContained.preparingRam = value; }
// public int headPitch() { return wrapperContained.headPitch; }
// public void headPitch(int value) { wrapperContained.headPitch = value; }
// public int DEFAULT_ATTACK_DAMAGE() { return wrapperContained.DEFAULT_ATTACK_DAMAGE; }
// public void DEFAULT_ATTACK_DAMAGE(int value) { wrapperContained.DEFAULT_ATTACK_DAMAGE = value; }
// public int BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public void BABY_ATTACK_DAMAGE(int value) { wrapperContained.BABY_ATTACK_DAMAGE = value; }
// public yarnwrap.entity.data.TrackedData LEFT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_HORN); }
// public void LEFT_HORN(yarnwrap.entity.data.TrackedData value) { wrapperContained.LEFT_HORN = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData RIGHT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_HORN); }
// public void RIGHT_HORN(yarnwrap.entity.data.TrackedData value) { wrapperContained.RIGHT_HORN = value.wrapperContained; }
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