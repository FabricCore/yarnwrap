package yarnwrap.datafixer.fix;
public class EntityBlockStateFix { public net.minecraft.datafixer.fix.EntityBlockStateFix wrapperContained; public EntityBlockStateFix(net.minecraft.datafixer.fix.EntityBlockStateFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCK_NAME_TO_ID() { return wrapperContained.BLOCK_NAME_TO_ID; }
// public void BLOCK_NAME_TO_ID(java.util.Map value) { wrapperContained.BLOCK_NAME_TO_ID = value; }
// public static java.util.Map BLOCK_NAME_TO_ID() { return net.minecraft.datafixer.fix.EntityBlockStateFix.BLOCK_NAME_TO_ID; }
// public static void BLOCK_NAME_TO_ID(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityBlockStateFix.BLOCK_NAME_TO_ID = value; }

public EntityBlockStateFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityBlockStateFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_15680(com.mojang.datafixers.Typed arrow) { return wrapperContained.method_15680(arrow); }
// public static com.mojang.datafixers.Typed method_15680(com.mojang.datafixers.Typed arrow, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15680(arrow); }
// public com.mojang.datafixers.Typed useFunction(com.mojang.datafixers.Typed entity,java.lang.String entityId,java.util.function.Function function) { return wrapperContained.useFunction(entity,entityId,function); }
// public static com.mojang.datafixers.Typed useFunction(com.mojang.datafixers.Typed entity,java.lang.String entityId,java.util.function.Function function, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.useFunction(entity,entityId,function); }
// public void method_15683(java.util.HashMap map) { wrapperContained.method_15683(map); }
// public static void method_15683(java.util.HashMap map, ) { net.minecraft.datafixer.fix.EntityBlockStateFix.method_15683(map); }
// public com.mojang.datafixers.util.Pair method_15684(com.mojang.serialization.Dynamic state) { return wrapperContained.method_15684(state); }
// public static com.mojang.datafixers.util.Pair method_15684(com.mojang.serialization.Dynamic state, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15684(state); }
// public com.mojang.datafixers.Typed method_15685(com.mojang.datafixers.Typed enderman) { return wrapperContained.method_15685(enderman); }
// public static com.mojang.datafixers.Typed method_15685(com.mojang.datafixers.Typed enderman, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15685(enderman); }
// public int getNumericalBlockId(java.lang.String blockId) { return wrapperContained.getNumericalBlockId(blockId); }
// public static int getNumericalBlockId(java.lang.String blockId, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.getNumericalBlockId(blockId); }
// public com.mojang.datafixers.Typed mergeIdAndData(com.mojang.datafixers.Typed entity,java.lang.String oldIdKey,java.lang.String oldDataKey,java.lang.String newStateKey) { return wrapperContained.mergeIdAndData(entity,oldIdKey,oldDataKey,newStateKey); }
// public static com.mojang.datafixers.Typed mergeIdAndData(com.mojang.datafixers.Typed entity,java.lang.String oldIdKey,java.lang.String oldDataKey,java.lang.String newStateKey, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.mergeIdAndData(entity,oldIdKey,oldDataKey,newStateKey); }
// public java.lang.Integer method_15688(java.lang.Integer id) { return wrapperContained.method_15688(id); }
// public static java.lang.Integer method_15688(java.lang.Integer id, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15688(id); }
// public java.lang.Integer method_15689(java.lang.Integer id) { return wrapperContained.method_15689(id); }
// public static java.lang.Integer method_15689(java.lang.Integer id, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15689(id); }
// public com.mojang.datafixers.util.Either method_15690(com.mojang.serialization.Dynamic state) { return wrapperContained.method_15690(state); }
// public static com.mojang.datafixers.util.Either method_15690(com.mojang.serialization.Dynamic state, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15690(state); }
// public com.mojang.datafixers.Typed method_15691(java.util.function.Function entity) { return wrapperContained.method_15691(entity); }
// public static com.mojang.datafixers.Typed method_15691(java.util.function.Function entity, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15691(entity); }
// public com.mojang.datafixers.Typed method_15692(com.mojang.datafixers.types.Type projectile) { return wrapperContained.method_15692(projectile); }
// public static com.mojang.datafixers.Typed method_15692(com.mojang.datafixers.types.Type projectile, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15692(projectile); }
// public java.lang.Integer method_15694(com.mojang.serialization.Dynamic unit) { return wrapperContained.method_15694(unit); }
// public static java.lang.Integer method_15694(com.mojang.serialization.Dynamic unit, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15694(unit); }
// public com.mojang.datafixers.Typed fixFallingBlock(com.mojang.datafixers.Typed fallingBlock) { return wrapperContained.fixFallingBlock(fallingBlock); }
// public static com.mojang.datafixers.Typed fixFallingBlock(com.mojang.datafixers.Typed fallingBlock, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.fixFallingBlock(fallingBlock); }
// public com.mojang.datafixers.Typed method_15696(com.mojang.datafixers.Typed minecart) { return wrapperContained.method_15696(minecart); }
// public static com.mojang.datafixers.Typed method_15696(com.mojang.datafixers.Typed minecart, ) { return net.minecraft.datafixer.fix.EntityBlockStateFix.method_15696(minecart); }

}