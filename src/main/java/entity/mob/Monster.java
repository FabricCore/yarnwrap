package yarnwrap.entity.mob;
public class Monster { public net.minecraft.entity.mob.Monster wrapperContained; public Monster(net.minecraft.entity.mob.Monster wrapperContained) { this.wrapperContained = wrapperContained; }

public int ZERO_XP() { return wrapperContained.ZERO_XP; }
public int SMALL_MONSTER_XP() { return wrapperContained.SMALL_MONSTER_XP; }
public int NORMAL_MONSTER_XP() { return wrapperContained.NORMAL_MONSTER_XP; }
public int STRONG_MONSTER_XP() { return wrapperContained.STRONG_MONSTER_XP; }
public int STRONGER_MONSTER_XP() { return wrapperContained.STRONGER_MONSTER_XP; }
public int WITHER_XP() { return wrapperContained.WITHER_XP; }

}