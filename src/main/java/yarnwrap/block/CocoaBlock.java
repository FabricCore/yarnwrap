package yarnwrap.block;
public class CocoaBlock { public net.minecraft.block.CocoaBlock wrapperContained; public CocoaBlock(net.minecraft.block.CocoaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CocoaBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CocoaBlock.AGE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.CocoaBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.CocoaBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CocoaBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CocoaBlock.CODEC = value; }

// public java.util.List SHAPES() { return wrapperContained.SHAPES; }
// public void SHAPES(java.util.List value) { wrapperContained.SHAPES = value; }
// public static java.util.List SHAPES() { return net.minecraft.block.CocoaBlock.SHAPES; }
// public static void SHAPES(java.util.List value, ) { net.minecraft.block.CocoaBlock.SHAPES = value; }

// public java.util.Map method_66424(int age) { return wrapperContained.method_66424(age); }
// public static java.util.Map method_66424(int age, ) { return net.minecraft.block.CocoaBlock.method_66424(age); }

}