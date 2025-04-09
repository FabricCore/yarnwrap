package yarnwrap.datafixer.fix;
public class EntityBlockStateFix { public net.minecraft.datafixer.fix.EntityBlockStateFix wrapperContained; public EntityBlockStateFix(net.minecraft.datafixer.fix.EntityBlockStateFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCK_NAME_TO_ID() { return wrapperContained.BLOCK_NAME_TO_ID; }
// public com.mojang.datafixers.Typed useFunction(com.mojang.datafixers.Typed entity,java.lang.String entityId,java.util.function.Function function) { return wrapperContained.useFunction(entity,entityId,function); }
public int getNumericalBlockId(java.lang.String blockId) { return wrapperContained.getNumericalBlockId(blockId); }
// public com.mojang.datafixers.Typed mergeIdAndData(com.mojang.datafixers.Typed entity,java.lang.String oldIdKey,java.lang.String oldDataKey,java.lang.String newStateKey) { return wrapperContained.mergeIdAndData(entity,oldIdKey,oldDataKey,newStateKey); }
// public com.mojang.datafixers.Typed fixFallingBlock(com.mojang.datafixers.Typed fallingBlock) { return wrapperContained.fixFallingBlock(fallingBlock); }

}