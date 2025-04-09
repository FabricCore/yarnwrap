package yarnwrap.world.gen.treedecorator;
public class TrunkVineTreeDecorator { public net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained; public TrunkVineTreeDecorator(net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator INSTANCE() { return new yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator(wrapperContained.INSTANCE); }

}