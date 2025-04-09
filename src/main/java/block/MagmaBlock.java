package yarnwrap.block;
public class MagmaBlock { public net.minecraft.block.MagmaBlock wrapperContained; public MagmaBlock(net.minecraft.block.MagmaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}