package yarnwrap.entity.ai.brain.task;
public class LookAroundTask { public net.minecraft.entity.ai.brain.task.LookAroundTask wrapperContained; public LookAroundTask(net.minecraft.entity.ai.brain.task.LookAroundTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider cooldown() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.cooldown); }
// public void cooldown(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.cooldown = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider cooldown() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.entity.ai.brain.task.LookAroundTask.cooldown); }
// public static void cooldown(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.entity.ai.brain.task.LookAroundTask.cooldown = value.wrapperContained; }

// public float maxYaw() { return wrapperContained.maxYaw; }
// public void maxYaw(float value) { wrapperContained.maxYaw = value; }
// public static float maxYaw() { return net.minecraft.entity.ai.brain.task.LookAroundTask.maxYaw; }
// public static void maxYaw(float value, ) { net.minecraft.entity.ai.brain.task.LookAroundTask.maxYaw = value; }

// public float minPitch() { return wrapperContained.minPitch; }
// public void minPitch(float value) { wrapperContained.minPitch = value; }
// public static float minPitch() { return net.minecraft.entity.ai.brain.task.LookAroundTask.minPitch; }
// public static void minPitch(float value, ) { net.minecraft.entity.ai.brain.task.LookAroundTask.minPitch = value; }

// public float pitchRange() { return wrapperContained.pitchRange; }
// public void pitchRange(float value) { wrapperContained.pitchRange = value; }
// public static float pitchRange() { return net.minecraft.entity.ai.brain.task.LookAroundTask.pitchRange; }
// public static void pitchRange(float value, ) { net.minecraft.entity.ai.brain.task.LookAroundTask.pitchRange = value; }

public LookAroundTask(yarnwrap.util.math.intprovider.IntProvider cooldown,float maxYaw,float minPitch,float maxPitch) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.LookAroundTask(cooldown.wrapperContained,maxYaw,minPitch,maxPitch); }

}