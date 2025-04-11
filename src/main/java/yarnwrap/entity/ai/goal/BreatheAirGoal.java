package yarnwrap.entity.ai.goal;
public class BreatheAirGoal { public net.minecraft.entity.ai.goal.BreatheAirGoal wrapperContained; public BreatheAirGoal(net.minecraft.entity.ai.goal.BreatheAirGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
public BreatheAirGoal(yarnwrap.entity.mob.PathAwareEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.BreatheAirGoal(mob.wrapperContained); }
// public void moveToAir() { wrapperContained.moveToAir(); }
// public boolean isAirPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAirPos(world.wrapperContained,pos.wrapperContained); }

}