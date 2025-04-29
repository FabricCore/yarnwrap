package yarnwrap.entity.passive;
public class IronGolemEntity { public net.minecraft.entity.passive.IronGolemEntity wrapperContained; public IronGolemEntity(net.minecraft.entity.passive.IronGolemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.passive.IronGolemEntity.ANGER_TIME_RANGE); }
// public static void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.passive.IronGolemEntity.ANGER_TIME_RANGE = value.wrapperContained; }

// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public static int angerTime() { return net.minecraft.entity.passive.IronGolemEntity.angerTime; }
// public static void angerTime(int value, ) { net.minecraft.entity.passive.IronGolemEntity.angerTime = value; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public static java.util.UUID angryAt() { return net.minecraft.entity.passive.IronGolemEntity.angryAt; }
// public static void angryAt(java.util.UUID value, ) { net.minecraft.entity.passive.IronGolemEntity.angryAt = value; }

// public int HEALTH_PER_INGOT() { return wrapperContained.HEALTH_PER_INGOT; }
// public void HEALTH_PER_INGOT(int value) { wrapperContained.HEALTH_PER_INGOT = value; }
// public static int HEALTH_PER_INGOT() { return net.minecraft.entity.passive.IronGolemEntity.HEALTH_PER_INGOT; }
// public static void HEALTH_PER_INGOT(int value, ) { net.minecraft.entity.passive.IronGolemEntity.HEALTH_PER_INGOT = value; }

// public int lookingAtVillagerTicksLeft() { return wrapperContained.lookingAtVillagerTicksLeft; }
// public void lookingAtVillagerTicksLeft(int value) { wrapperContained.lookingAtVillagerTicksLeft = value; }
// public static int lookingAtVillagerTicksLeft() { return net.minecraft.entity.passive.IronGolemEntity.lookingAtVillagerTicksLeft; }
// public static void lookingAtVillagerTicksLeft(int value, ) { net.minecraft.entity.passive.IronGolemEntity.lookingAtVillagerTicksLeft = value; }

// public int attackTicksLeft() { return wrapperContained.attackTicksLeft; }
// public void attackTicksLeft(int value) { wrapperContained.attackTicksLeft = value; }
// public static int attackTicksLeft() { return net.minecraft.entity.passive.IronGolemEntity.attackTicksLeft; }
// public static void attackTicksLeft(int value, ) { net.minecraft.entity.passive.IronGolemEntity.attackTicksLeft = value; }

// public yarnwrap.entity.data.TrackedData IRON_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IRON_GOLEM_FLAGS); }
// public void IRON_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.IRON_GOLEM_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData IRON_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.IronGolemEntity.IRON_GOLEM_FLAGS); }
// public static void IRON_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.IronGolemEntity.IRON_GOLEM_FLAGS = value.wrapperContained; }

// public float getAttackDamage() { return wrapperContained.getAttackDamage(); }
// public static float getAttackDamage() { return net.minecraft.entity.passive.IronGolemEntity.getAttackDamage(); }
public Object getCrackLevel() { return wrapperContained.getCrackLevel(); }
// public static Object getCrackLevel() { return net.minecraft.entity.passive.IronGolemEntity.getCrackLevel(); }
// public Object createIronGolemAttributes() { return wrapperContained.createIronGolemAttributes(); }
public static Object createIronGolemAttributes() { return net.minecraft.entity.passive.IronGolemEntity.createIronGolemAttributes(); }
public boolean isPlayerCreated() { return wrapperContained.isPlayerCreated(); }
// public static boolean isPlayerCreated() { return net.minecraft.entity.passive.IronGolemEntity.isPlayerCreated(); }
public void setLookingAtVillager(boolean lookingAtVillager) { wrapperContained.setLookingAtVillager(lookingAtVillager); }
// public static void setLookingAtVillager(boolean lookingAtVillager, ) { net.minecraft.entity.passive.IronGolemEntity.setLookingAtVillager(lookingAtVillager); }
// public boolean method_6498(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_6498(entity.wrapperContained); }
// public static boolean method_6498(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.IronGolemEntity.method_6498(entity.wrapperContained); }
public void setPlayerCreated(boolean playerCreated) { wrapperContained.setPlayerCreated(playerCreated); }
// public static void setPlayerCreated(boolean playerCreated, ) { net.minecraft.entity.passive.IronGolemEntity.setPlayerCreated(playerCreated); }
public int getAttackTicksLeft() { return wrapperContained.getAttackTicksLeft(); }
// public static int getAttackTicksLeft() { return net.minecraft.entity.passive.IronGolemEntity.getAttackTicksLeft(); }
public int getLookingAtVillagerTicks() { return wrapperContained.getLookingAtVillagerTicks(); }
// public static int getLookingAtVillagerTicks() { return net.minecraft.entity.passive.IronGolemEntity.getLookingAtVillagerTicks(); }

}