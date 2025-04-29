package yarnwrap.block;
public class OxidizableTrapdoorBlock { public net.minecraft.block.OxidizableTrapdoorBlock wrapperContained; public OxidizableTrapdoorBlock(net.minecraft.block.OxidizableTrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.OxidizableTrapdoorBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.OxidizableTrapdoorBlock.CODEC = value; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
// // public static Object oxidationLevel() { return net.minecraft.block.OxidizableTrapdoorBlock.oxidationLevel; }
// // public static void oxidationLevel(Object value, ) { net.minecraft.block.OxidizableTrapdoorBlock.oxidationLevel = value; }

// public OxidizableTrapdoorBlock(yarnwrap.block.BlockSetType type,Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableTrapdoorBlock(type.wrapperContained,oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54773(Object instance) { return wrapperContained.method_54773(instance); }
// public static com.mojang.datafixers.kinds.App method_54773(Object instance, ) { return net.minecraft.block.OxidizableTrapdoorBlock.method_54773(instance); }

}