package yarnwrap.entity.passive;
public class Cracks { public net.minecraft.entity.passive.Cracks wrapperContained; public Cracks(net.minecraft.entity.passive.Cracks wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.passive.Cracks IRON_GOLEM() { return new yarnwrap.entity.passive.Cracks(wrapperContained.IRON_GOLEM); }
// public void IRON_GOLEM(yarnwrap.entity.passive.Cracks value) { wrapperContained.IRON_GOLEM = value.wrapperContained; }
public yarnwrap.entity.passive.Cracks WOLF_ARMOR() { return new yarnwrap.entity.passive.Cracks(wrapperContained.WOLF_ARMOR); }
// public void WOLF_ARMOR(yarnwrap.entity.passive.Cracks value) { wrapperContained.WOLF_ARMOR = value.wrapperContained; }
// public float lowCrackThreshold() { return wrapperContained.lowCrackThreshold; }
// public void lowCrackThreshold(float value) { wrapperContained.lowCrackThreshold = value; }
// public float mediumCrackThreshold() { return wrapperContained.mediumCrackThreshold; }
// public void mediumCrackThreshold(float value) { wrapperContained.mediumCrackThreshold = value; }
// public float highCrackThreshold() { return wrapperContained.highCrackThreshold; }
// public void highCrackThreshold(float value) { wrapperContained.highCrackThreshold = value; }
public Object getCrackLevel(float health) { return wrapperContained.getCrackLevel(health); }
public Object getCrackLevel(int currentDamage,int maxDamage) { return wrapperContained.getCrackLevel(currentDamage,maxDamage); }
public Object getCrackLevel(yarnwrap.item.ItemStack stack) { return wrapperContained.getCrackLevel(stack.wrapperContained); }

}