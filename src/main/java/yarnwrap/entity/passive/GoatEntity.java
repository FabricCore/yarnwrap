package yarnwrap.entity.passive;
public class GoatEntity { public net.minecraft.entity.passive.GoatEntity wrapperContained; public GoatEntity(net.minecraft.entity.passive.GoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions LONG_JUMPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.LONG_JUMPING_DIMENSIONS); }
// public void LONG_JUMPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.LONG_JUMPING_DIMENSIONS = value.wrapperContained; }
public static yarnwrap.entity.EntityDimensions LONG_JUMPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.GoatEntity.LONG_JUMPING_DIMENSIONS); }
// public static void LONG_JUMPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.GoatEntity.LONG_JUMPING_DIMENSIONS = value.wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public static com.google.common.collect.ImmutableList SENSORS() { return net.minecraft.entity.passive.GoatEntity.SENSORS; }
// public static void SENSORS(com.google.common.collect.ImmutableList value, ) { net.minecraft.entity.passive.GoatEntity.SENSORS = value; }

// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
// public static com.google.common.collect.ImmutableList MEMORY_MODULES() { return net.minecraft.entity.passive.GoatEntity.MEMORY_MODULES; }
// public static void MEMORY_MODULES(com.google.common.collect.ImmutableList value, ) { net.minecraft.entity.passive.GoatEntity.MEMORY_MODULES = value; }

// public int FALL_DAMAGE_SUBTRACTOR() { return wrapperContained.FALL_DAMAGE_SUBTRACTOR; }
// public void FALL_DAMAGE_SUBTRACTOR(int value) { wrapperContained.FALL_DAMAGE_SUBTRACTOR = value; }
public static int FALL_DAMAGE_SUBTRACTOR() { return net.minecraft.entity.passive.GoatEntity.FALL_DAMAGE_SUBTRACTOR; }
// public static void FALL_DAMAGE_SUBTRACTOR(int value, ) { net.minecraft.entity.passive.GoatEntity.FALL_DAMAGE_SUBTRACTOR = value; }

// public double SCREAMING_CHANCE() { return wrapperContained.SCREAMING_CHANCE; }
// public void SCREAMING_CHANCE(double value) { wrapperContained.SCREAMING_CHANCE = value; }
public static double SCREAMING_CHANCE() { return net.minecraft.entity.passive.GoatEntity.SCREAMING_CHANCE; }
// public static void SCREAMING_CHANCE(double value, ) { net.minecraft.entity.passive.GoatEntity.SCREAMING_CHANCE = value; }

// public yarnwrap.entity.data.TrackedData SCREAMING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCREAMING); }
// public void SCREAMING(yarnwrap.entity.data.TrackedData value) { wrapperContained.SCREAMING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SCREAMING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.GoatEntity.SCREAMING); }
// public static void SCREAMING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.GoatEntity.SCREAMING = value.wrapperContained; }

// public boolean preparingRam() { return wrapperContained.preparingRam; }
// public void preparingRam(boolean value) { wrapperContained.preparingRam = value; }
// public static boolean preparingRam() { return net.minecraft.entity.passive.GoatEntity.preparingRam; }
// public static void preparingRam(boolean value, ) { net.minecraft.entity.passive.GoatEntity.preparingRam = value; }

// public int headPitch() { return wrapperContained.headPitch; }
// public void headPitch(int value) { wrapperContained.headPitch = value; }
// public static int headPitch() { return net.minecraft.entity.passive.GoatEntity.headPitch; }
// public static void headPitch(int value, ) { net.minecraft.entity.passive.GoatEntity.headPitch = value; }

// public int DEFAULT_ATTACK_DAMAGE() { return wrapperContained.DEFAULT_ATTACK_DAMAGE; }
// public void DEFAULT_ATTACK_DAMAGE(int value) { wrapperContained.DEFAULT_ATTACK_DAMAGE = value; }
// public static int DEFAULT_ATTACK_DAMAGE() { return net.minecraft.entity.passive.GoatEntity.DEFAULT_ATTACK_DAMAGE; }
// public static void DEFAULT_ATTACK_DAMAGE(int value, ) { net.minecraft.entity.passive.GoatEntity.DEFAULT_ATTACK_DAMAGE = value; }

// public int BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public void BABY_ATTACK_DAMAGE(int value) { wrapperContained.BABY_ATTACK_DAMAGE = value; }
// public static int BABY_ATTACK_DAMAGE() { return net.minecraft.entity.passive.GoatEntity.BABY_ATTACK_DAMAGE; }
// public static void BABY_ATTACK_DAMAGE(int value, ) { net.minecraft.entity.passive.GoatEntity.BABY_ATTACK_DAMAGE = value; }

