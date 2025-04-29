package yarnwrap.datafixer.fix;
public class JigsawRotationFix { public net.minecraft.datafixer.fix.JigsawRotationFix wrapperContained; public JigsawRotationFix(net.minecraft.datafixer.fix.JigsawRotationFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ORIENTATION_UPDATES() { return wrapperContained.ORIENTATION_UPDATES; }
// public void ORIENTATION_UPDATES(java.util.Map value) { wrapperContained.ORIENTATION_UPDATES = value; }
// public static java.util.Map ORIENTATION_UPDATES() { return net.minecraft.datafixer.fix.JigsawRotationFix.ORIENTATION_UPDATES; }
// public static void ORIENTATION_UPDATES(java.util.Map value, ) { net.minecraft.datafixer.fix.JigsawRotationFix.ORIENTATION_UPDATES = value; }

public JigsawRotationFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesTyped) { this.wrapperContained = new net.minecraft.datafixer.fix.JigsawRotationFix(outputSchema,changesTyped); }
// public com.mojang.serialization.Dynamic updateBlockState(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.updateBlockState(blockStateDynamic); }
// public static com.mojang.serialization.Dynamic updateBlockState(com.mojang.serialization.Dynamic blockStateDynamic, ) { return net.minecraft.datafixer.fix.JigsawRotationFix.updateBlockState(blockStateDynamic); }
// public com.mojang.datafixers.Typed method_26302(com.mojang.datafixers.Typed blockStateTyped) { return wrapperContained.method_26302(blockStateTyped); }
// public static com.mojang.datafixers.Typed method_26302(com.mojang.datafixers.Typed blockStateTyped, ) { return net.minecraft.datafixer.fix.JigsawRotationFix.method_26302(blockStateTyped); }
// public com.mojang.serialization.Dynamic method_26303(com.mojang.serialization.Dynamic propertiesDynamic) { return wrapperContained.method_26303(propertiesDynamic); }
// public static com.mojang.serialization.Dynamic method_26303(com.mojang.serialization.Dynamic propertiesDynamic, ) { return net.minecraft.datafixer.fix.JigsawRotationFix.method_26303(propertiesDynamic); }

}