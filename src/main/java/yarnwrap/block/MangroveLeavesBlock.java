package yarnwrap.block;
public class MangroveLeavesBlock { public net.minecraft.block.MangroveLeavesBlock wrapperContained; public MangroveLeavesBlock(net.minecraft.block.MangroveLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MangroveLeavesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MangroveLeavesBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67235(Object instance) { return wrapperContained.method_67235(instance); }
// public static com.mojang.datafixers.kinds.App method_67235(Object instance, ) { return net.minecraft.block.MangroveLeavesBlock.method_67235(instance); }
// public java.lang.Float method_67236(yarnwrap.block.MangroveLeavesBlock block) { return wrapperContained.method_67236(block.wrapperContained); }
// public static java.lang.Float method_67236(yarnwrap.block.MangroveLeavesBlock block, ) { return net.minecraft.block.MangroveLeavesBlock.method_67236(block.wrapperContained); }

}