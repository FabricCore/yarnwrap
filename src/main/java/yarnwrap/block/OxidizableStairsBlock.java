package yarnwrap.block;
public class OxidizableStairsBlock { public net.minecraft.block.OxidizableStairsBlock wrapperContained; public OxidizableStairsBlock(net.minecraft.block.OxidizableStairsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// // public static Object oxidationLevel() { return net.minecraft.block.OxidizableStairsBlock.oxidationLevel; }
// // public static void oxidationLevel(Object value, ) { net.minecraft.block.OxidizableStairsBlock.oxidationLevel = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.OxidizableStairsBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.OxidizableStairsBlock.CODEC = value; }

// public OxidizableStairsBlock(Object oxidationLevel,yarnwrap.block.BlockState baseBlockState,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableStairsBlock(oxidationLevel,baseBlockState.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54070(Object instance) { return wrapperContained.method_54070(instance); }
// public static com.mojang.datafixers.kinds.App method_54070(Object instance, ) { return net.minecraft.block.OxidizableStairsBlock.method_54070(instance); }

}