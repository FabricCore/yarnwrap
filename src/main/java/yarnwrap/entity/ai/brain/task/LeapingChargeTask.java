package yarnwrap.entity.ai.brain.task;
public class LeapingChargeTask { public net.minecraft.entity.ai.brain.task.LeapingChargeTask wrapperContained; public LeapingChargeTask(net.minecraft.entity.ai.brain.task.LeapingChargeTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
public static int RUN_TIME() { return net.minecraft.entity.ai.brain.task.LeapingChargeTask.RUN_TIME; }
// public static void RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.LeapingChargeTask.RUN_TIME = value; }

// public yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.cooldownRange); }
// public void cooldownRange(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.cooldownRange = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.ai.brain.task.LeapingChargeTask.cooldownRange); }
// public static void cooldownRange(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.ai.brain.task.LeapingChargeTask.cooldownRange = value.wrapperContained; }

// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.ai.brain.task.LeapingChargeTask.sound); }
// public static void sound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.ai.brain.task.LeapingChargeTask.sound = value.wrapperContained; }

public LeapingChargeTask(yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange,yarnwrap.sound.SoundEvent sound) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.LeapingChargeTask(cooldownRange.wrapperContained,sound.wrapperContained); }

}