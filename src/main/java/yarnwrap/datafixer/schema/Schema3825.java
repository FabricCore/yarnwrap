package yarnwrap.datafixer.schema;
public class Schema3825 { public net.minecraft.datafixer.schema.Schema3825 wrapperContained; public Schema3825(net.minecraft.datafixer.schema.Schema3825 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema3825.registerEntities(schema); }

}