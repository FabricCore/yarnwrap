package yarnwrap.entity.ai.goal;
public class BreakDoorGoal { public net.minecraft.entity.ai.goal.BreakDoorGoal wrapperContained; public BreakDoorGoal(net.minecraft.entity.ai.goal.BreakDoorGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastBreakProgress() { return wrapperContained.lastBreakProgress; }
// public void lastBreakProgress(int value) { wrapperContained.lastBreakProgress = value; }
// public static int lastBreakProgress() { return net.minecraft.entity.ai.goal.BreakDoorGoal.lastBreakProgress; }
// public static void lastBreakProgress(int value, ) { net.minecraft.entity.ai.goal.BreakDoorGoal.lastBreakProgress = value; }

// public int breakProgress() { return wrapperContained.breakProgress; }
// public void breakProgress(int value) { wrapperContained.breakProgress = value; }
// public static int breakProgress() { return net.minecraft.entity.ai.goal.BreakDoorGoal.breakProgress; }
// public static void breakProgress(int value, ) { net.minecraft.entity.ai.goal.BreakDoorGoal.breakProgress = value; }

// public int maxProgress() { return wrapperContained.maxProgress; }
// public void maxProgress(int value) { wrapperContained.maxProgress = value; }
// public static int maxProgress() { return net.minecraft.entity.ai.goal.BreakDoorGoal.maxProgress; }
// public static void maxProgress(int value, ) { net.minecraft.entity.ai.goal.BreakDoorGoal.maxProgress = value; }

// public java.util.function.Predicate difficultySufficientPredicate() { return wrapperContained.difficultySufficientPredicate; }
// public void difficultySufficientPredicate(java.util.function.Predicate value) { wrapperContained.difficultySufficientPredicate = value; }
// public static java.util.function.Predicate difficultySufficientPredicate() { return net.minecraft.entity.ai.goal.BreakDoorGoal.difficultySufficientPredicate; }
// public static void difficultySufficientPredicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.BreakDoorGoal.difficultySufficientPredicate = value; }

// public int MIN_MAX_PROGRESS() { return wrapperContained.MIN_MAX_PROGRESS; }
// public void MIN_MAX_PROGRESS(int value) { wrapperContained.MIN_MAX_PROGRESS = value; }
// public static int MIN_MAX_PROGRESS() { return net.minecraft.entity.ai.goal.BreakDoorGoal.MIN_MAX_PROGRESS; }
// public static void MIN_MAX_PROGRESS(int value, ) { net.minecraft.entity.ai.goal.BreakDoorGoal.MIN_MAX_PROGRESS = value; }

public BreakDoorGoal(yarnwrap.entity.mob.MobEntity mob,int maxProgress,java.util.function.Predicate difficultySufficientPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.BreakDoorGoal(mob.wrapperContained,maxProgress,difficultySufficientPredicate); }
public BreakDoorGoal(yarnwrap.entity.mob.MobEntity mob,java.util.function.Predicate difficultySufficientPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.BreakDoorGoal(mob.wrapperContained,difficultySufficientPredicate); }
// public int getMaxProgress() { return wrapperContained.getMaxProgress(); }
// public static int getMaxProgress() { return net.minecraft.entity.ai.goal.BreakDoorGoal.getMaxProgress(); }
// public boolean isDifficultySufficient(yarnwrap.world.Difficulty difficulty) { return wrapperContained.isDifficultySufficient(difficulty.wrapperContained); }
// public static boolean isDifficultySufficient(yarnwrap.world.Difficulty difficulty, ) { return net.minecraft.entity.ai.goal.BreakDoorGoal.isDifficultySufficient(difficulty.wrapperContained); }

}