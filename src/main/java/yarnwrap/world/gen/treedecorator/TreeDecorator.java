package yarnwrap.world.gen.treedecorator;
public class TreeDecorator { public net.minecraft.world.gen.treedecorator.TreeDecorator wrapperContained; public TreeDecorator(net.minecraft.world.gen.treedecorator.TreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public void generate(Object generator) { wrapperContained.generate(generator); }
// public yarnwrap.world.gen.treedecorator.TreeDecoratorType getType() { return new yarnwrap.world.gen.treedecorator.TreeDecoratorType(wrapperContained.getType()); }

}