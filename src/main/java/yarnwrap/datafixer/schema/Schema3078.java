package yarnwrap.datafixer.schema;
public class Schema3078 { public net.minecraft.datafixer.schema.Schema3078 wrapperContained; public Schema3078(net.minecraft.datafixer.schema.Schema3078 wrapperContained) { this.wrapperContained = wrapperContained; }

// public void targetEntityItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetEntityItems(schema,map,entityId); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}