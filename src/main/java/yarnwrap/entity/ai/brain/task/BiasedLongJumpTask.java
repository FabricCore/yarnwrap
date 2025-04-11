package yarnwrap.entity.ai.brain.task;
public class BiasedLongJumpTask { public net.minecraft.entity.ai.brain.task.BiasedLongJumpTask wrapperContained; public BiasedLongJumpTask(net.minecraft.entity.ai.brain.task.BiasedLongJumpTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey favoredBlocks() { return new yarnwrap.registry.tag.TagKey(wrapperContained.favoredBlocks); }
// public void favoredBlocks(yarnwrap.registry.tag.TagKey value) { wrapperContained.favoredBlocks = value.wrapperContained; }
// public float biasChance() { return wrapperContained.biasChance; }
// public void biasChance(float value) { wrapperContained.biasChance = value; }
// public java.util.List unfavoredTargets() { return wrapperContained.unfavoredTargets; }
// public void unfavoredTargets(java.util.List value) { wrapperContained.unfavoredTargets = value; }
// public boolean useBias() { return wrapperContained.useBias; }
// public void useBias(boolean value) { wrapperContained.useBias = value; }
public BiasedLongJumpTask(yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange,int verticalRange,int horizontalRange,float maxRange,java.util.function.Function entityToSound,yarnwrap.registry.tag.TagKey favoredBlocks,float biasChance,java.util.function.BiPredicate jumpToPredicate) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.BiasedLongJumpTask(cooldownRange.wrapperContained,verticalRange,horizontalRange,maxRange,entityToSound,favoredBlocks.wrapperContained,biasChance,jumpToPredicate); }

}