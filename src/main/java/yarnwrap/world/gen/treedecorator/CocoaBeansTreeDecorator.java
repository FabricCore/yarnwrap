package yarnwrap.world.gen.treedecorator;
public class CocoaBeansTreeDecorator { public net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained; public CocoaBeansTreeDecorator(net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}