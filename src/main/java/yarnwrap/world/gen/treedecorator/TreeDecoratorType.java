package yarnwrap.world.gen.treedecorator;
public class TreeDecoratorType { public net.minecraft.world.gen.treedecorator.TreeDecoratorType wrapperContained; public TreeDecoratorType(net.minecraft.world.gen.treedecorator.TreeDecoratorType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public TreeDecoratorType(com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.TreeDecoratorType(codec); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public yarnwrap.world.gen.treedecorator.TreeDecoratorType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.treedecorator.TreeDecoratorType(wrapperContained.register(id,codec)); }

}