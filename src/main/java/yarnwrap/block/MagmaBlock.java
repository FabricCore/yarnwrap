package yarnwrap.block;
public class MagmaBlock { public net.minecraft.block.MagmaBlock wrapperContained; public MagmaBlock(net.minecraft.block.MagmaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}