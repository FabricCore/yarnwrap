package yarnwrap.entity.ai.brain.sensor;
public class TemptationsSensor { public net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained; public TemptationsSensor(net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate TEMPTER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TEMPTER_PREDICATE); }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public boolean test(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.test(player.wrapperContained); }
// public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }

}