package yarnwrap.entity.ai.goal;
public class GoToBedAndSleepGoal { public net.minecraft.entity.ai.goal.GoToBedAndSleepGoal wrapperContained; public GoToBedAndSleepGoal(net.minecraft.entity.ai.goal.GoToBedAndSleepGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.CatEntity cat() { return new yarnwrap.entity.passive.CatEntity(wrapperContained.cat); }
// public void cat(yarnwrap.entity.passive.CatEntity value) { wrapperContained.cat = value.wrapperContained; }
// public static yarnwrap.entity.passive.CatEntity cat() { return new yarnwrap.entity.passive.CatEntity(net.minecraft.entity.ai.goal.GoToBedAndSleepGoal.cat); }
// public static void cat(yarnwrap.entity.passive.CatEntity value, ) { net.minecraft.entity.ai.goal.GoToBedAndSleepGoal.cat = value.wrapperContained; }

public GoToBedAndSleepGoal(yarnwrap.entity.passive.CatEntity cat,double speed,int range) { this.wrapperContained = new net.minecraft.entity.ai.goal.GoToBedAndSleepGoal(cat.wrapperContained,speed,range); }

}