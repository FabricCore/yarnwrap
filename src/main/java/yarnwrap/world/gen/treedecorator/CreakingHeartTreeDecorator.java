package yarnwrap.world.gen.treedecorator;
public class CreakingHeartTreeDecorator { public net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator wrapperContained; public CreakingHeartTreeDecorator(net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.CODEC = value; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public static float probability() { return net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.probability; }
// public static void probability(float value, ) { net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.probability = value; }

public CreakingHeartTreeDecorator(float probability) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator(probability); }
// public boolean method_64807(yarnwrap.block.BlockState state) { return wrapperContained.method_64807(state.wrapperContained); }
// public static boolean method_64807(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.method_64807(state.wrapperContained); }
// public java.lang.Float method_64808(yarnwrap.world.gen.treedecorator.CreakingHeartTreeDecorator treeDecorator) { return wrapperContained.method_64808(treeDecorator.wrapperContained); }
// public static java.lang.Float method_64808(yarnwrap.world.gen.treedecorator.CreakingHeartTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.method_64808(treeDecorator.wrapperContained); }
// public boolean method_64809(Object pos) { return wrapperContained.method_64809(pos); }
// public static boolean method_64809(Object pos, ) { return net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator.method_64809(pos); }

}