package yarnwrap.entity.ai.goal;
public class GoToVillageGoal { public net.minecraft.entity.ai.goal.GoToVillageGoal wrapperContained; public GoToVillageGoal(net.minecraft.entity.ai.goal.GoToVillageGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.GoToVillageGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.GoToVillageGoal.mob = value.wrapperContained; }

// public int searchRange() { return wrapperContained.searchRange; }
// public void searchRange(int value) { wrapperContained.searchRange = value; }
// public static int searchRange() { return net.minecraft.entity.ai.goal.GoToVillageGoal.searchRange; }
// public static void searchRange(int value, ) { net.minecraft.entity.ai.goal.GoToVillageGoal.searchRange = value; }

// public yarnwrap.util.math.BlockPos targetPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.targetPosition); }
// public void targetPosition(yarnwrap.util.math.BlockPos value) { wrapperContained.targetPosition = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos targetPosition() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.goal.GoToVillageGoal.targetPosition); }
// public static void targetPosition(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.goal.GoToVillageGoal.targetPosition = value.wrapperContained; }

public GoToVillageGoal(yarnwrap.entity.mob.PathAwareEntity mob,int searchRange) { this.wrapperContained = new net.minecraft.entity.ai.goal.GoToVillageGoal(mob.wrapperContained,searchRange); }
// public void findOtherWaypoint() { wrapperContained.findOtherWaypoint(); }
// public static void findOtherWaypoint() { net.minecraft.entity.ai.goal.GoToVillageGoal.findOtherWaypoint(); }

}