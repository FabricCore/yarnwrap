package yarnwrap.entity.passive;
public class FrogBrain { public net.minecraft.entity.passive.FrogBrain wrapperContained; public FrogBrain(net.minecraft.entity.passive.FrogBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FLEE_SPEED() { return wrapperContained.FLEE_SPEED; }
// public yarnwrap.util.math.intprovider.UniformIntProvider longJumpCooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.longJumpCooldownRange); }
// public float TEMPT_SPEED() { return wrapperContained.TEMPT_SPEED; }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public void coolDownLongJump(yarnwrap.entity.passive.FrogEntity frog,yarnwrap.util.math.random.Random random) { wrapperContained.coolDownLongJump(frog.wrapperContained,random.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
public void updateActivities(yarnwrap.entity.passive.FrogEntity frog) { wrapperContained.updateActivities(frog.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public boolean isNotBreeding(yarnwrap.entity.passive.FrogEntity frog) { return wrapperContained.isNotBreeding(frog.wrapperContained); }
// public void addSwimActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addSwimActivities(brain.wrapperContained); }
// public void addLaySpawnActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLaySpawnActivities(brain.wrapperContained); }
// public void addLongJumpActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLongJumpActivities(brain.wrapperContained); }
// public void addTongueActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addTongueActivities(brain.wrapperContained); }
// public boolean shouldJumpTo(yarnwrap.entity.mob.MobEntity frog,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldJumpTo(frog.wrapperContained,pos.wrapperContained); }

}