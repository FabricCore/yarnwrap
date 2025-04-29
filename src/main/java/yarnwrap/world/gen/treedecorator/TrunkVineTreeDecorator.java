package yarnwrap.world.gen.treedecorator;
public class TrunkVineTreeDecorator { public net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained; public TrunkVineTreeDecorator(net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator.CODEC = value; }

// public yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator INSTANCE() { return new yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator INSTANCE() { return new yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator(net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator value, ) { net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator.INSTANCE = value.wrapperContained; }

// public void method_23474(yarnwrap.util.math.random.Random pos) { wrapperContained.method_23474(pos.wrapperContained); }
// public static void method_23474(yarnwrap.util.math.random.Random pos, ) { net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator.method_23474(pos.wrapperContained); }

}