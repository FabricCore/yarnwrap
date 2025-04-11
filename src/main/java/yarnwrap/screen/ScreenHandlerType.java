package yarnwrap.screen;
public class ScreenHandlerType { public net.minecraft.screen.ScreenHandlerType wrapperContained; public ScreenHandlerType(net.minecraft.screen.ScreenHandlerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object factory() { return wrapperContained.factory; }
// // public void factory(Object value) { wrapperContained.factory = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
public yarnwrap.screen.ScreenHandler create(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.ScreenHandler(wrapperContained.create(syncId,playerInventory.wrapperContained)); }
// public yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory) { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.register(id,factory)); }
// public yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory,net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.register(id,factory,requiredFeatures)); }

}