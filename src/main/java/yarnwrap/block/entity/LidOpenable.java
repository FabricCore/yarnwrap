package yarnwrap.block.entity;
public class LidOpenable { public net.minecraft.block.entity.LidOpenable wrapperContained; public LidOpenable(net.minecraft.block.entity.LidOpenable wrapperContained) { this.wrapperContained = wrapperContained; }

public float getAnimationProgress(float tickDelta) { return wrapperContained.getAnimationProgress(tickDelta); }
// public static float getAnimationProgress(float tickDelta, ) { return net.minecraft.block.entity.LidOpenable.getAnimationProgress(tickDelta); }

}