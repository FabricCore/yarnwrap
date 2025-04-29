package yarnwrap.datafixer.schema;
public class Schema2688 { public net.minecraft.datafixer.schema.Schema2688 wrapperContained; public Schema2688(net.minecraft.datafixer.schema.Schema2688 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema2688.registerEntities(schema); }

}