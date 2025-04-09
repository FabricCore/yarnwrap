package yarnwrap.entity.mob;
public class BoggedEntity { public net.minecraft.entity.mob.BoggedEntity wrapperContained; public BoggedEntity(net.minecraft.entity.mob.BoggedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HARD_ATTACK_INTERVAL() { return wrapperContained.HARD_ATTACK_INTERVAL; }
// public int REGULAR_ATTACK_INTERVAL() { return wrapperContained.REGULAR_ATTACK_INTERVAL; }
public java.lang.String SHEARED_KEY() { return wrapperContained.SHEARED_KEY; }
// public yarnwrap.entity.data.TrackedData SHEARED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHEARED); }
public Object createBoggedAttributes() { return wrapperContained.createBoggedAttributes(); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public void dropShearedItems() { wrapperContained.dropShearedItems(); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }

}