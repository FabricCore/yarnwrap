package yarnwrap.entity.passive;
public class MooshroomEntity { public net.minecraft.entity.passive.MooshroomEntity wrapperContained; public MooshroomEntity(net.minecraft.entity.passive.MooshroomEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.MooshroomEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.MooshroomEntity.VARIANT = value.wrapperContained; }

// public java.util.UUID lightningId() { return wrapperContained.lightningId; }
// public void lightningId(java.util.UUID value) { wrapperContained.lightningId = value; }
// public static java.util.UUID lightningId() { return net.minecraft.entity.passive.MooshroomEntity.lightningId; }
// public static void lightningId(java.util.UUID value, ) { net.minecraft.entity.passive.MooshroomEntity.lightningId = value; }

// public int MUTATION_CHANCE() { return wrapperContained.MUTATION_CHANCE; }
// public void MUTATION_CHANCE(int value) { wrapperContained.MUTATION_CHANCE = value; }
// public static int MUTATION_CHANCE() { return net.minecraft.entity.passive.MooshroomEntity.MUTATION_CHANCE; }
// public static void MUTATION_CHANCE(int value, ) { net.minecraft.entity.passive.MooshroomEntity.MUTATION_CHANCE = value; }

// public java.lang.String STEW_EFFECTS_NBT_KEY() { return wrapperContained.STEW_EFFECTS_NBT_KEY; }
// public void STEW_EFFECTS_NBT_KEY(java.lang.String value) { wrapperContained.STEW_EFFECTS_NBT_KEY = value; }
// public static java.lang.String STEW_EFFECTS_NBT_KEY() { return net.minecraft.entity.passive.MooshroomEntity.STEW_EFFECTS_NBT_KEY; }
// public static void STEW_EFFECTS_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.passive.MooshroomEntity.STEW_EFFECTS_NBT_KEY = value; }

// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value) { wrapperContained.stewEffects = value.wrapperContained; }
// public static yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(net.minecraft.entity.passive.MooshroomEntity.stewEffects); }
// public static void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value, ) { net.minecraft.entity.passive.MooshroomEntity.stewEffects = value.wrapperContained; }

// public Object chooseBabyVariant(yarnwrap.entity.passive.MooshroomEntity mooshroom) { return wrapperContained.chooseBabyVariant(mooshroom.wrapperContained); }
// public static Object chooseBabyVariant(yarnwrap.entity.passive.MooshroomEntity mooshroom, ) { return net.minecraft.entity.passive.MooshroomEntity.chooseBabyVariant(mooshroom.wrapperContained); }
// public java.util.Optional getStewEffectFrom(yarnwrap.item.ItemStack flower) { return wrapperContained.getStewEffectFrom(flower.wrapperContained); }
// public static java.util.Optional getStewEffectFrom(yarnwrap.item.ItemStack flower, ) { return net.minecraft.entity.passive.MooshroomEntity.getStewEffectFrom(flower.wrapperContained); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.MooshroomEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void setVariant(Object variant) { wrapperContained.setVariant(variant); }
// public static void setVariant(Object variant, ) { net.minecraft.entity.passive.MooshroomEntity.setVariant(variant); }
public Object getVariant() { return wrapperContained.getVariant(); }
// public static Object getVariant() { return net.minecraft.entity.passive.MooshroomEntity.getVariant(); }
// public void method_61469(yarnwrap.server.world.ServerWorld worldx,yarnwrap.item.ItemStack stack) { wrapperContained.method_61469(worldx.wrapperContained,stack.wrapperContained); }
// public static void method_61469(yarnwrap.server.world.ServerWorld worldx,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.passive.MooshroomEntity.method_61469(worldx.wrapperContained,stack.wrapperContained); }
// public void method_63648(yarnwrap.server.world.ServerWorld cow) { wrapperContained.method_63648(cow.wrapperContained); }
// public static void method_63648(yarnwrap.server.world.ServerWorld cow, ) { net.minecraft.entity.passive.MooshroomEntity.method_63648(cow.wrapperContained); }

}