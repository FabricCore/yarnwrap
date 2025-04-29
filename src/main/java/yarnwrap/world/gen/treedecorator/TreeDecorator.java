package yarnwrap.world.gen.treedecorator;
public class TreeDecorator { public net.minecraft.world.gen.treedecorator.TreeDecorator wrapperContained; public TreeDecorator(net.minecraft.world.gen.treedecorator.TreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.world.gen.treedecorator.TreeDecorator.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.treedecorator.TreeDecorator.TYPE_CODEC = value; }

// public void generate(Object generator) { wrapperContained.generate(generator); }
// public static void generate(Object generator, ) { net.minecraft.world.gen.treedecorator.TreeDecorator.generate(generator); }
// public yarnwrap.world.gen.treedecorator.TreeDecoratorType getType() { return new yarnwrap.world.gen.treedecorator.TreeDecoratorType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.treedecorator.TreeDecoratorType getType() { return new yarnwrap.world.gen.treedecorator.TreeDecoratorType(net.minecraft.world.gen.treedecorator.TreeDecorator.getType()); }

}