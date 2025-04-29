package yarnwrap.entity.ai.goal;
public class LookAroundGoal { public net.minecraft.entity.ai.goal.LookAroundGoal wrapperContained; public LookAroundGoal(net.minecraft.entity.ai.goal.LookAroundGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double deltaZ() { return wrapperContained.deltaZ; }
// public void deltaZ(double value) { wrapperContained.deltaZ = value; }
// public static double deltaZ() { return net.minecraft.entity.ai.goal.LookAroundGoal.deltaZ; }
// public static void deltaZ(double value, ) { net.minecraft.entity.ai.goal.LookAroundGoal.deltaZ = value; }

// public double deltaX() { return wrapperContained.deltaX; }
// public void deltaX(double value) { wrapperContained.deltaX = value; }
// public static double deltaX() { return net.minecraft.entity.ai.goal.LookAroundGoal.deltaX; }
// public static void deltaX(double value, ) { net.minecraft.entity.ai.goal.LookAroundGoal.deltaX = value; }

// public int lookTime() { return wrapperContained.lookTime; }
// public void lookTime(int value) { wrapperContained.lookTime = value; }
// public static int lookTime() { return net.minecraft.entity.ai.goal.LookAroundGoal.lookTime; }
// public static void lookTime(int value, ) { net.minecraft.entity.ai.goal.LookAroundGoal.lookTime = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.LookAroundGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.LookAroundGoal.mob = value.wrapperContained; }

public LookAroundGoal(yarnwrap.entity.mob.MobEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAroundGoal(mob.wrapperContained); }

}