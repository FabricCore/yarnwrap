package yarnwrap.resource;
public class JsonDataLoader { public net.minecraft.resource.JsonDataLoader wrapperContained; public JsonDataLoader(net.minecraft.resource.JsonDataLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public java.lang.String dataType() { return wrapperContained.dataType; }
public void load(yarnwrap.resource.ResourceManager manager,java.lang.String dataType,com.google.gson.Gson gson,java.util.Map results) { wrapperContained.load(manager.wrapperContained,dataType,gson,results); }

}