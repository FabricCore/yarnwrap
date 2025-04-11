package yarnwrap.entity.ai.brain.sensor;
public class TemptationsSensor { public net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained; public TemptationsSensor(net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate TEMPTER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TEMPTER_PREDICATE); }
// public void TEMPTER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.TEMPTER_PREDICATE = value.wrapperContained; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public TemptationsSensor(java.util.function.Predicate predicate) { this.wrapperContained = new net.minecraft.entity.ai.brain.sensor.TemptationsSensor(predicate); }
// public boolean method_33214(yarnwrap.entity.mob.PathAwareEntity player) { return wrapperContained.method_33214(player.wrapperContained); }
// public boolean test(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.test(player.wrapperContained); }
// public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }
// public boolean method_33217(yarnwrap.entity.mob.PathAwareEntity player) { return wrapperContained.method_33217(player.wrapperContained); }

}