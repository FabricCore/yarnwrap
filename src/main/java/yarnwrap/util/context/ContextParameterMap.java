package yarnwrap.util.context;
public class ContextParameterMap { public net.minecraft.util.context.ContextParameterMap wrapperContained; public ContextParameterMap(net.minecraft.util.context.ContextParameterMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map map() { return wrapperContained.map; }
// public void map(java.util.Map value) { wrapperContained.map = value; }
// public static java.util.Map map() { return net.minecraft.util.context.ContextParameterMap.map; }
// public static void map(java.util.Map value, ) { net.minecraft.util.context.ContextParameterMap.map = value; }

// public ContextParameterMap(java.util.Map map) { this.wrapperContained = new net.minecraft.util.context.ContextParameterMap(map); }
public boolean contains(yarnwrap.util.context.ContextParameter parameter) { return wrapperContained.contains(parameter.wrapperContained); }
// public static boolean contains(yarnwrap.util.context.ContextParameter parameter, ) { return net.minecraft.util.context.ContextParameterMap.contains(parameter.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.util.context.ContextParameter parameter,java.lang.Object defaultValue) { return wrapperContained.getOrDefault(parameter.wrapperContained,defaultValue); }
// public static java.lang.Object getOrDefault(yarnwrap.util.context.ContextParameter parameter,java.lang.Object defaultValue, ) { return net.minecraft.util.context.ContextParameterMap.getOrDefault(parameter.wrapperContained,defaultValue); }
public java.lang.Object getOrThrow(yarnwrap.util.context.ContextParameter parameter) { return wrapperContained.getOrThrow(parameter.wrapperContained); }
// public static java.lang.Object getOrThrow(yarnwrap.util.context.ContextParameter parameter, ) { return net.minecraft.util.context.ContextParameterMap.getOrThrow(parameter.wrapperContained); }
public java.lang.Object getNullable(yarnwrap.util.context.ContextParameter parameter) { return wrapperContained.getNullable(parameter.wrapperContained); }
// public static java.lang.Object getNullable(yarnwrap.util.context.ContextParameter parameter, ) { return net.minecraft.util.context.ContextParameterMap.getNullable(parameter.wrapperContained); }

}