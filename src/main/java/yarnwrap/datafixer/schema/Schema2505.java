package yarnwrap.datafixer.schema;
public class Schema2505 { public net.minecraft.datafixer.schema.Schema2505 wrapperContained; public Schema2505(net.minecraft.datafixer.schema.Schema2505 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema2505.registerEntities(schema); }

}