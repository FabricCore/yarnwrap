package yarnwrap.datafixer.schema;
public class Schema2501 { public net.minecraft.datafixer.schema.Schema2501 wrapperContained; public Schema2501(net.minecraft.datafixer.schema.Schema2501 wrapperContained) { this.wrapperContained = wrapperContained; }

// public void registerFurnace(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String name) { wrapperContained.registerFurnace(schema,map,name); }
// public static void registerFurnace(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String name, ) { net.minecraft.datafixer.schema.Schema2501.registerFurnace(schema,map,name); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema2501.registerBlockEntities(schema); }

}