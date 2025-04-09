package yarnwrap.block;
public class SlimeBlock { public net.minecraft.block.SlimeBlock wrapperContained; public SlimeBlock(net.minecraft.block.SlimeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void bounce(yarnwrap.entity.Entity entity) { wrapperContained.bounce(entity.wrapperContained); }

}