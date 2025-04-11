package yarnwrap.entity.passive;
public class PassiveEntity { public net.minecraft.entity.passive.PassiveEntity wrapperContained; public PassiveEntity(net.minecraft.entity.passive.PassiveEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int BABY_AGE() { return wrapperContained.BABY_AGE; }
// public void BABY_AGE(int value) { wrapperContained.BABY_AGE = value; }
// public int HAPPY_TICKS() { return wrapperContained.HAPPY_TICKS; }
// public void HAPPY_TICKS(int value) { wrapperContained.HAPPY_TICKS = value; }
// public int happyTicksRemaining() { return wrapperContained.happyTicksRemaining; }
// public void happyTicksRemaining(int value) { wrapperContained.happyTicksRemaining = value; }
// public int forcedAge() { return wrapperContained.forcedAge; }
// public void forcedAge(int value) { wrapperContained.forcedAge = value; }
// public yarnwrap.entity.data.TrackedData CHILD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHILD); }
// public void CHILD(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHILD = value.wrapperContained; }
// public int breedingAge() { return wrapperContained.breedingAge; }
// public void breedingAge(int value) { wrapperContained.breedingAge = value; }
public boolean isReadyToBreed() { return wrapperContained.isReadyToBreed(); }
public int toGrowUpAge(int breedingAge) { return wrapperContained.toGrowUpAge(breedingAge); }
public yarnwrap.entity.passive.PassiveEntity createChild(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.PassiveEntity entity) { return new yarnwrap.entity.passive.PassiveEntity(wrapperContained.createChild(world.wrapperContained,entity.wrapperContained)); }
public void setBreedingAge(int age) { wrapperContained.setBreedingAge(age); }
public void growUp(int age) { wrapperContained.growUp(age); }
public int getBreedingAge() { return wrapperContained.getBreedingAge(); }
// public void onGrowUp() { wrapperContained.onGrowUp(); }
public void growUp(int age,boolean overGrow) { wrapperContained.growUp(age,overGrow); }

}