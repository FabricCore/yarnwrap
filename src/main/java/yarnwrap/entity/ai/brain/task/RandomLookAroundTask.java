package yarnwrap.entity.ai.brain.task;
public class RandomLookAroundTask { public net.minecraft.entity.ai.brain.task.RandomLookAroundTask wrapperContained; public RandomLookAroundTask(net.minecraft.entity.ai.brain.task.RandomLookAroundTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider cooldown() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.cooldown); }
// public void cooldown(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.cooldown = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider cooldown() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.entity.ai.brain.task.RandomLookAroundTask.cooldown); }
// public static void cooldown(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.entity.ai.brain.task.RandomLookAroundTask.cooldown = value.wrapperContained; }

// public float maxYaw() { return wrapperContained.maxYaw; }
// public void maxYaw(float value) { wrapperContained.maxYaw = value; }
// public static float maxYaw() { return net.minecraft.entity.ai.brain.task.RandomLookAroundTask.maxYaw; }
// public static void maxYaw(float value, ) { net.minecraft.entity.ai.brain.task.RandomLookAroundTask.maxYaw = value; }

// public float minPitch() { return wrapperContained.minPitch; }
// public void minPitch(float value) { wrapperContained.minPitch = value; }
// public static float minPitch() { return net.minecraft.entity.ai.brain.task.RandomLookAroundTask.minPitch; }
// public static void minPitch(float value, ) { net.minecraft.entity.ai.brain.task.RandomLookAroundTask.minPitch = value; }

// public float pitchRange() { return wrapperContained.pitchRange; }
// public void pitchRange(float value) { wrapperContained.pitchRange = value; }
// public static float pitchRange() { return net.minecraft.entity.ai.brain.task.RandomLookAroundTask.pitchRange; }
// public static void pitchRange(float value, ) { net.minecraft.entity.ai.brain.task.RandomLookAroundTask.pitchRange = value; }

public RandomLookAroundTask(yarnwrap.util.math.intprovider.IntProvider cooldown,float maxYaw,float minPitch,float maxPitch) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.RandomLookAroundTask(cooldown.wrapperContained,maxYaw,minPitch,maxPitch); }

}