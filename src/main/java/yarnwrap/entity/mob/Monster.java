package yarnwrap.entity.mob;
public class Monster { public net.minecraft.entity.mob.Monster wrapperContained; public Monster(net.minecraft.entity.mob.Monster wrapperContained) { this.wrapperContained = wrapperContained; }

public int ZERO_XP() { return wrapperContained.ZERO_XP; }
// public void ZERO_XP(int value) { wrapperContained.ZERO_XP = value; }
public int SMALL_MONSTER_XP() { return wrapperContained.SMALL_MONSTER_XP; }
// public void SMALL_MONSTER_XP(int value) { wrapperContained.SMALL_MONSTER_XP = value; }
public int NORMAL_MONSTER_XP() { return wrapperContained.NORMAL_MONSTER_XP; }
// public void NORMAL_MONSTER_XP(int value) { wrapperContained.NORMAL_MONSTER_XP = value; }
public int STRONG_MONSTER_XP() { return wrapperContained.STRONG_MONSTER_XP; }
// public void STRONG_MONSTER_XP(int value) { wrapperContained.STRONG_MONSTER_XP = value; }
public int STRONGER_MONSTER_XP() { return wrapperContained.STRONGER_MONSTER_XP; }
// public void STRONGER_MONSTER_XP(int value) { wrapperContained.STRONGER_MONSTER_XP = value; }
public int WITHER_XP() { return wrapperContained.WITHER_XP; }
// public void WITHER_XP(int value) { wrapperContained.WITHER_XP = value; }

}