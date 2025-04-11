package yarnwrap.entity.passive;
public class FrogBrain { public net.minecraft.entity.passive.FrogBrain wrapperContained; public FrogBrain(net.minecraft.entity.passive.FrogBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FLEE_SPEED() { return wrapperContained.FLEE_SPEED; }
// public void FLEE_SPEED(float value) { wrapperContained.FLEE_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider longJumpCooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.longJumpCooldownRange); }
// public void longJumpCooldownRange(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.longJumpCooldownRange = value.wrapperContained; }
// public float TEMPT_SPEED() { return wrapperContained.TEMPT_SPEED; }
// public void TEMPT_SPEED(float value) { wrapperContained.TEMPT_SPEED = value; }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public java.lang.Float method_41367(yarnwrap.entity.LivingEntity frog) { return wrapperContained.method_41367(frog.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public void coolDownLongJump(yarnwrap.entity.passive.FrogEntity frog,yarnwrap.util.math.random.Random random) { wrapperContained.coolDownLongJump(frog.wrapperContained,random.wrapperContained); }
// public java.lang.Float method_41371(yarnwrap.entity.LivingEntity frog) { return wrapperContained.method_41371(frog.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
public void updateActivities(yarnwrap.entity.passive.FrogEntity frog) { wrapperContained.updateActivities(frog.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public boolean isNotBreeding(yarnwrap.entity.passive.FrogEntity frog) { return wrapperContained.isNotBreeding(frog.wrapperContained); }
// public void addSwimActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addSwimActivities(brain.wrapperContained); }
// public yarnwrap.sound.SoundEvent method_41377(yarnwrap.entity.passive.FrogEntity frog) { return new yarnwrap.sound.SoundEvent(wrapperContained.method_41377(frog.wrapperContained)); }
// public void addLaySpawnActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLaySpawnActivities(brain.wrapperContained); }
// public java.util.Optional method_41379(yarnwrap.entity.passive.FrogEntity frog) { return wrapperContained.method_41379(frog.wrapperContained); }
// public void addLongJumpActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLongJumpActivities(brain.wrapperContained); }
// public java.util.Optional method_41381(yarnwrap.entity.passive.FrogEntity frog) { return wrapperContained.method_41381(frog.wrapperContained); }
// public void addTongueActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addTongueActivities(brain.wrapperContained); }
// public java.util.Optional method_41383(yarnwrap.entity.passive.FrogEntity frog) { return wrapperContained.method_41383(frog.wrapperContained); }
// public boolean shouldJumpTo(yarnwrap.entity.mob.MobEntity frog,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldJumpTo(frog.wrapperContained,pos.wrapperContained); }
// public boolean method_58390(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58390(stack.wrapperContained); }

}