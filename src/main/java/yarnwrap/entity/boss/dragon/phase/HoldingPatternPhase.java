package yarnwrap.entity.boss.dragon.phase;
public class HoldingPatternPhase { public net.minecraft.entity.boss.dragon.phase.HoldingPatternPhase wrapperContained; public HoldingPatternPhase(net.minecraft.entity.boss.dragon.phase.HoldingPatternPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate PLAYERS_IN_RANGE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.PLAYERS_IN_RANGE_PREDICATE); }
// public void PLAYERS_IN_RANGE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.PLAYERS_IN_RANGE_PREDICATE = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public void path(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.path = value.wrapperContained; }
// public boolean shouldFindNewPath() { return wrapperContained.shouldFindNewPath; }
// public void shouldFindNewPath(boolean value) { wrapperContained.shouldFindNewPath = value; }
// public yarnwrap.util.math.Vec3d pathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathTarget); }
// public void pathTarget(yarnwrap.util.math.Vec3d value) { wrapperContained.pathTarget = value.wrapperContained; }
// public void tickInRange() { wrapperContained.tickInRange(); }
// public void followPath() { wrapperContained.followPath(); }
// public void strafePlayer(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.strafePlayer(player.wrapperContained); }

}