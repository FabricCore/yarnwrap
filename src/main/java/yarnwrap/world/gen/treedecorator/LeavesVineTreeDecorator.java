package yarnwrap.world.gen.treedecorator;
public class LeavesVineTreeDecorator { public net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator wrapperContained; public LeavesVineTreeDecorator(net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.CODEC = value; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public static float probability() { return net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.probability; }
// public static void probability(float value, ) { net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.probability = value; }

public LeavesVineTreeDecorator(float probability) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator(probability); }
// public void placeVines(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.BooleanProperty faceProperty,Object generator) { wrapperContained.placeVines(pos.wrapperContained,faceProperty.wrapperContained,generator); }
// public static void placeVines(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.BooleanProperty faceProperty,Object generator, ) { net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.placeVines(pos.wrapperContained,faceProperty.wrapperContained,generator); }
// public void method_23468(yarnwrap.util.math.random.Random pos) { wrapperContained.method_23468(pos.wrapperContained); }
// public static void method_23468(yarnwrap.util.math.random.Random pos, ) { net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.method_23468(pos.wrapperContained); }
// public java.lang.Float method_43195(yarnwrap.world.gen.treedecorator.LeavesVineTreeDecorator treeDecorator) { return wrapperContained.method_43195(treeDecorator.wrapperContained); }
// public static java.lang.Float method_43195(yarnwrap.world.gen.treedecorator.LeavesVineTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator.method_43195(treeDecorator.wrapperContained); }

}