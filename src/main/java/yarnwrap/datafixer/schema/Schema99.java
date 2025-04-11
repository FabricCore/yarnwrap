package yarnwrap.datafixer.schema;
public class Schema99 { public net.minecraft.datafixer.schema.Schema99 wrapperContained; public Schema99(net.minecraft.datafixer.schema.Schema99 wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCKS_TO_BLOCK_ENTITIES() { return wrapperContained.BLOCKS_TO_BLOCK_ENTITIES; }
// public void BLOCKS_TO_BLOCK_ENTITIES(java.util.Map value) { wrapperContained.BLOCKS_TO_BLOCK_ENTITIES = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public Schema99(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema99(versionKey,parent); }
// public void targetEquipment(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetEquipment(schema,map,entityId); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5340(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5340(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5342(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5342(name); }
// public void method_5344(java.util.HashMap map) { wrapperContained.method_5344(map); }
// public void targetItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetItems(schema,map,entityId); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5349(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5349(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5351(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5351(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate targetEquipment(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.targetEquipment(schema); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5354(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5354(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5356(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5356(name); }
// public com.mojang.serialization.Dynamic method_5357(com.mojang.serialization.Dynamic tag) { return wrapperContained.method_5357(tag); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5358(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5358(name); }
// public java.lang.Object updateBlockEntityTags(com.mojang.serialization.Dynamic stack,java.util.Map renames) { return wrapperContained.updateBlockEntityTags(stack,renames); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5362(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5362(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5363(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5363(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5365(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5365(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5366(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5366(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5367(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5367(name); }
// public void targetInTile(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetInTile(schema,map,entityId); }
// public com.mojang.serialization.Dynamic method_5371(com.mojang.serialization.Dynamic entityTag) { return wrapperContained.method_5371(entityTag); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5372(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5372(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5374(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5374(name); }
// public com.mojang.serialization.Dynamic method_5375(com.mojang.serialization.Dynamic blockEntityTag) { return wrapperContained.method_5375(blockEntityTag); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5376(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5376(name); }
// public void targetDisplayTile(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetDisplayTile(schema,map,entityId); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5381(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5381(name); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}