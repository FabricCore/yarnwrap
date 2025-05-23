package yarnwrap.world.gen.treedecorator;
public class AttachedToLogsTreeDecorator { public net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator wrapperContained; public AttachedToLogsTreeDecorator(net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.CODEC = value; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public static float probability() { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.probability; }
// public static void probability(float value, ) { net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.probability = value; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.blockProvider); }
// public void blockProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.blockProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.blockProvider); }
// public static void blockProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.blockProvider = value.wrapperContained; }

// public java.util.List directions() { return wrapperContained.directions; }
// public void directions(java.util.List value) { wrapperContained.directions = value; }
// public static java.util.List directions() { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.directions; }
// public static void directions(java.util.List value, ) { net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.directions = value; }

public AttachedToLogsTreeDecorator(float probability,yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider,java.util.List directions) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator(probability,blockProvider.wrapperContained,directions); }
// public com.mojang.datafixers.kinds.App method_68322(Object instance) { return wrapperContained.method_68322(instance); }
// public static com.mojang.datafixers.kinds.App method_68322(Object instance, ) { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.method_68322(instance); }
// public java.util.List method_68323(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator) { return wrapperContained.method_68323(treeDecorator.wrapperContained); }
// public static java.util.List method_68323(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.method_68323(treeDecorator.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_68324(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_68324(treeDecorator.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_68324(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.method_68324(treeDecorator.wrapperContained)); }
// public java.lang.Float method_68325(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator) { return wrapperContained.method_68325(treeDecorator.wrapperContained); }
// public static java.lang.Float method_68325(yarnwrap.world.gen.treedecorator.AttachedToLogsTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.AttachedToLogsTreeDecorator.method_68325(treeDecorator.wrapperContained); }

}