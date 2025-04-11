package yarnwrap.entity.ai.brain.task;
public class LeapingChargeTask { public net.minecraft.entity.ai.brain.task.LeapingChargeTask wrapperContained; public LeapingChargeTask(net.minecraft.entity.ai.brain.task.LeapingChargeTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.cooldownRange); }
// public void cooldownRange(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.cooldownRange = value.wrapperContained; }
// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }

}