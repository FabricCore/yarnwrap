package yarnwrap.entity.ai.goal;
public class BreakDoorGoal { public net.minecraft.entity.ai.goal.BreakDoorGoal wrapperContained; public BreakDoorGoal(net.minecraft.entity.ai.goal.BreakDoorGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxProgress() { return wrapperContained.maxProgress; }
// public void maxProgress(int value) { wrapperContained.maxProgress = value; }
// public java.util.function.Predicate difficultySufficientPredicate() { return wrapperContained.difficultySufficientPredicate; }
// public void difficultySufficientPredicate(java.util.function.Predicate value) { wrapperContained.difficultySufficientPredicate = value; }
// public int MIN_MAX_PROGRESS() { return wrapperContained.MIN_MAX_PROGRESS; }
// public void MIN_MAX_PROGRESS(int value) { wrapperContained.MIN_MAX_PROGRESS = value; }
// public int prevBreakProgress() { return wrapperContained.prevBreakProgress; }
// public void prevBreakProgress(int value) { wrapperContained.prevBreakProgress = value; }
// public int breakProgress() { return wrapperContained.breakProgress; }
// public void breakProgress(int value) { wrapperContained.breakProgress = value; }
public BreakDoorGoal(yarnwrap.entity.mob.MobEntity mob,int maxProgress,java.util.function.Predicate difficultySufficientPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.BreakDoorGoal(mob.wrapperContained,maxProgress,difficultySufficientPredicate); }
public BreakDoorGoal(yarnwrap.entity.mob.MobEntity mob,java.util.function.Predicate difficultySufficientPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.BreakDoorGoal(mob.wrapperContained,difficultySufficientPredicate); }
// public int getMaxProgress() { return wrapperContained.getMaxProgress(); }
// public boolean isDifficultySufficient(yarnwrap.world.Difficulty difficulty) { return wrapperContained.isDifficultySufficient(difficulty.wrapperContained); }

}