package yarnwrap.datafixer.schema;
public class Schema1486 { public net.minecraft.datafixer.schema.Schema1486 wrapperContained; public Schema1486(net.minecraft.datafixer.schema.Schema1486 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}