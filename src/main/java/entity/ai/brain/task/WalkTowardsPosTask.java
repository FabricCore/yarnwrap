package yarnwrap.entity.ai.brain.task;
public class WalkTowardsPosTask { public net.minecraft.entity.ai.brain.task.WalkTowardsPosTask wrapperContained; public WalkTowardsPosTask(net.minecraft.entity.ai.brain.task.WalkTowardsPosTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos fuzz(yarnwrap.entity.mob.MobEntity mob,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.fuzz(mob.wrapperContained,pos.wrapperContained)); }
// public int fuzz(yarnwrap.util.math.random.Random random) { return wrapperContained.fuzz(random.wrapperContained); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,int completionRange,float speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(posModule.wrapperContained,completionRange,speed)); }

}