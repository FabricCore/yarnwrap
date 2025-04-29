package yarnwrap.datafixer.schema;
public class Schema808 { public net.minecraft.datafixer.schema.Schema808 wrapperContained; public Schema808(net.minecraft.datafixer.schema.Schema808 wrapperContained) { this.wrapperContained = wrapperContained; }

// public void targetItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String blockEntityId) { wrapperContained.targetItems(schema,map,blockEntityId); }
// public static void targetItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String blockEntityId, ) { net.minecraft.datafixer.schema.Schema808.targetItems(schema,map,blockEntityId); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema808.registerBlockEntities(schema); }

}