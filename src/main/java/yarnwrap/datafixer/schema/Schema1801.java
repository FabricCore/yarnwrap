package yarnwrap.datafixer.schema;
public class Schema1801 { public net.minecraft.datafixer.schema.Schema1801 wrapperContained; public Schema1801(net.minecraft.datafixer.schema.Schema1801 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}