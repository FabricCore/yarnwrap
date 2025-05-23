package yarnwrap.entity.passive;
public class PassiveEntity { public net.minecraft.entity.passive.PassiveEntity wrapperContained; public PassiveEntity(net.minecraft.entity.passive.PassiveEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int happyTicksRemaining() { return wrapperContained.happyTicksRemaining; }
// public void happyTicksRemaining(int value) { wrapperContained.happyTicksRemaining = value; }
// public static int happyTicksRemaining() { return net.minecraft.entity.passive.PassiveEntity.happyTicksRemaining; }
// public static void happyTicksRemaining(int value, ) { net.minecraft.entity.passive.PassiveEntity.happyTicksRemaining = value; }

// public int forcedAge() { return wrapperContained.forcedAge; }
// public void forcedAge(int value) { wrapperContained.forcedAge = value; }
// public static int forcedAge() { return net.minecraft.entity.passive.PassiveEntity.forcedAge; }
// public static void forcedAge(int value, ) { net.minecraft.entity.passive.PassiveEntity.forcedAge = value; }

// public yarnwrap.entity.data.TrackedData CHILD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHILD); }
// public void CHILD(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHILD = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CHILD() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.PassiveEntity.CHILD); }
// public static void CHILD(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.PassiveEntity.CHILD = value.wrapperContained; }

// public int breedingAge() { return wrapperContained.breedingAge; }
// public void breedingAge(int value) { wrapperContained.breedingAge = value; }
// public static int breedingAge() { return net.minecraft.entity.passive.PassiveEntity.breedingAge; }
// public static void breedingAge(int value, ) { net.minecraft.entity.passive.PassiveEntity.breedingAge = value; }

// public int BABY_AGE() { return wrapperContained.BABY_AGE; }
// public void BABY_AGE(int value) { wrapperContained.BABY_AGE = value; }
public static int BABY_AGE() { return net.minecraft.entity.passive.PassiveEntity.BABY_AGE; }
// public static void BABY_AGE(int value, ) { net.minecraft.entity.passive.PassiveEntity.BABY_AGE = value; }

// public int HAPPY_TICKS() { return wrapperContained.HAPPY_TICKS; }
// public void HAPPY_TICKS(int value) { wrapperContained.HAPPY_TICKS = value; }
// public static int HAPPY_TICKS() { return net.minecraft.entity.passive.PassiveEntity.HAPPY_TICKS; }
// public static void HAPPY_TICKS(int value, ) { net.minecraft.entity.passive.PassiveEntity.HAPPY_TICKS = value; }

// public int DEFAULT_AGE() { return wrapperContained.DEFAULT_AGE; }
// public void DEFAULT_AGE(int value) { wrapperContained.DEFAULT_AGE = value; }
// public static int DEFAULT_AGE() { return net.minecraft.entity.passive.PassiveEntity.DEFAULT_AGE; }
// public static void DEFAULT_AGE(int value, ) { net.minecraft.entity.passive.PassiveEntity.DEFAULT_AGE = value; }

// public int DEFAULT_FORCED_AGE() { return wrapperContained.DEFAULT_FORCED_AGE; }
// public void DEFAULT_FORCED_AGE(int value) { wrapperContained.DEFAULT_FORCED_AGE = value; }
// public static int DEFAULT_FORCED_AGE() { return net.minecraft.entity.passive.PassiveEntity.DEFAULT_FORCED_AGE; }
// public static void DEFAULT_FORCED_AGE(int value, ) { net.minecraft.entity.passive.PassiveEntity.DEFAULT_FORCED_AGE = value; }

public yarnwrap.entity.passive.PassiveEntity createChild(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.PassiveEntity entity) { return new yarnwrap.entity.passive.PassiveEntity(wrapperContained.createChild(world.wrapperContained,entity.wrapperContained)); }
// public static yarnwrap.entity.passive.PassiveEntity createChild(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.PassiveEntity entity, ) { return new yarnwrap.entity.passive.PassiveEntity(net.minecraft.entity.passive.PassiveEntity.createChild(world.wrapperContained,entity.wrapperContained)); }
public void setBreedingAge(int age) { wrapperContained.setBreedingAge(age); }
// public static void setBreedingAge(int age, ) { net.minecraft.entity.passive.PassiveEntity.setBreedingAge(age); }
public void growUp(int age) { wrapperContained.growUp(age); }
// public static void growUp(int age, ) { net.minecraft.entity.passive.PassiveEntity.growUp(age); }
public int getBreedingAge() { return wrapperContained.getBreedingAge(); }
// public static int getBreedingAge() { return net.minecraft.entity.passive.PassiveEntity.getBreedingAge(); }
// public void onGrowUp() { wrapperContained.onGrowUp(); }
// public static void onGrowUp() { net.minecraft.entity.passive.PassiveEntity.onGrowUp(); }
public void growUp(int age,boolean overGrow) { wrapperContained.growUp(age,overGrow); }
// public static void growUp(int age,boolean overGrow, ) { net.minecraft.entity.passive.PassiveEntity.growUp(age,overGrow); }
public boolean isReadyToBreed() { return wrapperContained.isReadyToBreed(); }
// public static boolean isReadyToBreed() { return net.minecraft.entity.passive.PassiveEntity.isReadyToBreed(); }
// public int toGrowUpAge(int breedingAge) { return wrapperContained.toGrowUpAge(breedingAge); }
// public static int toGrowUpAge(int breedingAge, ) { return net.minecraft.entity.passive.PassiveEntity.toGrowUpAge(breedingAge); }
public int getForcedAge() { return wrapperContained.getForcedAge(); }
// public static int getForcedAge() { return net.minecraft.entity.passive.PassiveEntity.getForcedAge(); }
public int getHappyTicksRemaining() { return wrapperContained.getHappyTicksRemaining(); }
// public static int getHappyTicksRemaining() { return net.minecraft.entity.passive.PassiveEntity.getHappyTicksRemaining(); }

}