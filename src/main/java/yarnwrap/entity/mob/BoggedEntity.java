package yarnwrap.entity.mob;
public class BoggedEntity { public net.minecraft.entity.mob.BoggedEntity wrapperContained; public BoggedEntity(net.minecraft.entity.mob.BoggedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HARD_ATTACK_INTERVAL() { return wrapperContained.HARD_ATTACK_INTERVAL; }
// public void HARD_ATTACK_INTERVAL(int value) { wrapperContained.HARD_ATTACK_INTERVAL = value; }
// public static int HARD_ATTACK_INTERVAL() { return net.minecraft.entity.mob.BoggedEntity.HARD_ATTACK_INTERVAL; }
// public static void HARD_ATTACK_INTERVAL(int value, ) { net.minecraft.entity.mob.BoggedEntity.HARD_ATTACK_INTERVAL = value; }

// public int REGULAR_ATTACK_INTERVAL() { return wrapperContained.REGULAR_ATTACK_INTERVAL; }
// public void REGULAR_ATTACK_INTERVAL(int value) { wrapperContained.REGULAR_ATTACK_INTERVAL = value; }
// public static int REGULAR_ATTACK_INTERVAL() { return net.minecraft.entity.mob.BoggedEntity.REGULAR_ATTACK_INTERVAL; }
// public static void REGULAR_ATTACK_INTERVAL(int value, ) { net.minecraft.entity.mob.BoggedEntity.REGULAR_ATTACK_INTERVAL = value; }

// public java.lang.String SHEARED_KEY() { return wrapperContained.SHEARED_KEY; }
// public void SHEARED_KEY(java.lang.String value) { wrapperContained.SHEARED_KEY = value; }
public static java.lang.String SHEARED_KEY() { return net.minecraft.entity.mob.BoggedEntity.SHEARED_KEY; }
// public static void SHEARED_KEY(java.lang.String value, ) { net.minecraft.entity.mob.BoggedEntity.SHEARED_KEY = value; }

// public yarnwrap.entity.data.TrackedData SHEARED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHEARED); }
// public void SHEARED(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHEARED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SHEARED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.BoggedEntity.SHEARED); }
// public static void SHEARED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.BoggedEntity.SHEARED = value.wrapperContained; }

// public Object createBoggedAttributes() { return wrapperContained.createBoggedAttributes(); }
public static Object createBoggedAttributes() { return net.minecraft.entity.mob.BoggedEntity.createBoggedAttributes(); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public static boolean isSheared() { return net.minecraft.entity.mob.BoggedEntity.isSheared(); }
// public void dropShearedItems() { wrapperContained.dropShearedItems(); }
// public static void dropShearedItems() { net.minecraft.entity.mob.BoggedEntity.dropShearedItems(); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }
// public static void setSheared(boolean sheared, ) { net.minecraft.entity.mob.BoggedEntity.setSheared(sheared); }

}