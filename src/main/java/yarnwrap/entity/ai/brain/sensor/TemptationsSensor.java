package yarnwrap.entity.ai.brain.sensor;
public class TemptationsSensor { public net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained; public TemptationsSensor(net.minecraft.entity.ai.brain.sensor.TemptationsSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate TEMPTER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TEMPTER_PREDICATE); }
// public void TEMPTER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.TEMPTER_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate TEMPTER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.brain.sensor.TemptationsSensor.TEMPTER_PREDICATE); }
// public static void TEMPTER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.brain.sensor.TemptationsSensor.TEMPTER_PREDICATE = value.wrapperContained; }

// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public static java.util.function.Predicate predicate() { return net.minecraft.entity.ai.brain.sensor.TemptationsSensor.predicate; }
// public static void predicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.brain.sensor.TemptationsSensor.predicate = value; }

public TemptationsSensor(java.util.function.Predicate predicate) { this.wrapperContained = new net.minecraft.entity.ai.brain.sensor.TemptationsSensor(predicate); }
// public boolean test(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.test(player.wrapperContained); }
// public static boolean test(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.ai.brain.sensor.TemptationsSensor.test(player.wrapperContained); }
// public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }
// public static boolean test(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.ai.brain.sensor.TemptationsSensor.test(stack.wrapperContained); }
// public boolean method_33217(yarnwrap.entity.ai.TargetPredicate player) { return wrapperContained.method_33217(player.wrapperContained); }
// public static boolean method_33217(yarnwrap.entity.ai.TargetPredicate player, ) { return net.minecraft.entity.ai.brain.sensor.TemptationsSensor.method_33217(player.wrapperContained); }
// public boolean method_45339(yarnwrap.entity.mob.PathAwareEntity playerx) { return wrapperContained.method_45339(playerx.wrapperContained); }
// public static boolean method_45339(yarnwrap.entity.mob.PathAwareEntity playerx, ) { return net.minecraft.entity.ai.brain.sensor.TemptationsSensor.method_45339(playerx.wrapperContained); }

}