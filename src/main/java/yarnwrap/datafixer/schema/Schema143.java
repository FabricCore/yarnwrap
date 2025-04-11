package yarnwrap.datafixer.schema;
public class Schema143 { public net.minecraft.datafixer.schema.Schema143 wrapperContained; public Schema143(net.minecraft.datafixer.schema.Schema143 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema143(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema143(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}