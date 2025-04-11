package yarnwrap.datafixer.schema;
public class Schema3799 { public net.minecraft.datafixer.schema.Schema3799 wrapperContained; public Schema3799(net.minecraft.datafixer.schema.Schema3799 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}