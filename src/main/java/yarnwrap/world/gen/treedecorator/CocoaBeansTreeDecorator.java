package yarnwrap.world.gen.treedecorator;
public class CocoaBeansTreeDecorator { public net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained; public CocoaBeansTreeDecorator(net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public CocoaBeansTreeDecorator(float probability) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator(probability); }
// public boolean method_23465(int pos) { return wrapperContained.method_23465(pos); }
// public void method_23466(yarnwrap.util.math.random.Random pos) { wrapperContained.method_23466(pos.wrapperContained); }
// public java.lang.Float method_28891(yarnwrap.world.gen.treedecorator.CocoaBeansTreeDecorator decorator) { return wrapperContained.method_28891(decorator.wrapperContained); }

}