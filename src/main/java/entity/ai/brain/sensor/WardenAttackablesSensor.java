package yarnwrap.entity.ai.brain.sensor;
public class WardenAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.WardenAttackablesSensor wrapperContained; public WardenAttackablesSensor(net.minecraft.entity.ai.brain.sensor.WardenAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional findNearestTarget(yarnwrap.entity.mob.WardenEntity warden,java.util.function.Predicate targetPredicate) { return wrapperContained.findNearestTarget(warden.wrapperContained,targetPredicate); }

}