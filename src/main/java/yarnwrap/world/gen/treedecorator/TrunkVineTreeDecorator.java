package yarnwrap.world.gen.treedecorator;
public class TrunkVineTreeDecorator { public net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained; public TrunkVineTreeDecorator(net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator INSTANCE() { return new yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.gen.treedecorator.TrunkVineTreeDecorator value) { wrapperContained.INSTANCE = value.wrapperContained; }

}