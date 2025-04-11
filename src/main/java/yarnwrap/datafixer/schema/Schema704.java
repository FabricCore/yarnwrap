package yarnwrap.datafixer.schema;
public class Schema704 { public net.minecraft.datafixer.schema.Schema704 wrapperContained; public Schema704(net.minecraft.datafixer.schema.Schema704 wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCK_RENAMES() { return wrapperContained.BLOCK_RENAMES; }
// public void BLOCK_RENAMES(java.util.Map value) { wrapperContained.BLOCK_RENAMES = value; }
public Schema704(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema704(versionKey,parent); }
// public com.mojang.datafixers.types.Type getChoiceType(Object type,java.lang.String choiceName) { return wrapperContained.getChoiceType(type,choiceName); }
// public void targetItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String blockEntityId) { wrapperContained.targetItems(schema,map,blockEntityId); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5298(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5298(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5301(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5301(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5302(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5302(name); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}