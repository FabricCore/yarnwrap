package yarnwrap.datafixer.fix;
public class DropInvalidSignDatafixDataFix { public net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix wrapperContained; public DropInvalidSignDatafixDataFix(net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

public DropInvalidSignDatafixDataFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name) { this.wrapperContained = new net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix(outputSchema,name); }
// public com.mojang.serialization.Dynamic dropInvalidDatafixData() { return wrapperContained.dropInvalidDatafixData(); }
// public static com.mojang.serialization.Dynamic dropInvalidDatafixData() { return net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix.dropInvalidDatafixData(); }
// public com.mojang.serialization.Dynamic method_52477(java.util.List message,com.mojang.serialization.Dynamic index) { return wrapperContained.method_52477(message,index); }
// public static com.mojang.serialization.Dynamic method_52477(java.util.List message,com.mojang.serialization.Dynamic index, ) { return net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix.method_52477(message,index); }
// public com.mojang.serialization.Dynamic dropInvalidDatafixDataOnSide(com.mojang.serialization.Dynamic textData) { return wrapperContained.dropInvalidDatafixDataOnSide(textData); }
// public static com.mojang.serialization.Dynamic dropInvalidDatafixDataOnSide(com.mojang.serialization.Dynamic textData, ) { return net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix.dropInvalidDatafixDataOnSide(textData); }

}