package yarnwrap.datafixer.schema;
public class Schema1510 { public net.minecraft.datafixer.schema.Schema1510 wrapperContained; public Schema1510(net.minecraft.datafixer.schema.Schema1510 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}