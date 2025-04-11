package yarnwrap.datafixer.schema;
public class Schema2502 { public net.minecraft.datafixer.schema.Schema2502 wrapperContained; public Schema2502(net.minecraft.datafixer.schema.Schema2502 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}