package yarnwrap.entity.mob;
public class Monster { public net.minecraft.entity.mob.Monster wrapperContained; public Monster(net.minecraft.entity.mob.Monster wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ZERO_EXPERIENCE() { return wrapperContained.ZERO_EXPERIENCE; }
// public void ZERO_EXPERIENCE(int value) { wrapperContained.ZERO_EXPERIENCE = value; }
public static int ZERO_EXPERIENCE() { return net.minecraft.entity.mob.Monster.ZERO_EXPERIENCE; }
// public static void ZERO_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.ZERO_EXPERIENCE = value; }

// public int SMALL_MONSTER_EXPERIENCE() { return wrapperContained.SMALL_MONSTER_EXPERIENCE; }
// public void SMALL_MONSTER_EXPERIENCE(int value) { wrapperContained.SMALL_MONSTER_EXPERIENCE = value; }
public static int SMALL_MONSTER_EXPERIENCE() { return net.minecraft.entity.mob.Monster.SMALL_MONSTER_EXPERIENCE; }
// public static void SMALL_MONSTER_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.SMALL_MONSTER_EXPERIENCE = value; }

// public int NORMAL_MONSTER_EXPERIENCE() { return wrapperContained.NORMAL_MONSTER_EXPERIENCE; }
// public void NORMAL_MONSTER_EXPERIENCE(int value) { wrapperContained.NORMAL_MONSTER_EXPERIENCE = value; }
public static int NORMAL_MONSTER_EXPERIENCE() { return net.minecraft.entity.mob.Monster.NORMAL_MONSTER_EXPERIENCE; }
// public static void NORMAL_MONSTER_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.NORMAL_MONSTER_EXPERIENCE = value; }

// public int STRONG_MONSTER_EXPERIENCE() { return wrapperContained.STRONG_MONSTER_EXPERIENCE; }
// public void STRONG_MONSTER_EXPERIENCE(int value) { wrapperContained.STRONG_MONSTER_EXPERIENCE = value; }
public static int STRONG_MONSTER_EXPERIENCE() { return net.minecraft.entity.mob.Monster.STRONG_MONSTER_EXPERIENCE; }
// public static void STRONG_MONSTER_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.STRONG_MONSTER_EXPERIENCE = value; }

// public int STRONGER_MONSTER_EXPERIENCE() { return wrapperContained.STRONGER_MONSTER_EXPERIENCE; }
// public void STRONGER_MONSTER_EXPERIENCE(int value) { wrapperContained.STRONGER_MONSTER_EXPERIENCE = value; }
public static int STRONGER_MONSTER_EXPERIENCE() { return net.minecraft.entity.mob.Monster.STRONGER_MONSTER_EXPERIENCE; }
// public static void STRONGER_MONSTER_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.STRONGER_MONSTER_EXPERIENCE = value; }

// public int WITHER_EXPERIENCE() { return wrapperContained.WITHER_EXPERIENCE; }
// public void WITHER_EXPERIENCE(int value) { wrapperContained.WITHER_EXPERIENCE = value; }
public static int WITHER_EXPERIENCE() { return net.minecraft.entity.mob.Monster.WITHER_EXPERIENCE; }
// public static void WITHER_EXPERIENCE(int value, ) { net.minecraft.entity.mob.Monster.WITHER_EXPERIENCE = value; }


}