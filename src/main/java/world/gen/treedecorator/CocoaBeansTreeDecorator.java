package yarnwrap.world.gen.treedecorator;
public class CocoaBeansTreeDecorator { public net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained; public CocoaBeansTreeDecorator(net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}