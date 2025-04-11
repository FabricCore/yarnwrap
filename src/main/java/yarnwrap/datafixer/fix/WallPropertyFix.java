package yarnwrap.datafixer.fix;
public class WallPropertyFix { public net.minecraft.datafixer.fix.WallPropertyFix wrapperContained; public WallPropertyFix(net.minecraft.datafixer.fix.WallPropertyFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set TARGET_BLOCK_IDS() { return wrapperContained.TARGET_BLOCK_IDS; }
// public void TARGET_BLOCK_IDS(java.util.Set value) { wrapperContained.TARGET_BLOCK_IDS = value; }
public WallPropertyFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.WallPropertyFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic updateWallProperties(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.updateWallProperties(blockStateDynamic); }
// public com.mojang.serialization.Dynamic updateWallValueReference(com.mojang.serialization.Dynamic propertiesDynamic,java.lang.String propertyName) { return wrapperContained.updateWallValueReference(propertiesDynamic,propertyName); }
// public com.mojang.datafixers.Typed method_24325(com.mojang.datafixers.Typed blockStateTyped) { return wrapperContained.method_24325(blockStateTyped); }
// public java.lang.String booleanToWallType(java.lang.String value) { return wrapperContained.booleanToWallType(value); }
// public com.mojang.serialization.Dynamic method_24327(com.mojang.serialization.Dynamic propertiesDynamic) { return wrapperContained.method_24327(propertiesDynamic); }
// public com.mojang.serialization.Dynamic method_24328(com.mojang.serialization.Dynamic propertyValue) { return wrapperContained.method_24328(propertyValue); }

}