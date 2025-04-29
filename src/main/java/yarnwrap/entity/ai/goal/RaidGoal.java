package yarnwrap.entity.ai.goal;
public class RaidGoal { public net.minecraft.entity.ai.goal.RaidGoal wrapperContained; public RaidGoal(net.minecraft.entity.ai.goal.RaidGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.RaidGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.RaidGoal.cooldown = value; }

// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
// public void MAX_COOLDOWN(int value) { wrapperContained.MAX_COOLDOWN = value; }
// public static int MAX_COOLDOWN() { return net.minecraft.entity.ai.goal.RaidGoal.MAX_COOLDOWN; }
// public static void MAX_COOLDOWN(int value, ) { net.minecraft.entity.ai.goal.RaidGoal.MAX_COOLDOWN = value; }

public RaidGoal(yarnwrap.entity.raid.RaiderEntity raider,java.lang.Class targetEntityClass,boolean checkVisibility,java.util.function.Predicate targetPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.RaidGoal(raider.wrapperContained,targetEntityClass,checkVisibility,targetPredicate); }
public int getCooldown() { return wrapperContained.getCooldown(); }
// public static int getCooldown() { return net.minecraft.entity.ai.goal.RaidGoal.getCooldown(); }
public void decreaseCooldown() { wrapperContained.decreaseCooldown(); }
// public static void decreaseCooldown() { net.minecraft.entity.ai.goal.RaidGoal.decreaseCooldown(); }

}