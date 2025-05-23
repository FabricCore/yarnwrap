package yarnwrap.block.entity;
public class LidOpenable { public net.minecraft.block.entity.LidOpenable wrapperContained; public LidOpenable(net.minecraft.block.entity.LidOpenable wrapperContained) { this.wrapperContained = wrapperContained; }

public float getAnimationProgress(float tickProgress) { return wrapperContained.getAnimationProgress(tickProgress); }
// public static float getAnimationProgress(float tickProgress, ) { return net.minecraft.block.entity.LidOpenable.getAnimationProgress(tickProgress); }

}