package yarnwrap.entity.passive;
public class IronGolemEntity { public net.minecraft.entity.passive.IronGolemEntity wrapperContained; public IronGolemEntity(net.minecraft.entity.passive.IronGolemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public int HEALTH_PER_INGOT() { return wrapperContained.HEALTH_PER_INGOT; }
// public void HEALTH_PER_INGOT(int value) { wrapperContained.HEALTH_PER_INGOT = value; }
// public int lookingAtVillagerTicksLeft() { return wrapperContained.lookingAtVillagerTicksLeft; }
// public void lookingAtVillagerTicksLeft(int value) { wrapperContained.lookingAtVillagerTicksLeft = value; }
// public int attackTicksLeft() { return wrapperContained.attackTicksLeft; }
// public void attackTicksLeft(int value) { wrapperContained.attackTicksLeft = value; }
// public yarnwrap.entity.data.TrackedData IRON_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IRON_GOLEM_FLAGS); }
// public void IRON_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.IRON_GOLEM_FLAGS = value.wrapperContained; }
// public float getAttackDamage() { return wrapperContained.getAttackDamage(); }
public Object getCrackLevel() { return wrapperContained.getCrackLevel(); }
public Object createIronGolemAttributes() { return wrapperContained.createIronGolemAttributes(); }
public boolean isPlayerCreated() { return wrapperContained.isPlayerCreated(); }
public void setLookingAtVillager(boolean lookingAtVillager) { wrapperContained.setLookingAtVillager(lookingAtVillager); }
public void setPlayerCreated(boolean playerCreated) { wrapperContained.setPlayerCreated(playerCreated); }
public int getAttackTicksLeft() { return wrapperContained.getAttackTicksLeft(); }
public int getLookingAtVillagerTicks() { return wrapperContained.getLookingAtVillagerTicks(); }

}