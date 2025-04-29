package yarnwrap.screen;
public class ScreenHandlerType { public net.minecraft.screen.ScreenHandlerType wrapperContained; public ScreenHandlerType(net.minecraft.screen.ScreenHandlerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object factory() { return wrapperContained.factory; }
// // public void factory(Object value) { wrapperContained.factory = value; }
// // public static Object factory() { return net.minecraft.screen.ScreenHandlerType.factory; }
// // public static void factory(Object value, ) { net.minecraft.screen.ScreenHandlerType.factory = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.screen.ScreenHandlerType.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.screen.ScreenHandlerType.requiredFeatures = value.wrapperContained; }

// public ScreenHandlerType(Object factory,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures) { this.wrapperContained = new net.minecraft.screen.ScreenHandlerType(factory,requiredFeatures.wrapperContained); }
public yarnwrap.screen.ScreenHandler create(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.ScreenHandler(wrapperContained.create(syncId,playerInventory.wrapperContained)); }
// public static yarnwrap.screen.ScreenHandler create(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.screen.ScreenHandlerType.create(syncId,playerInventory.wrapperContained)); }
// public yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory) { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.register(id,factory)); }
// public static yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory, ) { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.screen.ScreenHandlerType.register(id,factory)); }
// public yarnwrap.screen.LecternScreenHandler method_17436(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.LecternScreenHandler(wrapperContained.method_17436(syncId,playerInventory.wrapperContained)); }
// public static yarnwrap.screen.LecternScreenHandler method_17436(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory, ) { return new yarnwrap.screen.LecternScreenHandler(net.minecraft.screen.ScreenHandlerType.method_17436(syncId,playerInventory.wrapperContained)); }
// public yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory,net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.register(id,factory,requiredFeatures)); }
// public static yarnwrap.screen.ScreenHandlerType register(java.lang.String id,Object factory,net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures, ) { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.screen.ScreenHandlerType.register(id,factory,requiredFeatures)); }

}