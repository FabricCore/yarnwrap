package yarnwrap.block;
public class SlimeBlock { public net.minecraft.block.SlimeBlock wrapperContained; public SlimeBlock(net.minecraft.block.SlimeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SlimeBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SlimeBlock.CODEC = value; }

// public void bounce(yarnwrap.entity.Entity entity) { wrapperContained.bounce(entity.wrapperContained); }
// public static void bounce(yarnwrap.entity.Entity entity, ) { net.minecraft.block.SlimeBlock.bounce(entity.wrapperContained); }

}