package yarnwrap.client.render.model.json;
public class MultipartModelConditionBuilder { public net.minecraft.client.render.model.json.MultipartModelConditionBuilder wrapperContained; public MultipartModelConditionBuilder(net.minecraft.client.render.model.json.MultipartModelConditionBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object values() { return wrapperContained.values; }
// // public void values(Object value) { wrapperContained.values = value; }
// // public static Object values() { return net.minecraft.client.render.model.json.MultipartModelConditionBuilder.values; }
// // public static void values(Object value, ) { net.minecraft.client.render.model.json.MultipartModelConditionBuilder.values = value; }

public yarnwrap.client.render.model.json.MultipartModelCondition build() { return new yarnwrap.client.render.model.json.MultipartModelCondition(wrapperContained.build()); }
// public static yarnwrap.client.render.model.json.MultipartModelCondition build() { return new yarnwrap.client.render.model.json.MultipartModelCondition(net.minecraft.client.render.model.json.MultipartModelConditionBuilder.build()); }
// public void putTerms(yarnwrap.state.property.Property property,Object terms) { wrapperContained.putTerms(property.wrapperContained,terms); }
// public static void putTerms(yarnwrap.state.property.Property property,Object terms, ) { net.minecraft.client.render.model.json.MultipartModelConditionBuilder.putTerms(property.wrapperContained,terms); }
public yarnwrap.client.render.model.json.MultipartModelConditionBuilder put(yarnwrap.state.property.Property property,java.lang.Comparable value) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.put(property.wrapperContained,value)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder put(yarnwrap.state.property.Property property,java.lang.Comparable value, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.render.model.json.MultipartModelConditionBuilder.put(property.wrapperContained,value)); }
public yarnwrap.client.render.model.json.MultipartModelConditionBuilder put(yarnwrap.state.property.Property property,java.lang.Comparable value,java.lang.Comparable[] values) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.put(property.wrapperContained,value,values)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder put(yarnwrap.state.property.Property property,java.lang.Comparable value,java.lang.Comparable[] values, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.render.model.json.MultipartModelConditionBuilder.put(property.wrapperContained,value,values)); }
// public Object method_67849(java.lang.String valuex) { return wrapperContained.method_67849(valuex); }
// public static Object method_67849(java.lang.String valuex, ) { return net.minecraft.client.render.model.json.MultipartModelConditionBuilder.method_67849(valuex); }
public yarnwrap.client.render.model.json.MultipartModelConditionBuilder replace(yarnwrap.state.property.Property property,java.lang.Comparable value) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.replace(property.wrapperContained,value)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder replace(yarnwrap.state.property.Property property,java.lang.Comparable value, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.render.model.json.MultipartModelConditionBuilder.replace(property.wrapperContained,value)); }

}