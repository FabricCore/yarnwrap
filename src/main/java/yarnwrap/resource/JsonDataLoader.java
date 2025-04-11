package yarnwrap.resource;
public class JsonDataLoader { public net.minecraft.resource.JsonDataLoader wrapperContained; public JsonDataLoader(net.minecraft.resource.JsonDataLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public void gson(com.google.gson.Gson value) { wrapperContained.gson = value; }
// public java.lang.String dataType() { return wrapperContained.dataType; }
// public void dataType(java.lang.String value) { wrapperContained.dataType = value; }
public void load(yarnwrap.resource.ResourceManager manager,java.lang.String dataType,com.google.gson.Gson gson,java.util.Map results) { wrapperContained.load(manager.wrapperContained,dataType,gson,results); }

}