// public yarnwrap.entity.data.TrackedData LEFT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_HORN); }
// public void LEFT_HORN(yarnwrap.entity.data.TrackedData value) { wrapperContained.LEFT_HORN = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LEFT_HORN() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.GoatEntity.LEFT_HORN); }
// public static void LEFT_HORN(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.GoatEntity.LEFT_HORN = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData RIGHT_HORN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_HORN); }
// public void RIGHT_HORN(yarnwrap.entity.data.TrackedData value) { wrapperContained.RIGHT_HORN = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData RIGHT_HORN() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.GoatEntity.RIGHT_HORN); }
// public static void RIGHT_HORN(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.GoatEntity.RIGHT_HORN = value.wrapperContained; }

// public boolean DEFAULT_SCREAMING() { return wrapperContained.DEFAULT_SCREAMING; }
// public void DEFAULT_SCREAMING(boolean value) { wrapperContained.DEFAULT_SCREAMING = value; }
// public static boolean DEFAULT_SCREAMING() { return net.minecraft.entity.passive.GoatEntity.DEFAULT_SCREAMING; }
// public static void DEFAULT_SCREAMING(boolean value, ) { net.minecraft.entity.passive.GoatEntity.DEFAULT_SCREAMING = value; }

// public boolean DEFAULT_LEFT_HORN() { return wrapperContained.DEFAULT_LEFT_HORN; }
// public void DEFAULT_LEFT_HORN(boolean value) { wrapperContained.DEFAULT_LEFT_HORN = value; }
// public static boolean DEFAULT_LEFT_HORN() { return net.minecraft.entity.passive.GoatEntity.DEFAULT_LEFT_HORN; }
// public static void DEFAULT_LEFT_HORN(boolean value, ) { net.minecraft.entity.passive.GoatEntity.DEFAULT_LEFT_HORN = value; }

// public boolean DEFAULT_RIGHT_HORN() { return wrapperContained.DEFAULT_RIGHT_HORN; }
// public void DEFAULT_RIGHT_HORN(boolean value) { wrapperContained.DEFAULT_RIGHT_HORN = value; }
// public static boolean DEFAULT_RIGHT_HORN() { return net.minecraft.entity.passive.GoatEntity.DEFAULT_RIGHT_HORN; }
// public static void DEFAULT_RIGHT_HORN(boolean value, ) { net.minecraft.entity.passive.GoatEntity.DEFAULT_RIGHT_HORN = value; }

public boolean isScreaming() { return wrapperContained.isScreaming(); }
// public static boolean isScreaming() { return net.minecraft.entity.passive.GoatEntity.isScreaming(); }
// public Object createGoatAttributes() { return wrapperContained.createGoatAttributes(); }
public static Object createGoatAttributes() { return net.minecraft.entity.passive.GoatEntity.createGoatAttributes(); }
// public yarnwrap.sound.SoundEvent getMilkingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getMilkingSound()); }
// public static yarnwrap.sound.SoundEvent getMilkingSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.GoatEntity.getMilkingSound()); }
public float getHeadPitch() { return wrapperContained.getHeadPitch(); }
// public static float getHeadPitch() { return net.minecraft.entity.passive.GoatEntity.getHeadPitch(); }
public void setScreaming(boolean screaming) { wrapperContained.setScreaming(screaming); }
// public static void setScreaming(boolean screaming, ) { net.minecraft.entity.passive.GoatEntity.setScreaming(screaming); }
// public boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.GoatEntity.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean hasLeftHorn() { return wrapperContained.hasLeftHorn(); }
// public static boolean hasLeftHorn() { return net.minecraft.entity.passive.GoatEntity.hasLeftHorn(); }
public boolean hasRightHorn() { return wrapperContained.hasRightHorn(); }
// public static boolean hasRightHorn() { return net.minecraft.entity.passive.GoatEntity.hasRightHorn(); }
public boolean dropHorn() { return wrapperContained.dropHorn(); }
// public static boolean dropHorn() { return net.minecraft.entity.passive.GoatEntity.dropHorn(); }
public void addHorns() { wrapperContained.addHorns(); }
// public static void addHorns() { net.minecraft.entity.passive.GoatEntity.addHorns(); }
public void removeHorns() { wrapperContained.removeHorns(); }
// public static void removeHorns() { net.minecraft.entity.passive.GoatEntity.removeHorns(); }
public yarnwrap.item.ItemStack getGoatHornStack() { return new yarnwrap.item.ItemStack(wrapperContained.getGoatHornStack()); }
// public static yarnwrap.item.ItemStack getGoatHornStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.passive.GoatEntity.getGoatHornStack()); }
// public yarnwrap.item.ItemStack method_61482(yarnwrap.registry.entry.RegistryEntry instrument) { return new yarnwrap.item.ItemStack(wrapperContained.method_61482(instrument.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_61482(yarnwrap.registry.entry.RegistryEntry instrument, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.passive.GoatEntity.method_61482(instrument.wrapperContained)); }

}