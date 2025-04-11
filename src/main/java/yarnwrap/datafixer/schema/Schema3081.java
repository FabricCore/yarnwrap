package yarnwrap.datafixer.schema;
public class Schema3081 { public net.minecraft.datafixer.schema.Schema3081 wrapperContained; public Schema3081(net.minecraft.datafixer.schema.Schema3081 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}