package yarnwrap.entity.ai.brain.task;
public class BiasedLongJumpTask { public net.minecraft.entity.ai.brain.task.BiasedLongJumpTask wrapperContained; public BiasedLongJumpTask(net.minecraft.entity.ai.brain.task.BiasedLongJumpTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey favoredBlocks() { return new yarnwrap.registry.tag.TagKey(wrapperContained.favoredBlocks); }
// public void favoredBlocks(yarnwrap.registry.tag.TagKey value) { wrapperContained.favoredBlocks = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey favoredBlocks() { return new yarnwrap.registry.tag.TagKey(net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.favoredBlocks); }
// public static void favoredBlocks(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.favoredBlocks = value.wrapperContained; }

// public float biasChance() { return wrapperContained.biasChance; }
// public void biasChance(float value) { wrapperContained.biasChance = value; }
// public static float biasChance() { return net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.biasChance; }
// public static void biasChance(float value, ) { net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.biasChance = value; }

// public java.util.List unfavoredTargets() { return wrapperContained.unfavoredTargets; }
// public void unfavoredTargets(java.util.List value) { wrapperContained.unfavoredTargets = value; }
// public static java.util.List unfavoredTargets() { return net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.unfavoredTargets; }
// public static void unfavoredTargets(java.util.List value, ) { net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.unfavoredTargets = value; }

// public boolean useBias() { return wrapperContained.useBias; }
// public void useBias(boolean value) { wrapperContained.useBias = value; }
// public static boolean useBias() { return net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.useBias; }
// public static void useBias(boolean value, ) { net.minecraft.entity.ai.brain.task.BiasedLongJumpTask.useBias = value; }

public BiasedLongJumpTask(yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange,int verticalRange,int horizontalRange,float maxRange,java.util.function.Function entityToSound,yarnwrap.registry.tag.TagKey favoredBlocks,float biasChance,java.util.function.BiPredicate jumpToPredicate) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.BiasedLongJumpTask(cooldownRange.wrapperContained,verticalRange,horizontalRange,maxRange,entityToSound,favoredBlocks.wrapperContained,biasChance,jumpToPredicate); }

}