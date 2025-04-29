package yarnwrap.entity.ai.brain.task;
public class LookAroundTask { public net.minecraft.entity.ai.brain.task.LookAroundTask wrapperContained; public LookAroundTask(net.minecraft.entity.ai.brain.task.LookAroundTask wrapperContained) { this.wrapperContained = wrapperContained; }

public LookAroundTask(int minRunTime,int maxRunTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.LookAroundTask(minRunTime,maxRunTime); }
// public void method_18966(yarnwrap.entity.mob.MobEntity lookTarget) { wrapperContained.method_18966(lookTarget.wrapperContained); }
// public static void method_18966(yarnwrap.entity.mob.MobEntity lookTarget, ) { net.minecraft.entity.ai.brain.task.LookAroundTask.method_18966(lookTarget.wrapperContained); }
// public boolean method_19569(yarnwrap.entity.mob.MobEntity lookTarget) { return wrapperContained.method_19569(lookTarget.wrapperContained); }
// public static boolean method_19569(yarnwrap.entity.mob.MobEntity lookTarget, ) { return net.minecraft.entity.ai.brain.task.LookAroundTask.method_19569(lookTarget.wrapperContained); }

}