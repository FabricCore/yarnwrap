package yarnwrap.data.client;
public class BlockStateVariantMap { public net.minecraft.data.client.BlockStateVariantMap wrapperContained; public BlockStateVariantMap(net.minecraft.data.client.BlockStateVariantMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map variants() { return wrapperContained.variants; }
// public java.util.Map getVariants() { return wrapperContained.getVariants(); }
public Object create(yarnwrap.state.property.Property property) { return wrapperContained.create(property.wrapperContained); }
public Object create(yarnwrap.state.property.Property first,yarnwrap.state.property.Property second) { return wrapperContained.create(first.wrapperContained,second.wrapperContained); }
public Object create(yarnwrap.state.property.Property first,yarnwrap.state.property.Property second,yarnwrap.state.property.Property third) { return wrapperContained.create(first.wrapperContained,second.wrapperContained,third.wrapperContained); }
public Object create(yarnwrap.state.property.Property first,yarnwrap.state.property.Property second,yarnwrap.state.property.Property third,yarnwrap.state.property.Property fourth) { return wrapperContained.create(first.wrapperContained,second.wrapperContained,third.wrapperContained,fourth.wrapperContained); }
public Object create(yarnwrap.state.property.Property first,yarnwrap.state.property.Property second,yarnwrap.state.property.Property third,yarnwrap.state.property.Property fourth,yarnwrap.state.property.Property fifth) { return wrapperContained.create(first.wrapperContained,second.wrapperContained,third.wrapperContained,fourth.wrapperContained,fifth.wrapperContained); }
// public void register(yarnwrap.data.client.PropertiesMap condition,java.util.List possibleVariants) { wrapperContained.register(condition.wrapperContained,possibleVariants); }
// public java.util.List getProperties() { return wrapperContained.getProperties(); }
// public void checkAllPropertyDefinitions() { wrapperContained.checkAllPropertyDefinitions(); }

}