package yarnwrap.datafixer.fix;
public class DropInvalidSignDatafixDataFix { public net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix wrapperContained; public DropInvalidSignDatafixDataFix(net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] KEYS_TO_REMOVE() { return wrapperContained.KEYS_TO_REMOVE; }
// public void KEYS_TO_REMOVE(java.lang.String[] value) { wrapperContained.KEYS_TO_REMOVE = value; }
public DropInvalidSignDatafixDataFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.lang.String blockEntityId) { this.wrapperContained = new net.minecraft.datafixer.fix.DropInvalidSignDatafixDataFix(outputSchema,name,blockEntityId); }
// public com.mojang.serialization.Dynamic dropInvalidDatafixData(com.mojang.serialization.Dynamic blockEntityData) { return wrapperContained.dropInvalidDatafixData(blockEntityData); }
// public boolean method_52476(com.mojang.serialization.Dynamic message) { return wrapperContained.method_52476(message); }
// public com.mojang.serialization.Dynamic method_52477(java.util.List message,com.mojang.serialization.Dynamic index) { return wrapperContained.method_52477(message,index); }
// public com.mojang.serialization.Dynamic dropInvalidDatafixDataOnSide(com.mojang.serialization.Dynamic textData) { return wrapperContained.dropInvalidDatafixDataOnSide(textData); }

}